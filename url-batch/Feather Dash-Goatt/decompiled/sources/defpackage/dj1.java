package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class dj1 extends ib1 {
    public final ib1 e;
    public final boolean f;
    public final boolean g;
    public Function1 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj1(ib1 ib1Var, Function1 function1, boolean z, boolean z2) {
        super(0L, mb1.i);
        Function1 e;
        k61 k61Var = pb1.a;
        this.e = ib1Var;
        this.f = z;
        this.g = z2;
        this.h = pb1.k(function1, (ib1Var == null || (e = ib1Var.e()) == null) ? pb1.j.e : e, z);
        this.i = t90.l();
    }

    @Override // defpackage.ib1
    public final void c() {
        ib1 ib1Var;
        this.c = true;
        if (!this.g || (ib1Var = this.e) == null) {
            return;
        }
        ib1Var.c();
    }

    @Override // defpackage.ib1
    public final mb1 d() {
        return v().d();
    }

    @Override // defpackage.ib1
    public final Function1 e() {
        return this.h;
    }

    @Override // defpackage.ib1
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.ib1
    public final long g() {
        return v().g();
    }

    @Override // defpackage.ib1
    public final Function1 i() {
        return null;
    }

    @Override // defpackage.ib1
    public final void k() {
        t80.O();
        throw null;
    }

    @Override // defpackage.ib1
    public final void l() {
        t80.O();
        throw null;
    }

    @Override // defpackage.ib1
    public final void m() {
        v().m();
    }

    @Override // defpackage.ib1
    public final void n(ge1 ge1Var) {
        v().n(ge1Var);
    }

    @Override // defpackage.ib1
    public final ib1 u(Function1 function1) {
        Function1 k = pb1.k(function1, this.h, true);
        return !this.f ? pb1.g(v().u(null), k, true) : v().u(k);
    }

    public final ib1 v() {
        ib1 ib1Var = this.e;
        return ib1Var == null ? pb1.j : ib1Var;
    }
}
