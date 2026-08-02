package Y0;

import d1.AbstractC0184a;

/* renamed from: Y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0107a extends Z implements H0.d, InterfaceC0126u {

    /* renamed from: g, reason: collision with root package name */
    public final H0.i f1195g;

    public AbstractC0107a(H0.i iVar, boolean z2) {
        super(z2);
        H((P) iVar.k(C0125t.f1230f));
        this.f1195g = iVar.i(this);
    }

    @Override // Y0.Z
    public final void G(F0.b bVar) {
        AbstractC0127v.d(this.f1195g, bVar);
    }

    @Override // Y0.Z
    public final void O(Object obj) {
        if (!(obj instanceof C0120n)) {
            V(obj);
        } else {
            C0120n c0120n = (C0120n) obj;
            U(c0120n.f1219a, C0120n.f1218b.get(c0120n) != 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W(int i2, AbstractC0107a abstractC0107a, P0.p pVar) {
        int b2 = K.j.b(i2);
        if (b2 == 0) {
            i1.a.F(pVar, abstractC0107a, this);
            return;
        }
        if (b2 != 1) {
            if (b2 == 2) {
                i1.a.t(((J0.b) pVar).b(this, abstractC0107a)).j(F0.h.f469a);
                return;
            }
            if (b2 != 3) {
                throw new F0.b();
            }
            try {
                H0.i iVar = this.f1195g;
                Object m2 = AbstractC0184a.m(iVar, null);
                try {
                    Q0.r.a(2, pVar);
                    Object h2 = pVar.h(abstractC0107a, this);
                    if (h2 != I0.a.f733e) {
                        j(h2);
                    }
                } finally {
                    AbstractC0184a.g(iVar, m2);
                }
            } catch (Throwable th) {
                j(i1.a.b(th));
            }
        }
    }

    @Override // H0.d
    public final H0.i f() {
        return this.f1195g;
    }

    @Override // Y0.InterfaceC0126u
    public final H0.i h() {
        return this.f1195g;
    }

    @Override // H0.d
    public final void j(Object obj) {
        Throwable a2 = F0.e.a(obj);
        if (a2 != null) {
            obj = new C0120n(a2, false);
        }
        Object L2 = L(obj);
        if (L2 == AbstractC0127v.f1234d) {
            return;
        }
        r(L2);
    }

    @Override // Y0.Z
    public final String v() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void V(Object obj) {
    }

    public void U(Throwable th, boolean z2) {
    }
}
