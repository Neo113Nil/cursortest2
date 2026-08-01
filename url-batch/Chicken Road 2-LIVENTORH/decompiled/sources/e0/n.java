package e0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: k, reason: collision with root package name */
    public static final n f1161k;

    /* renamed from: a, reason: collision with root package name */
    public final float f1162a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1163b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1164c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1165e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1166f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f1167g;

    /* renamed from: h, reason: collision with root package name */
    public final float f1168h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final float f1169j;

    static {
        float[] fArr = b.f1133c;
        float l4 = (float) ((b.l() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f1131a;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f4 = fArr3[0] * f2;
        float f5 = fArr[1];
        float f6 = (fArr3[1] * f5) + f4;
        float f7 = fArr[2];
        float f8 = (fArr3[2] * f7) + f6;
        float[] fArr4 = fArr2[1];
        float f9 = (fArr4[2] * f7) + (fArr4[1] * f5) + (fArr4[0] * f2);
        float[] fArr5 = fArr2[2];
        float f10 = (f7 * fArr5[2]) + (f5 * fArr5[1]) + (f2 * fArr5[0]);
        float f11 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-l4) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float f12 = 1.0f / ((5.0f * l4) + 1.0f);
        float f13 = f12 * f12 * f12 * f12;
        float f14 = 1.0f - f13;
        float cbrt = (0.1f * f14 * f14 * ((float) Math.cbrt(l4 * 5.0d))) + (f13 * l4);
        float l5 = b.l() / fArr[1];
        double d3 = l5;
        float sqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r2[0] * cbrt) * f8) / 100.0d, 0.42d), (float) Math.pow(((r2[1] * cbrt) * f9) / 100.0d, 0.42d), (float) Math.pow(((r2[2] * cbrt) * f10) / 100.0d, 0.42d)};
        float f15 = fArr6[0];
        float f16 = (f15 * 400.0f) / (f15 + 27.13f);
        float f17 = fArr6[1];
        float f18 = (f17 * 400.0f) / (f17 + 27.13f);
        float f19 = fArr6[2];
        float[] fArr7 = {f16, f18, (400.0f * f19) / (f19 + 27.13f)};
        f1161k = new n(l5, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * pow, pow, pow, f11, 1.0f, new float[]{(((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp, (((100.0f / f10) * exp) + 1.0f) - exp}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public n(float f2, float f4, float f5, float f6, float f7, float f8, float[] fArr, float f9, float f10, float f11) {
        this.f1166f = f2;
        this.f1162a = f4;
        this.f1163b = f5;
        this.f1164c = f6;
        this.d = f7;
        this.f1165e = f8;
        this.f1167g = fArr;
        this.f1168h = f9;
        this.i = f10;
        this.f1169j = f11;
    }
}
