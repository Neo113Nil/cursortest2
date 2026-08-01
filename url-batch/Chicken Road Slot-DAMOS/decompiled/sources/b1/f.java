package b1;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends i {

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f974e;

    /* renamed from: f, reason: collision with root package name */
    public final i f975f;

    public f(long j, o oVar, Function1 function1, i iVar) {
        super(j, oVar);
        this.f974e = function1;
        this.f975f = iVar;
        iVar.k();
    }

    @Override // b1.i
    public final void c() {
        i iVar = this.f975f;
        if (this.f985c) {
            return;
        }
        if (this.f984b != iVar.g()) {
            a();
        }
        iVar.l();
        this.f985c = true;
        synchronized (r.f1030c) {
            o();
        }
    }

    @Override // b1.i
    public final Function1 e() {
        return this.f974e;
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
        x.l();
        throw null;
    }

    @Override // b1.i
    public final void l() {
        x.l();
        throw null;
    }

    @Override // b1.i
    public final void n(f0 f0Var) {
        a1.f fVar = r.f1028a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // b1.i
    public final i u(Function1 function1) {
        return new f(this.f984b, this.f983a, r.k(function1, this.f974e, true), this.f975f);
    }

    @Override // b1.i
    public final void m() {
    }
}
