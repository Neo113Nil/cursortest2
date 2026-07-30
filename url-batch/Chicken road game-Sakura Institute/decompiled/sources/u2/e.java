package u2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: k, reason: collision with root package name */
    public static final e f8975k;

    /* renamed from: a, reason: collision with root package name */
    public final float f8976a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8977b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8978c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8979d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8980e;

    /* renamed from: f, reason: collision with root package name */
    public final float f8981f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f8982g;

    /* renamed from: h, reason: collision with root package name */
    public final float f8983h;

    /* renamed from: i, reason: collision with root package name */
    public final float f8984i;

    /* renamed from: j, reason: collision with root package name */
    public final float f8985j;

    static {
        float d8 = (float) ((b.d() * 63.66197723675813d) / 100.0d);
        float[] fArr = b.f8972c;
        float f9 = fArr[0];
        float[][] fArr2 = b.f8970a;
        float[] fArr3 = fArr2[0];
        float f10 = fArr3[0] * f9;
        float f11 = fArr[1];
        float f12 = (fArr3[1] * f11) + f10;
        float f13 = fArr[2];
        float f14 = (fArr3[2] * f13) + f12;
        float[] fArr4 = fArr2[1];
        float f15 = (fArr4[2] * f13) + (fArr4[1] * f11) + (fArr4[0] * f9);
        float[] fArr5 = fArr2[2];
        float f16 = (f13 * fArr5[2]) + (f11 * fArr5[1]) + (f9 * fArr5[0]);
        float f17 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-d8) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d9 = exp;
        if (d9 > 1.0d) {
            exp = 1.0f;
        } else if (d9 < 0.0d) {
            exp = 0.0f;
        }
        float f18 = 1.0f / ((5.0f * d8) + 1.0f);
        float f19 = f18 * f18 * f18 * f18;
        float f20 = 1.0f - f19;
        float cbrt = (0.1f * f20 * f20 * ((float) Math.cbrt(d8 * 5.0d))) + (f19 * d8);
        float d10 = b.d() / fArr[1];
        double d11 = d10;
        float sqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r2[0] * cbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((r2[1] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((r2[2] * cbrt) * f16) / 100.0d, 0.42d)};
        float f21 = fArr6[0];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr6[1];
        float f24 = (f23 * 400.0f) / (f23 + 27.13f);
        float f25 = fArr6[2];
        float[] fArr7 = {f22, f24, (400.0f * f25) / (f25 + 27.13f)};
        f8975k = new e(d10, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * pow, pow, pow, f17, 1.0f, new float[]{(((100.0f / f14) * exp) + 1.0f) - exp, (((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public e(float f9, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.f8981f = f9;
        this.f8976a = f10;
        this.f8977b = f11;
        this.f8978c = f12;
        this.f8979d = f13;
        this.f8980e = f14;
        this.f8982g = fArr;
        this.f8983h = f15;
        this.f8984i = f16;
        this.f8985j = f17;
    }
}
