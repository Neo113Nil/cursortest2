package W0;

import a.AbstractC0086a;
import b1.AbstractC0115a;

/* renamed from: W0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0061a extends Z implements G0.d, InterfaceC0080u {

    /* renamed from: g, reason: collision with root package name */
    public final G0.i f941g;

    public AbstractC0061a(G0.i iVar, boolean z2) {
        super(z2);
        G((P) iVar.m(C0079t.f974f));
        this.f941g = iVar.j(this);
    }

    @Override // W0.Z
    public final void F(D0.b bVar) {
        AbstractC0081v.d(this.f941g, bVar);
    }

    @Override // W0.Z
    public final void N(Object obj) {
        if (!(obj instanceof C0074n)) {
            U(obj);
        } else {
            C0074n c0074n = (C0074n) obj;
            T(c0074n.f965a, C0074n.f964b.get(c0074n) != 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V(int i2, AbstractC0061a abstractC0061a, O0.p pVar) {
        int a2 = H.j.a(i2);
        if (a2 == 0) {
            androidx.datastore.preferences.protobuf.k0.H(pVar, abstractC0061a, this);
            return;
        }
        if (a2 != 1) {
            if (a2 == 2) {
                AbstractC0086a.v(((I0.b) pVar).b(this, abstractC0061a)).g(D0.h.f206a);
                return;
            }
            if (a2 != 3) {
                throw new D0.b();
            }
            try {
                G0.i iVar = this.f941g;
                Object l2 = AbstractC0115a.l(iVar, null);
                try {
                    P0.r.a(2, pVar);
                    Object i3 = pVar.i(abstractC0061a, this);
                    if (i3 != H0.a.f511e) {
                        g(i3);
                    }
                } finally {
                    AbstractC0115a.f(iVar, l2);
                }
            } catch (Throwable th) {
                g(AbstractC0086a.l(th));
            }
        }
    }

    @Override // W0.InterfaceC0080u
    public final G0.i c() {
        return this.f941g;
    }

    @Override // G0.d
    public final G0.i e() {
        return this.f941g;
    }

    @Override // G0.d
    public final void g(Object obj) {
        Throwable a2 = D0.e.a(obj);
        if (a2 != null) {
            obj = new C0074n(a2, false);
        }
        Object K2 = K(obj);
        if (K2 == AbstractC0081v.f978d) {
            return;
        }
        q(K2);
    }

    @Override // W0.Z
    public final String u() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void U(Object obj) {
    }

    public void T(Throwable th, boolean z2) {
    }
}
