package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class f11 extends ib1 {
    public final Function1 e;
    public int f;

    public f11(long j, mb1 mb1Var, Function1 function1) {
        super(j, mb1Var);
        this.e = function1;
        this.f = 1;
    }

    @Override // defpackage.ib1
    public final void c() {
        if (this.c) {
            return;
        }
        l();
        this.c = true;
        synchronized (pb1.c) {
            o();
        }
    }

    @Override // defpackage.ib1
    public final Function1 e() {
        return this.e;
    }

    @Override // defpackage.ib1
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ib1
    public final Function1 i() {
        return null;
    }

    @Override // defpackage.ib1
    public final void k() {
        this.f++;
    }

    @Override // defpackage.ib1
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // defpackage.ib1
    public final void n(ge1 ge1Var) {
        k61 k61Var = pb1.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.ib1
    public final ib1 u(Function1 function1) {
        pb1.c(this);
        return new so0(this.b, this.a, pb1.k(function1, this.e, true), this);
    }

    @Override // defpackage.ib1
    public final void m() {
    }
}
