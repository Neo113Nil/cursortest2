package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zp2 extends p90 implements a91, w22, go0 {
    public Function0 C;
    public boolean D;
    public final vr2 E;

    public zp2(Function0 function0) {
        this.C = function0;
        z62 z62Var = new z62(7, null, this);
        m22 m22Var = rr2.a;
        vr2 vr2Var = new vr2(null, null, sr2.m);
        vr2Var.C = z62Var;
        G0(vr2Var);
        this.E = vr2Var;
    }

    @Override // defpackage.w22
    public final void J(m22 m22Var, n22 n22Var, long j) {
        this.E.J(m22Var, n22Var, j);
    }

    @Override // defpackage.go0
    public final void X(xo0 xo0Var) {
        this.D = xo0Var.a();
    }

    @Override // defpackage.w22
    public final void h0() {
        this.E.h0();
    }

    @Override // defpackage.a91
    public final pj1 j(qj1 qj1Var, jj1 jj1Var, long j) {
        pj1 G;
        int R = qj1Var.R(40.0f);
        int R2 = qj1Var.R(10.0f);
        int i = R2 * 2;
        int i2 = R * 2;
        n12 c = jj1Var.c(v10.j(i, i2, j));
        G = qj1Var.G(c.m - i, c.n - i2, mi1.c(), new c31(c, R2, R, 3));
        return G;
    }
}
