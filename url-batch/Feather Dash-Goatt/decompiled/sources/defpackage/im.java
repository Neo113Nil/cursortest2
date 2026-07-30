package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class im extends jm {
    public final w31 e;
    public final w31 f;
    public final float[] g;

    public im(w31 w31Var, w31 w31Var2) {
        super(w31Var2, w31Var, w31Var2, null);
        float[] O;
        this.e = w31Var;
        this.f = w31Var2;
        float[] fArr = s2.c.b;
        oo1 oo1Var = w31Var.d;
        float[] fArr2 = w31Var.i;
        oo1 oo1Var2 = w31Var2.d;
        float[] fArr3 = w31Var2.j;
        if (p4.y(oo1Var, oo1Var2)) {
            O = p4.O(fArr3, fArr2);
        } else {
            float[] a = oo1Var.a();
            float[] a2 = oo1Var2.a();
            oo1 oo1Var3 = uq1.f;
            O = p4.O(p4.y(oo1Var2, oo1Var3) ? fArr3 : p4.J(p4.O(p4.u(fArr, a2, new float[]{0.964212f, 1.0f, 0.825188f}), w31Var2.i)), p4.y(oo1Var, oo1Var3) ? fArr2 : p4.O(p4.u(fArr, a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = O;
    }

    @Override // defpackage.jm
    public final long a(long j) {
        float h = hi.h(j);
        float g = hi.g(j);
        float e = hi.e(j);
        float d = hi.d(j);
        s31 s31Var = this.e.p;
        float b = (float) s31Var.b(h);
        float b2 = (float) s31Var.b(g);
        float b3 = (float) s31Var.b(e);
        float[] fArr = this.g;
        float f = (fArr[6] * b3) + (fArr[3] * b2) + (fArr[0] * b);
        float f2 = (fArr[7] * b3) + (fArr[4] * b2) + (fArr[1] * b);
        float f3 = (fArr[8] * b3) + (fArr[5] * b2) + (fArr[2] * b);
        w31 w31Var = this.f;
        float b4 = (float) w31Var.m.b(f);
        s31 s31Var2 = w31Var.m;
        return la0.b(b4, (float) s31Var2.b(f2), (float) s31Var2.b(f3), d, w31Var);
    }
}
