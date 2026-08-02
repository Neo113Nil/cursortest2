package s;

/* renamed from: s.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303n {

    /* renamed from: k, reason: collision with root package name */
    public static final C0303n f3424k;

    /* renamed from: a, reason: collision with root package name */
    public final float f3425a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3426b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3427c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3428d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3429e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3430f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3431g;

    /* renamed from: h, reason: collision with root package name */
    public final float f3432h;

    /* renamed from: i, reason: collision with root package name */
    public final float f3433i;

    /* renamed from: j, reason: collision with root package name */
    public final float f3434j;

    static {
        float[] fArr = AbstractC0291b.f3402c;
        float l2 = (float) ((AbstractC0291b.l() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = AbstractC0291b.f3400a;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f3 = fArr3[0] * f2;
        float f4 = fArr[1];
        float f5 = (fArr3[1] * f4) + f3;
        float f6 = fArr[2];
        float f7 = (fArr3[2] * f6) + f5;
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[2] * f6) + (fArr4[1] * f4) + (fArr4[0] * f2);
        float[] fArr5 = fArr2[2];
        float f9 = (f6 * fArr5[2]) + (f4 * fArr5[1]) + (f2 * fArr5[0]);
        float f10 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-l2) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d2 = exp;
        if (d2 > 1.0d) {
            exp = 1.0f;
        } else if (d2 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp};
        float f11 = 1.0f / ((5.0f * l2) + 1.0f);
        float f12 = f11 * f11 * f11 * f11;
        float f13 = 1.0f - f12;
        float cbrt = (0.1f * f13 * f13 * ((float) Math.cbrt(l2 * 5.0d))) + (f12 * l2);
        float l3 = AbstractC0291b.l() / fArr[1];
        double d3 = l3;
        float sqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f7) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f8) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f9) / 100.0d, 0.42d)};
        float f14 = fArr7[0];
        float f15 = (f14 * 400.0f) / (f14 + 27.13f);
        float f16 = fArr7[1];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr7[2];
        float[] fArr8 = {f15, f17, (400.0f * f18) / (f18 + 27.13f)};
        f3424k = new C0303n(l3, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, f10, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public C0303n(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10) {
        this.f3430f = f2;
        this.f3425a = f3;
        this.f3426b = f4;
        this.f3427c = f5;
        this.f3428d = f6;
        this.f3429e = f7;
        this.f3431g = fArr;
        this.f3432h = f8;
        this.f3433i = f9;
        this.f3434j = f10;
    }
}
