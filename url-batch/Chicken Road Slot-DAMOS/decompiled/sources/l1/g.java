package l1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final c f5783a;

    /* renamed from: b, reason: collision with root package name */
    public final c f5784b;

    /* renamed from: c, reason: collision with root package name */
    public final c f5785c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f5786d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(c cVar, c cVar2, int i3) {
        this(cVar2, r0, r1, r3);
        float[] fArr;
        long j = cVar.f5756b;
        long j3 = b.f5750a;
        c a9 = b.a(j, j3) ? j.a(cVar) : cVar;
        c a10 = b.a(cVar2.f5756b, j3) ? j.a(cVar2) : cVar2;
        if (i3 == 3) {
            boolean a11 = b.a(cVar.f5756b, j3);
            boolean a12 = b.a(cVar2.f5756b, j3);
            if ((!a11 || !a12) && (a11 || a12)) {
                s sVar = ((q) (a11 ? cVar : cVar2)).f5806d;
                float[] fArr2 = j.f5792e;
                float[] a13 = a11 ? sVar.a() : fArr2;
                fArr2 = a12 ? sVar.a() : fArr2;
                fArr = new float[]{a13[0] / fArr2[0], a13[1] / fArr2[1], a13[2] / fArr2[2]};
            }
        }
        fArr = null;
    }

    public long a(long j) {
        float g = k1.p.g(j);
        float f3 = k1.p.f(j);
        float e2 = k1.p.e(j);
        float d10 = k1.p.d(j);
        c cVar = this.f5784b;
        long d11 = cVar.d(g, f3, e2);
        float intBitsToFloat = Float.intBitsToFloat((int) (d11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d11 & 4294967295L));
        float e9 = cVar.e(g, f3, e2);
        float[] fArr = this.f5786d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e9 *= fArr[2];
        }
        float f10 = intBitsToFloat;
        float f11 = intBitsToFloat2;
        return this.f5785c.f(f10, f11, e9, d10, this.f5783a);
    }

    public g(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.f5783a = cVar;
        this.f5784b = cVar2;
        this.f5785c = cVar3;
        this.f5786d = fArr;
    }
}
