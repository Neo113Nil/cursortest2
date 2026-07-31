package androidx.core.content.res;

/* loaded from: classes.dex */
final class i {

    /* renamed from: k, reason: collision with root package name */
    static final i f11758k = k(b.f11729c, (float) ((b.h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a, reason: collision with root package name */
    private final float f11759a;

    /* renamed from: b, reason: collision with root package name */
    private final float f11760b;

    /* renamed from: c, reason: collision with root package name */
    private final float f11761c;

    /* renamed from: d, reason: collision with root package name */
    private final float f11762d;

    /* renamed from: e, reason: collision with root package name */
    private final float f11763e;

    /* renamed from: f, reason: collision with root package name */
    private final float f11764f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f11765g;

    /* renamed from: h, reason: collision with root package name */
    private final float f11766h;

    /* renamed from: i, reason: collision with root package name */
    private final float f11767i;

    /* renamed from: j, reason: collision with root package name */
    private final float f11768j;

    private i(float f4, float f5, float f6, float f7, float f8, float f9, float[] fArr, float f10, float f11, float f12) {
        this.f11764f = f4;
        this.f11759a = f5;
        this.f11760b = f6;
        this.f11761c = f7;
        this.f11762d = f8;
        this.f11763e = f9;
        this.f11765g = fArr;
        this.f11766h = f10;
        this.f11767i = f11;
        this.f11768j = f12;
    }

    static i k(float[] fArr, float f4, float f5, float f6, boolean z4) {
        float[][] fArr2 = b.f11727a;
        float f7 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f8 = fArr3[0] * f7;
        float f9 = fArr[1];
        float f10 = f8 + (fArr3[1] * f9);
        float f11 = fArr[2];
        float f12 = f10 + (fArr3[2] * f11);
        float[] fArr4 = fArr2[1];
        float f13 = (fArr4[0] * f7) + (fArr4[1] * f9) + (fArr4[2] * f11);
        float[] fArr5 = fArr2[2];
        float f14 = (f7 * fArr5[0]) + (f9 * fArr5[1]) + (f11 * fArr5[2]);
        float f15 = (f6 / 10.0f) + 0.8f;
        float d4 = ((double) f15) >= 0.9d ? b.d(0.59f, 0.69f, (f15 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f15 - 0.8f) * 10.0f);
        float exp = z4 ? 1.0f : (1.0f - (((float) Math.exp(((-f4) - 42.0f) / 92.0f)) * 0.2777778f)) * f15;
        double d5 = exp;
        if (d5 > 1.0d) {
            exp = 1.0f;
        } else if (d5 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f12) * exp) + 1.0f) - exp, (((100.0f / f13) * exp) + 1.0f) - exp, (((100.0f / f14) * exp) + 1.0f) - exp};
        float f16 = 1.0f / ((5.0f * f4) + 1.0f);
        float f17 = f16 * f16 * f16 * f16;
        float f18 = 1.0f - f17;
        float cbrt = (f17 * f4) + (0.1f * f18 * f18 * ((float) Math.cbrt(f4 * 5.0d)));
        float h4 = b.h(f5) / fArr[1];
        double d6 = h4;
        float sqrt = ((float) Math.sqrt(d6)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d6, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f12) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f13) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f14) / 100.0d, 0.42d)};
        float f19 = fArr7[0];
        float f20 = (f19 * 400.0f) / (f19 + 27.13f);
        float f21 = fArr7[1];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr7[2];
        float[] fArr8 = {f20, f22, (400.0f * f23) / (f23 + 27.13f)};
        return new i(h4, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * pow, pow, pow, d4, f15, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    float a() {
        return this.f11759a;
    }

    float b() {
        return this.f11762d;
    }

    float c() {
        return this.f11766h;
    }

    float d() {
        return this.f11767i;
    }

    float e() {
        return this.f11764f;
    }

    float f() {
        return this.f11760b;
    }

    float g() {
        return this.f11763e;
    }

    float h() {
        return this.f11761c;
    }

    float[] i() {
        return this.f11765g;
    }

    float j() {
        return this.f11768j;
    }
}
