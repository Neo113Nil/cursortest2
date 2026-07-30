package com.baidu.ar;

import android.opengl.Matrix;

/* loaded from: classes.dex */
public class h1 extends g1 implements z5 {

    /* renamed from: g, reason: collision with root package name */
    public float[] f2353g;

    public h1(String str, int i8) {
        super(str, i8);
        this.f2353g = new float[16];
    }

    @Override // com.baidu.ar.z5
    public boolean a() {
        return false;
    }

    public float[] f() {
        if (this.f2307b == null) {
            return this.f2353g;
        }
        float[] fArr = new float[16];
        Matrix.invertM(fArr, 0, this.f2353g, 0);
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, this.f2307b.a(), 0);
        float[] fArr3 = new float[16];
        Matrix.invertM(fArr3, 0, fArr2, 0);
        return fArr3;
    }
}
