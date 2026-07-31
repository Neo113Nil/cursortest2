package g1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final s f2853a = new s(0.31006f, 0.31616f);

    /* renamed from: b, reason: collision with root package name */
    public static final s f2854b = new s(0.34567f, 0.3585f);

    /* renamed from: c, reason: collision with root package name */
    public static final s f2855c = new s(0.32168f, 0.33767f);

    /* renamed from: d, reason: collision with root package name */
    public static final s f2856d = new s(0.31271f, 0.32902f);

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f2857e = {0.964212f, 1.0f, 0.825188f};

    public static c a(c cVar) {
        if (b.a(cVar.f2819b, b.f2813a)) {
            q qVar = (q) cVar;
            s sVar = qVar.f2872d;
            s sVar2 = f2854b;
            if (!d(sVar, sVar2)) {
                return new q(qVar.f2818a, qVar.f2876h, sVar2, g(c(a.f2811b.f2812a, sVar.a(), sVar2.a()), qVar.i), qVar.f2878k, qVar.f2881n, qVar.f2873e, qVar.f2874f, qVar.f2875g, -1);
            }
        }
        return cVar;
    }

    public static float b(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f6 = fArr[0];
        float f8 = fArr[1];
        float f9 = fArr[2];
        float f10 = fArr[3];
        float f11 = fArr[4];
        float f12 = fArr[5];
        float f13 = (((((f9 * f12) + ((f8 * f11) + (f6 * f10))) - (f10 * f11)) - (f8 * f9)) - (f6 * f12)) * 0.5f;
        return f13 < 0.0f ? -f13 : f13;
    }

    public static final float[] c(float[] fArr, float[] fArr2, float[] fArr3) {
        h(fArr, fArr2);
        h(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] f6 = f(fArr);
        float f8 = fArr4[0];
        float f9 = fArr[0] * f8;
        float f10 = fArr4[1];
        float f11 = fArr[1] * f10;
        float f12 = fArr4[2];
        return g(f6, new float[]{f9, f11, fArr[2] * f12, fArr[3] * f8, fArr[4] * f10, fArr[5] * f12, f8 * fArr[6], f10 * fArr[7], f12 * fArr[8]});
    }

    public static final boolean d(s sVar, s sVar2) {
        if (sVar == sVar2) {
            return true;
        }
        return Math.abs(sVar.f2892a - sVar2.f2892a) < 0.001f && Math.abs(sVar.f2893b - sVar2.f2893b) < 0.001f;
    }

    public static final g e(c cVar, c cVar2) {
        if (cVar == cVar2) {
            return new e(cVar, cVar, 1);
        }
        long j7 = cVar.f2819b;
        long j8 = b.f2813a;
        return (b.a(j7, j8) && b.a(cVar2.f2819b, j8)) ? new f((q) cVar, (q) cVar2) : new g(cVar, cVar2, 0);
    }

    public static final float[] f(float[] fArr) {
        float f6 = fArr[0];
        float f8 = fArr[3];
        float f9 = fArr[6];
        float f10 = fArr[1];
        float f11 = fArr[4];
        float f12 = fArr[7];
        float f13 = fArr[2];
        float f14 = fArr[5];
        float f15 = fArr[8];
        float f16 = (f11 * f15) - (f12 * f14);
        float f17 = (f12 * f13) - (f10 * f15);
        float f18 = (f10 * f14) - (f11 * f13);
        float f19 = (f9 * f18) + (f8 * f17) + (f6 * f16);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f16 / f19;
        fArr2[1] = f17 / f19;
        fArr2[2] = f18 / f19;
        fArr2[3] = ((f9 * f14) - (f8 * f15)) / f19;
        fArr2[4] = ((f15 * f6) - (f9 * f13)) / f19;
        fArr2[5] = ((f13 * f8) - (f14 * f6)) / f19;
        fArr2[6] = ((f8 * f12) - (f9 * f11)) / f19;
        fArr2[7] = ((f9 * f10) - (f12 * f6)) / f19;
        fArr2[8] = ((f6 * f11) - (f8 * f10)) / f19;
        return fArr2;
    }

    public static final float[] g(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f6 = fArr[0] * fArr2[0];
        float f8 = fArr[3];
        float f9 = fArr2[1];
        float f10 = fArr[6];
        float f11 = fArr2[2];
        fArr3[0] = (f10 * f11) + (f8 * f9) + f6;
        float f12 = fArr[1];
        float f13 = fArr2[0];
        float f14 = fArr[4];
        float f15 = fArr[7];
        float f16 = f15 * f11;
        fArr3[1] = f16 + (f9 * f14) + (f12 * f13);
        float f17 = fArr[2] * f13;
        float f18 = fArr[5];
        float f19 = (fArr2[1] * f18) + f17;
        float f20 = fArr[8];
        fArr3[2] = (f11 * f20) + f19;
        float f21 = fArr[0];
        float f22 = fArr2[3] * f21;
        float f23 = fArr2[4];
        float f24 = (f8 * f23) + f22;
        float f25 = fArr2[5];
        fArr3[3] = (f10 * f25) + f24;
        float f26 = fArr[1];
        float f27 = fArr2[3];
        float f28 = f14 * f23;
        fArr3[4] = (f15 * f25) + f28 + (f26 * f27);
        float f29 = fArr[2];
        float f30 = f25 * f20;
        fArr3[5] = f30 + (f18 * fArr2[4]) + (f27 * f29);
        float f31 = f21 * fArr2[6];
        float f32 = fArr[3];
        float f33 = fArr2[7];
        float f34 = (f32 * f33) + f31;
        float f35 = fArr2[8];
        fArr3[6] = (f10 * f35) + f34;
        float f36 = fArr2[6];
        float f37 = f15 * f35;
        fArr3[7] = f37 + (fArr[4] * f33) + (f26 * f36);
        float f38 = f20 * f35;
        fArr3[8] = f38 + (fArr[5] * fArr2[7]) + (f29 * f36);
        return fArr3;
    }

    public static final float[] h(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f6 = fArr2[0];
        float f8 = fArr2[1];
        float f9 = fArr2[2];
        fArr2[0] = (fArr[6] * f9) + (fArr[3] * f8) + (fArr[0] * f6);
        fArr2[1] = (fArr[7] * f9) + (fArr[4] * f8) + (fArr[1] * f6);
        fArr2[2] = (fArr[8] * f9) + (fArr[5] * f8) + (fArr[2] * f6);
        return fArr2;
    }
}
