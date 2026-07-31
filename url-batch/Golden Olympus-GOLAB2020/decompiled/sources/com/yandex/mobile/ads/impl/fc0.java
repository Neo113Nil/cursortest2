package com.yandex.mobile.ads.impl;

import android.opengl.Matrix;

/* loaded from: classes3.dex */
final class fc0 {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f25742a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f25743b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    private final w42<float[]> f25744c = new w42<>();

    /* renamed from: d, reason: collision with root package name */
    private boolean f25745d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f4 = fArr2[10];
        float f5 = fArr2[8];
        float sqrt = (float) Math.sqrt((f5 * f5) + (f4 * f4));
        float f6 = fArr2[10] / sqrt;
        fArr[0] = f6;
        float f7 = fArr2[8];
        fArr[2] = f7 / sqrt;
        fArr[8] = (-f7) / sqrt;
        fArr[10] = f6;
    }

    public final void b(long j4, float[] fArr) {
        this.f25744c.a(fArr, j4);
    }

    public final void a(long j4, float[] fArr) {
        float[] b4 = this.f25744c.b(j4);
        if (b4 == null) {
            return;
        }
        float[] fArr2 = this.f25743b;
        float f4 = b4[0];
        float f5 = -b4[1];
        float f6 = -b4[2];
        float length = Matrix.length(f4, f5, f6);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr2, 0, (float) Math.toDegrees(length), f4 / length, f5 / length, f6 / length);
        } else {
            Matrix.setIdentityM(fArr2, 0);
        }
        if (!this.f25745d) {
            a(this.f25742a, this.f25743b);
            this.f25745d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f25742a, 0, this.f25743b, 0);
    }

    public final void a() {
        this.f25744c.a();
        this.f25745d = false;
    }
}
