package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class l10 extends m10 {
    public final pa2 e;
    public final pa2 f;
    public final float[] g;

    public l10(pa2 pa2Var, pa2 pa2Var2) {
        super(pa2Var2, pa2Var, pa2Var2, null);
        float[] P;
        this.e = pa2Var;
        this.f = pa2Var2;
        float[] fArr = r4.c.b;
        q63 q63Var = pa2Var.d;
        float[] fArr2 = pa2Var.i;
        q63 q63Var2 = pa2Var2.d;
        float[] fArr3 = pa2Var2.j;
        if (l41.w(q63Var, q63Var2)) {
            P = l41.P(fArr3, fArr2);
        } else {
            float[] a = q63Var.a();
            float[] a2 = q63Var2.a();
            q63 q63Var3 = zm3.d;
            P = l41.P(l41.w(q63Var2, q63Var3) ? fArr3 : l41.I(l41.P(l41.v(fArr, a2, new float[]{0.964212f, 1.0f, 0.825188f}), pa2Var2.i)), l41.w(q63Var, q63Var3) ? fArr2 : l41.P(l41.v(fArr, a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = P;
    }

    @Override // defpackage.m10
    public final long a(long j) {
        float h = aw.h(j);
        float g = aw.g(j);
        float e = aw.e(j);
        float d = aw.d(j);
        la2 la2Var = this.e.p;
        float b = (float) la2Var.b(h);
        float b2 = (float) la2Var.b(g);
        float b3 = (float) la2Var.b(e);
        float[] fArr = this.g;
        float f = (fArr[6] * b3) + (fArr[3] * b2) + (fArr[0] * b);
        float f2 = (fArr[7] * b3) + (fArr[4] * b2) + (fArr[1] * b);
        float f3 = (fArr[8] * b3) + (fArr[5] * b2) + (fArr[2] * b);
        pa2 pa2Var = this.f;
        float b4 = (float) pa2Var.m.b(f);
        la2 la2Var2 = pa2Var.m;
        return ap.b(b4, (float) la2Var2.b(f2), (float) la2Var2.b(f3), d, pa2Var);
    }
}
