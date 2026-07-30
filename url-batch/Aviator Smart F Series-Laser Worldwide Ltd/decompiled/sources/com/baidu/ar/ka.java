package com.baidu.ar;

import android.content.Context;
import android.opengl.Matrix;

/* loaded from: classes.dex */
public class ka extends g1 {

    /* renamed from: g, reason: collision with root package name */
    public float[] f2659g;

    /* renamed from: h, reason: collision with root package name */
    public float[] f2660h;

    /* renamed from: i, reason: collision with root package name */
    public float[] f2661i;

    /* renamed from: j, reason: collision with root package name */
    public float[] f2662j;

    /* renamed from: k, reason: collision with root package name */
    public long f2663k;

    /* renamed from: l, reason: collision with root package name */
    public int f2664l;

    public ka(Context context) {
        super("IMU", com.baidu.ar.vps.marker.a.Local3Dof.f3551a);
        this.f2663k = 20L;
        float[] fArr = new float[16];
        this.f2659g = fArr;
        Matrix.setIdentityM(fArr, 0);
        Matrix.rotateM(this.f2659g, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr2 = new float[16];
        this.f2660h = fArr2;
        Matrix.setIdentityM(fArr2, 0);
        Matrix.rotateM(this.f2660h, 0, 180.0f, 0.0f, 0.0f, 1.0f);
        float[] fArr3 = new float[16];
        this.f2661i = fArr3;
        Matrix.multiplyMM(fArr3, 0, this.f2660h, 0, this.f2659g, 0);
    }

    @Override // com.baidu.ar.g1, com.baidu.ar.g6
    public boolean d() {
        return this.f2306a;
    }

    public float[] d(float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[4], fArr[8], 0.0f, fArr[1], fArr[5], fArr[9], 0.0f, fArr[2], fArr[6], fArr[10], 0.0f, fArr[3], fArr[7], fArr[11], 1.0f};
        this.f2306a = true;
        this.f2664l++;
        float[] fArr3 = new float[16];
        this.f2662j = fArr3;
        Matrix.setIdentityM(fArr3, 0);
        Matrix.rotateM(this.f2662j, 0, -90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr4 = new float[16];
        Matrix.multiplyMM(fArr4, 0, this.f2662j, 0, fArr2, 0);
        Matrix.multiplyMM(this.f2308c, 0, this.f2661i, 0, fArr4, 0);
        v vVar = this.f2310e;
        if (vVar != null && this.f2664l >= this.f2663k) {
            vVar.a();
            this.f2310e = null;
        }
        u6 u6Var = this.f2311f;
        if (u6Var != null) {
            u6Var.a(this);
        }
        return this.f2308c;
    }
}
