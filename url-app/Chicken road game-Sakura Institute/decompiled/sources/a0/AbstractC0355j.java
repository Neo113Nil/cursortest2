package a0;

/* renamed from: a0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0355j {

    /* renamed from: a, reason: collision with root package name */
    public static final C0364s f4790a = new C0364s(0.31006f, 0.31616f);

    /* renamed from: b, reason: collision with root package name */
    public static final C0364s f4791b = new C0364s(0.34567f, 0.3585f);

    /* renamed from: c, reason: collision with root package name */
    public static final C0364s f4792c = new C0364s(0.32168f, 0.33767f);

    /* renamed from: d, reason: collision with root package name */
    public static final C0364s f4793d = new C0364s(0.31271f, 0.32902f);

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f4794e = {0.964212f, 1.0f, 0.825188f};

    public static AbstractC0348c a(AbstractC0348c abstractC0348c) {
        C0364s c0364s = f4791b;
        C0346a c0346a = C0346a.f4751b;
        if (!AbstractC0347b.a(abstractC0348c.f4759b, AbstractC0347b.f4753a)) {
            return abstractC0348c;
        }
        C0362q c0362q = (C0362q) abstractC0348c;
        C0364s c0364s2 = c0362q.f4809d;
        if (d(c0364s2, c0364s)) {
            return abstractC0348c;
        }
        return new C0362q(c0362q.f4758a, c0362q.f4813h, c0364s, h(c(c0346a.f4752a, c0364s2.a(), c0364s.a()), c0362q.f4814i), c0362q.f4816k, c0362q.f4819n, c0362q.f4810e, c0362q.f4811f, c0362q.f4812g, -1);
    }

    public static float b(float[] fArr) {
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float f7 = fArr[3];
        float f8 = fArr[4];
        float f9 = fArr[5];
        float f10 = (((((f6 * f9) + ((f5 * f8) + (f4 * f7))) - (f7 * f8)) - (f5 * f6)) - (f4 * f9)) * 0.5f;
        return f10 < 0.0f ? -f10 : f10;
    }

    public static final float[] c(float[] fArr, float[] fArr2, float[] fArr3) {
        j(fArr, fArr2);
        j(fArr, fArr3);
        return h(g(fArr), i(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    public static final boolean d(C0364s c0364s, C0364s c0364s2) {
        if (c0364s == c0364s2) {
            return true;
        }
        return Math.abs(c0364s.f4830a - c0364s2.f4830a) < 0.001f && Math.abs(c0364s.f4831b - c0364s2.f4831b) < 0.001f;
    }

    public static final C0352g e(AbstractC0348c abstractC0348c, AbstractC0348c abstractC0348c2, int i2) {
        if (abstractC0348c == abstractC0348c2) {
            return new C0350e(abstractC0348c, abstractC0348c, 1);
        }
        long j4 = AbstractC0347b.f4753a;
        return (AbstractC0347b.a(abstractC0348c.f4759b, j4) && AbstractC0347b.a(abstractC0348c2.f4759b, j4)) ? new C0351f((C0362q) abstractC0348c, (C0362q) abstractC0348c2, i2) : new C0352g(abstractC0348c, abstractC0348c2, i2);
    }

    public static float f(float f4, float f5, float f6, float f7) {
        return (f4 * f7) - (f5 * f6);
    }

    public static final float[] g(float[] fArr) {
        float f4 = fArr[0];
        float f5 = fArr[3];
        float f6 = fArr[6];
        float f7 = fArr[1];
        float f8 = fArr[4];
        float f9 = fArr[7];
        float f10 = fArr[2];
        float f11 = fArr[5];
        float f12 = fArr[8];
        float f13 = (f8 * f12) - (f9 * f11);
        float f14 = (f9 * f10) - (f7 * f12);
        float f15 = (f7 * f11) - (f8 * f10);
        float f16 = (f6 * f15) + (f5 * f14) + (f4 * f13);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f13 / f16;
        fArr2[1] = f14 / f16;
        fArr2[2] = f15 / f16;
        fArr2[3] = ((f6 * f11) - (f5 * f12)) / f16;
        fArr2[4] = ((f12 * f4) - (f6 * f10)) / f16;
        fArr2[5] = ((f10 * f5) - (f11 * f4)) / f16;
        fArr2[6] = ((f5 * f9) - (f6 * f8)) / f16;
        fArr2[7] = ((f6 * f7) - (f9 * f4)) / f16;
        fArr2[8] = ((f4 * f8) - (f5 * f7)) / f16;
        return fArr2;
    }

    public static final float[] h(float[] fArr, float[] fArr2) {
        float f4 = fArr[0];
        float f5 = fArr2[0];
        float f6 = fArr[3];
        float f7 = fArr2[1];
        float f8 = fArr[6];
        float f9 = fArr2[2];
        float f10 = (f8 * f9) + (f6 * f7) + (f4 * f5);
        float f11 = fArr[1];
        float f12 = fArr[4];
        float f13 = fArr[7];
        float f14 = (f13 * f9) + (f12 * f7) + (f11 * f5);
        float f15 = fArr[2];
        float f16 = fArr[5];
        float f17 = fArr[8];
        float f18 = (f9 * f17) + (f7 * f16) + (f5 * f15);
        float f19 = fArr2[3];
        float f20 = fArr2[4];
        float f21 = fArr2[5];
        float f22 = (f8 * f21) + (f6 * f20) + (f4 * f19);
        float f23 = (f13 * f21) + (f12 * f20) + (f11 * f19);
        float f24 = (f21 * f17) + (f20 * f16) + (f19 * f15);
        float f25 = fArr2[6];
        float f26 = fArr2[7];
        float f27 = (f6 * f26) + (f4 * f25);
        float f28 = fArr2[8];
        return new float[]{f10, f14, f18, f22, f23, f24, (f8 * f28) + f27, (f13 * f28) + (f12 * f26) + (f11 * f25), (f17 * f28) + (f16 * f26) + (f15 * f25)};
    }

    public static final float[] i(float[] fArr, float[] fArr2) {
        float f4 = fArr[0];
        float f5 = fArr2[0] * f4;
        float f6 = fArr[1];
        float f7 = fArr2[1] * f6;
        float f8 = fArr[2];
        return new float[]{f5, f7, fArr2[2] * f8, fArr2[3] * f4, fArr2[4] * f6, fArr2[5] * f8, f4 * fArr2[6], f6 * fArr2[7], f8 * fArr2[8]};
    }

    public static final void j(float[] fArr, float[] fArr2) {
        float f4 = fArr2[0];
        float f5 = fArr2[1];
        float f6 = fArr2[2];
        fArr2[0] = (fArr[6] * f6) + (fArr[3] * f5) + (fArr[0] * f4);
        fArr2[1] = (fArr[7] * f6) + (fArr[4] * f5) + (fArr[1] * f4);
        fArr2[2] = (fArr[8] * f6) + (fArr[5] * f5) + (fArr[2] * f4);
    }
}
