package c0;

import b0.C0288u;

/* renamed from: c0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0304g {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0300c f4372a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0300c f4373b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0300c f4374c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f4375d;

    public C0304g(AbstractC0300c abstractC0300c, AbstractC0300c abstractC0300c2, AbstractC0300c abstractC0300c3, float[] fArr) {
        this.f4372a = abstractC0300c;
        this.f4373b = abstractC0300c2;
        this.f4374c = abstractC0300c3;
        this.f4375d = fArr;
    }

    public long a(long j3) {
        float h3 = C0288u.h(j3);
        float g3 = C0288u.g(j3);
        float e3 = C0288u.e(j3);
        float d3 = C0288u.d(j3);
        AbstractC0300c abstractC0300c = this.f4373b;
        long d4 = abstractC0300c.d(h3, g3, e3);
        float intBitsToFloat = Float.intBitsToFloat((int) (d4 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d4 & 4294967295L));
        float e4 = abstractC0300c.e(h3, g3, e3);
        float[] fArr = this.f4375d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e4 *= fArr[2];
        }
        float f3 = intBitsToFloat;
        float f4 = intBitsToFloat2;
        return this.f4374c.f(f3, f4, e4, d3, this.f4372a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0304g(AbstractC0300c abstractC0300c, AbstractC0300c abstractC0300c2, int i3) {
        this(abstractC0300c2, r4, r5, r8);
        long j3 = abstractC0300c.f4347b;
        long j4 = AbstractC0299b.f4341a;
        AbstractC0300c a3 = AbstractC0299b.a(j3, j4) ? AbstractC0307j.a(abstractC0300c) : abstractC0300c;
        AbstractC0300c a4 = AbstractC0299b.a(abstractC0300c2.f4347b, j4) ? AbstractC0307j.a(abstractC0300c2) : abstractC0300c2;
        float[] fArr = null;
        if (i3 == 3) {
            boolean a5 = AbstractC0299b.a(abstractC0300c.f4347b, j4);
            boolean a6 = AbstractC0299b.a(abstractC0300c2.f4347b, j4);
            if ((!a5 || !a6) && (a5 || a6)) {
                abstractC0300c = a5 ? abstractC0300c : abstractC0300c2;
                float[] fArr2 = AbstractC0307j.f4381e;
                C0316s c0316s = ((C0314q) abstractC0300c).f4396d;
                float[] a7 = a5 ? c0316s.a() : fArr2;
                fArr2 = a6 ? c0316s.a() : fArr2;
                fArr = new float[]{a7[0] / fArr2[0], a7[1] / fArr2[1], a7[2] / fArr2[2]};
            }
        }
    }
}
