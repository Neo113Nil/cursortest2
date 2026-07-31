package k2;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0529a extends f0 implements P1.d, InterfaceC0550w {

    /* renamed from: f, reason: collision with root package name */
    public final P1.i f5338f;

    public AbstractC0529a(P1.i iVar, boolean z3) {
        super(z3);
        N((X) iVar.k(C0547t.f5390e));
        this.f5338f = iVar.o(this);
    }

    @Override // k2.f0
    public final String A() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // k2.f0
    public final void M(L1.f fVar) {
        AbstractC0552y.l(this.f5338f, fVar);
    }

    @Override // k2.f0
    public final void W(Object obj) {
        if (!(obj instanceof C0544p)) {
            f0(obj);
        } else {
            C0544p c0544p = (C0544p) obj;
            e0(c0544p.f5378a, C0544p.f5377b.get(c0544p) != 0);
        }
    }

    public final void g0(EnumC0551x enumC0551x, AbstractC0529a abstractC0529a, Y1.e eVar) {
        Object g3;
        int ordinal = enumC0551x.ordinal();
        L1.z zVar = L1.z.f2729a;
        if (ordinal == 0) {
            try {
                p2.a.j(M1.B.G(M1.B.w(abstractC0529a, this, eVar)), zVar);
                return;
            } finally {
                resumeWith(I2.l.t(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                Z1.i.f(eVar, "<this>");
                M1.B.G(M1.B.w(abstractC0529a, this, eVar)).resumeWith(zVar);
                return;
            }
            if (ordinal != 3) {
                throw new L1.f();
            }
            try {
                P1.i iVar = this.f5338f;
                Object n3 = p2.a.n(iVar, null);
                try {
                    if (eVar instanceof R1.a) {
                        Z1.w.d(2, eVar);
                        g3 = eVar.g(abstractC0529a, this);
                    } else {
                        g3 = M1.B.S(eVar, abstractC0529a, this);
                    }
                    p2.a.i(iVar, n3);
                    if (g3 != Q1.a.f3113d) {
                        resumeWith(g3);
                    }
                } catch (Throwable th) {
                    p2.a.i(iVar, n3);
                    throw th;
                }
            } catch (Throwable th2) {
            }
        }
    }

    @Override // P1.d
    public final P1.i getContext() {
        return this.f5338f;
    }

    @Override // P1.d
    public final void resumeWith(Object obj) {
        Throwable a3 = L1.m.a(obj);
        if (a3 != null) {
            obj = new C0544p(a3, false);
        }
        Object S2 = S(obj);
        if (S2 == AbstractC0552y.f5404e) {
            return;
        }
        q(S2);
    }

    @Override // k2.InterfaceC0550w
    public final P1.i u() {
        return this.f5338f;
    }

    public void f0(Object obj) {
    }

    public void e0(Throwable th, boolean z3) {
    }
}
