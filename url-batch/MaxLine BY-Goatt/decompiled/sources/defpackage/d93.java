package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class d93 extends ul1 implements a91 {
    public int A;
    public Function2 B;

    @Override // defpackage.a91
    public final pj1 j(qj1 qj1Var, jj1 jj1Var, long j) {
        pj1 G;
        n12 c = jj1Var.c(v10.a(this.A != 1 ? 0 : u10.j(j), u10.h(j), this.A == 2 ? u10.i(j) : 0, u10.g(j)));
        int c2 = d.c(c.m, u10.j(j), u10.h(j));
        int c3 = d.c(c.n, u10.i(j), u10.g(j));
        G = qj1Var.G(c2, c3, mi1.c(), new c93(this, c2, c, c3, qj1Var));
        return G;
    }
}
