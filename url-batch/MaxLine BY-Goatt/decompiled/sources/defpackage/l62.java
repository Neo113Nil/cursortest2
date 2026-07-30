package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class l62 extends nm2 {
    public final Function1 e;
    public int f;

    public l62(long j, rm2 rm2Var, Function1 function1) {
        super(j, rm2Var);
        this.e = function1;
        this.f = 1;
    }

    @Override // defpackage.nm2
    public final void c() {
        if (this.c) {
            return;
        }
        l();
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
        this.f++;
    }

    @Override // defpackage.nm2
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // defpackage.nm2
    public final void n(yo2 yo2Var) {
        de2 de2Var = tm2.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.nm2
    public final nm2 u(Function1 function1) {
        tm2.d(this);
        return new gr1(this.b, this.a, tm2.l(function1, this.e, true), this);
    }

    @Override // defpackage.nm2
    public final void m() {
    }
}
