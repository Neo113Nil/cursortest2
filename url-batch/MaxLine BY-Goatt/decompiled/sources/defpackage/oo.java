package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class oo extends ul1 implements a91, xh2 {
    public Function1 A;

    public oo(Function1 function1) {
        this.A = function1;
    }

    @Override // defpackage.a91
    public final pj1 j(qj1 qj1Var, jj1 jj1Var, long j) {
        pj1 G;
        n12 c = jj1Var.c(j);
        G = qj1Var.G(c.m, c.n, mi1.c(), new p8(10, c, this));
        return G;
    }

    @Override // defpackage.xh2
    public final boolean l() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.A + ')';
    }

    @Override // defpackage.ul1
    public final boolean v0() {
        return false;
    }

    @Override // defpackage.xh2
    public final void M(sh2 sh2Var) {
    }
}
