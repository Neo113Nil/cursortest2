package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lz2 extends nm2 {
    public final nm2 e;
    public final boolean f;
    public final boolean g;
    public Function1 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz2(nm2 nm2Var, Function1 function1, boolean z, boolean z2) {
        super(0L, rm2.q);
        Function1 e;
        de2 de2Var = tm2.a;
        this.e = nm2Var;
        this.f = z;
        this.g = z2;
        this.h = tm2.l(function1, (nm2Var == null || (e = nm2Var.e()) == null) ? tm2.j.e : e, z);
        this.i = ij2.c();
    }

    @Override // defpackage.nm2
    public final void c() {
        nm2 nm2Var;
        this.c = true;
        if (!this.g || (nm2Var = this.e) == null) {
            return;
        }
        nm2Var.c();
    }

    @Override // defpackage.nm2
    public final rm2 d() {
        return v().d();
    }

    @Override // defpackage.nm2
    public final Function1 e() {
        return this.h;
    }

    @Override // defpackage.nm2
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.nm2
    public final long g() {
        return v().g();
    }

    @Override // defpackage.nm2
    public final Function1 i() {
        return null;
    }

    @Override // defpackage.nm2
    public final void k() {
        uj2.h();
        throw null;
    }

    @Override // defpackage.nm2
    public final void l() {
        uj2.h();
        throw null;
    }

    @Override // defpackage.nm2
    public final void m() {
        v().m();
    }

    @Override // defpackage.nm2
    public final void n(yo2 yo2Var) {
        v().n(yo2Var);
    }

    @Override // defpackage.nm2
    public final nm2 u(Function1 function1) {
        Function1 l = tm2.l(function1, this.h, true);
        return !this.f ? tm2.h(v().u(null), l, true) : v().u(l);
    }

    public final nm2 v() {
        nm2 nm2Var = this.e;
        return nm2Var == null ? tm2.j : nm2Var;
    }
}
