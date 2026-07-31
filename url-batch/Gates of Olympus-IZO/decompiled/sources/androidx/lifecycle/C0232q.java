package androidx.lifecycle;

import k2.C0547t;
import k2.InterfaceC0550w;

/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232q implements InterfaceC0234t, InterfaceC0550w {

    /* renamed from: d, reason: collision with root package name */
    public final C0238x f4033d;

    /* renamed from: e, reason: collision with root package name */
    public final P1.i f4034e;

    public C0232q(C0238x c0238x, P1.i iVar) {
        k2.X x3;
        Z1.i.f(iVar, "coroutineContext");
        this.f4033d = c0238x;
        this.f4034e = iVar;
        if (c0238x.f4041d != EnumC0230o.f4025d || (x3 = (k2.X) iVar.k(C0547t.f5390e)) == null) {
            return;
        }
        x3.a(null);
    }

    @Override // androidx.lifecycle.InterfaceC0234t
    public final void b(InterfaceC0236v interfaceC0236v, EnumC0229n enumC0229n) {
        C0238x c0238x = this.f4033d;
        if (c0238x.f4041d.compareTo(EnumC0230o.f4025d) <= 0) {
            c0238x.f(this);
            k2.X x3 = (k2.X) this.f4034e.k(C0547t.f5390e);
            if (x3 != null) {
                x3.a(null);
            }
        }
    }

    @Override // k2.InterfaceC0550w
    public final P1.i u() {
        return this.f4034e;
    }
}
