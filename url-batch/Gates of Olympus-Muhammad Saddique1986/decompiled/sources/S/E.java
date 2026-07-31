package S;

import I.C0143d;
import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class E extends i {

    /* renamed from: e, reason: collision with root package name */
    public final i f4189e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4190f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC0424c f4191g;

    /* renamed from: h, reason: collision with root package name */
    public final long f4192h;

    public E(i iVar, InterfaceC0424c interfaceC0424c, boolean z3) {
        super(0, n.f4232h);
        InterfaceC0424c f3;
        this.f4189e = iVar;
        this.f4190f = z3;
        this.f4191g = p.l(interfaceC0424c, (iVar == null || (f3 = iVar.f()) == null) ? ((C0220d) p.f4248i.get()).f4201e : f3, false);
        this.f4192h = C0143d.A();
    }

    @Override // S.i
    public final void c() {
        i iVar;
        this.f4218c = true;
        if (!this.f4190f || (iVar = this.f4189e) == null) {
            return;
        }
        iVar.c();
    }

    @Override // S.i
    public final int d() {
        return u().d();
    }

    @Override // S.i
    public final n e() {
        return u().e();
    }

    @Override // S.i
    public final InterfaceC0424c f() {
        return this.f4191g;
    }

    @Override // S.i
    public final boolean g() {
        return u().g();
    }

    @Override // S.i
    public final InterfaceC0424c i() {
        return null;
    }

    @Override // S.i
    public final void k() {
        u.g();
        throw null;
    }

    @Override // S.i
    public final void l() {
        u.g();
        throw null;
    }

    @Override // S.i
    public final void m() {
        u().m();
    }

    @Override // S.i
    public final void n(y yVar) {
        u().n(yVar);
    }

    @Override // S.i
    public final i t(InterfaceC0424c interfaceC0424c) {
        return p.h(u().t(null), p.l(interfaceC0424c, this.f4191g, true), true);
    }

    public final i u() {
        i iVar = this.f4189e;
        return iVar == null ? (i) p.f4248i.get() : iVar;
    }
}
