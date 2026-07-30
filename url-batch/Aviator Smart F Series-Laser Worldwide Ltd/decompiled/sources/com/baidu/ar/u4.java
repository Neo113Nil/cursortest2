package com.baidu.ar;

import android.opengl.Matrix;
import android.util.Log;
import com.baidu.ar.arplay.representation.Vector4f;

/* loaded from: classes.dex */
public class u4 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3386a;

    /* renamed from: b, reason: collision with root package name */
    public float f3387b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f3388c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    public Vector4f f3389d = new Vector4f();

    /* renamed from: e, reason: collision with root package name */
    public Vector4f f3390e = new Vector4f();

    /* renamed from: f, reason: collision with root package name */
    public float[] f3391f = new float[4];

    /* renamed from: g, reason: collision with root package name */
    public float[] f3392g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    public float[] f3393h = new float[16];

    public final void a() {
        float[] fArr = new float[16];
        Matrix.invertM(fArr, 0, this.f3388c, 0);
        Vector4f a8 = td.a(new float[]{0.0f, 0.0f, 0.0f, 1.0f});
        a8.subtract(this.f3389d);
        float[] fArr2 = new float[4];
        Matrix.multiplyMV(fArr2, 0, fArr, 0, a8.toArray(), 0);
        Vector4f a9 = td.a(fArr2);
        a9.subdivide(td.a(this.f3391f));
        a9.setY(-a9.getY());
        a9.setX(-a9.getX());
        a9.add(this.f3390e);
        float[] fArr3 = {a9.getX(), a9.getY()};
        this.f3390e = new Vector4f(a9.getX(), a9.getY(), 0.0f, 1.0f);
        this.f3389d = new Vector4f(0.0f, 0.0f, 0.0f, 1.0f);
        this.f3391f = a(fArr3);
        float[] fArr4 = new float[16];
        Matrix.invertM(fArr4, 0, this.f3388c, 0);
        float[] fArr5 = this.f3391f;
        float[] fArr6 = new float[16];
        Matrix.multiplyMM(fArr6, 0, u8.a(new Vector4f(1.0f / (-fArr5[0]), 1.0f / (-fArr5[1]), 1.0f, 1.0f)), 0, fArr4, 0);
        float[] fArr7 = {fArr6[0], fArr6[1], fArr6[2], fArr6[3], fArr6[4], fArr6[5], fArr6[6], fArr6[7], fArr6[8], fArr6[9], fArr6[10], fArr6[11], this.f3390e.getX(), this.f3390e.getY(), this.f3390e.getZ(), 1.0f};
        this.f3393h = fArr7;
        Matrix.invertM(this.f3392g, 0, fArr7, 0);
    }

    public final void b() {
        float[] fArr = this.f3392g;
        float[] fArr2 = {r2[0], r2[1], r2[2], r2[3], r2[0], r2[1], r2[2], r2[3], r2[0], r2[1], r2[2], r2[3], 0.0f, 0.0f, 0.0f, 1.0f};
        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
        float[] f8 = f(new float[]{fArr2[1], fArr2[2], fArr2[3], fArr2[4]});
        float[] f9 = f(new float[]{fArr2[4], fArr2[5], fArr2[6], fArr2[7]});
        float[] f10 = f(new float[]{fArr2[8], fArr2[9], fArr2[10], fArr2[11]});
        float[] fArr3 = new float[4];
        Matrix.multiplyMV(fArr3, 0, fArr2, 0, new Vector4f(0.0f, 1.0f, 0.0f, 1.0f).toArray(), 0);
        float[] e8 = e(new float[]{fArr3[0], fArr3[1]});
        float f11 = e8[0];
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        if (f11 != 0.0f || e8[1] >= 0.0f) {
            if (f11 == 0.0f && e8[1] > 0.0f) {
                d8 = 3.141592653589793d;
            } else if (f11 > 0.0f && e8[1] == 0.0f) {
                d8 = 1.5707963267948966d;
            } else if (f11 >= 0.0f || e8[1] != 0.0f) {
                if (f11 > 0.0f) {
                    if (e8[1] < 0.0f) {
                        d8 = Math.atan(f11 / (-r12));
                    }
                }
                if (f11 > 0.0f) {
                    if (e8[1] > 0.0f) {
                        d8 = Math.atan(r12 / f11) + 1.5707963267948966d;
                    }
                }
                if (f11 < 0.0f) {
                    if (e8[1] > 0.0f) {
                        d8 = Math.atan((-f11) / r6) + 3.141592653589793d;
                    }
                }
                if (f11 < 0.0f) {
                    if (e8[1] < 0.0f) {
                        d8 = Math.atan(r0 / f11) + 4.71238898038469d;
                    }
                }
            } else {
                d8 = 4.71238898038469d;
            }
        }
        Log.e("GeoLocalTransform", "angle: " + ((d8 / 3.141592653589793d) * 180.0d));
    }

    public float[] c(float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[1], 0.0f, 1.0f};
        float[] fArr3 = this.f3392g;
        Vector4f a8 = td.a(fArr2);
        v8.a(new double[]{fArr3[0], fArr3[1], fArr3[2], fArr3[3], fArr3[4], fArr3[5], fArr3[6], fArr3[7], fArr3[8], fArr3[9], fArr3[10], fArr3[11], fArr3[12], fArr3[13], fArr3[14], fArr3[15]}, a8);
        return a8.toArray();
    }

    public float[] d(float[] fArr) {
        float[] fArr2 = new float[4];
        Matrix.multiplyMV(fArr2, 0, this.f3393h, 0, fArr, 0);
        return new float[]{fArr2[0], fArr2[1]};
    }

    public final float[] e(float[] fArr) {
        float sqrt = (float) Math.sqrt(Math.pow(fArr[0], 2.0d) + Math.pow(fArr[1], 2.0d));
        return new float[]{fArr[0] / sqrt, fArr[1] / sqrt};
    }

    public final float[] f(float[] fArr) {
        float sqrt = (float) Math.sqrt(Math.pow(fArr[0], 2.0d) + Math.pow(fArr[1], 2.0d) + Math.pow(fArr[2], 2.0d) + Math.pow(fArr[3], 2.0d));
        return new float[]{fArr[0] / sqrt, fArr[1] / sqrt, fArr[2] / sqrt, fArr[3] / sqrt};
    }

    public void a(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        this.f3388c = fArr;
        this.f3389d = td.a(fArr2);
        this.f3390e = td.a(fArr3);
        this.f3391f = fArr4;
        a();
        b();
    }

    public void b(float[] fArr) {
        this.f3392g = fArr;
        Matrix.invertM(this.f3393h, 0, fArr, 0);
        b();
    }

    public final float[] a(float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[1]};
        float[] fArr3 = {fArr[0], fArr[1] + 1.0f};
        return new float[]{u8.a(fArr[0] + 1.0f, fArr[1], fArr2[0], fArr2[1]), u8.a(fArr3[0], fArr3[1], fArr2[0], fArr2[1]), 0.0f, 1.0f};
    }
}
