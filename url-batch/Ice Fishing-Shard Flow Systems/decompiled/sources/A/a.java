package A;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f0a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5f;

    public a(float f7, float f8, float f9, float f10, float f11, float f12) {
        this.f0a = f7;
        this.f1b = f8;
        this.f2c = f9;
        this.f3d = f10;
        this.f4e = f11;
        this.f5f = f12;
    }

    public static a a(int i2) {
        n nVar = n.f38k;
        float c7 = b.c(Color.red(i2));
        float c8 = b.c(Color.green(i2));
        float c9 = b.c(Color.blue(i2));
        float[][] fArr = b.f9d;
        float[] fArr2 = fArr[0];
        float f7 = (fArr2[2] * c9) + (fArr2[1] * c8) + (fArr2[0] * c7);
        float[] fArr3 = fArr[1];
        float f8 = (fArr3[2] * c9) + (fArr3[1] * c8) + (fArr3[0] * c7);
        float[] fArr4 = fArr[2];
        float f9 = (c9 * fArr4[2]) + (c8 * fArr4[1]) + (c7 * fArr4[0]);
        float[][] fArr5 = b.f6a;
        float[] fArr6 = fArr5[0];
        float f10 = (fArr6[2] * f9) + (fArr6[1] * f8) + (fArr6[0] * f7);
        float[] fArr7 = fArr5[1];
        float f11 = (fArr7[2] * f9) + (fArr7[1] * f8) + (fArr7[0] * f7);
        float[] fArr8 = fArr5[2];
        float f12 = (f9 * fArr8[2]) + (f8 * fArr8[1]) + (f7 * fArr8[0]);
        float[] fArr9 = nVar.f45g;
        float f13 = nVar.f47i;
        float f14 = nVar.f42d;
        float f15 = nVar.f39a;
        float f16 = fArr9[0] * f10;
        float f17 = fArr9[1] * f11;
        float f18 = fArr9[2] * f12;
        float f19 = nVar.f46h;
        float pow = (float) Math.pow((Math.abs(f16) * f19) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f17) * f19) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f18) * f19) / 100.0d, 0.42d);
        float signum = ((Math.signum(f16) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f17) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f18) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d7 = signum3;
        float f20 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d7)) / 11.0f;
        float f21 = ((float) ((signum + signum2) - (d7 * 2.0d))) / 9.0f;
        float f22 = signum2 * 20.0f;
        float f23 = ((21.0f * signum3) + ((signum * 20.0f) + f22)) / 20.0f;
        float f24 = (((signum * 40.0f) + f22) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f21, f20)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f25 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f24 * nVar.f40b) / f15, nVar.j * f14)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f26 = f15 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, nVar.f44f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * nVar.f43e) * nVar.f41c) * ((float) Math.sqrt((f21 * f21) + (f20 * f20)))) / (f23 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        Math.sqrt((r0 * f14) / f26);
        float f27 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f13 * pow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d8 = f25;
        return new a(atan2, pow5, pow4, f27, log * ((float) Math.cos(d8)), log * ((float) Math.sin(d8)));
    }

    public static a b(float f7, float f8, float f9) {
        n nVar = n.f38k;
        float f10 = nVar.f42d;
        Math.sqrt(f7 / 100.0d);
        float f11 = nVar.f39a + 4.0f;
        float f12 = nVar.f47i * f8;
        Math.sqrt(((f8 / ((float) Math.sqrt(r1))) * nVar.f42d) / f11);
        float f13 = (1.7f * f7) / ((0.007f * f7) + 1.0f);
        float log = ((float) Math.log((f12 * 0.0228d) + 1.0d)) * 43.85965f;
        double d7 = (3.1415927f * f9) / 180.0f;
        return new a(f9, f8, f7, f13, log * ((float) Math.cos(d7)), log * ((float) Math.sin(d7)));
    }

    public final int c(n nVar) {
        float f7;
        float f8 = this.f1b;
        double d7 = f8;
        float f9 = this.f2c;
        if (d7 != 0.0d) {
            double d8 = f9;
            if (d8 != 0.0d) {
                f7 = f8 / ((float) Math.sqrt(d8 / 100.0d));
                float f10 = nVar.f44f;
                float f11 = nVar.f46h;
                float pow = (float) Math.pow(f7 / Math.pow(1.64d - Math.pow(0.29d, f10), 0.73d), 1.1111111111111112d);
                double d9 = (this.f0a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d9) + 3.8d)) * 0.25f;
                float pow2 = nVar.f39a * ((float) Math.pow(f9 / 100.0d, (1.0d / nVar.f42d) / nVar.j));
                float f12 = cos * 3846.1538f * nVar.f43e * nVar.f41c;
                float f13 = pow2 / nVar.f40b;
                float sin = (float) Math.sin(d9);
                float cos2 = (float) Math.cos(d9);
                float f14 = (((0.305f + f13) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f12 * 23.0f)));
                float f15 = cos2 * f14;
                float f16 = f14 * sin;
                float f17 = f13 * 460.0f;
                float f18 = ((288.0f * f16) + ((451.0f * f15) + f17)) / 1403.0f;
                float f19 = ((f17 - (891.0f * f15)) - (261.0f * f16)) / 1403.0f;
                float f20 = ((f17 - (f15 * 220.0f)) - (f16 * 6300.0f)) / 1403.0f;
                float f21 = 100.0f / f11;
                float signum = Math.signum(f18) * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f18) * 27.13d) / (400.0d - Math.abs(f18))), 2.380952380952381d));
                float signum2 = Math.signum(f19) * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f19) * 27.13d) / (400.0d - Math.abs(f19))), 2.380952380952381d));
                float signum3 = Math.signum(f20) * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f20) * 27.13d) / (400.0d - Math.abs(f20))), 2.380952380952381d));
                float[] fArr = nVar.f45g;
                float f22 = signum / fArr[0];
                float f23 = signum2 / fArr[1];
                float f24 = signum3 / fArr[2];
                float[][] fArr2 = b.f7b;
                float[] fArr3 = fArr2[0];
                float f25 = (fArr3[2] * f24) + (fArr3[1] * f23) + (fArr3[0] * f22);
                float[] fArr4 = fArr2[1];
                float f26 = (fArr4[2] * f24) + (fArr4[1] * f23) + (fArr4[0] * f22);
                float[] fArr5 = fArr2[2];
                return B.a.a(f25, f26, (f24 * fArr5[2]) + (f23 * fArr5[1]) + (f22 * fArr5[0]));
            }
        }
        f7 = 0.0f;
        float f102 = nVar.f44f;
        float f112 = nVar.f46h;
        float pow3 = (float) Math.pow(f7 / Math.pow(1.64d - Math.pow(0.29d, f102), 0.73d), 1.1111111111111112d);
        double d92 = (this.f0a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d92) + 3.8d)) * 0.25f;
        float pow22 = nVar.f39a * ((float) Math.pow(f9 / 100.0d, (1.0d / nVar.f42d) / nVar.j));
        float f122 = cos3 * 3846.1538f * nVar.f43e * nVar.f41c;
        float f132 = pow22 / nVar.f40b;
        float sin2 = (float) Math.sin(d92);
        float cos22 = (float) Math.cos(d92);
        float f142 = (((0.305f + f132) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + (((11.0f * pow3) * cos22) + (f122 * 23.0f)));
        float f152 = cos22 * f142;
        float f162 = f142 * sin2;
        float f172 = f132 * 460.0f;
        float f182 = ((288.0f * f162) + ((451.0f * f152) + f172)) / 1403.0f;
        float f192 = ((f172 - (891.0f * f152)) - (261.0f * f162)) / 1403.0f;
        float f202 = ((f172 - (f152 * 220.0f)) - (f162 * 6300.0f)) / 1403.0f;
        float f212 = 100.0f / f112;
        float signum4 = Math.signum(f182) * f212 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f182) * 27.13d) / (400.0d - Math.abs(f182))), 2.380952380952381d));
        float signum22 = Math.signum(f192) * f212 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f192) * 27.13d) / (400.0d - Math.abs(f192))), 2.380952380952381d));
        float signum32 = Math.signum(f202) * f212 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f202) * 27.13d) / (400.0d - Math.abs(f202))), 2.380952380952381d));
        float[] fArr6 = nVar.f45g;
        float f222 = signum4 / fArr6[0];
        float f232 = signum22 / fArr6[1];
        float f242 = signum32 / fArr6[2];
        float[][] fArr22 = b.f7b;
        float[] fArr32 = fArr22[0];
        float f252 = (fArr32[2] * f242) + (fArr32[1] * f232) + (fArr32[0] * f222);
        float[] fArr42 = fArr22[1];
        float f262 = (fArr42[2] * f242) + (fArr42[1] * f232) + (fArr42[0] * f222);
        float[] fArr52 = fArr22[2];
        return B.a.a(f252, f262, (f242 * fArr52[2]) + (f232 * fArr52[1]) + (f222 * fArr52[0]));
    }
}
