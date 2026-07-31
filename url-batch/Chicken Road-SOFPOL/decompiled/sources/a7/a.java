package a7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a extends a1 implements g6.c, u {

    /* renamed from: f, reason: collision with root package name */
    public final g6.h f239f;

    public a(g6.h hVar, boolean z3) {
        super(z3);
        P((s0) hVar.l(r.f297e));
        this.f239f = hVar.c(this);
    }

    @Override // a7.a1
    public final String E() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // a7.a1
    public final void O(a5.c cVar) {
        x.j(this.f239f, cVar);
    }

    @Override // a7.a1
    public final void X(Object obj) {
        if (!(obj instanceof o)) {
            g0(obj);
        } else {
            o oVar = (o) obj;
            f0(oVar.f286a, o.f285b.get(oVar) != 0);
        }
    }

    @Override // g6.c
    public final g6.h f() {
        return this.f239f;
    }

    @Override // a7.u
    public final g6.h h() {
        return this.f239f;
    }

    public final void h0(v vVar, a aVar, p6.e eVar) {
        Object g3;
        int ordinal = vVar.ordinal();
        c6.m mVar = c6.m.f1757a;
        if (ordinal == 0) {
            try {
                f7.a.h(m.a.G(m.a.o(aVar, this, eVar)), mVar);
                return;
            } finally {
                k(s6.a.l(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                q6.i.e(eVar, "<this>");
                m.a.G(m.a.o(aVar, this, eVar)).k(mVar);
                return;
            }
            if (ordinal != 3) {
                throw new a5.c();
            }
            try {
                g6.h hVar = this.f239f;
                Object l3 = f7.a.l(hVar, null);
                try {
                    if (eVar instanceof i6.a) {
                        q6.v.c(2, eVar);
                        g3 = eVar.g(aVar, this);
                    } else {
                        g3 = m.a.S(eVar, aVar, this);
                    }
                    f7.a.g(hVar, l3);
                    if (g3 != h6.a.f3204d) {
                        k(g3);
                    }
                } catch (Throwable th) {
                    f7.a.g(hVar, l3);
                    throw th;
                }
            } catch (Throwable th2) {
            }
        }
    }

    @Override // g6.c
    public final void k(Object obj) {
        Throwable a8 = c6.i.a(obj);
        if (a8 != null) {
            obj = new o(a8, false);
        }
        Object T = T(obj);
        if (T == x.f314e) {
            return;
        }
        z(T);
    }

    public void g0(Object obj) {
    }

    public void f0(Throwable th, boolean z3) {
    }
}
