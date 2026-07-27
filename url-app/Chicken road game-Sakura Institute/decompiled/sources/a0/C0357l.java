package a0;

import Z.K;

/* renamed from: a0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0357l extends AbstractC0348c {

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f4796d;

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f4797e;

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f4798f;

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f4799g;

    static {
        float[] h4 = AbstractC0355j.h(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, AbstractC0355j.c(C0346a.f4751b.f4752a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f4796d = h4;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f4797e = fArr;
        f4798f = AbstractC0355j.g(h4);
        f4799g = AbstractC0355j.g(fArr);
    }

    @Override // a0.AbstractC0348c
    public final float a(int i2) {
        return i2 == 0 ? 1.0f : 0.5f;
    }

    @Override // a0.AbstractC0348c
    public final float b(int i2) {
        return i2 == 0 ? 0.0f : -0.5f;
    }

    @Override // a0.AbstractC0348c
    public final long d(float f4, float f5, float f6) {
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        if (f5 < -0.5f) {
            f5 = -0.5f;
        }
        if (f5 > 0.5f) {
            f5 = 0.5f;
        }
        if (f6 < -0.5f) {
            f6 = -0.5f;
        }
        float f7 = f6 <= 0.5f ? f6 : 0.5f;
        float[] fArr = f4799g;
        float f8 = (fArr[6] * f7) + (fArr[3] * f5) + (fArr[0] * f4);
        float f9 = (fArr[7] * f7) + (fArr[4] * f5) + (fArr[1] * f4);
        float f10 = (fArr[8] * f7) + (fArr[5] * f5) + (fArr[2] * f4);
        float f11 = f9 * f9 * f9;
        float f12 = f10 * f10 * f10;
        float[] fArr2 = f4798f;
        float f13 = (fArr2[6] * f12) + (fArr2[3] * f11) + (fArr2[0] * f8 * f8 * f8);
        return (Float.floatToRawIntBits((fArr2[7] * f12) + (fArr2[4] * f11) + (fArr2[1] * r11)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    @Override // a0.AbstractC0348c
    public final float e(float f4, float f5, float f6) {
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        if (f5 < -0.5f) {
            f5 = -0.5f;
        }
        if (f5 > 0.5f) {
            f5 = 0.5f;
        }
        if (f6 < -0.5f) {
            f6 = -0.5f;
        }
        float f7 = f6 <= 0.5f ? f6 : 0.5f;
        float[] fArr = f4799g;
        float f8 = (fArr[6] * f7) + (fArr[3] * f5) + (fArr[0] * f4);
        float f9 = (fArr[7] * f7) + (fArr[4] * f5) + (fArr[1] * f4);
        float f10 = (fArr[8] * f7) + (fArr[5] * f5) + (fArr[2] * f4);
        float f11 = f8 * f8 * f8;
        float f12 = f9 * f9 * f9;
        float f13 = f10 * f10 * f10;
        float[] fArr2 = f4798f;
        return (fArr2[8] * f13) + (fArr2[5] * f12) + (fArr2[2] * f11);
    }

    @Override // a0.AbstractC0348c
    public final long f(float f4, float f5, float f6, float f7, AbstractC0348c abstractC0348c) {
        float[] fArr = f4796d;
        float f8 = (fArr[6] * f6) + (fArr[3] * f5) + (fArr[0] * f4);
        float f9 = (fArr[7] * f6) + (fArr[4] * f5) + (fArr[1] * f4);
        float f10 = (fArr[8] * f6) + (fArr[5] * f5) + (fArr[2] * f4);
        float w4 = u3.d.w(f8);
        float w5 = u3.d.w(f9);
        float w6 = u3.d.w(f10);
        float[] fArr2 = f4797e;
        return K.b((fArr2[6] * w6) + (fArr2[3] * w5) + (fArr2[0] * w4), (fArr2[7] * w6) + (fArr2[4] * w5) + (fArr2[1] * w4), (fArr2[8] * w6) + (fArr2[5] * w5) + (fArr2[2] * w4), f7, abstractC0348c);
    }
}
