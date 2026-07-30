package com.baidu.ar.marker;

/* loaded from: classes.dex */
public class MarkerFrameInfo {

    /* renamed from: a, reason: collision with root package name */
    public int f2804a;

    /* renamed from: b, reason: collision with root package name */
    public int f2805b;

    /* renamed from: c, reason: collision with root package name */
    public double[] f2806c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f2807d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f2808e;

    /* renamed from: f, reason: collision with root package name */
    public int f2809f;

    /* renamed from: g, reason: collision with root package name */
    public int f2810g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f2811h;

    /* renamed from: i, reason: collision with root package name */
    public float[] f2812i;

    /* renamed from: j, reason: collision with root package name */
    public float f2813j;

    /* renamed from: k, reason: collision with root package name */
    public float[] f2814k;

    public float[] getDistort() {
        return this.f2808e;
    }

    public int getFps() {
        return this.f2810g;
    }

    public byte[] getImage() {
        return this.f2811h;
    }

    public int getInputHeight() {
        return this.f2805b;
    }

    public int getInputWidth() {
        return this.f2804a;
    }

    public float[] getIntrinsics() {
        return this.f2807d;
    }

    public double[] getMagnet() {
        return this.f2806c;
    }

    public float[] getOrignalTransform() {
        return this.f2814k;
    }

    public float[] getPoseMat() {
        return this.f2812i;
    }

    public float getScaleY() {
        return this.f2813j;
    }

    public int getTrackingState() {
        return this.f2809f;
    }

    public void setDistort(float[] fArr) {
        this.f2808e = fArr;
    }

    public void setFps(int i8) {
        this.f2810g = i8;
    }

    public void setImage(byte[] bArr) {
        this.f2811h = bArr;
    }

    public void setInputHeight(int i8) {
        this.f2805b = i8;
    }

    public void setInputWidth(int i8) {
        this.f2804a = i8;
    }

    public void setIntrinsics(float[] fArr) {
        this.f2807d = fArr;
    }

    public void setMagnet(double[] dArr) {
        this.f2806c = dArr;
    }

    public void setOrignalTransform(float[] fArr) {
        this.f2814k = fArr;
    }

    public void setPoseMat(float[] fArr) {
        this.f2812i = fArr;
    }

    public void setScaleY(float f8) {
        this.f2813j = f8;
    }

    public void setTrackingState(int i8) {
        this.f2809f = i8;
    }
}
