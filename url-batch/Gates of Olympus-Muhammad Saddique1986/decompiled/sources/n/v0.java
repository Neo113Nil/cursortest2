package n;

import l2.InterfaceC0604e;

/* loaded from: classes.dex */
public final class v0 extends U.p implements t0.o0 {

    /* renamed from: q, reason: collision with root package name */
    public y0 f7211q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7212r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7213s;

    @Override // t0.o0
    public final void j(A0.i iVar) {
        InterfaceC0604e[] interfaceC0604eArr = A0.u.f193a;
        A0.v vVar = A0.s.f177l;
        InterfaceC0604e[] interfaceC0604eArr2 = A0.u.f193a;
        InterfaceC0604e interfaceC0604e = interfaceC0604eArr2[6];
        vVar.a(iVar, Boolean.TRUE);
        A0.g gVar = new A0.g(new u0(this, 0), new u0(this, 1), this.f7212r);
        if (this.f7213s) {
            A0.v vVar2 = A0.s.f181p;
            InterfaceC0604e interfaceC0604e2 = interfaceC0604eArr2[11];
            vVar2.a(iVar, gVar);
        } else {
            A0.v vVar3 = A0.s.f180o;
            InterfaceC0604e interfaceC0604e3 = interfaceC0604eArr2[10];
            vVar3.a(iVar, gVar);
        }
    }
}
