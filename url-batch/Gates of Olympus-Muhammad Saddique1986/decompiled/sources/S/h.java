package S;

import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0424c f4214e;

    /* renamed from: f, reason: collision with root package name */
    public int f4215f;

    public h(int i3, n nVar, InterfaceC0424c interfaceC0424c) {
        super(i3, nVar);
        this.f4214e = interfaceC0424c;
        this.f4215f = 1;
    }

    @Override // S.i
    public final void c() {
        if (this.f4218c) {
            return;
        }
        l();
        this.f4218c = true;
        synchronized (p.f4241b) {
            int i3 = this.f4219d;
            if (i3 >= 0) {
                p.u(i3);
                this.f4219d = -1;
            }
        }
    }

    @Override // S.i
    public final InterfaceC0424c f() {
        return this.f4214e;
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
        this.f4215f++;
    }

    @Override // S.i
    public final void l() {
        int i3 = this.f4215f - 1;
        this.f4215f = i3;
        if (i3 == 0) {
            a();
        }
    }

    @Override // S.i
    public final void n(y yVar) {
        G1.m mVar = p.f4240a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // S.i
    public final i t(InterfaceC0424c interfaceC0424c) {
        p.d(this);
        return new g(this.f4217b, this.f4216a, p.l(interfaceC0424c, this.f4214e, true), this);
    }

    @Override // S.i
    public final void m() {
    }
}
