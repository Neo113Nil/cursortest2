package g3;

import android.graphics.Color;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f4230a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4231b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4232c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4233d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4234e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4235f;

    public /* synthetic */ a(float f3, float f10, float f11, float f12, float f13, float f14) {
        this.f4230a = f3;
        this.f4231b = f10;
        this.f4232c = f11;
        this.f4233d = f12;
        this.f4234e = f13;
        this.f4235f = f14;
    }

    public static a a(int i3) {
        l lVar = l.f4262k;
        float c10 = b.c(Color.red(i3));
        float c11 = b.c(Color.green(i3));
        float c12 = b.c(Color.blue(i3));
        float[][] fArr = b.f4239d;
        float[] fArr2 = fArr[0];
        float f3 = (fArr2[2] * c12) + (fArr2[1] * c11) + (fArr2[0] * c10);
        float[] fArr3 = fArr[1];
        float f10 = (fArr3[2] * c12) + (fArr3[1] * c11) + (fArr3[0] * c10);
        float[] fArr4 = fArr[2];
        float f11 = (c12 * fArr4[2]) + (c11 * fArr4[1]) + (c10 * fArr4[0]);
        float[][] fArr5 = b.f4236a;
        float[] fArr6 = fArr5[0];
        float f12 = (fArr6[2] * f11) + (fArr6[1] * f10) + (fArr6[0] * f3);
        float[] fArr7 = fArr5[1];
        float f13 = (fArr7[2] * f11) + (fArr7[1] * f10) + (fArr7[0] * f3);
        float[] fArr8 = fArr5[2];
        float f14 = (f11 * fArr8[2]) + (f10 * fArr8[1]) + (f3 * fArr8[0]);
        float[] fArr9 = lVar.g;
        float f15 = lVar.f4270i;
        float f16 = lVar.f4266d;
        float f17 = lVar.f4263a;
        float f18 = fArr9[0] * f12;
        float f19 = fArr9[1] * f13;
        float f20 = fArr9[2] * f14;
        float f21 = lVar.f4269h;
        float pow = (float) Math.pow((Math.abs(f18) * f21) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f19) * f21) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f20) * f21) / 100.0d, 0.42d);
        float signum = ((Math.signum(f18) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f19) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f20) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d10 = signum3;
        float f22 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d10)) / 11.0f;
        float f23 = ((float) ((signum + signum2) - (d10 * 2.0d))) / 9.0f;
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
        float pow4 = ((float) Math.pow((f26 * lVar.f4264b) / f17, lVar.j * f16)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f28 = f17 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.f4268f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.f4267e) * lVar.f4265c) * ((float) Math.sqrt((f23 * f23) + (f22 * f22)))) / (f25 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        Math.sqrt((r0 * f16) / f28);
        float f29 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f15 * pow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d11 = f27;
        return new a(atan2, pow5, pow4, f29, log * ((float) Math.cos(d11)), log * ((float) Math.sin(d11)));
    }

    public static a b(float f3, float f10, float f11) {
        l lVar = l.f4262k;
        float f12 = lVar.f4266d;
        Math.sqrt(f3 / 100.0d);
        float f13 = lVar.f4263a + 4.0f;
        float f14 = lVar.f4270i * f10;
        Math.sqrt(((f10 / ((float) Math.sqrt(r1))) * lVar.f4266d) / f13);
        float f15 = (1.7f * f3) / ((0.007f * f3) + 1.0f);
        float log = ((float) Math.log((f14 * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f11) / 180.0f;
        return new a(f11, f10, f3, f15, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public int c(l lVar) {
        float f3;
        float f10 = this.f4231b;
        double d10 = f10;
        float f11 = this.f4232c;
        if (d10 != 0.0d) {
            double d11 = f11;
            if (d11 != 0.0d) {
                f3 = f10 / ((float) Math.sqrt(d11 / 100.0d));
                float f12 = lVar.f4268f;
                float f13 = lVar.f4269h;
                float pow = (float) Math.pow(f3 / Math.pow(1.64d - Math.pow(0.29d, f12), 0.73d), 1.1111111111111112d);
                double d12 = (this.f4230a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d12) + 3.8d)) * 0.25f;
                float pow2 = lVar.f4263a * ((float) Math.pow(f11 / 100.0d, (1.0d / lVar.f4266d) / lVar.j));
                float f14 = cos * 3846.1538f * lVar.f4267e * lVar.f4265c;
                float f15 = pow2 / lVar.f4264b;
                float sin = (float) Math.sin(d12);
                float cos2 = (float) Math.cos(d12);
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
                float[] fArr = lVar.g;
                float f24 = signum / fArr[0];
                float f25 = signum2 / fArr[1];
                float f26 = signum3 / fArr[2];
                float[][] fArr2 = b.f4237b;
                float[] fArr3 = fArr2[0];
                float f27 = (fArr3[2] * f26) + (fArr3[1] * f25) + (fArr3[0] * f24);
                float[] fArr4 = fArr2[1];
                float f28 = (fArr4[2] * f26) + (fArr4[1] * f25) + (fArr4[0] * f24);
                float[] fArr5 = fArr2[2];
                return h3.a.a(f27, f28, (f26 * fArr5[2]) + (f25 * fArr5[1]) + (f24 * fArr5[0]));
            }
        }
        f3 = 0.0f;
        float f122 = lVar.f4268f;
        float f132 = lVar.f4269h;
        float pow3 = (float) Math.pow(f3 / Math.pow(1.64d - Math.pow(0.29d, f122), 0.73d), 1.1111111111111112d);
        double d122 = (this.f4230a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d122) + 3.8d)) * 0.25f;
        float pow22 = lVar.f4263a * ((float) Math.pow(f11 / 100.0d, (1.0d / lVar.f4266d) / lVar.j));
        float f142 = cos3 * 3846.1538f * lVar.f4267e * lVar.f4265c;
        float f152 = pow22 / lVar.f4264b;
        float sin2 = (float) Math.sin(d122);
        float cos22 = (float) Math.cos(d122);
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
        float[] fArr6 = lVar.g;
        float f242 = signum4 / fArr6[0];
        float f252 = signum22 / fArr6[1];
        float f262 = signum32 / fArr6[2];
        float[][] fArr22 = b.f4237b;
        float[] fArr32 = fArr22[0];
        float f272 = (fArr32[2] * f262) + (fArr32[1] * f252) + (fArr32[0] * f242);
        float[] fArr42 = fArr22[1];
        float f282 = (fArr42[2] * f262) + (fArr42[1] * f252) + (fArr42[0] * f242);
        float[] fArr52 = fArr22[2];
        return h3.a.a(f272, f282, (f262 * fArr52[2]) + (f252 * fArr52[1]) + (f242 * fArr52[0]));
    }

    public int d(l0.b bVar) {
        float f3 = this.f4231b;
        float sqrt = (f3 == 0.0f || this.f4232c == 0.0f) ? 0.0f : f3 / ((float) Math.sqrt(r3 / 100.0f));
        float f10 = bVar.f5740a;
        float f11 = bVar.f5746h;
        float pow = sqrt / ((float) Math.pow(1.64f - ((float) Math.pow((float) Math.pow(0.29f, f10), 0.73f)), 1.1111112f));
        float f12 = (this.f4230a * 3.1415927f) / 180.0f;
        float cos = (((float) Math.cos(2.0f + f12)) + 3.8f) * 0.25f;
        float pow2 = bVar.f5741b * ((float) Math.pow(r3 / 100.0f, (1.0f / bVar.f5744e) / bVar.j));
        float f13 = cos * 3846.1538f * bVar.f5745f * bVar.f5743d;
        float f14 = pow2 / bVar.f5742c;
        double d10 = f12;
        float sin = (float) Math.sin(d10);
        float cos2 = (float) Math.cos(d10);
        float f15 = (((0.305f + f14) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f13 * 23.0f)));
        float f16 = cos2 * f15;
        float f17 = f15 * sin;
        float f18 = f14 * 460.0f;
        float f19 = ((288.0f * f17) + ((451.0f * f16) + f18)) / 1403.0f;
        float f20 = ((f18 - (891.0f * f16)) - (261.0f * f17)) / 1403.0f;
        float f21 = ((f18 - (f16 * 220.0f)) - (f17 * 6300.0f)) / 1403.0f;
        float f22 = 100.0f / f11;
        double d11 = 2.3809524f;
        float signum = Math.signum(f19) * f22 * ((float) Math.pow(Math.max(0.0f, (Math.abs(f19) * 27.13f) / (400.0f - Math.abs(f19))), d11));
        float signum2 = Math.signum(f20) * f22 * ((float) Math.pow(Math.max(0.0f, (Math.abs(f20) * 27.13f) / (400.0f - Math.abs(f20))), d11));
        float signum3 = Math.signum(f21) * f22 * ((float) Math.pow(Math.max(0.0f, (Math.abs(f21) * 27.13f) / (400.0f - Math.abs(f21))), d11));
        float[] fArr = bVar.g;
        float f23 = signum / fArr[0];
        float f24 = signum2 / fArr[1];
        float f25 = signum3 / fArr[2];
        float[][] fArr2 = l0.a.f5732b;
        float[] fArr3 = fArr2[0];
        float f26 = (fArr3[2] * f25) + (fArr3[1] * f24) + (fArr3[0] * f23);
        float[] fArr4 = fArr2[1];
        float f27 = (fArr4[2] * f25) + (fArr4[1] * f24) + (fArr4[0] * f23);
        float[] fArr5 = fArr2[2];
        return h3.a.a(f26, f27, (f25 * fArr5[2]) + (f24 * fArr5[1]) + (f23 * fArr5[0]));
    }
}
