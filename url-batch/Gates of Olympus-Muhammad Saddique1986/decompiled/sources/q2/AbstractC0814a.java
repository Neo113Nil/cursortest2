package q2;

import e2.InterfaceC0426e;

/* renamed from: q2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0814a extends f0 implements V1.d, InterfaceC0835w {

    /* renamed from: f, reason: collision with root package name */
    public final V1.i f7877f;

    public AbstractC0814a(V1.i iVar, boolean z3) {
        super(z3);
        S((X) iVar.v(C0832t.f7929e));
        this.f7877f = iVar.d(this);
    }

    @Override // q2.f0
    public final String H() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // q2.f0
    public final void R(C1.c cVar) {
        AbstractC0837y.m(this.f7877f, cVar);
    }

    @Override // q2.f0
    public final void a0(Object obj) {
        if (!(obj instanceof C0829p)) {
            j0(obj);
        } else {
            C0829p c0829p = (C0829p) obj;
            i0(c0829p.f7917a, C0829p.f7916b.get(c0829p) != 0);
        }
    }

    public final void k0(EnumC0836x enumC0836x, AbstractC0814a abstractC0814a, InterfaceC0426e interfaceC0426e) {
        Object h3;
        int ordinal = enumC0836x.ordinal();
        R1.y yVar = R1.y.f4171a;
        if (ordinal == 0) {
            try {
                v2.a.j(l0.c.B(l0.c.q(abstractC0814a, this, interfaceC0426e)), yVar);
                return;
            } finally {
                u(R1.a.b(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                f2.j.f(interfaceC0426e, "<this>");
                l0.c.B(l0.c.q(abstractC0814a, this, interfaceC0426e)).u(yVar);
                return;
            }
            if (ordinal != 3) {
                throw new C1.c();
            }
            try {
                V1.i iVar = this.f7877f;
                Object n3 = v2.a.n(iVar, null);
                try {
                    if (interfaceC0426e instanceof X1.a) {
                        f2.x.d(2, interfaceC0426e);
                        h3 = interfaceC0426e.h(abstractC0814a, this);
                    } else {
                        h3 = l0.c.Q(interfaceC0426e, abstractC0814a, this);
                    }
                    v2.a.i(iVar, n3);
                    if (h3 != W1.a.f4608d) {
                        u(h3);
                    }
                } catch (Throwable th) {
                    v2.a.i(iVar, n3);
                    throw th;
                }
            } catch (Throwable th2) {
            }
        }
    }

    @Override // q2.InterfaceC0835w
    public final V1.i q() {
        return this.f7877f;
    }

    @Override // V1.d
    public final V1.i t() {
        return this.f7877f;
    }

    @Override // V1.d
    public final void u(Object obj) {
        Throwable a3 = R1.l.a(obj);
        if (a3 != null) {
            obj = new C0829p(a3, false);
        }
        Object W2 = W(obj);
        if (W2 == AbstractC0837y.f7944e) {
            return;
        }
        D(W2);
    }

    public void j0(Object obj) {
    }

    public void i0(Throwable th, boolean z3) {
    }
}
