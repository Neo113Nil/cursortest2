package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ow {
    public static final qw a = new qw(s93.c, qb2.A);

    public static final qw a(zh zhVar, yn ynVar, a00 a00Var, int i) {
        if (zhVar.equals(s93.c) && ynVar.equals(qb2.A)) {
            a00Var.X(345962472);
            a00Var.q(false);
            return a;
        }
        a00Var.X(346016319);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && a00Var.f(zhVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !a00Var.f(ynVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object M = a00Var.M();
        if (z3 || M == sz.a) {
            M = new qw(zhVar, ynVar);
            a00Var.i0(M);
        }
        qw qwVar = (qw) M;
        a00Var.q(false);
        return qwVar;
    }
}
