package com.baidu.ar;

import android.opengl.Matrix;

/* loaded from: classes.dex */
public class ia extends g1 {

    /* renamed from: g, reason: collision with root package name */
    public float[] f2470g;

    /* renamed from: h, reason: collision with root package name */
    public float[] f2471h;

    /* renamed from: i, reason: collision with root package name */
    public float[] f2472i;

    /* renamed from: j, reason: collision with root package name */
    public long f2473j;

    /* renamed from: k, reason: collision with root package name */
    public int f2474k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2475l;

    /* renamed from: m, reason: collision with root package name */
    public float[] f2476m;

    public ia(String str, int i8) {
        super(str, i8);
        this.f2473j = 20L;
        this.f2475l = true;
        this.f2476m = new float[]{0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        float[] fArr = new float[16];
        this.f2470g = fArr;
        Matrix.setIdentityM(fArr, 0);
        Matrix.rotateM(this.f2470g, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr2 = new float[16];
        this.f2471h = fArr2;
        Matrix.setIdentityM(fArr2, 0);
        Matrix.rotateM(this.f2471h, 0, 180.0f, 0.0f, 0.0f, 1.0f);
        float[] fArr3 = new float[16];
        Matrix.multiplyMM(fArr3, 0, this.f2471h, 0, this.f2470g, 0);
        float[] fArr4 = new float[16];
        this.f2472i = fArr4;
        Matrix.multiplyMM(fArr4, 0, this.f2471h, 0, fArr3, 0);
    }

    public float[] a(int i8, float[] fArr) {
        this.f2474k++;
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, this.f2476m, 0);
        float[] fArr3 = new float[16];
        this.f2308c = fArr3;
        Matrix.multiplyMM(fArr3, 0, this.f2472i, 0, fArr2, 0);
        boolean z7 = this.f2475l;
        if (z7 && i8 == 0 && this.f2474k >= this.f2473j) {
            this.f2475l = !z7;
            this.f2306a = true;
            this.f2310e.a();
            this.f2310e = null;
        }
        u6 u6Var = this.f2311f;
        if (u6Var != null) {
            u6Var.a(this);
        }
        return this.f2308c;
    }

    @Override // com.baidu.ar.g1
    public void e() {
        super.e();
        this.f2475l = true;
        this.f2306a = false;
        this.f2311f = null;
    }
}
