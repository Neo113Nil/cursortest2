package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kz2 extends yn1 {
    public final yn1 o;
    public final boolean p;
    public final boolean q;
    public Function1 r;
    public Function1 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kz2(yn1 yn1Var, Function1 function1, Function1 function12, boolean z, boolean z2) {
        super(0L, rm2.q, tm2.l(function1, (yn1Var == null || (r0 = yn1Var.e()) == null) ? tm2.j.e : r0, z), tm2.b(function12, (yn1Var == null || (r9 = yn1Var.i()) == null) ? tm2.j.f : r9));
        Function1 i;
        Function1 e;
        de2 de2Var = tm2.a;
        this.o = yn1Var;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = ij2.c();
    }

    @Override // defpackage.yn1
    public final void B(un1 un1Var) {
        uj2.h();
        throw null;
    }

    @Override // defpackage.yn1
    public final yn1 C(Function1 function1, Function1 function12) {
        Function1 l = tm2.l(function1, this.r, true);
        Function1 b = tm2.b(function12, this.s);
        return !this.p ? new kz2(D().C(null, b), l, b, false, true) : D().C(l, b);
    }

    public final yn1 D() {
        yn1 yn1Var = this.o;
        return yn1Var == null ? tm2.j : yn1Var;
    }

    @Override // defpackage.yn1, defpackage.nm2
    public final void c() {
        yn1 yn1Var;
        this.c = true;
        if (!this.q || (yn1Var = this.o) == null) {
            return;
        }
        yn1Var.c();
    }

    @Override // defpackage.nm2
    public final rm2 d() {
        return D().d();
    }

    @Override // defpackage.yn1, defpackage.nm2
    public final Function1 e() {
        return this.r;
    }

    @Override // defpackage.yn1, defpackage.nm2
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.nm2
    public final long g() {
        return D().g();
    }

    @Override // defpackage.yn1, defpackage.nm2
    public final int h() {
        return D().h();
    }

    @Override // defpackage.yn1, defpackage.nm2
    public final Function1 i() {
        return this.s;
    }

    @Override // defpackage.yn1, defpackage.nm2
    public final void k() {
        uj2.h();
        throw null;
    }

    @Override // defpackage.yn1, defpackage.nm2
    public final void l() {
        uj2.h();
        throw null;
    }

    @Override // defpackage.yn1, defpackage.nm2
    public final void m() {
        D().m();
    }

    @Override // defpackage.yn1, defpackage.nm2
    public final void n(yo2 yo2Var) {
        D().n(yo2Var);
    }

    @Override // defpackage.nm2
    public final void r(rm2 rm2Var) {
        uj2.h();
        throw null;
    }

    @Override // defpackage.nm2
    public final void s(long j) {
        uj2.h();
        throw null;
    }

    @Override // defpackage.yn1, defpackage.nm2
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.yn1, defpackage.nm2
    public final nm2 u(Function1 function1) {
        Function1 l = tm2.l(function1, this.r, true);
        return !this.p ? tm2.h(D().u(null), l, true) : D().u(l);
    }

    @Override // defpackage.yn1
    public final mi2 w() {
        return D().w();
    }

    @Override // defpackage.yn1
    public final un1 x() {
        return D().x();
    }

    @Override // defpackage.yn1
    /* renamed from: y */
    public final Function1 e() {
        return this.r;
    }
}
