package com.baidu.ar;

import android.opengl.Matrix;
import com.baidu.ar.arplay.representation.Vector4f;

/* loaded from: classes.dex */
public class b8 implements f6 {

    /* renamed from: a, reason: collision with root package name */
    public float[] f1778a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    public Vector4f f1779b = new Vector4f();

    /* renamed from: c, reason: collision with root package name */
    public Vector4f f1780c = new Vector4f();

    /* renamed from: d, reason: collision with root package name */
    public float[] f1781d = new float[16];

    @Override // com.baidu.ar.f6
    public void a(float[] fArr, float[] fArr2, float[] fArr3) {
        this.f1778a = fArr;
        this.f1779b = td.a(fArr2);
        this.f1780c = td.a(fArr3);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] b8 = u8.b(fArr4);
        Vector4f c8 = u8.c(fArr4);
        float[] fArr5 = new float[16];
        Matrix.multiplyMM(fArr5, 0, this.f1778a, 0, b8, 0);
        c8.add(u8.b(this.f1780c));
        float[] fArr6 = new float[4];
        Matrix.multiplyMV(fArr6, 0, this.f1778a, 0, c8.toArray(), 0);
        Vector4f a8 = td.a(fArr6);
        a8.add(this.f1779b);
        fArr5[12] = a8.getX();
        fArr5[13] = a8.getY();
        fArr5[14] = a8.getZ();
        this.f1781d = fArr5;
    }

    @Override // com.baidu.ar.f6
    public float[] a() {
        return this.f1781d;
    }

    @Override // com.baidu.ar.f6
    public float[] a(float[] fArr) {
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, this.f1781d, 0, fArr, 0);
        return fArr2;
    }
}
