package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ip implements oj1 {
    public final ao a;
    public final boolean b;

    public ip(ao aoVar, boolean z) {
        this.a = aoVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip)) {
            return false;
        }
        ip ipVar = (ip) obj;
        return this.a.equals(ipVar.a) && this.b == ipVar.b;
    }

    @Override // defpackage.oj1
    public final pj1 f(qj1 qj1Var, List list, long j) {
        pj1 G;
        pj1 G2;
        pj1 G3;
        if (list.isEmpty()) {
            G3 = qj1Var.G(u10.j(j), u10.i(j), mi1.c(), o3.C);
            return G3;
        }
        long a = this.b ? j : u10.a(j, 0, 0, 0, 0, 10);
        if (list.size() == 1) {
            jj1 jj1Var = (jj1) list.get(0);
            jj1Var.i();
            n12 c = jj1Var.c(a);
            int max = Math.max(u10.j(j), c.m);
            int max2 = Math.max(u10.i(j), c.n);
            G2 = qj1Var.G(max, max2, mi1.c(), new gp(c, jj1Var, qj1Var, max, max2, this));
            return G2;
        }
        n12[] n12VarArr = new n12[list.size()];
        a82 a82Var = new a82();
        a82Var.m = u10.j(j);
        a82 a82Var2 = new a82();
        a82Var2.m = u10.i(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jj1 jj1Var2 = (jj1) list.get(i);
            jj1Var2.i();
            n12 c2 = jj1Var2.c(a);
            n12VarArr[i] = c2;
            a82Var.m = Math.max(a82Var.m, c2.m);
            a82Var2.m = Math.max(a82Var2.m, c2.n);
        }
        G = qj1Var.G(a82Var.m, a82Var2.m, mi1.c(), new hp(n12VarArr, list, qj1Var, a82Var, a82Var2, this));
        return G;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ')';
    }
}
