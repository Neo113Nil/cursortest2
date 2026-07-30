package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class js0 extends zs0 {
    public static final js0 c = new js0(0, 3, 1);

    @Override // defpackage.zs0
    public final void a(uh uhVar, b9 b9Var, db1 db1Var, i21 i21Var, at0 at0Var) {
        yw ywVar;
        ab1 ab1Var = (ab1) uhVar.c(1);
        d3 d3Var = (d3) uhVar.c(0);
        tz tzVar = (tz) uhVar.c(2);
        db1 e = ab1Var.e();
        if (at0Var != null) {
            try {
                ywVar = new yw(at0Var, 25, db1Var);
            } catch (Throwable th) {
                e.e(false);
                throw th;
            }
        } else {
            ywVar = null;
        }
        if (!tzVar.b.B()) {
            kl.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        tzVar.a.A(b9Var, e, i21Var, ywVar);
        e.e(true);
        db1Var.d();
        d3Var.getClass();
        db1Var.A(ab1Var, ab1Var.a(d3Var));
        db1Var.k();
    }
}
