package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class tr2 {
    public static final tr2 dgRBjINgWbAK;
    public final float OPXfSBeufaJ8;
    public final float PxuCJdSBwIXG;
    public final float[] RAsUl2FVSrh6;
    public final float TSizfFm2Yiuu;
    public final float Y1f8riQaR6yg;
    public final float a92UlCVFR9N8;
    public final float e9gEMXR7LXtO;
    public final float lS5Rgt96tfkO;
    public final float rtx2ld2ELZv4;
    public final float wdg6QnbFHrFF;

    static {
        float[] fArr = cs0.dgRBjINgWbAK;
        float ryVscX7ZL4Ux = (float) ((cs0.ryVscX7ZL4Ux() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = cs0.OPXfSBeufaJ8;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + f2;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float exp = (1.0f - (((float) Math.exp(((-ryVscX7ZL4Ux) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f6) * exp) + 1.0f) - exp, (((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp};
        float f9 = 1.0f / ((5.0f * ryVscX7ZL4Ux) + 1.0f);
        float f10 = f9 * f9 * f9 * f9;
        float f11 = 1.0f - f10;
        float cbrt = (0.1f * f11 * f11 * ((float) Math.cbrt(ryVscX7ZL4Ux * 5.0d))) + (f10 * ryVscX7ZL4Ux);
        float ryVscX7ZL4Ux2 = cs0.ryVscX7ZL4Ux() / fArr[1];
        double d2 = ryVscX7ZL4Ux2;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f6) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f7) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f8) / 100.0d, 0.42d)};
        float f12 = fArr7[0];
        float f13 = (f12 * 400.0f) / (f12 + 27.13f);
        float f14 = fArr7[1];
        float f15 = (f14 * 400.0f) / (f14 + 27.13f);
        float f16 = fArr7[2];
        float[] fArr8 = {f13, f15, (400.0f * f16) / (f16 + 27.13f)};
        dgRBjINgWbAK = new tr2(ryVscX7ZL4Ux2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, 0.69f, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public tr2(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.a92UlCVFR9N8 = f;
        this.PxuCJdSBwIXG = f2;
        this.lS5Rgt96tfkO = f3;
        this.TSizfFm2Yiuu = f4;
        this.Y1f8riQaR6yg = f5;
        this.e9gEMXR7LXtO = f6;
        this.RAsUl2FVSrh6 = fArr;
        this.rtx2ld2ELZv4 = f7;
        this.OPXfSBeufaJ8 = f8;
        this.wdg6QnbFHrFF = f9;
    }
}
