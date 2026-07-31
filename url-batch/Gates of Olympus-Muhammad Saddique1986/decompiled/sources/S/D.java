package S;

import I.C0143d;
import e2.InterfaceC0424c;
import j.C0519A;

/* loaded from: classes.dex */
public final class D extends C0221e {

    /* renamed from: o, reason: collision with root package name */
    public final C0221e f4183o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f4184p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f4185q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0424c f4186r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0424c f4187s;

    /* renamed from: t, reason: collision with root package name */
    public final long f4188t;

    public D(C0221e c0221e, InterfaceC0424c interfaceC0424c, InterfaceC0424c interfaceC0424c2, boolean z3, boolean z4) {
        super(0, n.f4232h, p.l(interfaceC0424c, (c0221e == null || (r1 = c0221e.f()) == null) ? ((C0220d) p.f4248i.get()).f4201e : r1, z3), p.b(interfaceC0424c2, (c0221e == null || (r1 = c0221e.i()) == null) ? ((C0220d) p.f4248i.get()).f4202f : r1));
        InterfaceC0424c i3;
        InterfaceC0424c f3;
        this.f4183o = c0221e;
        this.f4184p = z3;
        this.f4185q = z4;
        this.f4186r = this.f4201e;
        this.f4187s = this.f4202f;
        this.f4188t = C0143d.A();
    }

    @Override // S.C0221e
    public final void A(C0519A c0519a) {
        u.g();
        throw null;
    }

    @Override // S.C0221e
    public final C0221e B(InterfaceC0424c interfaceC0424c, InterfaceC0424c interfaceC0424c2) {
        InterfaceC0424c l3 = p.l(interfaceC0424c, this.f4186r, true);
        InterfaceC0424c b3 = p.b(interfaceC0424c2, this.f4187s);
        return !this.f4184p ? new D(C().B(null, b3), l3, b3, false, true) : C().B(l3, b3);
    }

    public final C0221e C() {
        C0221e c0221e = this.f4183o;
        return c0221e == null ? (C0221e) p.f4248i.get() : c0221e;
    }

    @Override // S.C0221e, S.i
    public final void c() {
        C0221e c0221e;
        this.f4218c = true;
        if (!this.f4185q || (c0221e = this.f4183o) == null) {
            return;
        }
        c0221e.c();
    }

    @Override // S.i
    public final int d() {
        return C().d();
    }

    @Override // S.i
    public final n e() {
        return C().e();
    }

    @Override // S.C0221e, S.i
    public final InterfaceC0424c f() {
        return this.f4186r;
    }

    @Override // S.C0221e, S.i
    public final boolean g() {
        return C().g();
    }

    @Override // S.C0221e, S.i
    public final int h() {
        return C().h();
    }

    @Override // S.C0221e, S.i
    public final InterfaceC0424c i() {
        return this.f4187s;
    }

    @Override // S.C0221e, S.i
    public final void k() {
        u.g();
        throw null;
    }

    @Override // S.C0221e, S.i
    public final void l() {
        u.g();
        throw null;
    }

    @Override // S.C0221e, S.i
    public final void m() {
        C().m();
    }

    @Override // S.C0221e, S.i
    public final void n(y yVar) {
        C().n(yVar);
    }

    @Override // S.i
    public final void q(int i3) {
        u.g();
        throw null;
    }

    @Override // S.i
    public final void r(n nVar) {
        u.g();
        throw null;
    }

    @Override // S.C0221e, S.i
    public final void s(int i3) {
        C().s(i3);
    }

    @Override // S.C0221e, S.i
    public final i t(InterfaceC0424c interfaceC0424c) {
        InterfaceC0424c l3 = p.l(interfaceC0424c, this.f4186r, true);
        return !this.f4184p ? p.h(C().t(null), l3, true) : C().t(l3);
    }

    @Override // S.C0221e
    public final u v() {
        return C().v();
    }

    @Override // S.C0221e
    public final C0519A w() {
        return C().w();
    }

    @Override // S.C0221e
    /* renamed from: x */
    public final InterfaceC0424c f() {
        return this.f4186r;
    }
}
