package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class us0 extends zs0 {
    public static final us0 c = new us0(1, 0, 2);

    @Override // defpackage.zs0
    public final void a(uh uhVar, b9 b9Var, db1 db1Var, i21 i21Var, at0 at0Var) {
        int b = uhVar.b(0);
        int i = db1Var.v;
        int N = db1Var.N(db1Var.b, db1Var.r(i));
        int g = db1Var.g(db1Var.b, db1Var.r(i + 1));
        for (int max = Math.max(N, g - b); max < g; max++) {
            Object obj = db1Var.c[db1Var.h(max)];
            if (obj instanceof k21) {
                i21Var.e((k21) obj);
            } else if (obj instanceof i11) {
                ((i11) obj).c();
            }
        }
        if (b <= 0) {
            kl.a("Check failed");
        }
        int i2 = db1Var.v;
        int N2 = db1Var.N(db1Var.b, db1Var.r(i2));
        int g2 = db1Var.g(db1Var.b, db1Var.r(i2 + 1)) - b;
        if (g2 < N2) {
            kl.a("Check failed");
        }
        db1Var.J(g2, b, i2);
        int i3 = db1Var.i;
        if (i3 >= N2) {
            db1Var.i = i3 - b;
        }
    }
}
