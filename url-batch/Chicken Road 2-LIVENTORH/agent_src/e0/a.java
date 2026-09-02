package e0;

import android.graphics.Color;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f1126a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1127b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1128c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1129e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1130f;

    public a(float f2, float f4, float f5, float f6, float f7, float f8) {
        this.f1126a = f2;
        this.f1127b = f4;
        this.f1128c = f5;
        this.d = f6;
        this.f1129e = f7;
        this.f1130f = f8;
    }

    public static a a(int i) {
        n nVar = n.f1161k;
        float e4 = b.e(Color.red(i));
        float e5 = b.e(Color.green(i));
        float e6 = b.e(Color.blue(i));
        float[][] fArr = b.d;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[2] * e6) + (fArr2[1] * e5) + (fArr2[0] * e4);
        float[] fArr3 = fArr[1];
        float f4 = (fArr3[2] * e6) + (fArr3[1] * e5) + (fArr3[0] * e4);
        float[] fArr4 = fArr[2];
        float f5 = (e6 * fArr4[2]) + (e5 * fArr4[1]) + (e4 * fArr4[0]);
        float[][] fArr5 = b.f1131a;
        float[] fArr6 = fArr5[0];
        float f6 = (fArr6[2] * f5) + (fArr6[1] * f4) + (fArr6[0] * f2);
        float[] fArr7 = fArr5[1];
        float f7 = (fArr7[2] * f5) + (fArr7[1] * f4) + (fArr7[0] * f2);
        float[] fArr8 = fArr5[2];
        float f8 = (f5 * fArr8[2]) + (f4 * fArr8[1]) + (f2 * fArr8[0]);
        float[] fArr9 = nVar.f1167g;
        float f9 = nVar.i;
        float f10 = nVar.d;
        float f11 = nVar.f1162a;
        float f12 = fArr9[0] * f6;
        float f13 = fArr9[1] * f7;
        float f14 = fArr9[2] * f8;
        float f15 = nVar.f1168h;
        float pow = (float) Math.pow((Math.abs(f12) * f15) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f13) * f15) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f14) * f15) / 100.0d, 0.42d);
        float signum = ((Math.signum(f12) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f13) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f14) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = signum3;
        float f16 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f17 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f18 = signum2 * 20.0f;
        float f19 = ((21.0f * signum3) + ((signum * 20.0f) + f18)) / 20.0f;
        float f20 = (((signum * 40.0f) + f18) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f17, f16)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f21 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f20 * nVar.f1163b) / f11, nVar.f1169j * f10)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f22 = f11 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, nVar.f1166f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * nVar.f1165e) * nVar.f1164c) * ((float) Math.sqrt((f17 * f17) + (f16 * f16)))) / (f19 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        Math.sqrt((r0 * f10) / f22);
        float f23 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f9 * pow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d3 = f21;
        return new a(atan2, pow5, pow4, f23, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    public static a b(float f2, float f4, float f5) {
        n nVar = n.f1161k;
        float f6 = nVar.d;
        Math.sqrt(f2 / 100.0d);
        float f7 = nVar.f1162a + 4.0f;
        float f8 = nVar.i * f4;
        Math.sqrt(((f4 / ((float) Math.sqrt(r1))) * nVar.d) / f7);
        float f9 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float log = ((float) Math.log((f8 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f5) / 180.0f;
        return new a(f5, f4, f2, f9, log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
    }

    public final int c(n nVar) {
        float f2;
        float f4 = this.f1127b;
        double d = f4;
        float f5 = this.f1128c;
        if (d != 0.0d) {
            double d3 = f5;
            if (d3 != 0.0d) {
                f2 = f4 / ((float) Math.sqrt(d3 / 100.0d));
                float f6 = nVar.f1166f;
                float f7 = nVar.f1168h;
                float pow = (float) Math.pow(f2 / Math.pow(1.64d - Math.pow(0.29d, f6), 0.73d), 1.1111111111111112d);
                double d4 = (this.f1126a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d4) + 3.8d)) * 0.25f;
                float pow2 = nVar.f1162a * ((float) Math.pow(f5 / 100.0d, (1.0d / nVar.d) / nVar.f1169j));
                float f8 = cos * 3846.1538f * nVar.f1165e * nVar.f1164c;
                float f9 = pow2 / nVar.f1163b;
                float sin = (float) Math.sin(d4);
                float cos2 = (float) Math.cos(d4);
                float f10 = (((0.305f + f9) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f8 * 23.0f)));
                float f11 = cos2 * f10;
                float f12 = f10 * sin;
                float f13 = f9 * 460.0f;
                float f14 = ((288.0f * f12) + ((451.0f * f11) + f13)) / 1403.0f;
                float f15 = ((f13 - (891.0f * f11)) - (261.0f * f12)) / 1403.0f;
                float f16 = ((f13 - (f11 * 220.0f)) - (f12 * 6300.0f)) / 1403.0f;
                float f17 = 100.0f / f7;
                float signum = Math.signum(f14) * f17 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f14) * 27.13d) / (400.0d - Math.abs(f14))), 2.380952380952381d));
                float signum2 = Math.signum(f15) * f17 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f15) * 27.13d) / (400.0d - Math.abs(f15))), 2.380952380952381d));
                float signum3 = Math.signum(f16) * f17 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f16) * 27.13d) / (400.0d - Math.abs(f16))), 2.380952380952381d));
                float[] fArr = nVar.f1167g;
                float f18 = signum / fArr[0];
                float f19 = signum2 / fArr[1];
                float f20 = signum3 / fArr[2];
                float[][] fArr2 = b.f1132b;
                float[] fArr3 = fArr2[0];
                float f21 = (fArr3[2] * f20) + (fArr3[1] * f19) + (fArr3[0] * f18);
                float[] fArr4 = fArr2[1];
                float f22 = (fArr4[2] * f20) + (fArr4[1] * f19) + (fArr4[0] * f18);
                float[] fArr5 = fArr2[2];
                return f0.a.a(f21, f22, (f20 * fArr5[2]) + (f19 * fArr5[1]) + (f18 * fArr5[0]));
            }
        }
        f2 = 0.0f;
        float f62 = nVar.f1166f;
        float f72 = nVar.f1168h;
        float pow3 = (float) Math.pow(f2 / Math.pow(1.64d - Math.pow(0.29d, f62), 0.73d), 1.1111111111111112d);
        double d42 = (this.f1126a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d42) + 3.8d)) * 0.25f;
        float pow22 = nVar.f1162a * ((float) Math.pow(f5 / 100.0d, (1.0d / nVar.d) / nVar.f1169j));
        float f82 = cos3 * 3846.1538f * nVar.f1165e * nVar.f1164c;
        float f92 = pow22 / nVar.f1163b;
        float sin2 = (float) Math.sin(d42);
        float cos22 = (float) Math.cos(d42);
        float f102 = (((0.305f + f92) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + (((11.0f * pow3) * cos22) + (f82 * 23.0f)));
        float f112 = cos22 * f102;
        float f122 = f102 * sin2;
        float f132 = f92 * 460.0f;
        float f142 = ((288.0f * f122) + ((451.0f * f112) + f132)) / 1403.0f;
        float f152 = ((f132 - (891.0f * f112)) - (261.0f * f122)) / 1403.0f;
        float f162 = ((f132 - (f112 * 220.0f)) - (f122 * 6300.0f)) / 1403.0f;
        float f172 = 100.0f / f72;
        float signum4 = Math.signum(f142) * f172 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f142) * 27.13d) / (400.0d - Math.abs(f142))), 2.380952380952381d));
        float signum22 = Math.signum(f152) * f172 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f152) * 27.13d) / (400.0d - Math.abs(f152))), 2.380952380952381d));
        float signum32 = Math.signum(f162) * f172 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f162) * 27.13d) / (400.0d - Math.abs(f162))), 2.380952380952381d));
        float[] fArr6 = nVar.f1167g;
        float f182 = signum4 / fArr6[0];
        float f192 = signum22 / fArr6[1];
        float f202 = signum32 / fArr6[2];
        float[][] fArr22 = b.f1132b;
        float[] fArr32 = fArr22[0];
        float f212 = (fArr32[2] * f202) + (fArr32[1] * f192) + (fArr32[0] * f182);
        float[] fArr42 = fArr22[1];
        float f222 = (fArr42[2] * f202) + (fArr42[1] * f192) + (fArr42[0] * f182);
        float[] fArr52 = fArr22[2];
        return f0.a.a(f212, f222, (f202 * fArr52[2]) + (f192 * fArr52[1]) + (f182 * fArr52[0]));
    }
}
