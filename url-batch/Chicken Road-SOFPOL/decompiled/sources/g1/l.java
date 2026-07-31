package g1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l extends c {

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f2859d;

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f2860e;

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f2861f;

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f2862g;

    static {
        float[] g3 = j.g(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, j.c(a.f2811b.f2812a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f2859d = g3;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f2860e = fArr;
        f2861f = j.f(g3);
        f2862g = j.f(fArr);
    }

    @Override // g1.c
    public final float a(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // g1.c
    public final float b(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    @Override // g1.c
    public final long d(float f6, float f8, float f9) {
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f8 < -0.5f) {
            f8 = -0.5f;
        }
        if (f8 > 0.5f) {
            f8 = 0.5f;
        }
        if (f9 < -0.5f) {
            f9 = -0.5f;
        }
        float f10 = f9 <= 0.5f ? f9 : 0.5f;
        float[] fArr = f2862g;
        float f11 = (fArr[6] * f10) + (fArr[3] * f8) + (fArr[0] * f6);
        float f12 = (fArr[7] * f10) + (fArr[4] * f8) + (fArr[1] * f6);
        float f13 = (fArr[8] * f10) + (fArr[5] * f8) + (fArr[2] * f6);
        float f14 = f12 * f12 * f12;
        float f15 = f13 * f13 * f13;
        float[] fArr2 = f2861f;
        float f16 = (fArr2[6] * f15) + (fArr2[3] * f14) + (fArr2[0] * f11 * f11 * f11);
        return (Float.floatToRawIntBits((fArr2[7] * f15) + (fArr2[4] * f14) + (fArr2[1] * r11)) & 4294967295L) | (Float.floatToRawIntBits(f16) << 32);
    }

    @Override // g1.c
    public final float e(float f6, float f8, float f9) {
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f8 < -0.5f) {
            f8 = -0.5f;
        }
        if (f8 > 0.5f) {
            f8 = 0.5f;
        }
        if (f9 < -0.5f) {
            f9 = -0.5f;
        }
        float f10 = f9 <= 0.5f ? f9 : 0.5f;
        float[] fArr = f2862g;
        float f11 = (fArr[6] * f10) + (fArr[3] * f8) + (fArr[0] * f6);
        float f12 = (fArr[7] * f10) + (fArr[4] * f8) + (fArr[1] * f6);
        float f13 = (fArr[8] * f10) + (fArr[5] * f8) + (fArr[2] * f6);
        float f14 = f11 * f11 * f11;
        float f15 = f12 * f12 * f12;
        float f16 = f13 * f13 * f13;
        float[] fArr2 = f2861f;
        return (fArr2[8] * f16) + (fArr2[5] * f15) + (fArr2[2] * f14);
    }

    @Override // g1.c
    public final long f(float f6, float f8, float f9, float f10, c cVar) {
        float[] fArr = f2859d;
        float f11 = (fArr[6] * f9) + (fArr[3] * f8) + (fArr[0] * f6);
        float f12 = (fArr[7] * f9) + (fArr[4] * f8) + (fArr[1] * f6);
        float f13 = (fArr[8] * f9) + (fArr[5] * f8) + (fArr[2] * f6);
        float t3 = r2.r.t(f11);
        float t7 = r2.r.t(f12);
        float t8 = r2.r.t(f13);
        float[] fArr2 = f2860e;
        return f1.p.a((fArr2[6] * t8) + (fArr2[3] * t7) + (fArr2[0] * t3), (fArr2[7] * t8) + (fArr2[4] * t7) + (fArr2[1] * t3), (fArr2[8] * t8) + (fArr2[5] * t7) + (fArr2[2] * t3), f10, cVar);
    }
}
