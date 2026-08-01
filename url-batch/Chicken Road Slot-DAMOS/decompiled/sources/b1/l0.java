package b1;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l0 extends i {

    /* renamed from: e, reason: collision with root package name */
    public final i f1003e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1004f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public Function1 f1005h;

    /* renamed from: i, reason: collision with root package name */
    public final long f1006i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(i iVar, Function1 function1, boolean z10, boolean z11) {
        super(0L, o.f1018s);
        Function1 e2;
        a1.f fVar = r.f1028a;
        this.f1003e = iVar;
        this.f1004f = z10;
        this.g = z11;
        this.f1005h = r.k(function1, (iVar == null || (e2 = iVar.e()) == null) ? r.j.f957e : e2, z10);
        this.f1006i = x0.i.b();
    }

    @Override // b1.i
    public final void c() {
        i iVar;
        this.f985c = true;
        if (!this.g || (iVar = this.f1003e) == null) {
            return;
        }
        iVar.c();
    }

    @Override // b1.i
    public final o d() {
        return v().d();
    }

    @Override // b1.i
    public final Function1 e() {
        return this.f1005h;
    }

    @Override // b1.i
    public final boolean f() {
        return v().f();
    }

    @Override // b1.i
    public final long g() {
        return v().g();
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
    public final void m() {
        v().m();
    }

    @Override // b1.i
    public final void n(f0 f0Var) {
        v().n(f0Var);
    }

    @Override // b1.i
    public final i u(Function1 function1) {
        Function1 k10 = r.k(function1, this.f1005h, true);
        return !this.f1004f ? r.g(v().u(null), k10, true) : v().u(k10);
    }

    public final i v() {
        i iVar = this.f1003e;
        return iVar == null ? r.j : iVar;
    }
}
