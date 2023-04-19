package com.example.readcampus.bean

data class BookShopInfo(val shopName:String="",
                        val protocol:String="",
                        val host:String="",
                        val bookInfoPath:String="",
                        val bookChapterListPath:String="",
                        val bookChapterContentPath:String="",
                        val bookSearchByKeyPath:String="",
                        val bookSearchByTypePath:String="")