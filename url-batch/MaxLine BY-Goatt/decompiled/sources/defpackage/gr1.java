package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gr1 extends nm2 {
    public final Function1 e;
    public final nm2 f;

    public gr1(long j, rm2 rm2Var, Function1 function1, nm2 nm2Var) {
        super(j, rm2Var);
        this.e = function1;
        this.f = nm2Var;
        nm2Var.k();
    }

    @Override // defpackage.nm2
    public final void c() {
        if (this.c) {
            return;
        }
        long j = this.b;
        nm2 nm2Var = this.f;
        if (j != nm2Var.g()) {
            a();
        }
        nm2Var.l();
        super.c();
    }

    @Override // defpackage.nm2
    public final Function1 e() {
        return this.e;
    }

    @Override // defpackage.nm2
    public final boolean f() {
        return true;
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
    public final void n(yo2 yo2Var) {
        de2 de2Var = tm2.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.nm2
    public final nm2 u(Function1 function1) {
        return new gr1(this.b, this.a, tm2.l(function1, this.e, true), this.f);
    }

    @Override // defpackage.nm2
    public final void m() {
    }
}
