package S;

import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0424c f4212e;

    /* renamed from: f, reason: collision with root package name */
    public final i f4213f;

    public g(int i3, n nVar, InterfaceC0424c interfaceC0424c, i iVar) {
        super(i3, nVar);
        this.f4212e = interfaceC0424c;
        this.f4213f = iVar;
        iVar.k();
    }

    @Override // S.i
    public final void c() {
        if (this.f4218c) {
            return;
        }
        int i3 = this.f4217b;
        i iVar = this.f4213f;
        if (i3 != iVar.d()) {
            a();
        }
        iVar.l();
        this.f4218c = true;
        synchronized (p.f4241b) {
            int i4 = this.f4219d;
            if (i4 >= 0) {
                p.u(i4);
                this.f4219d = -1;
            }
        }
    }

    @Override // S.i
    public final InterfaceC0424c f() {
        return this.f4212e;
    }

    @Override // S.i
    public final boolean g() {
        return true;
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
    public final void n(y yVar) {
        G1.m mVar = p.f4240a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // S.i
    public final i t(InterfaceC0424c interfaceC0424c) {
        return new g(this.f4217b, this.f4216a, p.l(interfaceC0424c, this.f4212e, true), this.f4213f);
    }

    @Override // S.i
    public final void m() {
    }
}
