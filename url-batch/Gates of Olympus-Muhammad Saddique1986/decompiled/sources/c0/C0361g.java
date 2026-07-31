package c0;

import b0.C0352v;

/* renamed from: c0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0361g {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0357c f5498a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0357c f5499b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0357c f5500c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f5501d;

    public C0361g(AbstractC0357c abstractC0357c, AbstractC0357c abstractC0357c2, AbstractC0357c abstractC0357c3, float[] fArr) {
        this.f5498a = abstractC0357c;
        this.f5499b = abstractC0357c2;
        this.f5500c = abstractC0357c3;
        this.f5501d = fArr;
    }

    public long a(long j3) {
        float h3 = C0352v.h(j3);
        float g3 = C0352v.g(j3);
        float e3 = C0352v.e(j3);
        float d3 = C0352v.d(j3);
        AbstractC0357c abstractC0357c = this.f5499b;
        long d4 = abstractC0357c.d(h3, g3, e3);
        float intBitsToFloat = Float.intBitsToFloat((int) (d4 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d4 & 4294967295L));
        float e4 = abstractC0357c.e(h3, g3, e3);
        float[] fArr = this.f5501d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e4 *= fArr[2];
        }
        float f3 = intBitsToFloat;
        float f4 = intBitsToFloat2;
        return this.f5500c.f(f3, f4, e4, d3, this.f5498a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0361g(AbstractC0357c abstractC0357c, AbstractC0357c abstractC0357c2, int i3) {
        this(abstractC0357c2, r4, r5, r8);
        long j3 = abstractC0357c.f5472b;
        long j4 = AbstractC0356b.f5466a;
        AbstractC0357c a3 = AbstractC0356b.a(j3, j4) ? AbstractC0364j.a(abstractC0357c) : abstractC0357c;
        AbstractC0357c a4 = AbstractC0356b.a(abstractC0357c2.f5472b, j4) ? AbstractC0364j.a(abstractC0357c2) : abstractC0357c2;
        float[] fArr = null;
        if (i3 == 3) {
            boolean a5 = AbstractC0356b.a(abstractC0357c.f5472b, j4);
            boolean a6 = AbstractC0356b.a(abstractC0357c2.f5472b, j4);
            if ((!a5 || !a6) && (a5 || a6)) {
                abstractC0357c = a5 ? abstractC0357c : abstractC0357c2;
                float[] fArr2 = AbstractC0364j.f5507e;
                C0373s c0373s = ((C0371q) abstractC0357c).f5522d;
                float[] a7 = a5 ? c0373s.a() : fArr2;
                fArr2 = a6 ? c0373s.a() : fArr2;
                fArr = new float[]{a7[0] / fArr2[0], a7[1] / fArr2[1], a7[2] / fArr2[2]};
            }
        }
    }
}
