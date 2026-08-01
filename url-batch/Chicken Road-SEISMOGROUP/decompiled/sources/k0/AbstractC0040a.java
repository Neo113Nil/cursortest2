package k0;

import a.AbstractC0016a;
import m.AbstractC0068d;
import p0.AbstractC0084a;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0040a extends T implements W.d, r {

    /* renamed from: d, reason: collision with root package name */
    public final W.i f906d;

    public AbstractC0040a(W.i iVar, boolean z) {
        super(z);
        B((K) iVar.k(C0056q.f936c));
        this.f906d = iVar.c(this);
    }

    @Override // k0.T
    public final void A(A.c cVar) {
        AbstractC0058t.c(this.f906d, cVar);
    }

    @Override // k0.T
    public final void F(Object obj) {
        if (!(obj instanceof C0050k)) {
            L(obj);
            return;
        }
        C0050k c0050k = (C0050k) obj;
        Throwable th = c0050k.f925a;
        c0050k.getClass();
        K(th, C0050k.f924b.get(c0050k) != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M(int i2, AbstractC0040a abstractC0040a, d0.p pVar) {
        int a2 = AbstractC0068d.a(i2);
        U.g gVar = U.g.f433a;
        if (a2 == 0) {
            try {
                AbstractC0084a.i(AbstractC0016a.t(((Y.b) pVar).b(abstractC0040a, this)), gVar, null);
                return;
            } finally {
                d(AbstractC0016a.h(th));
            }
        }
        if (a2 != 1) {
            if (a2 == 2) {
                AbstractC0016a.t(((Y.b) pVar).b(abstractC0040a, this)).d(gVar);
                return;
            }
            if (a2 != 3) {
                throw new A.c();
            }
            try {
                W.i iVar = this.f906d;
                Object m2 = AbstractC0084a.m(iVar, null);
                try {
                    e0.n.a(2, pVar);
                    Object e2 = pVar.e(abstractC0040a, this);
                    if (e2 != X.a.f450b) {
                        d(e2);
                    }
                } finally {
                    AbstractC0084a.h(iVar, m2);
                }
            } catch (Throwable th) {
            }
        }
    }

    @Override // W.d
    public final void d(Object obj) {
        Throwable a2 = U.d.a(obj);
        if (a2 != null) {
            obj = new C0050k(a2, false);
        }
        Object C2 = C(obj);
        if (C2 == AbstractC0058t.f940d) {
            return;
        }
        n(C2);
    }

    @Override // W.d
    public final W.i i() {
        return this.f906d;
    }

    @Override // k0.r
    public final W.i j() {
        return this.f906d;
    }

    @Override // k0.T
    public final String r() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void L(Object obj) {
    }

    public void K(Throwable th, boolean z) {
    }
}
