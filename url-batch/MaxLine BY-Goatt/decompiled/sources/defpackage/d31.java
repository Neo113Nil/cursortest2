package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class d31 implements y81, wl1, zl1 {
    public final z63 a;
    public final lz1 b;
    public final lz1 c;

    public d31(z63 z63Var) {
        this.a = z63Var;
        this.b = ij2.j(z63Var);
        this.c = ij2.j(z63Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d31) {
            return Intrinsics.b(((d31) obj).a, this.a);
        }
        return false;
    }

    @Override // defpackage.wl1
    public final void f(am1 am1Var) {
        z63 z63Var = (z63) am1Var.i(j83.a);
        z63 z63Var2 = this.a;
        this.b.setValue(new aj0(z63Var2, z63Var));
        this.c.setValue(new c23(z63Var, z63Var2));
    }

    @Override // defpackage.zl1
    public final u52 getKey() {
        return j83.a;
    }

    @Override // defpackage.zl1
    public final Object getValue() {
        return (z63) this.c.getValue();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.y81
    public final pj1 j(qj1 qj1Var, jj1 jj1Var, long j) {
        pj1 G;
        lz1 lz1Var = this.b;
        int d = ((z63) lz1Var.getValue()).d(qj1Var, qj1Var.getLayoutDirection());
        int b = ((z63) lz1Var.getValue()).b(qj1Var);
        int c = ((z63) lz1Var.getValue()).c(qj1Var, qj1Var.getLayoutDirection()) + d;
        int a = ((z63) lz1Var.getValue()).a(qj1Var) + b;
        n12 c2 = jj1Var.c(v10.j(-c, -a, j));
        G = qj1Var.G(v10.g(j, c2.m + c), v10.f(j, c2.n + a), mi1.c(), new c31(c2, d, b, 0));
        return G;
    }
}
