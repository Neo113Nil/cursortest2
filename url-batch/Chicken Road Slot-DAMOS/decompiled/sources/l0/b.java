package l0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: k, reason: collision with root package name */
    public static final b f5739k;

    /* renamed from: a, reason: collision with root package name */
    public final float f5740a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5741b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5742c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5743d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5744e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5745f;
    public final float[] g;

    /* renamed from: h, reason: collision with root package name */
    public final float f5746h;

    /* renamed from: i, reason: collision with root package name */
    public final float f5747i;
    public final float j;

    static {
        float[] fArr = a.f5733c;
        float pow = (float) (((Math.pow(0.5689655172413793d, 3.0d) * 100.0d) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = a.f5731a;
        float f3 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f10 = fArr3[0] * f3;
        float f11 = fArr[1];
        float f12 = (fArr3[1] * f11) + f10;
        float f13 = fArr[2];
        float f14 = (fArr3[2] * f13) + f12;
        float[] fArr4 = fArr2[1];
        float f15 = (fArr4[2] * f13) + (fArr4[1] * f11) + (fArr4[0] * f3);
        float[] fArr5 = fArr2[2];
        float f16 = (f13 * fArr5[2]) + (f11 * fArr5[1]) + (f3 * fArr5[0]);
        float f17 = ((double) 1.0f) >= 0.9d ? 0.69000006f : 0.6549999f;
        float exp = (1.0f - (((float) Math.exp(((-pow) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d10 = exp;
        if (d10 > 1.0d) {
            exp = 1.0f;
        } else if (d10 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f14) * exp) + 1.0f) - exp, (((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp};
        float f18 = 1.0f / ((5.0f * pow) + 1.0f);
        float f19 = f18 * f18 * f18 * f18;
        float f20 = 1.0f - f19;
        float cbrt = (0.1f * f20 * f20 * ((float) Math.cbrt(pow * 5.0d))) + (f19 * pow);
        double d11 = 50.0f;
        float pow2 = ((float) (d11 > 8.0d ? Math.pow((d11 + 16.0d) / 116.0d, 3.0d) * 100.0d : (d11 / 903.2962962962963d) * 100.0d)) / fArr[1];
        double d12 = pow2;
        float sqrt = ((float) Math.sqrt(d12)) + 1.48f;
        float pow3 = 0.725f / ((float) Math.pow(d12, 0.2f));
        double d13 = 0.42f;
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f14) / 100.0f, d13), (float) Math.pow(((fArr6[1] * cbrt) * f15) / 100.0f, d13), (float) Math.pow(((fArr6[2] * cbrt) * f16) / 100.0f, d13)};
        float f21 = fArr7[0];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr7[1];
        float f24 = (f23 * 400.0f) / (f23 + 27.13f);
        float f25 = fArr7[2];
        float[] fArr8 = {f22, f24, (400.0f * f25) / (f25 + 27.13f)};
        f5739k = new b(pow2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow3, pow3, pow3, f17, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25f), sqrt);
    }

    public b(float f3, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.f5740a = f3;
        this.f5741b = f10;
        this.f5742c = f11;
        this.f5743d = f12;
        this.f5744e = f13;
        this.f5745f = f14;
        this.g = fArr;
        this.f5746h = f15;
        this.f5747i = f16;
        this.j = f17;
    }
}
