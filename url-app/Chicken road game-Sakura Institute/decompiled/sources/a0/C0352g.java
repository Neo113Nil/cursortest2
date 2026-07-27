package a0;

import Z.C0323u;

/* renamed from: a0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0352g {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0348c f4785a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0348c f4786b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0348c f4787c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f4788d;

    public C0352g(AbstractC0348c abstractC0348c, AbstractC0348c abstractC0348c2, AbstractC0348c abstractC0348c3, float[] fArr) {
        this.f4785a = abstractC0348c;
        this.f4786b = abstractC0348c2;
        this.f4787c = abstractC0348c3;
        this.f4788d = fArr;
    }

    public long a(long j4) {
        float h4 = C0323u.h(j4);
        float g4 = C0323u.g(j4);
        float e4 = C0323u.e(j4);
        float d4 = C0323u.d(j4);
        AbstractC0348c abstractC0348c = this.f4786b;
        long d5 = abstractC0348c.d(h4, g4, e4);
        float intBitsToFloat = Float.intBitsToFloat((int) (d5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d5 & 4294967295L));
        float e5 = abstractC0348c.e(h4, g4, e4);
        float[] fArr = this.f4788d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e5 *= fArr[2];
        }
        float f4 = intBitsToFloat;
        float f5 = intBitsToFloat2;
        return this.f4787c.f(f4, f5, e5, d4, this.f4785a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0352g(AbstractC0348c abstractC0348c, AbstractC0348c abstractC0348c2, int i2) {
        this(abstractC0348c2, r4, r5, r8);
        long j4 = abstractC0348c.f4759b;
        long j5 = AbstractC0347b.f4753a;
        AbstractC0348c a4 = AbstractC0347b.a(j4, j5) ? AbstractC0355j.a(abstractC0348c) : abstractC0348c;
        AbstractC0348c a5 = AbstractC0347b.a(abstractC0348c2.f4759b, j5) ? AbstractC0355j.a(abstractC0348c2) : abstractC0348c2;
        float[] fArr = null;
        if (i2 == 3) {
            boolean a6 = AbstractC0347b.a(abstractC0348c.f4759b, j5);
            boolean a7 = AbstractC0347b.a(abstractC0348c2.f4759b, j5);
            if ((!a6 || !a7) && (a6 || a7)) {
                abstractC0348c = a6 ? abstractC0348c : abstractC0348c2;
                float[] fArr2 = AbstractC0355j.f4794e;
                C0364s c0364s = ((C0362q) abstractC0348c).f4809d;
                float[] a8 = a6 ? c0364s.a() : fArr2;
                fArr2 = a7 ? c0364s.a() : fArr2;
                fArr = new float[]{a8[0] / fArr2[0], a8[1] / fArr2[1], a8[2] / fArr2[2]};
            }
        }
    }
}
