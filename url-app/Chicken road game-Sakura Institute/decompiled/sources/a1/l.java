package a1;

import z0.l0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l extends c {

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f253d;

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f254e;

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f255f;

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f256g;

    static {
        float[] h3 = j.h(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, j.c(a.f208b.f209a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f253d = h3;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f254e = fArr;
        f255f = j.g(h3);
        f256g = j.g(fArr);
    }

    @Override // a1.c
    public final float a(int i7) {
        return i7 == 0 ? 1.0f : 0.5f;
    }

    @Override // a1.c
    public final float b(int i7) {
        return i7 == 0 ? 0.0f : -0.5f;
    }

    @Override // a1.c
    public final long d(float f9, float f10, float f11) {
        if (f9 < 0.0f) {
            f9 = 0.0f;
        }
        if (f9 > 1.0f) {
            f9 = 1.0f;
        }
        if (f10 < -0.5f) {
            f10 = -0.5f;
        }
        if (f10 > 0.5f) {
            f10 = 0.5f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        float f12 = f11 <= 0.5f ? f11 : 0.5f;
        float[] fArr = f256g;
        float f13 = (fArr[6] * f12) + (fArr[3] * f10) + (fArr[0] * f9);
        float f14 = (fArr[7] * f12) + (fArr[4] * f10) + (fArr[1] * f9);
        float f15 = (fArr[8] * f12) + (fArr[5] * f10) + (fArr[2] * f9);
        float f16 = f14 * f14 * f14;
        float f17 = f15 * f15 * f15;
        float[] fArr2 = f255f;
        float f18 = (fArr2[6] * f17) + (fArr2[3] * f16) + (fArr2[0] * f13 * f13 * f13);
        return (Float.floatToRawIntBits((fArr2[7] * f17) + (fArr2[4] * f16) + (fArr2[1] * r11)) & 4294967295L) | (Float.floatToRawIntBits(f18) << 32);
    }

    @Override // a1.c
    public final float e(float f9, float f10, float f11) {
        if (f9 < 0.0f) {
            f9 = 0.0f;
        }
        if (f9 > 1.0f) {
            f9 = 1.0f;
        }
        if (f10 < -0.5f) {
            f10 = -0.5f;
        }
        if (f10 > 0.5f) {
            f10 = 0.5f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        float f12 = f11 <= 0.5f ? f11 : 0.5f;
        float[] fArr = f256g;
        float f13 = (fArr[6] * f12) + (fArr[3] * f10) + (fArr[0] * f9);
        float f14 = (fArr[7] * f12) + (fArr[4] * f10) + (fArr[1] * f9);
        float f15 = (fArr[8] * f12) + (fArr[5] * f10) + (fArr[2] * f9);
        float f16 = f13 * f13 * f13;
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float[] fArr2 = f255f;
        return (fArr2[8] * f18) + (fArr2[5] * f17) + (fArr2[2] * f16);
    }

    @Override // a1.c
    public final long f(float f9, float f10, float f11, float f12, c cVar) {
        float[] fArr = f253d;
        float f13 = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f9);
        float f14 = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f9);
        float f15 = (fArr[8] * f11) + (fArr[5] * f10) + (fArr[2] * f9);
        float u8 = a8.m.u(f13);
        float u9 = a8.m.u(f14);
        float u10 = a8.m.u(f15);
        float[] fArr2 = f254e;
        return l0.b((fArr2[6] * u10) + (fArr2[3] * u9) + (fArr2[0] * u8), (fArr2[7] * u10) + (fArr2[4] * u9) + (fArr2[1] * u8), (fArr2[8] * u10) + (fArr2[5] * u9) + (fArr2[2] * u8), f12, cVar);
    }
}
