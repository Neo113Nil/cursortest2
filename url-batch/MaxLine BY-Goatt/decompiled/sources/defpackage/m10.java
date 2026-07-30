package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class m10 {
    public final iw a;
    public final iw b;
    public final iw c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m10(iw iwVar, iw iwVar2, int i) {
        this(iwVar2, r0, r1, r4);
        float[] fArr;
        iw o = o70.v(iwVar.b, 12884901888L) ? l41.o(iwVar) : iwVar;
        iw o2 = o70.v(iwVar2.b, 12884901888L) ? l41.o(iwVar2) : iwVar2;
        float[] fArr2 = zm3.g;
        if (i == 3) {
            boolean v = o70.v(iwVar.b, 12884901888L);
            boolean v2 = o70.v(iwVar2.b, 12884901888L);
            if ((!v || !v2) && (v || v2)) {
                q63 q63Var = ((pa2) (v ? iwVar : iwVar2)).d;
                float[] a = v ? q63Var.a() : fArr2;
                fArr2 = v2 ? q63Var.a() : fArr2;
                fArr = new float[]{a[0] / fArr2[0], a[1] / fArr2[1], a[2] / fArr2[2]};
            }
        }
        fArr = null;
    }

    public long a(long j) {
        float h = aw.h(j);
        float g = aw.g(j);
        float e = aw.e(j);
        float d = aw.d(j);
        iw iwVar = this.b;
        long d2 = iwVar.d(h, g, e);
        float intBitsToFloat = Float.intBitsToFloat((int) (d2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d2 & 4294967295L));
        float e2 = iwVar.e(h, g, e);
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

    public m10(iw iwVar, iw iwVar2, iw iwVar3, float[] fArr) {
        this.a = iwVar;
        this.b = iwVar2;
        this.c = iwVar3;
        this.d = fArr;
    }
}
