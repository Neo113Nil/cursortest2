package A;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: k, reason: collision with root package name */
    public static final n f38k;

    /* renamed from: a, reason: collision with root package name */
    public final float f39a;

    /* renamed from: b, reason: collision with root package name */
    public final float f40b;

    /* renamed from: c, reason: collision with root package name */
    public final float f41c;

    /* renamed from: d, reason: collision with root package name */
    public final float f42d;

    /* renamed from: e, reason: collision with root package name */
    public final float f43e;

    /* renamed from: f, reason: collision with root package name */
    public final float f44f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f45g;

    /* renamed from: h, reason: collision with root package name */
    public final float f46h;

    /* renamed from: i, reason: collision with root package name */
    public final float f47i;
    public final float j;

    static {
        float[] fArr = b.f8c;
        float g7 = (float) ((b.g() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f6a;
        float f7 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f8 = fArr3[0] * f7;
        float f9 = fArr[1];
        float f10 = (fArr3[1] * f9) + f8;
        float f11 = fArr[2];
        float f12 = (fArr3[2] * f11) + f10;
        float[] fArr4 = fArr2[1];
        float f13 = (fArr4[2] * f11) + (fArr4[1] * f9) + (fArr4[0] * f7);
        float[] fArr5 = fArr2[2];
        float f14 = (f11 * fArr5[2]) + (f9 * fArr5[1]) + (f7 * fArr5[0]);
        float f15 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-g7) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d7 = exp;
        if (d7 > 1.0d) {
            exp = 1.0f;
        } else if (d7 < 0.0d) {
            exp = 0.0f;
        }
        float f16 = 1.0f / ((5.0f * g7) + 1.0f);
        float f17 = f16 * f16 * f16 * f16;
        float f18 = 1.0f - f17;
        float cbrt = (0.1f * f18 * f18 * ((float) Math.cbrt(g7 * 5.0d))) + (f17 * g7);
        float g8 = b.g() / fArr[1];
        double d8 = g8;
        float sqrt = ((float) Math.sqrt(d8)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d8, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r2[0] * cbrt) * f12) / 100.0d, 0.42d), (float) Math.pow(((r2[1] * cbrt) * f13) / 100.0d, 0.42d), (float) Math.pow(((r2[2] * cbrt) * f14) / 100.0d, 0.42d)};
        float f19 = fArr6[0];
        float f20 = (f19 * 400.0f) / (f19 + 27.13f);
        float f21 = fArr6[1];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr6[2];
        float[] fArr7 = {f20, f22, (400.0f * f23) / (f23 + 27.13f)};
        f38k = new n(g8, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * pow, pow, pow, f15, 1.0f, new float[]{(((100.0f / f12) * exp) + 1.0f) - exp, (((100.0f / f13) * exp) + 1.0f) - exp, (((100.0f / f14) * exp) + 1.0f) - exp}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public n(float f7, float f8, float f9, float f10, float f11, float f12, float[] fArr, float f13, float f14, float f15) {
        this.f44f = f7;
        this.f39a = f8;
        this.f40b = f9;
        this.f41c = f10;
        this.f42d = f11;
        this.f43e = f12;
        this.f45g = fArr;
        this.f46h = f13;
        this.f47i = f14;
        this.j = f15;
    }
}
