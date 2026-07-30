package k;

import g0.z0;
import l.k1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l implements p1.r {

    /* renamed from: a, reason: collision with root package name */
    public final k1 f5234a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f5235b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f5236c;

    public l(m mVar, k1 k1Var, z0 z0Var) {
        this.f5236c = mVar;
        this.f5234a = k1Var;
        this.f5235b = z0Var;
    }

    @Override // p1.r
    public final int b(r1.o0 o0Var, p1.e0 e0Var, int i7) {
        return e0Var.d0(i7);
    }

    @Override // p1.r
    public final int e(r1.o0 o0Var, p1.e0 e0Var, int i7) {
        return e0Var.c(i7);
    }

    @Override // p1.r
    public final p1.g0 f(p1.h0 h0Var, p1.e0 e0Var, long j8) {
        p1.n0 b9 = e0Var.b(j8);
        m mVar = this.f5236c;
        long G = h0Var.v() ? j1.c.G(b9.f7063f, b9.f7064g) : ((m2.j) this.f5234a.a(new a0.y(mVar, 16, this), new c1.a(13, mVar)).getValue()).f6321a;
        return h0Var.C((int) (G >> 32), (int) (4294967295L & G), e6.v.f2827f, new k(mVar, b9, G));
    }

    @Override // p1.r
    public final int h(r1.o0 o0Var, p1.e0 e0Var, int i7) {
        return e0Var.a0(i7);
    }

    @Override // p1.r
    public final int i(r1.o0 o0Var, p1.e0 e0Var, int i7) {
        return e0Var.e0(i7);
    }
}
