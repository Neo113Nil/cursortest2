package x;

import a0.e0;
import d0.t1;
import e6.v;
import h6.d;
import l1.a0;
import l1.d0;
import l1.j;
import l1.k;
import p1.g0;
import p1.h0;
import p1.n0;
import r1.l1;
import r1.m;
import r1.w;
import x0.c;
import x0.q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends m implements w, l1, c {

    /* renamed from: u, reason: collision with root package name */
    public q6.a f9589u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9590v;

    /* renamed from: w, reason: collision with root package name */
    public final d0 f9591w;

    public a(q6.a aVar) {
        this.f9589u = aVar;
        e0 e0Var = new e0(this, (d) null, 28);
        j jVar = a0.f5772a;
        d0 d0Var = new d0(null, null, e0Var);
        A0(d0Var);
        this.f9591w = d0Var;
    }

    @Override // r1.l1
    public final void A(j jVar, k kVar, long j8) {
        this.f9591w.A(jVar, kVar, j8);
    }

    @Override // r1.l1
    public final void a0() {
        this.f9591w.a0();
    }

    @Override // r1.w
    public final g0 f(h0 h0Var, p1.e0 e0Var, long j8) {
        int K = h0Var.K(androidx.compose.foundation.text.handwriting.a.f682a);
        int K2 = h0Var.K(androidx.compose.foundation.text.handwriting.a.f683b);
        int i7 = K2 * 2;
        int i8 = K * 2;
        n0 b9 = e0Var.b(r4.a.M(i7, i8, j8));
        int i9 = b9.f7064g - i8;
        return h0Var.C(b9.f7063f - i7, i9, v.f2827f, new t1(b9, K2, K, 2));
    }

    @Override // x0.c
    public final void m0(q qVar) {
        this.f9590v = qVar.a();
    }
}
