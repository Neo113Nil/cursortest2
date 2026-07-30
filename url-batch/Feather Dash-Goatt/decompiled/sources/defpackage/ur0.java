package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ur0 extends zs0 {
    public static final ur0 c = new ur0(0, 2, 1);

    @Override // defpackage.zs0
    public final void a(uh uhVar, b9 b9Var, db1 db1Var, i21 i21Var, at0 at0Var) {
        d3 d3Var = (d3) uhVar.c(0);
        Object c2 = uhVar.c(1);
        if (c2 instanceof k21) {
            k21 k21Var = (k21) c2;
            i21Var.e.b(k21Var);
            i21Var.d.a(k21Var);
        }
        if (db1Var.n != 0) {
            kl.a("Can only append a slot if not current inserting");
        }
        int i = db1Var.i;
        int i2 = db1Var.j;
        int c3 = db1Var.c(d3Var);
        int g = db1Var.g(db1Var.b, db1Var.r(c3 + 1));
        db1Var.i = g;
        db1Var.j = g;
        db1Var.x(1, c3);
        if (i >= g) {
            i++;
            i2++;
        }
        db1Var.c[g] = c2;
        db1Var.i = i;
        db1Var.j = i2;
    }
}
