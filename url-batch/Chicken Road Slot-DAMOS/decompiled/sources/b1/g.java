package b1;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f976e;

    /* renamed from: f, reason: collision with root package name */
    public int f977f;

    public g(long j, o oVar, Function1 function1) {
        super(j, oVar);
        this.f976e = function1;
        this.f977f = 1;
    }

    @Override // b1.i
    public final void c() {
        if (this.f985c) {
            return;
        }
        l();
        this.f985c = true;
        synchronized (r.f1030c) {
            o();
        }
    }

    @Override // b1.i
    public final Function1 e() {
        return this.f976e;
    }

    @Override // b1.i
    public final boolean f() {
        return true;
    }

    @Override // b1.i
    public final Function1 i() {
        return null;
    }

    @Override // b1.i
    public final void k() {
        this.f977f++;
    }

    @Override // b1.i
    public final void l() {
        int i3 = this.f977f - 1;
        this.f977f = i3;
        if (i3 == 0) {
            a();
        }
    }

    @Override // b1.i
    public final void n(f0 f0Var) {
        a1.f fVar = r.f1028a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // b1.i
    public final i u(Function1 function1) {
        r.c(this);
        return new f(this.f984b, this.f983a, r.k(function1, this.f976e, true), this);
    }

    @Override // b1.i
    public final void m() {
    }
}
