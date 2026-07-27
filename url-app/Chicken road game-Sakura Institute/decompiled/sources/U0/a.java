package U0;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f4082a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4083b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4084c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4085d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4086e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4087f;

    public a(float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f4082a = f4;
        this.f4083b = f5;
        this.f4084c = f6;
        this.f4085d = f7;
        this.f4086e = f8;
        this.f4087f = f9;
    }

    public static a a(int i2) {
        f fVar = f.f4095k;
        float c4 = b.c(Color.red(i2));
        float c5 = b.c(Color.green(i2));
        float c6 = b.c(Color.blue(i2));
        float[][] fArr = b.f4091d;
        float[] fArr2 = fArr[0];
        float f4 = (fArr2[2] * c6) + (fArr2[1] * c5) + (fArr2[0] * c4);
        float[] fArr3 = fArr[1];
        float f5 = (fArr3[2] * c6) + (fArr3[1] * c5) + (fArr3[0] * c4);
        float[] fArr4 = fArr[2];
        float f6 = (c6 * fArr4[2]) + (c5 * fArr4[1]) + (c4 * fArr4[0]);
        float[][] fArr5 = b.f4088a;
        float[] fArr6 = fArr5[0];
        float f7 = (fArr6[2] * f6) + (fArr6[1] * f5) + (fArr6[0] * f4);
        float[] fArr7 = fArr5[1];
        float f8 = (fArr7[2] * f6) + (fArr7[1] * f5) + (fArr7[0] * f4);
        float[] fArr8 = fArr5[2];
        float f9 = (f6 * fArr8[2]) + (f5 * fArr8[1]) + (f4 * fArr8[0]);
        float[] fArr9 = fVar.f4102g;
        float f10 = fArr9[0] * f7;
        float f11 = fArr9[1] * f8;
        float f12 = fArr9[2] * f9;
        float abs = Math.abs(f10);
        float f13 = fVar.f4103h;
        float pow = (float) Math.pow((abs * f13) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f11) * f13) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f12) * f13) / 100.0d, 0.42d);
        float signum = ((Math.signum(f10) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f11) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f12) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d4 = signum3;
        float f14 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d4)) / 11.0f;
        float f15 = ((float) ((signum + signum2) - (d4 * 2.0d))) / 9.0f;
        float f16 = signum2 * 20.0f;
        float f17 = ((21.0f * signum3) + ((signum * 20.0f) + f16)) / 20.0f;
        float f18 = (((signum * 40.0f) + f16) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f19 = atan2;
        float f20 = (3.1415927f * f19) / 180.0f;
        float f21 = f18 * fVar.f4097b;
        float f22 = fVar.f4096a;
        float f23 = fVar.f4099d;
        float pow4 = ((float) Math.pow(f21 / f22, fVar.f4105j * f23)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f24 = f22 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, fVar.f4101f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f19) < 20.14d ? 360.0f + f19 : f19) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * fVar.f4100e) * fVar.f4098c) * ((float) Math.sqrt((f15 * f15) + (f14 * f14)))) / (f17 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float f25 = fVar.f4104i * pow5;
        Math.sqrt((r3 * f23) / f24);
        float f26 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f25 * 0.0228f) + 1.0f)) * 43.85965f;
        double d5 = f20;
        return new a(f19, pow5, pow4, f26, log * ((float) Math.cos(d5)), log * ((float) Math.sin(d5)));
    }

    public static a b(float f4, float f5, float f6) {
        f fVar = f.f4095k;
        float f7 = fVar.f4099d;
        Math.sqrt(f4 / 100.0d);
        float f8 = fVar.f4096a + 4.0f;
        float f9 = fVar.f4104i * f5;
        Math.sqrt(((f5 / ((float) Math.sqrt(r1))) * fVar.f4099d) / f8);
        float f10 = (1.7f * f4) / ((0.007f * f4) + 1.0f);
        float log = ((float) Math.log((f9 * 0.0228d) + 1.0d)) * 43.85965f;
        double d4 = (3.1415927f * f6) / 180.0f;
        return new a(f6, f5, f4, f10, log * ((float) Math.cos(d4)), log * ((float) Math.sin(d4)));
    }

    public final int c(f fVar) {
        float f4;
        float f5 = this.f4083b;
        double d4 = f5;
        float f6 = this.f4084c;
        if (d4 != 0.0d) {
            double d5 = f6;
            if (d5 != 0.0d) {
                f4 = f5 / ((float) Math.sqrt(d5 / 100.0d));
                float pow = (float) Math.pow(f4 / Math.pow(1.64d - Math.pow(0.29d, fVar.f4101f), 0.73d), 1.1111111111111112d);
                double d6 = (this.f4082a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d6) + 3.8d)) * 0.25f;
                float pow2 = fVar.f4096a * ((float) Math.pow(f6 / 100.0d, (1.0d / fVar.f4099d) / fVar.f4105j));
                float f7 = cos * 3846.1538f * fVar.f4100e * fVar.f4098c;
                float f8 = pow2 / fVar.f4097b;
                float sin = (float) Math.sin(d6);
                float cos2 = (float) Math.cos(d6);
                float f9 = (((0.305f + f8) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f7 * 23.0f)));
                float f10 = cos2 * f9;
                float f11 = f9 * sin;
                float f12 = f8 * 460.0f;
                float f13 = ((288.0f * f11) + ((451.0f * f10) + f12)) / 1403.0f;
                float f14 = ((f12 - (891.0f * f10)) - (261.0f * f11)) / 1403.0f;
                float f15 = ((f12 - (f10 * 220.0f)) - (f11 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (Math.abs(f13) * 27.13d) / (400.0d - Math.abs(f13)));
                float signum = Math.signum(f13);
                float f16 = 100.0f / fVar.f4103h;
                float pow3 = signum * f16 * ((float) Math.pow(max, 2.380952380952381d));
                float signum2 = Math.signum(f14) * f16 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f14) * 27.13d) / (400.0d - Math.abs(f14))), 2.380952380952381d));
                float signum3 = Math.signum(f15) * f16 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f15) * 27.13d) / (400.0d - Math.abs(f15))), 2.380952380952381d));
                float[] fArr = fVar.f4102g;
                float f17 = pow3 / fArr[0];
                float f18 = signum2 / fArr[1];
                float f19 = signum3 / fArr[2];
                float[][] fArr2 = b.f4089b;
                float[] fArr3 = fArr2[0];
                float f20 = (fArr3[2] * f19) + (fArr3[1] * f18) + (fArr3[0] * f17);
                float[] fArr4 = fArr2[1];
                float f21 = (fArr4[2] * f19) + (fArr4[1] * f18) + (fArr4[0] * f17);
                float[] fArr5 = fArr2[2];
                return V0.a.a(f20, f21, (f19 * fArr5[2]) + (f18 * fArr5[1]) + (f17 * fArr5[0]));
            }
        }
        f4 = 0.0f;
        float pow4 = (float) Math.pow(f4 / Math.pow(1.64d - Math.pow(0.29d, fVar.f4101f), 0.73d), 1.1111111111111112d);
        double d62 = (this.f4082a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d62) + 3.8d)) * 0.25f;
        float pow22 = fVar.f4096a * ((float) Math.pow(f6 / 100.0d, (1.0d / fVar.f4099d) / fVar.f4105j));
        float f72 = cos3 * 3846.1538f * fVar.f4100e * fVar.f4098c;
        float f82 = pow22 / fVar.f4097b;
        float sin2 = (float) Math.sin(d62);
        float cos22 = (float) Math.cos(d62);
        float f92 = (((0.305f + f82) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (f72 * 23.0f)));
        float f102 = cos22 * f92;
        float f112 = f92 * sin2;
        float f122 = f82 * 460.0f;
        float f132 = ((288.0f * f112) + ((451.0f * f102) + f122)) / 1403.0f;
        float f142 = ((f122 - (891.0f * f102)) - (261.0f * f112)) / 1403.0f;
        float f152 = ((f122 - (f102 * 220.0f)) - (f112 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (Math.abs(f132) * 27.13d) / (400.0d - Math.abs(f132)));
        float signum4 = Math.signum(f132);
        float f162 = 100.0f / fVar.f4103h;
        float pow32 = signum4 * f162 * ((float) Math.pow(max2, 2.380952380952381d));
        float signum22 = Math.signum(f142) * f162 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f142) * 27.13d) / (400.0d - Math.abs(f142))), 2.380952380952381d));
        float signum32 = Math.signum(f152) * f162 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f152) * 27.13d) / (400.0d - Math.abs(f152))), 2.380952380952381d));
        float[] fArr6 = fVar.f4102g;
        float f172 = pow32 / fArr6[0];
        float f182 = signum22 / fArr6[1];
        float f192 = signum32 / fArr6[2];
        float[][] fArr22 = b.f4089b;
        float[] fArr32 = fArr22[0];
        float f202 = (fArr32[2] * f192) + (fArr32[1] * f182) + (fArr32[0] * f172);
        float[] fArr42 = fArr22[1];
        float f212 = (fArr42[2] * f192) + (fArr42[1] * f182) + (fArr42[0] * f172);
        float[] fArr52 = fArr22[2];
        return V0.a.a(f202, f212, (f192 * fArr52[2]) + (f182 * fArr52[1]) + (f172 * fArr52[0]));
    }
}
