package t;

import l2.InterfaceC0602c;
import l2.InterfaceC0604e;
import p.P;
import s.C0935d;
import t0.o0;

/* loaded from: classes.dex */
public final class F extends U.p implements o0 {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0602c f8431q;

    /* renamed from: r, reason: collision with root package name */
    public C0935d f8432r;

    /* renamed from: s, reason: collision with root package name */
    public P f8433s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8434t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8435u;

    /* renamed from: v, reason: collision with root package name */
    public A0.g f8436v;

    /* renamed from: w, reason: collision with root package name */
    public final D f8437w = new D(this, 0);

    /* renamed from: x, reason: collision with root package name */
    public D f8438x;

    public F(InterfaceC0602c interfaceC0602c, C0935d c0935d, P p3, boolean z3, boolean z4) {
        this.f8431q = interfaceC0602c;
        this.f8432r = c0935d;
        this.f8433s = p3;
        this.f8434t = z3;
        this.f8435u = z4;
        y0();
    }

    @Override // t0.o0
    public final void j(A0.i iVar) {
        int i3 = 1;
        InterfaceC0604e[] interfaceC0604eArr = A0.u.f193a;
        A0.v vVar = A0.s.f177l;
        InterfaceC0604e[] interfaceC0604eArr2 = A0.u.f193a;
        InterfaceC0604e interfaceC0604e = interfaceC0604eArr2[6];
        vVar.a(iVar, Boolean.TRUE);
        iVar.c(A0.s.f163E, this.f8437w);
        if (this.f8433s == P.f7567d) {
            A0.g gVar = this.f8436v;
            if (gVar == null) {
                f2.j.j("scrollAxisRange");
                throw null;
            }
            A0.v vVar2 = A0.s.f181p;
            InterfaceC0604e interfaceC0604e2 = interfaceC0604eArr2[11];
            vVar2.a(iVar, gVar);
        } else {
            A0.g gVar2 = this.f8436v;
            if (gVar2 == null) {
                f2.j.j("scrollAxisRange");
                throw null;
            }
            A0.v vVar3 = A0.s.f180o;
            InterfaceC0604e interfaceC0604e3 = interfaceC0604eArr2[10];
            vVar3.a(iVar, gVar2);
        }
        D d3 = this.f8438x;
        if (d3 != null) {
            iVar.c(A0.h.f108f, new A0.a(null, d3));
        }
        iVar.c(A0.h.f102A, new A0.a(null, new A0.l(i3, new C(this, 0))));
        this.f8432r.getClass();
        A0.b bVar = new A0.b(-1, 1);
        A0.v vVar4 = A0.s.f171f;
        InterfaceC0604e interfaceC0604e4 = interfaceC0604eArr2[20];
        vVar4.a(iVar, bVar);
    }

    @Override // U.p
    public final boolean n0() {
        return false;
    }

    public final void y0() {
        this.f8436v = new A0.g(new C(this, 1), new C(this, 2), this.f8435u);
        this.f8438x = this.f8434t ? new D(this, 1) : null;
    }
}
