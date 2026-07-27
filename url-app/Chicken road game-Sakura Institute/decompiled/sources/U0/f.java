package U0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: k, reason: collision with root package name */
    public static final f f4095k;

    /* renamed from: a, reason: collision with root package name */
    public final float f4096a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4097b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4098c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4099d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4100e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4101f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f4102g;

    /* renamed from: h, reason: collision with root package name */
    public final float f4103h;

    /* renamed from: i, reason: collision with root package name */
    public final float f4104i;

    /* renamed from: j, reason: collision with root package name */
    public final float f4105j;

    static {
        float[] fArr = b.f4090c;
        float d4 = (float) ((b.d() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f4088a;
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
        float exp = (1.0f - (((float) Math.exp(((-d4) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d5 = exp;
        if (d5 > 1.0d) {
            exp = 1.0f;
        } else if (d5 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f9) * exp) + 1.0f) - exp, (((100.0f / f10) * exp) + 1.0f) - exp, (((100.0f / f11) * exp) + 1.0f) - exp};
        float f13 = 1.0f / ((5.0f * d4) + 1.0f);
        float f14 = f13 * f13 * f13 * f13;
        float f15 = 1.0f - f14;
        float cbrt = (0.1f * f15 * f15 * ((float) Math.cbrt(d4 * 5.0d))) + (f14 * d4);
        float d6 = b.d() / fArr[1];
        double d7 = d6;
        float sqrt = ((float) Math.sqrt(d7)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d7, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f9) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f10) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f11) / 100.0d, 0.42d)};
        float f16 = fArr7[0];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr7[1];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr7[2];
        float[] fArr8 = {f17, f19, (400.0f * f20) / (f20 + 27.13f)};
        f4095k = new f(d6, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, f12, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public f(float f4, float f5, float f6, float f7, float f8, float f9, float[] fArr, float f10, float f11, float f12) {
        this.f4101f = f4;
        this.f4096a = f5;
        this.f4097b = f6;
        this.f4098c = f7;
        this.f4099d = f8;
        this.f4100e = f9;
        this.f4102g = fArr;
        this.f4103h = f10;
        this.f4104i = f11;
        this.f4105j = f12;
    }
}
