package n;

import f2.InterfaceC0390e;
import t0.n0;

/* loaded from: classes.dex */
public final class h0 extends U.k implements n0 {

    /* renamed from: q, reason: collision with root package name */
    public k0 f6088q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6089r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6090s;

    @Override // t0.n0
    public final void h(z0.i iVar) {
        InterfaceC0390e[] interfaceC0390eArr = z0.s.f9036a;
        z0.t tVar = z0.q.f9021l;
        InterfaceC0390e[] interfaceC0390eArr2 = z0.s.f9036a;
        InterfaceC0390e interfaceC0390e = interfaceC0390eArr2[6];
        tVar.a(iVar, Boolean.TRUE);
        z0.g gVar = new z0.g(new g0(this, 0), new g0(this, 1), this.f6089r);
        if (this.f6090s) {
            z0.t tVar2 = z0.q.p;
            InterfaceC0390e interfaceC0390e2 = interfaceC0390eArr2[11];
            tVar2.a(iVar, gVar);
        } else {
            z0.t tVar3 = z0.q.f9024o;
            InterfaceC0390e interfaceC0390e3 = interfaceC0390eArr2[10];
            tVar3.a(iVar, gVar);
        }
    }
}
