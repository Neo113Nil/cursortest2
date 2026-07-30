package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class jm {
    public final pi a;
    public final pi b;
    public final pi c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jm(pi piVar, pi piVar2, int i) {
        this(piVar2, r0, r1, r4);
        float[] fArr;
        pi m = uq1.D(piVar.b, 12884901888L) ? p4.m(piVar) : piVar;
        pi m2 = uq1.D(piVar2.b, 12884901888L) ? p4.m(piVar2) : piVar2;
        float[] fArr2 = uq1.i;
        if (i == 3) {
            boolean D = uq1.D(piVar.b, 12884901888L);
            boolean D2 = uq1.D(piVar2.b, 12884901888L);
            if ((!D || !D2) && (D || D2)) {
                oo1 oo1Var = ((w31) (D ? piVar : piVar2)).d;
                float[] a = D ? oo1Var.a() : fArr2;
                fArr2 = D2 ? oo1Var.a() : fArr2;
                fArr = new float[]{a[0] / fArr2[0], a[1] / fArr2[1], a[2] / fArr2[2]};
            }
        }
        fArr = null;
    }

    public long a(long j) {
        float h = hi.h(j);
        float g = hi.g(j);
        float e = hi.e(j);
        float d = hi.d(j);
        pi piVar = this.b;
        long d2 = piVar.d(h, g, e);
        float intBitsToFloat = Float.intBitsToFloat((int) (d2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d2 & 4294967295L));
        float e2 = piVar.e(h, g, e);
        float[] fArr = this.d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e2 *= fArr[2];
        }
        float f = intBitsToFloat;
        float f2 = intBitsToFloat2;
        return this.c.f(f, f2, e2, d, this.a);
    }

    public jm(pi piVar, pi piVar2, pi piVar3, float[] fArr) {
        this.a = piVar;
        this.b = piVar2;
        this.c = piVar3;
        this.d = fArr;
    }
}
