package b0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: k, reason: collision with root package name */
    public static final n f718k;

    /* renamed from: a, reason: collision with root package name */
    public final float f719a;

    /* renamed from: b, reason: collision with root package name */
    public final float f720b;
    public final float c;

    /* renamed from: d, reason: collision with root package name */
    public final float f721d;

    /* renamed from: e, reason: collision with root package name */
    public final float f722e;

    /* renamed from: f, reason: collision with root package name */
    public final float f723f;
    public final float[] g;
    public final float h;

    /* renamed from: i, reason: collision with root package name */
    public final float f724i;

    /* renamed from: j, reason: collision with root package name */
    public final float f725j;

    static {
        float[] fArr = b.c;
        float l4 = (float) ((b.l() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f692a;
        float f4 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f5 = fArr3[0] * f4;
        float f6 = fArr[1];
        float f7 = (fArr3[1] * f6) + f5;
        float f8 = fArr[2];
        float f9 = (fArr3[2] * f8) + f7;
        float[] fArr4 = fArr2[1];
        float f10 = (fArr4[2] * f8) + (fArr4[1] * f6) + (fArr4[0] * f4);
        float[] fArr5 = fArr2[2];
        float f11 = (f8 * fArr5[2]) + (f6 * fArr5[1]) + (f4 * fArr5[0]);
        float f12 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-l4) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d4 = exp;
        if (d4 > 1.0d) {
            exp = 1.0f;
        } else if (d4 < 0.0d) {
            exp = 0.0f;
        }
        float f13 = 1.0f / ((5.0f * l4) + 1.0f);
        float f14 = f13 * f13 * f13 * f13;
        float f15 = 1.0f - f14;
        float cbrt = (0.1f * f15 * f15 * ((float) Math.cbrt(l4 * 5.0d))) + (f14 * l4);
        float l5 = b.l() / fArr[1];
        double d5 = l5;
        float sqrt = ((float) Math.sqrt(d5)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d5, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r2[0] * cbrt) * f9) / 100.0d, 0.42d), (float) Math.pow(((r2[1] * cbrt) * f10) / 100.0d, 0.42d), (float) Math.pow(((r2[2] * cbrt) * f11) / 100.0d, 0.42d)};
        float f16 = fArr6[0];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr6[1];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr6[2];
        float[] fArr7 = {f17, f19, (400.0f * f20) / (f20 + 27.13f)};
        f718k = new n(l5, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * pow, pow, pow, f12, 1.0f, new float[]{(((100.0f / f9) * exp) + 1.0f) - exp, (((100.0f / f10) * exp) + 1.0f) - exp, (((100.0f / f11) * exp) + 1.0f) - exp}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public n(float f4, float f5, float f6, float f7, float f8, float f9, float[] fArr, float f10, float f11, float f12) {
        this.f723f = f4;
        this.f719a = f5;
        this.f720b = f6;
        this.c = f7;
        this.f721d = f8;
        this.f722e = f9;
        this.g = fArr;
        this.h = f10;
        this.f724i = f11;
        this.f725j = f12;
    }
}
