package com.baidu.ar.face.algo;

/* loaded from: classes.dex */
public class FAUFaceBox {
    public float angle;
    public float height;
    public float width;

    /* renamed from: x, reason: collision with root package name */
    public float f2222x;

    /* renamed from: y, reason: collision with root package name */
    public float f2223y;

    public FAUFaceBox(float f8, float f9, float f10, float f11) {
        this.f2222x = f8;
        this.f2223y = f9;
        this.width = f10;
        this.height = f11;
    }

    public float getAngle() {
        return this.angle;
    }

    public float getHeight() {
        return this.height;
    }

    public float getWidth() {
        return this.width;
    }

    public float getX() {
        return this.f2222x;
    }

    public float getY() {
        return this.f2223y;
    }

    public FAUFaceBox(float f8, float f9, float f10, float f11, float f12) {
        this.f2222x = f8;
        this.f2223y = f9;
        this.width = f10;
        this.height = f11;
        this.angle = f12;
    }
}
