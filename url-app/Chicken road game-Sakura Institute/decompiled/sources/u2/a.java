package u2;

import android.graphics.Color;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f8964a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8965b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8966c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8967d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8968e;

    /* renamed from: f, reason: collision with root package name */
    public final float f8969f;

    public a(float f9, float f10, float f11, float f12, float f13, float f14) {
        this.f8964a = f9;
        this.f8965b = f10;
        this.f8966c = f11;
        this.f8967d = f12;
        this.f8968e = f13;
        this.f8969f = f14;
    }

    public static a a(int i7) {
        e eVar = e.f8975k;
        float c4 = b.c(Color.red(i7));
        float c6 = b.c(Color.green(i7));
        float c9 = b.c(Color.blue(i7));
        float[][] fArr = b.f8973d;
        float[] fArr2 = fArr[0];
        float f9 = (fArr2[2] * c9) + (fArr2[1] * c6) + (fArr2[0] * c4);
        float[] fArr3 = fArr[1];
        float f10 = (fArr3[2] * c9) + (fArr3[1] * c6) + (fArr3[0] * c4);
        float[] fArr4 = fArr[2];
        float f11 = (c9 * fArr4[2]) + (c6 * fArr4[1]) + (c4 * fArr4[0]);
        float[][] fArr5 = b.f8970a;
        float[] fArr6 = fArr5[0];
        float f12 = (fArr6[2] * f11) + (fArr6[1] * f10) + (fArr6[0] * f9);
        float[] fArr7 = fArr5[1];
        float f13 = (fArr7[2] * f11) + (fArr7[1] * f10) + (fArr7[0] * f9);
        float[] fArr8 = fArr5[2];
        float f14 = (f11 * fArr8[2]) + (f10 * fArr8[1]) + (f9 * fArr8[0]);
        float[] fArr9 = eVar.f8982g;
        float f15 = eVar.f8984i;
        float f16 = eVar.f8979d;
        float f17 = eVar.f8976a;
        float f18 = fArr9[0] * f12;
        float f19 = fArr9[1] * f13;
        float f20 = fArr9[2] * f14;
        float f21 = eVar.f8983h;
        float pow = (float) Math.pow((Math.abs(f18) * f21) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f19) * f21) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f20) * f21) / 100.0d, 0.42d);
        float signum = ((Math.signum(f18) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f19) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f20) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d8 = signum3;
        float f22 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d8)) / 11.0f;
        float f23 = ((float) ((signum + signum2) - (d8 * 2.0d))) / 9.0f;
        float f24 = signum2 * 20.0f;
        float f25 = ((21.0f * signum3) + ((signum * 20.0f) + f24)) / 20.0f;
        float f26 = (((signum * 40.0f) + f24) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f23, f22)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f27 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f26 * eVar.f8977b) / f17, eVar.f8985j * f16)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f28 = f17 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, eVar.f8981f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * eVar.f8980e) * eVar.f8978c) * ((float) Math.sqrt((f23 * f23) + (f22 * f22)))) / (f25 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        Math.sqrt((r0 * f16) / f28);
        float f29 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f15 * pow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d9 = f27;
        return new a(atan2, pow5, pow4, f29, log * ((float) Math.cos(d9)), log * ((float) Math.sin(d9)));
    }

    public static a b(float f9, float f10, float f11) {
        e eVar = e.f8975k;
        float f12 = eVar.f8979d;
        Math.sqrt(f9 / 100.0d);
        float f13 = eVar.f8976a + 4.0f;
        float f14 = eVar.f8984i * f10;
        Math.sqrt(((f10 / ((float) Math.sqrt(r1))) * eVar.f8979d) / f13);
        float f15 = (1.7f * f9) / ((0.007f * f9) + 1.0f);
        float log = ((float) Math.log((f14 * 0.0228d) + 1.0d)) * 43.85965f;
        double d8 = (3.1415927f * f11) / 180.0f;
        return new a(f11, f10, f9, f15, log * ((float) Math.cos(d8)), log * ((float) Math.sin(d8)));
    }

    public final int c(e eVar) {
        float f9;
        float f10 = this.f8965b;
        double d8 = f10;
        float f11 = this.f8966c;
        if (d8 != 0.0d) {
            double d9 = f11;
            if (d9 != 0.0d) {
                f9 = f10 / ((float) Math.sqrt(d9 / 100.0d));
                float f12 = eVar.f8981f;
                float f13 = eVar.f8983h;
                float pow = (float) Math.pow(f9 / Math.pow(1.64d - Math.pow(0.29d, f12), 0.73d), 1.1111111111111112d);
                double d10 = (this.f8964a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d10) + 3.8d)) * 0.25f;
                float pow2 = eVar.f8976a * ((float) Math.pow(f11 / 100.0d, (1.0d / eVar.f8979d) / eVar.f8985j));
                float f14 = cos * 3846.1538f * eVar.f8980e * eVar.f8978c;
                float f15 = pow2 / eVar.f8977b;
                float sin = (float) Math.sin(d10);
                float cos2 = (float) Math.cos(d10);
                float f16 = (((0.305f + f15) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f14 * 23.0f)));
                float f17 = cos2 * f16;
                float f18 = f16 * sin;
                float f19 = f15 * 460.0f;
                float f20 = ((288.0f * f18) + ((451.0f * f17) + f19)) / 1403.0f;
                float f21 = ((f19 - (891.0f * f17)) - (261.0f * f18)) / 1403.0f;
                float f22 = ((f19 - (f17 * 220.0f)) - (f18 * 6300.0f)) / 1403.0f;
                float f23 = 100.0f / f13;
                float signum = Math.signum(f20) * f23 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f20) * 27.13d) / (400.0d - Math.abs(f20))), 2.380952380952381d));
                float signum2 = Math.signum(f21) * f23 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f21) * 27.13d) / (400.0d - Math.abs(f21))), 2.380952380952381d));
                float signum3 = Math.signum(f22) * f23 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f22) * 27.13d) / (400.0d - Math.abs(f22))), 2.380952380952381d));
                float[] fArr = eVar.f8982g;
                float f24 = signum / fArr[0];
                float f25 = signum2 / fArr[1];
                float f26 = signum3 / fArr[2];
                float[][] fArr2 = b.f8971b;
                float[] fArr3 = fArr2[0];
                float f27 = (fArr3[2] * f26) + (fArr3[1] * f25) + (fArr3[0] * f24);
                float[] fArr4 = fArr2[1];
                float f28 = (fArr4[2] * f26) + (fArr4[1] * f25) + (fArr4[0] * f24);
                float[] fArr5 = fArr2[2];
                return v2.a.a(f27, f28, (f26 * fArr5[2]) + (f25 * fArr5[1]) + (f24 * fArr5[0]));
            }
        }
        f9 = 0.0f;
        float f122 = eVar.f8981f;
        float f132 = eVar.f8983h;
        float pow3 = (float) Math.pow(f9 / Math.pow(1.64d - Math.pow(0.29d, f122), 0.73d), 1.1111111111111112d);
        double d102 = (this.f8964a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d102) + 3.8d)) * 0.25f;
        float pow22 = eVar.f8976a * ((float) Math.pow(f11 / 100.0d, (1.0d / eVar.f8979d) / eVar.f8985j));
        float f142 = cos3 * 3846.1538f * eVar.f8980e * eVar.f8978c;
        float f152 = pow22 / eVar.f8977b;
        float sin2 = (float) Math.sin(d102);
        float cos22 = (float) Math.cos(d102);
        float f162 = (((0.305f + f152) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + (((11.0f * pow3) * cos22) + (f142 * 23.0f)));
        float f172 = cos22 * f162;
        float f182 = f162 * sin2;
        float f192 = f152 * 460.0f;
        float f202 = ((288.0f * f182) + ((451.0f * f172) + f192)) / 1403.0f;
        float f212 = ((f192 - (891.0f * f172)) - (261.0f * f182)) / 1403.0f;
        float f222 = ((f192 - (f172 * 220.0f)) - (f182 * 6300.0f)) / 1403.0f;
        float f232 = 100.0f / f132;
        float signum4 = Math.signum(f202) * f232 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f202) * 27.13d) / (400.0d - Math.abs(f202))), 2.380952380952381d));
        float signum22 = Math.signum(f212) * f232 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f212) * 27.13d) / (400.0d - Math.abs(f212))), 2.380952380952381d));
        float signum32 = Math.signum(f222) * f232 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f222) * 27.13d) / (400.0d - Math.abs(f222))), 2.380952380952381d));
        float[] fArr6 = eVar.f8982g;
        float f242 = signum4 / fArr6[0];
        float f252 = signum22 / fArr6[1];
        float f262 = signum32 / fArr6[2];
        float[][] fArr22 = b.f8971b;
        float[] fArr32 = fArr22[0];
        float f272 = (fArr32[2] * f262) + (fArr32[1] * f252) + (fArr32[0] * f242);
        float[] fArr42 = fArr22[1];
        float f282 = (fArr42[2] * f262) + (fArr42[1] * f252) + (fArr42[0] * f242);
        float[] fArr52 = fArr22[2];
        return v2.a.a(f272, f282, (f262 * fArr52[2]) + (f252 * fArr52[1]) + (f242 * fArr52[0]));
    }
}
