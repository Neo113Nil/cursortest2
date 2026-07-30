package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class cj1 extends zn0 {
    public final zn0 o;
    public final boolean p;
    public final boolean q;
    public Function1 r;
    public Function1 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cj1(zn0 zn0Var, Function1 function1, Function1 function12, boolean z, boolean z2) {
        super(0L, mb1.i, pb1.k(function1, (zn0Var == null || (r0 = zn0Var.e()) == null) ? pb1.j.e : r0, z), pb1.l(function12, (zn0Var == null || (r9 = zn0Var.i()) == null) ? pb1.j.f : r9));
        Function1 i;
        Function1 e;
        k61 k61Var = pb1.a;
        this.o = zn0Var;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = t90.l();
    }

    @Override // defpackage.zn0
    public final void B(wn0 wn0Var) {
        t80.O();
        throw null;
    }

    @Override // defpackage.zn0
    public final zn0 C(Function1 function1, Function1 function12) {
        Function1 k = pb1.k(function1, this.r, true);
        Function1 l = pb1.l(function12, this.s);
        return !this.p ? new cj1(D().C(null, l), k, l, false, true) : D().C(k, l);
    }

    public final zn0 D() {
        zn0 zn0Var = this.o;
        return zn0Var == null ? pb1.j : zn0Var;
    }

    @Override // defpackage.zn0, defpackage.ib1
    public final void c() {
        zn0 zn0Var;
        this.c = true;
        if (!this.q || (zn0Var = this.o) == null) {
            return;
        }
        zn0Var.c();
    }

    @Override // defpackage.ib1
    public final mb1 d() {
        return D().d();
    }

    @Override // defpackage.zn0, defpackage.ib1
    public final Function1 e() {
        return this.r;
    }

    @Override // defpackage.zn0, defpackage.ib1
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.ib1
    public final long g() {
        return D().g();
    }

    @Override // defpackage.zn0, defpackage.ib1
    public final int h() {
        return D().h();
    }

    @Override // defpackage.zn0, defpackage.ib1
    public final Function1 i() {
        return this.s;
    }

    @Override // defpackage.zn0, defpackage.ib1
    public final void k() {
        t80.O();
        throw null;
    }

    @Override // defpackage.zn0, defpackage.ib1
    public final void l() {
        t80.O();
        throw null;
    }

    @Override // defpackage.zn0, defpackage.ib1
    public final void m() {
        D().m();
    }

    @Override // defpackage.zn0, defpackage.ib1
    public final void n(ge1 ge1Var) {
        D().n(ge1Var);
    }

    @Override // defpackage.ib1
    public final void r(mb1 mb1Var) {
        t80.O();
        throw null;
    }

    @Override // defpackage.ib1
    public final void s(long j) {
        t80.O();
        throw null;
    }

    @Override // defpackage.zn0, defpackage.ib1
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.zn0, defpackage.ib1
    public final ib1 u(Function1 function1) {
        Function1 k = pb1.k(function1, this.r, true);
        return !this.p ? pb1.g(D().u(null), k, true) : D().u(k);
    }

    @Override // defpackage.zn0
    public final ka0 w() {
        return D().w();
    }

    @Override // defpackage.zn0
    public final wn0 x() {
        return D().x();
    }

    @Override // defpackage.zn0
    /* renamed from: y */
    public final Function1 e() {
        return this.r;
    }
}
