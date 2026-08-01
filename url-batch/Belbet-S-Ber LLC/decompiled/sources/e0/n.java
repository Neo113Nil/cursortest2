package e0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: k, reason: collision with root package name */
    public static final n f1342k;

    /* renamed from: a, reason: collision with root package name */
    public final float f1343a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1344b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1345c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1346e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1347f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f1348g;
    public final float h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final float f1349j;

    static {
        float[] fArr = b.f1315c;
        float l4 = (float) ((b.l() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f1313a;
        float f5 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f6 = fArr3[0] * f5;
        float f7 = fArr[1];
        float f8 = (fArr3[1] * f7) + f6;
        float f9 = fArr[2];
        float f10 = (fArr3[2] * f9) + f8;
        float[] fArr4 = fArr2[1];
        float f11 = (fArr4[2] * f9) + (fArr4[1] * f7) + (fArr4[0] * f5);
        float[] fArr5 = fArr2[2];
        float f12 = (f9 * fArr5[2]) + (f7 * fArr5[1]) + (f5 * fArr5[0]);
        float f13 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-l4) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float f14 = 1.0f / ((5.0f * l4) + 1.0f);
        float f15 = f14 * f14 * f14 * f14;
        float f16 = 1.0f - f15;
        float cbrt = (0.1f * f16 * f16 * ((float) Math.cbrt(l4 * 5.0d))) + (f15 * l4);
        float l5 = b.l() / fArr[1];
        double d5 = l5;
        float sqrt = ((float) Math.sqrt(d5)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d5, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r2[0] * cbrt) * f10) / 100.0d, 0.42d), (float) Math.pow(((r2[1] * cbrt) * f11) / 100.0d, 0.42d), (float) Math.pow(((r2[2] * cbrt) * f12) / 100.0d, 0.42d)};
        float f17 = fArr6[0];
        float f18 = (f17 * 400.0f) / (f17 + 27.13f);
        float f19 = fArr6[1];
        float f20 = (f19 * 400.0f) / (f19 + 27.13f);
        float f21 = fArr6[2];
        float[] fArr7 = {f18, f20, (400.0f * f21) / (f21 + 27.13f)};
        f1342k = new n(l5, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * pow, pow, pow, f13, 1.0f, new float[]{(((100.0f / f10) * exp) + 1.0f) - exp, (((100.0f / f11) * exp) + 1.0f) - exp, (((100.0f / f12) * exp) + 1.0f) - exp}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public n(float f5, float f6, float f7, float f8, float f9, float f10, float[] fArr, float f11, float f12, float f13) {
        this.f1347f = f5;
        this.f1343a = f6;
        this.f1344b = f7;
        this.f1345c = f8;
        this.d = f9;
        this.f1346e = f10;
        this.f1348g = fArr;
        this.h = f11;
        this.i = f12;
        this.f1349j = f13;
    }
}
