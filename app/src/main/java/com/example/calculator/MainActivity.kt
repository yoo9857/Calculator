package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var countValue = 0 // 카운트값 이라는 벨류 생성
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val count = findViewById<TextView>(R.id.count)
        val plusButton = findViewById<Button>(R.id.plus_btn) // 플러스 버튼 호출
        val minusButton =  findViewById<Button>(R.id.minus_btn) // 마이너스 버튼 호출

        plusButton.setOnClickListener{ //플러스버튼을 클릭할시 호출
            countValue++ //플러스 버튼이 눌리면 플러스함.
            count.text = countValue.toString() // 카운트에 있는 텍스트 벨류값을 스트링으로 형변환
        }
        minusButton.setOnClickListener {
            countValue-- // 마이너스 버튼이 눌리면 마이너스함
            count.text = countValue.toString()
        }

    }
}