package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ec2 {
    public static final fc2 a = new fc2(s93.a, qb2.y);

    public static final fc2 a(xh xhVar, zn znVar, a00 a00Var, int i) {
        if (xhVar.equals(s93.a) && Intrinsics.b(znVar, qb2.y)) {
            a00Var.X(-849081669);
            a00Var.q(false);
            return a;
        }
        a00Var.X(-849030798);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && a00Var.f(xhVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !a00Var.f(znVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object M = a00Var.M();
        if (z3 || M == sz.a) {
            M = new fc2(xhVar, znVar);
            a00Var.i0(M);
        }
        fc2 fc2Var = (fc2) M;
        a00Var.q(false);
        return fc2Var;
    }
}
