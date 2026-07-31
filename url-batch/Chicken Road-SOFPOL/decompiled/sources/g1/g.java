package g1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final c f2848a;

    /* renamed from: b, reason: collision with root package name */
    public final c f2849b;

    /* renamed from: c, reason: collision with root package name */
    public final c f2850c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f2851d;

    public g(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.f2848a = cVar;
        this.f2849b = cVar2;
        this.f2850c = cVar3;
        this.f2851d = fArr;
    }

    public long a(long j7) {
        float h8 = f1.s.h(j7);
        float g3 = f1.s.g(j7);
        float e8 = f1.s.e(j7);
        float d8 = f1.s.d(j7);
        c cVar = this.f2849b;
        long d9 = cVar.d(h8, g3, e8);
        float intBitsToFloat = Float.intBitsToFloat((int) (d9 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d9 & 4294967295L));
        float e9 = cVar.e(h8, g3, e8);
        float[] fArr = this.f2851d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e9 *= fArr[2];
        }
        float f6 = intBitsToFloat;
        float f8 = intBitsToFloat2;
        return this.f2850c.f(f6, f8, e9, d8, this.f2848a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(c cVar, c cVar2, int i) {
        this(cVar2, r0, r1, r3);
        float[] fArr;
        long j7 = cVar.f2819b;
        long j8 = b.f2813a;
        c a8 = b.a(j7, j8) ? j.a(cVar) : cVar;
        c a9 = b.a(cVar2.f2819b, j8) ? j.a(cVar2) : cVar2;
        if (i == 3) {
            boolean a10 = b.a(cVar.f2819b, j8);
            boolean a11 = b.a(cVar2.f2819b, j8);
            if ((!a10 || !a11) && (a10 || a11)) {
                s sVar = ((q) (a10 ? cVar : cVar2)).f2872d;
                float[] fArr2 = j.f2857e;
                float[] a12 = a10 ? sVar.a() : fArr2;
                fArr2 = a11 ? sVar.a() : fArr2;
                fArr = new float[]{a12[0] / fArr2[0], a12[1] / fArr2[1], a12[2] / fArr2[2]};
            }
        }
        fArr = null;
    }
}
