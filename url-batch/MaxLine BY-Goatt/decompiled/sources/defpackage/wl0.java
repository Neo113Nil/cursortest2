package defpackage;

import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wl0 extends ul1 implements a91 {
    public int A;
    public float B;

    @Override // defpackage.a91
    public final pj1 j(qj1 qj1Var, jj1 jj1Var, long j) {
        int j2;
        int h;
        int i;
        int g;
        pj1 G;
        if (!u10.d(j) || this.A == 1) {
            j2 = u10.j(j);
            h = u10.h(j);
        } else {
            j2 = d.c(Math.round(u10.h(j) * this.B), u10.j(j), u10.h(j));
            h = j2;
        }
        if (!u10.c(j) || this.A == 2) {
            i = u10.i(j);
            g = u10.g(j);
        } else {
            i = d.c(Math.round(u10.g(j) * this.B), u10.i(j), u10.g(j));
            g = i;
        }
        n12 c = jj1Var.c(v10.a(j2, h, i, g));
        G = qj1Var.G(c.m, c.n, mi1.c(), new bb(c, 4));
        return G;
    }
}
