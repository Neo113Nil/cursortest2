package b1;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k0 extends d {

    /* renamed from: o, reason: collision with root package name */
    public final d f996o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f997p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f998q;

    /* renamed from: r, reason: collision with root package name */
    public Function1 f999r;

    /* renamed from: s, reason: collision with root package name */
    public Function1 f1000s;

    /* renamed from: t, reason: collision with root package name */
    public final long f1001t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k0(d dVar, Function1 function1, Function1 function12, boolean z10, boolean z11) {
        super(0L, o.f1018s, r.k(function1, (dVar == null || (r0 = dVar.e()) == null) ? r.j.f957e : r0, z10), r.l(function12, (dVar == null || (r9 = dVar.i()) == null) ? r.j.f958f : r9));
        Function1 i3;
        Function1 e2;
        a1.f fVar = r.f1028a;
        this.f996o = dVar;
        this.f997p = z10;
        this.f998q = z11;
        this.f999r = this.f957e;
        this.f1000s = this.f958f;
        this.f1001t = x0.i.b();
    }

    @Override // b1.d
    public final void B(s.i0 i0Var) {
        x.l();
        throw null;
    }

    @Override // b1.d
    public final d C(Function1 function1, Function1 function12) {
        Function1 k10 = r.k(function1, this.f999r, true);
        Function1 l10 = r.l(function12, this.f1000s);
        return !this.f997p ? new k0(D().C(null, l10), k10, l10, false, true) : D().C(k10, l10);
    }

    public final d D() {
        d dVar = this.f996o;
        return dVar == null ? r.j : dVar;
    }

    @Override // b1.d, b1.i
    public final void c() {
        d dVar;
        this.f985c = true;
        if (!this.f998q || (dVar = this.f996o) == null) {
            return;
        }
        dVar.c();
    }

    @Override // b1.i
    public final o d() {
        return D().d();
    }

    @Override // b1.d, b1.i
    public final Function1 e() {
        return this.f999r;
    }

    @Override // b1.d, b1.i
    public final boolean f() {
        return D().f();
    }

    @Override // b1.i
    public final long g() {
        return D().g();
    }

    @Override // b1.d, b1.i
    public final int h() {
        return D().h();
    }

    @Override // b1.d, b1.i
    public final Function1 i() {
        return this.f1000s;
    }

    @Override // b1.d, b1.i
    public final void k() {
        x.l();
        throw null;
    }

    @Override // b1.d, b1.i
    public final void l() {
        x.l();
        throw null;
    }

    @Override // b1.d, b1.i
    public final void m() {
        D().m();
    }

    @Override // b1.d, b1.i
    public final void n(f0 f0Var) {
        D().n(f0Var);
    }

    @Override // b1.i
    public final void r(o oVar) {
        x.l();
        throw null;
    }

    @Override // b1.i
    public final void s(long j) {
        x.l();
        throw null;
    }

    @Override // b1.d, b1.i
    public final void t(int i3) {
        D().t(i3);
    }

    @Override // b1.d, b1.i
    public final i u(Function1 function1) {
        Function1 k10 = r.k(function1, this.f999r, true);
        return !this.f997p ? r.g(D().u(null), k10, true) : D().u(k10);
    }

    @Override // b1.d
    public final x w() {
        return D().w();
    }

    @Override // b1.d
    public final s.i0 x() {
        return D().x();
    }

    @Override // b1.d
    /* renamed from: y */
    public final Function1 e() {
        return this.f999r;
    }
}
