package U0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: k, reason: collision with root package name */
    public static final f f3329k;

    /* renamed from: a, reason: collision with root package name */
    public final float f3330a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3331b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3332c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3333d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3334e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3335f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3336g;

    /* renamed from: h, reason: collision with root package name */
    public final float f3337h;

    /* renamed from: i, reason: collision with root package name */
    public final float f3338i;

    /* renamed from: j, reason: collision with root package name */
    public final float f3339j;

    static {
        float[] fArr = b.f3324c;
        float d3 = (float) ((b.d() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f3322a;
        float f3 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f4 = fArr3[0] * f3;
        float f5 = fArr[1];
        float f6 = (fArr3[1] * f5) + f4;
        float f7 = fArr[2];
        float f8 = (fArr3[2] * f7) + f6;
        float[] fArr4 = fArr2[1];
        float f9 = (fArr4[2] * f7) + (fArr4[1] * f5) + (fArr4[0] * f3);
        float[] fArr5 = fArr2[2];
        float f10 = (f7 * fArr5[2]) + (f5 * fArr5[1]) + (f3 * fArr5[0]);
        float f11 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-d3) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d4 = exp;
        if (d4 > 1.0d) {
            exp = 1.0f;
        } else if (d4 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp, (((100.0f / f10) * exp) + 1.0f) - exp};
        float f12 = 1.0f / ((5.0f * d3) + 1.0f);
        float f13 = f12 * f12 * f12 * f12;
        float f14 = 1.0f - f13;
        float cbrt = (0.1f * f14 * f14 * ((float) Math.cbrt(d3 * 5.0d))) + (f13 * d3);
        float d5 = b.d() / fArr[1];
        double d6 = d5;
        float sqrt = ((float) Math.sqrt(d6)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d6, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f8) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f9) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f10) / 100.0d, 0.42d)};
        float f15 = fArr7[0];
        float f16 = (f15 * 400.0f) / (f15 + 27.13f);
        float f17 = fArr7[1];
        float f18 = (f17 * 400.0f) / (f17 + 27.13f);
        float f19 = fArr7[2];
        float[] fArr8 = {f16, f18, (400.0f * f19) / (f19 + 27.13f)};
        f3329k = new f(d5, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, f11, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public f(float f3, float f4, float f5, float f6, float f7, float f8, float[] fArr, float f9, float f10, float f11) {
        this.f3335f = f3;
        this.f3330a = f4;
        this.f3331b = f5;
        this.f3332c = f6;
        this.f3333d = f7;
        this.f3334e = f8;
        this.f3336g = fArr;
        this.f3337h = f9;
        this.f3338i = f10;
        this.f3339j = f11;
    }
}
