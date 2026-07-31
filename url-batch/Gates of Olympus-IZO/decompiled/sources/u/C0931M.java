package u;

import f2.InterfaceC0388c;
import f2.InterfaceC0390e;
import t0.n0;
import z0.C1076a;

/* renamed from: u.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0931M extends U.k implements n0 {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0388c f8020q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0927I f8021r;

    /* renamed from: s, reason: collision with root package name */
    public o.J f8022s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8023t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8024u;

    /* renamed from: v, reason: collision with root package name */
    public z0.g f8025v;

    /* renamed from: w, reason: collision with root package name */
    public final C0929K f8026w = new C0929K(this, 0);

    /* renamed from: x, reason: collision with root package name */
    public C0929K f8027x;

    public C0931M(InterfaceC0388c interfaceC0388c, InterfaceC0927I interfaceC0927I, o.J j3, boolean z3, boolean z4) {
        this.f8020q = interfaceC0388c;
        this.f8021r = interfaceC0927I;
        this.f8022s = j3;
        this.f8023t = z3;
        this.f8024u = z4;
        v0();
    }

    @Override // t0.n0
    public final void h(z0.i iVar) {
        InterfaceC0390e[] interfaceC0390eArr = z0.s.f9036a;
        z0.t tVar = z0.q.f9021l;
        InterfaceC0390e[] interfaceC0390eArr2 = z0.s.f9036a;
        InterfaceC0390e interfaceC0390e = interfaceC0390eArr2[6];
        tVar.a(iVar, Boolean.TRUE);
        iVar.d(z0.q.C, this.f8026w);
        if (this.f8022s == o.J.f6443d) {
            z0.g gVar = this.f8025v;
            if (gVar == null) {
                Z1.i.j("scrollAxisRange");
                throw null;
            }
            z0.t tVar2 = z0.q.p;
            InterfaceC0390e interfaceC0390e2 = interfaceC0390eArr2[11];
            tVar2.a(iVar, gVar);
        } else {
            z0.g gVar2 = this.f8025v;
            if (gVar2 == null) {
                Z1.i.j("scrollAxisRange");
                throw null;
            }
            z0.t tVar3 = z0.q.f9024o;
            InterfaceC0390e interfaceC0390e3 = interfaceC0390eArr2[10];
            tVar3.a(iVar, gVar2);
        }
        C0929K c0929k = this.f8027x;
        if (c0929k != null) {
            iVar.d(z0.h.f8962f, new C1076a(null, c0929k));
        }
        iVar.d(z0.h.f8981z, new C1076a(null, new t.x(12, new C0928J(this, 0))));
        z0.b d3 = this.f8021r.d();
        z0.t tVar4 = z0.q.f9015f;
        InterfaceC0390e interfaceC0390e4 = interfaceC0390eArr2[20];
        tVar4.a(iVar, d3);
    }

    @Override // U.k
    public final boolean k0() {
        return false;
    }

    public final void v0() {
        this.f8025v = new z0.g(new C0928J(this, 1), new C0928J(this, 2), this.f8024u);
        this.f8027x = this.f8023t ? new C0929K(this, 1) : null;
    }
}
