package l1;

import k1.v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l extends c {

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f5794d;

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f5795e;

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f5796f;
    public static final float[] g;

    static {
        float[] g2 = j.g(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, j.c(a.f5748b.f5749a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f5794d = g2;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f5795e = fArr;
        f5796f = j.f(g2);
        g = j.f(fArr);
    }

    @Override // l1.c
    public final float a(int i3) {
        return i3 == 0 ? 1.0f : 0.5f;
    }

    @Override // l1.c
    public final float b(int i3) {
        return i3 == 0 ? 0.0f : -0.5f;
    }

    @Override // l1.c
    public final long d(float f3, float f10, float f11) {
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
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
        float[] fArr = g;
        float f13 = (fArr[6] * f12) + (fArr[3] * f10) + (fArr[0] * f3);
        float f14 = (fArr[7] * f12) + (fArr[4] * f10) + (fArr[1] * f3);
        float f15 = (fArr[8] * f12) + (fArr[5] * f10) + (fArr[2] * f3);
        float f16 = f14 * f14 * f14;
        float f17 = f15 * f15 * f15;
        float[] fArr2 = f5796f;
        float f18 = (fArr2[6] * f17) + (fArr2[3] * f16) + (fArr2[0] * f13 * f13 * f13);
        return (Float.floatToRawIntBits((fArr2[7] * f17) + (fArr2[4] * f16) + (fArr2[1] * r11)) & 4294967295L) | (Float.floatToRawIntBits(f18) << 32);
    }

    @Override // l1.c
    public final float e(float f3, float f10, float f11) {
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
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
        float[] fArr = g;
        float f13 = (fArr[6] * f12) + (fArr[3] * f10) + (fArr[0] * f3);
        float f14 = (fArr[7] * f12) + (fArr[4] * f10) + (fArr[1] * f3);
        float f15 = (fArr[8] * f12) + (fArr[5] * f10) + (fArr[2] * f3);
        float f16 = f13 * f13 * f13;
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float[] fArr2 = f5796f;
        return (fArr2[8] * f18) + (fArr2[5] * f17) + (fArr2[2] * f16);
    }

    @Override // l1.c
    public final long f(float f3, float f10, float f11, float f12, c cVar) {
        float[] fArr = f5794d;
        float f13 = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f3);
        float f14 = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f3);
        float f15 = (fArr[8] * f11) + (fArr[5] * f10) + (fArr[2] * f3);
        float a9 = z2.b.a(f13);
        float a10 = z2.b.a(f14);
        float a11 = z2.b.a(f15);
        float[] fArr2 = f5795e;
        return v.a((fArr2[6] * a11) + (fArr2[3] * a10) + (fArr2[0] * a9), (fArr2[7] * a11) + (fArr2[4] * a10) + (fArr2[1] * a9), (fArr2[8] * a11) + (fArr2[5] * a10) + (fArr2[2] * a9), f12, cVar);
    }
}
