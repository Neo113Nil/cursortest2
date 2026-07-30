package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final u1 f5610a;

    /* renamed from: b, reason: collision with root package name */
    public final p1 f5611b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5612c;

    /* renamed from: d, reason: collision with root package name */
    public final g0.g1 f5613d;

    /* renamed from: e, reason: collision with root package name */
    public final g0.g1 f5614e;

    /* renamed from: f, reason: collision with root package name */
    public final g0.e1 f5615f;

    /* renamed from: g, reason: collision with root package name */
    public final g0.e1 f5616g;

    /* renamed from: h, reason: collision with root package name */
    public final g0.g1 f5617h;

    /* renamed from: i, reason: collision with root package name */
    public final q0.q f5618i;

    /* renamed from: j, reason: collision with root package name */
    public final q0.q f5619j;

    /* renamed from: k, reason: collision with root package name */
    public final g0.g1 f5620k;

    /* renamed from: l, reason: collision with root package name */
    public final g0.e0 f5621l;

    public p1(u1 u1Var, p1 p1Var, String str) {
        this.f5610a = u1Var;
        this.f5611b = p1Var;
        this.f5612c = str;
        Object a3 = u1Var.a();
        g0.t0 t0Var = g0.t0.f3903k;
        this.f5613d = g0.d.J(a3, t0Var);
        this.f5614e = g0.d.J(new m1(u1Var.a(), u1Var.a()), t0Var);
        int i7 = g0.b.f3689b;
        this.f5615f = new g0.e1(0L);
        this.f5616g = new g0.e1(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.f5617h = g0.d.J(bool, t0Var);
        this.f5618i = new q0.q();
        this.f5619j = new q0.q();
        this.f5620k = g0.d.J(bool, t0Var);
        this.f5621l = g0.d.C(new k.p(this, 1));
        u1Var.d(this);
    }

    public final void a(Object obj, g0.p pVar, int i7) {
        int i8;
        pVar.S(-1493585151);
        if ((i7 & 6) == 0) {
            i8 = ((i7 & 8) == 0 ? pVar.f(obj) : pVar.h(obj) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.f(this) ? 32 : 16;
        }
        if ((i8 & 19) == 18 && pVar.x()) {
            pVar.L();
        } else if (g()) {
            pVar.Q(1823992347);
            pVar.p(false);
        } else {
            pVar.Q(1822507602);
            q(obj);
            if (r6.k.a(obj, this.f5610a.a())) {
                g0.e1 e1Var = this.f5616g;
                if (!(((g0.d2) q0.n.t(e1Var.f3719g, e1Var)).f3715c != Long.MIN_VALUE) && !((Boolean) this.f5617h.getValue()).booleanValue()) {
                    pVar.Q(1823982427);
                    pVar.p(false);
                    pVar.p(false);
                }
            }
            pVar.Q(1822738893);
            Object G = pVar.G();
            g0.t0 t0Var = g0.l.f3784a;
            if (G == t0Var) {
                g0.y yVar = new g0.y(g0.d.y(pVar));
                pVar.a0(yVar);
                G = yVar;
            }
            h7.c cVar = ((g0.y) G).f3972f;
            boolean h3 = pVar.h(cVar) | ((i8 & 112) == 32);
            Object G2 = pVar.G();
            if (h3 || G2 == t0Var) {
                G2 = new a0.y(cVar, 18, this);
                pVar.a0(G2);
            }
            g0.d.c(cVar, this, (q6.c) G2, pVar);
            pVar.p(false);
            pVar.p(false);
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new g0.v(i7, 2, this, obj);
        }
    }

    public final long b() {
        q0.q qVar = this.f5618i;
        int size = qVar.size();
        long j8 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            g0.e1 e1Var = ((n1) qVar.get(i7)).f5588q;
            j8 = Math.max(j8, ((g0.d2) q0.n.t(e1Var.f3719g, e1Var)).f3715c);
        }
        q0.q qVar2 = this.f5619j;
        int size2 = qVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            j8 = Math.max(j8, ((p1) qVar2.get(i8)).b());
        }
        return j8;
    }

    public final void c() {
        q0.q qVar = this.f5618i;
        int size = qVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            n1 n1Var = (n1) qVar.get(i7);
            n1Var.f5582k = null;
            n1Var.f5581j = null;
            n1Var.f5585n = false;
        }
        q0.q qVar2 = this.f5619j;
        int size2 = qVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((p1) qVar2.get(i8)).c();
        }
    }

    public final boolean d() {
        q0.q qVar = this.f5618i;
        int size = qVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((n1) qVar.get(i7)).f5581j != null) {
                return true;
            }
        }
        q0.q qVar2 = this.f5619j;
        int size2 = qVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            if (((p1) qVar2.get(i8)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        p1 p1Var = this.f5611b;
        if (p1Var != null) {
            return p1Var.e();
        }
        g0.e1 e1Var = this.f5615f;
        return ((g0.d2) q0.n.t(e1Var.f3719g, e1Var)).f3715c;
    }

    public final l1 f() {
        return (l1) this.f5614e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f5620k.getValue()).booleanValue();
    }

    public final void h(long j8, boolean z8) {
        g0.e1 e1Var = this.f5616g;
        long j9 = ((g0.d2) q0.n.t(e1Var.f3719g, e1Var)).f3715c;
        u1 u1Var = this.f5610a;
        if (j9 == Long.MIN_VALUE) {
            e1Var.e(j8);
            ((g0.g1) u1Var.f5679a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((g0.g1) u1Var.f5679a).getValue()).booleanValue()) {
            ((g0.g1) u1Var.f5679a).setValue(Boolean.TRUE);
        }
        this.f5617h.setValue(Boolean.FALSE);
        q0.q qVar = this.f5618i;
        int size = qVar.size();
        boolean z9 = true;
        for (int i7 = 0; i7 < size; i7++) {
            n1 n1Var = (n1) qVar.get(i7);
            g0.g1 g1Var = n1Var.f5583l;
            g0.g1 g1Var2 = n1Var.f5583l;
            if (!((Boolean) g1Var.getValue()).booleanValue()) {
                long c4 = z8 ? n1Var.a().c() : j8;
                n1Var.d(n1Var.a().b(c4));
                n1Var.f5587p = n1Var.a().f(c4);
                if (n1Var.a().g(c4)) {
                    g1Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) g1Var2.getValue()).booleanValue()) {
                z9 = false;
            }
        }
        q0.q qVar2 = this.f5619j;
        int size2 = qVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            p1 p1Var = (p1) qVar2.get(i8);
            g0.g1 g1Var3 = p1Var.f5613d;
            u1 u1Var2 = p1Var.f5610a;
            if (!r6.k.a(g1Var3.getValue(), u1Var2.a())) {
                p1Var.h(j8, z8);
            }
            if (!r6.k.a(p1Var.f5613d.getValue(), u1Var2.a())) {
                z9 = false;
            }
        }
        if (z9) {
            i();
        }
    }

    public final void i() {
        this.f5616g.e(Long.MIN_VALUE);
        u1 u1Var = this.f5610a;
        if (u1Var instanceof m0) {
            u1Var.c(this.f5613d.getValue());
        }
        o(0L);
        ((g0.g1) u1Var.f5679a).setValue(Boolean.FALSE);
        q0.q qVar = this.f5619j;
        int size = qVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((p1) qVar.get(i7)).i();
        }
    }

    public final void j(float f9) {
        q0.q qVar = this.f5618i;
        int size = qVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            n1 n1Var = (n1) qVar.get(i7);
            n1Var.getClass();
            if (f9 == -4.0f || f9 == -5.0f) {
                i1 i1Var = n1Var.f5582k;
                if (i1Var != null) {
                    n1Var.a().h(i1Var.f5534c);
                    n1Var.f5581j = null;
                    n1Var.f5582k = null;
                }
                Object obj = f9 == -4.0f ? n1Var.a().f5535d : n1Var.a().f5534c;
                n1Var.a().h(obj);
                n1Var.a().i(obj);
                n1Var.d(obj);
                n1Var.f5588q.e(n1Var.a().c());
            } else {
                n1Var.f5584m.f(f9);
            }
        }
        q0.q qVar2 = this.f5619j;
        int size2 = qVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((p1) qVar2.get(i8)).j(f9);
        }
    }

    public final void k() {
        q0.q qVar = this.f5618i;
        int size = qVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((n1) qVar.get(i7)).f5584m.f(-2.0f);
        }
        q0.q qVar2 = this.f5619j;
        int size2 = qVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((p1) qVar2.get(i8)).k();
        }
    }

    public final void l(Object obj, Object obj2) {
        this.f5616g.e(Long.MIN_VALUE);
        u1 u1Var = this.f5610a;
        ((g0.g1) u1Var.f5679a).setValue(Boolean.FALSE);
        boolean g9 = g();
        g0.g1 g1Var = this.f5613d;
        if (!g9 || !r6.k.a(u1Var.a(), obj) || !r6.k.a(g1Var.getValue(), obj2)) {
            if (!r6.k.a(u1Var.a(), obj) && (u1Var instanceof m0)) {
                u1Var.c(obj);
            }
            g1Var.setValue(obj2);
            this.f5620k.setValue(Boolean.TRUE);
            this.f5614e.setValue(new m1(obj, obj2));
        }
        q0.q qVar = this.f5619j;
        int size = qVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            p1 p1Var = (p1) qVar.get(i7);
            r6.k.d(p1Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (p1Var.g()) {
                p1Var.l(p1Var.f5610a.a(), p1Var.f5613d.getValue());
            }
        }
        q0.q qVar2 = this.f5618i;
        int size2 = qVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((n1) qVar2.get(i8)).c(0L);
        }
    }

    public final void m(long j8) {
        g0.e1 e1Var = this.f5616g;
        if (((g0.d2) q0.n.t(e1Var.f3719g, e1Var)).f3715c == Long.MIN_VALUE) {
            e1Var.e(j8);
        }
        o(j8);
        this.f5617h.setValue(Boolean.FALSE);
        q0.q qVar = this.f5618i;
        int size = qVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((n1) qVar.get(i7)).c(j8);
        }
        q0.q qVar2 = this.f5619j;
        int size2 = qVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            p1 p1Var = (p1) qVar2.get(i8);
            if (!r6.k.a(p1Var.f5613d.getValue(), p1Var.f5610a.a())) {
                p1Var.m(j8);
            }
        }
    }

    public final void n(p0 p0Var) {
        q0.q qVar = this.f5618i;
        int size = qVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            n1 n1Var = (n1) qVar.get(i7);
            g0.g1 g1Var = n1Var.f5586o;
            if (!r6.k.a(n1Var.a().f5534c, n1Var.a().f5535d)) {
                n1Var.f5582k = n1Var.a();
                n1Var.f5581j = p0Var;
            }
            n1Var.f5580i.setValue(new i1(n1Var.f5590s, n1Var.f5577f, g1Var.getValue(), g1Var.getValue(), n1Var.f5587p.c()));
            n1Var.f5588q.e(n1Var.a().c());
            n1Var.f5585n = true;
        }
        q0.q qVar2 = this.f5619j;
        int size2 = qVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((p1) qVar2.get(i8)).n(p0Var);
        }
    }

    public final void o(long j8) {
        if (this.f5611b == null) {
            this.f5615f.e(j8);
        }
    }

    public final void p() {
        i1 i1Var;
        q0.q qVar = this.f5618i;
        int size = qVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            n1 n1Var = (n1) qVar.get(i7);
            p0 p0Var = n1Var.f5581j;
            if (p0Var != null && (i1Var = n1Var.f5582k) != null) {
                long P = t6.a.P(p0Var.f5608g * p0Var.f5605d);
                Object b9 = i1Var.b(P);
                if (n1Var.f5585n) {
                    n1Var.a().i(b9);
                }
                n1Var.a().h(b9);
                n1Var.f5588q.e(n1Var.a().c());
                if (n1Var.f5584m.e() == -2.0f || n1Var.f5585n) {
                    n1Var.d(b9);
                } else {
                    n1Var.c(n1Var.f5591t.e());
                }
                if (P >= p0Var.f5608g) {
                    n1Var.f5581j = null;
                    n1Var.f5582k = null;
                } else {
                    p0Var.f5604c = false;
                }
            }
        }
        q0.q qVar2 = this.f5619j;
        int size2 = qVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((p1) qVar2.get(i8)).p();
        }
    }

    public final void q(Object obj) {
        g0.g1 g1Var = this.f5613d;
        if (r6.k.a(g1Var.getValue(), obj)) {
            return;
        }
        this.f5614e.setValue(new m1(g1Var.getValue(), obj));
        u1 u1Var = this.f5610a;
        if (!r6.k.a(u1Var.a(), g1Var.getValue())) {
            u1Var.c(g1Var.getValue());
        }
        g1Var.setValue(obj);
        g0.e1 e1Var = this.f5616g;
        if (((g0.d2) q0.n.t(e1Var.f3719g, e1Var)).f3715c == Long.MIN_VALUE) {
            this.f5617h.setValue(Boolean.TRUE);
        }
        k();
    }

    public final String toString() {
        q0.q qVar = this.f5618i;
        int size = qVar.size();
        String str = "Transition animation values: ";
        for (int i7 = 0; i7 < size; i7++) {
            str = str + ((n1) qVar.get(i7)) + ", ";
        }
        return str;
    }
}
