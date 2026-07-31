package k0;

import n.AbstractC0077d;
import p0.AbstractC0090a;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0042a extends T implements W.d, r {

    /* renamed from: d, reason: collision with root package name */
    public final W.i f853d;

    public AbstractC0042a(W.i iVar, boolean z2) {
        super(z2);
        B((K) iVar.k(C0058q.f883c));
        this.f853d = iVar.c(this);
    }

    @Override // k0.T
    public final void A(B.c cVar) {
        AbstractC0060t.c(this.f853d, cVar);
    }

    @Override // k0.T
    public final void F(Object obj) {
        if (!(obj instanceof C0052k)) {
            L(obj);
            return;
        }
        C0052k c0052k = (C0052k) obj;
        Throwable th = c0052k.f872a;
        c0052k.getClass();
        K(th, C0052k.f871b.get(c0052k) != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M(int i2, AbstractC0042a abstractC0042a, d0.p pVar) {
        int a2 = AbstractC0077d.a(i2);
        U.g gVar = U.g.f378a;
        if (a2 == 0) {
            try {
                AbstractC0090a.i(a.a.o(((Y.b) pVar).b(abstractC0042a, this)), gVar, null);
                return;
            } finally {
                d(a.a.h(th));
            }
        }
        if (a2 != 1) {
            if (a2 == 2) {
                a.a.o(((Y.b) pVar).b(abstractC0042a, this)).d(gVar);
                return;
            }
            if (a2 != 3) {
                throw new B.c();
            }
            try {
                W.i iVar = this.f853d;
                Object m2 = AbstractC0090a.m(iVar, null);
                try {
                    e0.n.a(2, pVar);
                    Object e2 = pVar.e(abstractC0042a, this);
                    if (e2 != X.a.f395b) {
                        d(e2);
                    }
                } finally {
                    AbstractC0090a.h(iVar, m2);
                }
            } catch (Throwable th) {
            }
        }
    }

    @Override // W.d
    public final void d(Object obj) {
        Throwable a2 = U.d.a(obj);
        if (a2 != null) {
            obj = new C0052k(a2, false);
        }
        Object C2 = C(obj);
        if (C2 == AbstractC0060t.f887d) {
            return;
        }
        n(C2);
    }

    @Override // W.d
    public final W.i i() {
        return this.f853d;
    }

    @Override // k0.r
    public final W.i j() {
        return this.f853d;
    }

    @Override // k0.T
    public final String r() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void L(Object obj) {
    }

    public void K(Throwable th, boolean z2) {
    }
}
