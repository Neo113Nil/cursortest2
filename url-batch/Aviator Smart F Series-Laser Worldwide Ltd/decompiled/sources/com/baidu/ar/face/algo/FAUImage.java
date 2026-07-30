package com.baidu.ar.face.algo;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class FAUImage {
    public ByteBuffer data;
    public int format;
    public int height;
    public int width;
    public int rotation = 0;
    public int flip = 0;
    public float scale = 1.0f;
    public float timestamp = 0.0f;

    public FAUImage(ByteBuffer byteBuffer, int i8, int i9, int i10) {
        this.width = i8;
        this.height = i9;
        this.format = i10;
        this.data = byteBuffer;
    }

    public void setData(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
    }

    public void setFormat(int i8) {
        this.format = i8;
    }

    public void setHeight(int i8) {
        this.height = i8;
    }

    public void setScale(float f8) {
        this.scale = f8;
    }

    public void setWidth(int i8) {
        this.width = i8;
    }
}
