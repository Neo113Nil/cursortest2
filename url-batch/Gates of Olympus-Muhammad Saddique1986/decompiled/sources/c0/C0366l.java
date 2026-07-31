package c0;

import b0.M;

/* renamed from: c0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366l extends AbstractC0357c {

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f5509d;

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f5510e;

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f5511f;

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f5512g;

    static {
        float[] h3 = AbstractC0364j.h(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, AbstractC0364j.c(C0355a.f5464b.f5465a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f5509d = h3;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f5510e = fArr;
        f5511f = AbstractC0364j.g(h3);
        f5512g = AbstractC0364j.g(fArr);
    }

    @Override // c0.AbstractC0357c
    public final float a(int i3) {
        return i3 == 0 ? 1.0f : 0.5f;
    }

    @Override // c0.AbstractC0357c
    public final float b(int i3) {
        return i3 == 0 ? 0.0f : -0.5f;
    }

    @Override // c0.AbstractC0357c
    public final long d(float f3, float f4, float f5) {
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        if (f4 > 0.5f) {
            f4 = 0.5f;
        }
        if (f5 < -0.5f) {
            f5 = -0.5f;
        }
        float f6 = f5 <= 0.5f ? f5 : 0.5f;
        float[] fArr = f5512g;
        float f7 = (fArr[6] * f6) + (fArr[3] * f4) + (fArr[0] * f3);
        float f8 = (fArr[7] * f6) + (fArr[4] * f4) + (fArr[1] * f3);
        float f9 = (fArr[8] * f6) + (fArr[5] * f4) + (fArr[2] * f3);
        float f10 = f8 * f8 * f8;
        float f11 = f9 * f9 * f9;
        float[] fArr2 = f5511f;
        float f12 = (fArr2[6] * f11) + (fArr2[3] * f10) + (fArr2[0] * f7 * f7 * f7);
        return (Float.floatToRawIntBits((fArr2[7] * f11) + (fArr2[4] * f10) + (fArr2[1] * r11)) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
    }

    @Override // c0.AbstractC0357c
    public final float e(float f3, float f4, float f5) {
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        if (f4 > 0.5f) {
            f4 = 0.5f;
        }
        if (f5 < -0.5f) {
            f5 = -0.5f;
        }
        float f6 = f5 <= 0.5f ? f5 : 0.5f;
        float[] fArr = f5512g;
        float f7 = (fArr[6] * f6) + (fArr[3] * f4) + (fArr[0] * f3);
        float f8 = (fArr[7] * f6) + (fArr[4] * f4) + (fArr[1] * f3);
        float f9 = (fArr[8] * f6) + (fArr[5] * f4) + (fArr[2] * f3);
        float f10 = f7 * f7 * f7;
        float f11 = f8 * f8 * f8;
        float f12 = f9 * f9 * f9;
        float[] fArr2 = f5511f;
        return (fArr2[8] * f12) + (fArr2[5] * f11) + (fArr2[2] * f10);
    }

    @Override // c0.AbstractC0357c
    public final long f(float f3, float f4, float f5, float f6, AbstractC0357c abstractC0357c) {
        float[] fArr = f5509d;
        float f7 = (fArr[6] * f5) + (fArr[3] * f4) + (fArr[0] * f3);
        float f8 = (fArr[7] * f5) + (fArr[4] * f4) + (fArr[1] * f3);
        float f9 = (fArr[8] * f5) + (fArr[5] * f4) + (fArr[2] * f3);
        float s3 = l0.c.s(f7);
        float s4 = l0.c.s(f8);
        float s5 = l0.c.s(f9);
        float[] fArr2 = f5510e;
        return M.b((fArr2[6] * s5) + (fArr2[3] * s4) + (fArr2[0] * s3), (fArr2[7] * s5) + (fArr2[4] * s4) + (fArr2[1] * s3), (fArr2[8] * s5) + (fArr2[5] * s4) + (fArr2[2] * s3), f6, abstractC0357c);
    }
}
