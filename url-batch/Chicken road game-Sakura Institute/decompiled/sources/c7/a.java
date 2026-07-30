package c7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a extends f1 implements h6.d, x {

    /* renamed from: h, reason: collision with root package name */
    public final h6.i f1659h;

    public a(h6.i iVar, boolean z8) {
        super(z8);
        K((x0) iVar.u(u.f1748g));
        this.f1659h = iVar.z(this);
    }

    @Override // c7.f1
    public final void J(b4.c cVar) {
        a0.l(this.f1659h, cVar);
    }

    @Override // c7.f1
    public final void V(Object obj) {
        if (!(obj instanceof p)) {
            e0(obj);
        } else {
            p pVar = (p) obj;
            d0(pVar.f1725a, p.f1724b.get(pVar) != 0);
        }
    }

    public final void f0(y yVar, a aVar, q6.e eVar) {
        Object d8;
        int ordinal = yVar.ordinal();
        d6.z zVar = d6.z.f2639a;
        if (ordinal == 0) {
            try {
                h7.a.h(a8.m.A(a8.m.q(aVar, this, eVar)), zVar);
                return;
            } finally {
                resumeWith(d6.a.b(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                r6.k.f(eVar, "<this>");
                a8.m.A(a8.m.q(aVar, this, eVar)).resumeWith(zVar);
                return;
            }
            if (ordinal != 3) {
                throw new b4.c();
            }
            try {
                h6.i iVar = this.f1659h;
                Object l8 = h7.a.l(iVar, null);
                try {
                    if (eVar instanceof j6.a) {
                        r6.y.d(2, eVar);
                        d8 = eVar.d(aVar, this);
                    } else {
                        d8 = a8.m.N(eVar, aVar, this);
                    }
                    h7.a.g(iVar, l8);
                    if (d8 != i6.a.f4956f) {
                        resumeWith(d8);
                    }
                } catch (Throwable th) {
                    h7.a.g(iVar, l8);
                    throw th;
                }
            } catch (Throwable th2) {
            }
        }
    }

    @Override // h6.d
    public final h6.i getContext() {
        return this.f1659h;
    }

    @Override // c7.x
    public final h6.i k() {
        return this.f1659h;
    }

    @Override // c7.f1
    public final String r() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // h6.d
    public final void resumeWith(Object obj) {
        Throwable a3 = d6.m.a(obj);
        if (a3 != null) {
            obj = new p(a3, false);
        }
        Object P = P(obj);
        if (P == a0.f1664e) {
            return;
        }
        j(P);
    }

    public void e0(Object obj) {
    }

    public void d0(Throwable th, boolean z8) {
    }
}
