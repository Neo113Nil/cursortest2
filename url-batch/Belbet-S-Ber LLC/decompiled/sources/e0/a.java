package e0;

import android.graphics.Color;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f1308a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1309b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1310c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1311e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1312f;

    public a(float f5, float f6, float f7, float f8, float f9, float f10) {
        this.f1308a = f5;
        this.f1309b = f6;
        this.f1310c = f7;
        this.d = f8;
        this.f1311e = f9;
        this.f1312f = f10;
    }

    public static a a(int i) {
        n nVar = n.f1342k;
        float e4 = b.e(Color.red(i));
        float e5 = b.e(Color.green(i));
        float e6 = b.e(Color.blue(i));
        float[][] fArr = b.d;
        float[] fArr2 = fArr[0];
        float f5 = (fArr2[2] * e6) + (fArr2[1] * e5) + (fArr2[0] * e4);
        float[] fArr3 = fArr[1];
        float f6 = (fArr3[2] * e6) + (fArr3[1] * e5) + (fArr3[0] * e4);
        float[] fArr4 = fArr[2];
        float f7 = (e6 * fArr4[2]) + (e5 * fArr4[1]) + (e4 * fArr4[0]);
        float[][] fArr5 = b.f1313a;
        float[] fArr6 = fArr5[0];
        float f8 = (fArr6[2] * f7) + (fArr6[1] * f6) + (fArr6[0] * f5);
        float[] fArr7 = fArr5[1];
        float f9 = (fArr7[2] * f7) + (fArr7[1] * f6) + (fArr7[0] * f5);
        float[] fArr8 = fArr5[2];
        float f10 = (f7 * fArr8[2]) + (f6 * fArr8[1]) + (f5 * fArr8[0]);
        float[] fArr9 = nVar.f1348g;
        float f11 = nVar.i;
        float f12 = nVar.d;
        float f13 = nVar.f1343a;
        float f14 = fArr9[0] * f8;
        float f15 = fArr9[1] * f9;
        float f16 = fArr9[2] * f10;
        float f17 = nVar.h;
        float pow = (float) Math.pow((Math.abs(f14) * f17) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f15) * f17) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f16) * f17) / 100.0d, 0.42d);
        float signum = ((Math.signum(f14) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f15) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f16) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = signum3;
        float f18 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f19 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f20 = signum2 * 20.0f;
        float f21 = ((21.0f * signum3) + ((signum * 20.0f) + f20)) / 20.0f;
        float f22 = (((signum * 40.0f) + f20) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f19, f18)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f23 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f22 * nVar.f1344b) / f13, nVar.f1349j * f12)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f24 = f13 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, nVar.f1347f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * nVar.f1346e) * nVar.f1345c) * ((float) Math.sqrt((f19 * f19) + (f18 * f18)))) / (f21 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        Math.sqrt((r0 * f12) / f24);
        float f25 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f11 * pow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d5 = f23;
        return new a(atan2, pow5, pow4, f25, log * ((float) Math.cos(d5)), log * ((float) Math.sin(d5)));
    }

    public static a b(float f5, float f6, float f7) {
        n nVar = n.f1342k;
        float f8 = nVar.d;
        Math.sqrt(f5 / 100.0d);
        float f9 = nVar.f1343a + 4.0f;
        float f10 = nVar.i * f6;
        Math.sqrt(((f6 / ((float) Math.sqrt(r1))) * nVar.d) / f9);
        float f11 = (1.7f * f5) / ((0.007f * f5) + 1.0f);
        float log = ((float) Math.log((f10 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f7) / 180.0f;
        return new a(f7, f6, f5, f11, log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
    }

    public final int c(n nVar) {
        float f5;
        float f6 = this.f1309b;
        double d = f6;
        float f7 = this.f1310c;
        if (d != 0.0d) {
            double d5 = f7;
            if (d5 != 0.0d) {
                f5 = f6 / ((float) Math.sqrt(d5 / 100.0d));
                float f8 = nVar.f1347f;
                float f9 = nVar.h;
                float pow = (float) Math.pow(f5 / Math.pow(1.64d - Math.pow(0.29d, f8), 0.73d), 1.1111111111111112d);
                double d6 = (this.f1308a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d6) + 3.8d)) * 0.25f;
                float pow2 = nVar.f1343a * ((float) Math.pow(f7 / 100.0d, (1.0d / nVar.d) / nVar.f1349j));
                float f10 = cos * 3846.1538f * nVar.f1346e * nVar.f1345c;
                float f11 = pow2 / nVar.f1344b;
                float sin = (float) Math.sin(d6);
                float cos2 = (float) Math.cos(d6);
                float f12 = (((0.305f + f11) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f10 * 23.0f)));
                float f13 = cos2 * f12;
                float f14 = f12 * sin;
                float f15 = f11 * 460.0f;
                float f16 = ((288.0f * f14) + ((451.0f * f13) + f15)) / 1403.0f;
                float f17 = ((f15 - (891.0f * f13)) - (261.0f * f14)) / 1403.0f;
                float f18 = ((f15 - (f13 * 220.0f)) - (f14 * 6300.0f)) / 1403.0f;
                float f19 = 100.0f / f9;
                float signum = Math.signum(f16) * f19 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f16) * 27.13d) / (400.0d - Math.abs(f16))), 2.380952380952381d));
                float signum2 = Math.signum(f17) * f19 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f17) * 27.13d) / (400.0d - Math.abs(f17))), 2.380952380952381d));
                float signum3 = Math.signum(f18) * f19 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f18) * 27.13d) / (400.0d - Math.abs(f18))), 2.380952380952381d));
                float[] fArr = nVar.f1348g;
                float f20 = signum / fArr[0];
                float f21 = signum2 / fArr[1];
                float f22 = signum3 / fArr[2];
                float[][] fArr2 = b.f1314b;
                float[] fArr3 = fArr2[0];
                float f23 = (fArr3[2] * f22) + (fArr3[1] * f21) + (fArr3[0] * f20);
                float[] fArr4 = fArr2[1];
                float f24 = (fArr4[2] * f22) + (fArr4[1] * f21) + (fArr4[0] * f20);
                float[] fArr5 = fArr2[2];
                return f0.a.a(f23, f24, (f22 * fArr5[2]) + (f21 * fArr5[1]) + (f20 * fArr5[0]));
            }
        }
        f5 = 0.0f;
        float f82 = nVar.f1347f;
        float f92 = nVar.h;
        float pow3 = (float) Math.pow(f5 / Math.pow(1.64d - Math.pow(0.29d, f82), 0.73d), 1.1111111111111112d);
        double d62 = (this.f1308a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d62) + 3.8d)) * 0.25f;
        float pow22 = nVar.f1343a * ((float) Math.pow(f7 / 100.0d, (1.0d / nVar.d) / nVar.f1349j));
        float f102 = cos3 * 3846.1538f * nVar.f1346e * nVar.f1345c;
        float f112 = pow22 / nVar.f1344b;
        float sin2 = (float) Math.sin(d62);
        float cos22 = (float) Math.cos(d62);
        float f122 = (((0.305f + f112) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + (((11.0f * pow3) * cos22) + (f102 * 23.0f)));
        float f132 = cos22 * f122;
        float f142 = f122 * sin2;
        float f152 = f112 * 460.0f;
        float f162 = ((288.0f * f142) + ((451.0f * f132) + f152)) / 1403.0f;
        float f172 = ((f152 - (891.0f * f132)) - (261.0f * f142)) / 1403.0f;
        float f182 = ((f152 - (f132 * 220.0f)) - (f142 * 6300.0f)) / 1403.0f;
        float f192 = 100.0f / f92;
        float signum4 = Math.signum(f162) * f192 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f162) * 27.13d) / (400.0d - Math.abs(f162))), 2.380952380952381d));
        float signum22 = Math.signum(f172) * f192 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f172) * 27.13d) / (400.0d - Math.abs(f172))), 2.380952380952381d));
        float signum32 = Math.signum(f182) * f192 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f182) * 27.13d) / (400.0d - Math.abs(f182))), 2.380952380952381d));
        float[] fArr6 = nVar.f1348g;
        float f202 = signum4 / fArr6[0];
        float f212 = signum22 / fArr6[1];
        float f222 = signum32 / fArr6[2];
        float[][] fArr22 = b.f1314b;
        float[] fArr32 = fArr22[0];
        float f232 = (fArr32[2] * f222) + (fArr32[1] * f212) + (fArr32[0] * f202);
        float[] fArr42 = fArr22[1];
        float f242 = (fArr42[2] * f222) + (fArr42[1] * f212) + (fArr42[0] * f202);
        float[] fArr52 = fArr22[2];
        return f0.a.a(f232, f242, (f222 * fArr52[2]) + (f212 * fArr52[1]) + (f202 * fArr52[0]));
    }
}
