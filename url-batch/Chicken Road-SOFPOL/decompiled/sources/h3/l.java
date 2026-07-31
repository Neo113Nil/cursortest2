package h3;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: k, reason: collision with root package name */
    public static final l f3153k;

    /* renamed from: a, reason: collision with root package name */
    public final float f3154a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3155b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3156c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3157d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3158e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3159f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3160g;

    /* renamed from: h, reason: collision with root package name */
    public final float f3161h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final float f3162j;

    static {
        float i = (float) ((b.i() * 63.66197723675813d) / 100.0d);
        float[] fArr = b.f3128c;
        float f6 = fArr[0];
        float[][] fArr2 = b.f3126a;
        float[] fArr3 = fArr2[0];
        float f8 = fArr3[0] * f6;
        float f9 = fArr[1];
        float f10 = (fArr3[1] * f9) + f8;
        float f11 = fArr[2];
        float f12 = (fArr3[2] * f11) + f10;
        float[] fArr4 = fArr2[1];
        float f13 = (fArr4[2] * f11) + (fArr4[1] * f9) + (fArr4[0] * f6);
        float[] fArr5 = fArr2[2];
        float f14 = (f11 * fArr5[2]) + (f9 * fArr5[1]) + (f6 * fArr5[0]);
        float f15 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-i) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d8 = exp;
        if (d8 > 1.0d) {
            exp = 1.0f;
        } else if (d8 < 0.0d) {
            exp = 0.0f;
        }
        float f16 = 1.0f / ((5.0f * i) + 1.0f);
        float f17 = f16 * f16 * f16 * f16;
        float f18 = 1.0f - f17;
        float cbrt = (0.1f * f18 * f18 * ((float) Math.cbrt(i * 5.0d))) + (f17 * i);
        float i8 = b.i() / fArr[1];
        double d9 = i8;
        float sqrt = ((float) Math.sqrt(d9)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d9, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r2[0] * cbrt) * f12) / 100.0d, 0.42d), (float) Math.pow(((r2[1] * cbrt) * f13) / 100.0d, 0.42d), (float) Math.pow(((r2[2] * cbrt) * f14) / 100.0d, 0.42d)};
        float f19 = fArr6[0];
        float f20 = (f19 * 400.0f) / (f19 + 27.13f);
        float f21 = fArr6[1];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr6[2];
        float[] fArr7 = {f20, f22, (400.0f * f23) / (f23 + 27.13f)};
        f3153k = new l(i8, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * pow, pow, pow, f15, 1.0f, new float[]{(((100.0f / f12) * exp) + 1.0f) - exp, (((100.0f / f13) * exp) + 1.0f) - exp, (((100.0f / f14) * exp) + 1.0f) - exp}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public l(float f6, float f8, float f9, float f10, float f11, float f12, float[] fArr, float f13, float f14, float f15) {
        this.f3159f = f6;
        this.f3154a = f8;
        this.f3155b = f9;
        this.f3156c = f10;
        this.f3157d = f11;
        this.f3158e = f12;
        this.f3160g = fArr;
        this.f3161h = f13;
        this.i = f14;
        this.f3162j = f15;
    }
}
