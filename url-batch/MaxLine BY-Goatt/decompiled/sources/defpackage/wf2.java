package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wf2 extends ul1 implements a91 {
    public jf2 A;
    public boolean B;

    @Override // defpackage.a91
    public final int a(qg1 qg1Var, jj1 jj1Var, int i) {
        return this.B ? jj1Var.Y(Integer.MAX_VALUE) : jj1Var.Y(i);
    }

    @Override // defpackage.a91
    public final int c(qg1 qg1Var, jj1 jj1Var, int i) {
        return this.B ? jj1Var.e(i) : jj1Var.e(Integer.MAX_VALUE);
    }

    @Override // defpackage.a91
    public final int e(qg1 qg1Var, jj1 jj1Var, int i) {
        return this.B ? jj1Var.a0(i) : jj1Var.a0(Integer.MAX_VALUE);
    }

    @Override // defpackage.a91
    public final int h(qg1 qg1Var, jj1 jj1Var, int i) {
        return this.B ? jj1Var.V(Integer.MAX_VALUE) : jj1Var.V(i);
    }

    @Override // defpackage.a91
    public final pj1 j(qj1 qj1Var, jj1 jj1Var, long j) {
        pj1 G;
        tk3.A(j, this.B ? ww1.m : ww1.n);
        n12 c = jj1Var.c(u10.a(j, 0, this.B ? u10.h(j) : Integer.MAX_VALUE, 0, this.B ? Integer.MAX_VALUE : u10.g(j), 5));
        int i = c.m;
        int h = u10.h(j);
        if (i > h) {
            i = h;
        }
        int i2 = c.n;
        int g = u10.g(j);
        if (i2 > g) {
            i2 = g;
        }
        int i3 = c.n - i2;
        int i4 = c.m - i;
        if (!this.B) {
            i3 = i4;
        }
        jf2 jf2Var = this.A;
        iz1 iz1Var = jf2Var.d;
        iz1 iz1Var2 = jf2Var.a;
        iz1Var.i(i3);
        nm2 d = ci2.d();
        Function1 e = d != null ? d.e() : null;
        nm2 f = ci2.f(d);
        try {
            if (iz1Var2.h() > i3) {
                iz1Var2.i(i3);
            }
            Unit unit = Unit.a;
            ci2.j(d, f, e);
            this.A.b.i(this.B ? i2 : i);
            G = qj1Var.G(i, i2, mi1.c(), new vf2(this, i3, c));
            return G;
        } catch (Throwable th) {
            ci2.j(d, f, e);
            throw th;
        }
    }
}
