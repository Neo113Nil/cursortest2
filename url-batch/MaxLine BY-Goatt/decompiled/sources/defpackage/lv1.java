package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lv1 extends pw1 {
    public static final lv1 c = new lv1(0, 2, 1);

    @Override // defpackage.pw1
    public final void a(gn gnVar, rh rhVar, zl2 zl2Var, q82 q82Var, qw1 qw1Var) {
        m6 m6Var = (m6) gnVar.g(0);
        Object g = gnVar.g(1);
        if (g instanceof s82) {
            s82 s82Var = (s82) g;
            q82Var.e.b(s82Var);
            q82Var.d.a(s82Var);
        }
        if (zl2Var.n != 0) {
            b00.c("Can only append a slot if not current inserting");
        }
        int i = zl2Var.i;
        int i2 = zl2Var.j;
        int c2 = zl2Var.c(m6Var);
        int g2 = zl2Var.g(zl2Var.b, zl2Var.r(c2 + 1));
        zl2Var.i = g2;
        zl2Var.j = g2;
        zl2Var.w(1, c2);
        if (i >= g2) {
            i++;
            i2++;
        }
        zl2Var.c[g2] = g;
        zl2Var.i = i;
        zl2Var.j = i2;
    }
}
