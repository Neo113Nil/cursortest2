package l;

import g0.m2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n1 implements m2 {

    /* renamed from: f, reason: collision with root package name */
    public final w1 f5577f;

    /* renamed from: g, reason: collision with root package name */
    public final g0.g1 f5578g;

    /* renamed from: h, reason: collision with root package name */
    public final g0.g1 f5579h;

    /* renamed from: i, reason: collision with root package name */
    public final g0.g1 f5580i;

    /* renamed from: j, reason: collision with root package name */
    public p0 f5581j;

    /* renamed from: k, reason: collision with root package name */
    public i1 f5582k;

    /* renamed from: l, reason: collision with root package name */
    public final g0.g1 f5583l;

    /* renamed from: m, reason: collision with root package name */
    public final g0.c1 f5584m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5585n;

    /* renamed from: o, reason: collision with root package name */
    public final g0.g1 f5586o;

    /* renamed from: p, reason: collision with root package name */
    public q f5587p;

    /* renamed from: q, reason: collision with root package name */
    public final g0.e1 f5588q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5589r;

    /* renamed from: s, reason: collision with root package name */
    public final a1 f5590s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p1 f5591t;

    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, java.util.Map] */
    public n1(p1 p1Var, Object obj, q qVar, w1 w1Var) {
        this.f5591t = p1Var;
        this.f5577f = w1Var;
        g0.t0 t0Var = g0.t0.f3903k;
        g0.g1 J = g0.d.J(obj, t0Var);
        this.f5578g = J;
        Object obj2 = null;
        g0.g1 J2 = g0.d.J(e.k(7, null), t0Var);
        this.f5579h = J2;
        this.f5580i = g0.d.J(new i1((a0) J2.getValue(), w1Var, obj, J.getValue(), qVar), t0Var);
        this.f5583l = g0.d.J(Boolean.TRUE, t0Var);
        this.f5584m = g0.d.H(-1.0f);
        this.f5586o = g0.d.J(obj, t0Var);
        this.f5587p = qVar;
        long c4 = a().c();
        int i7 = g0.b.f3689b;
        this.f5588q = new g0.e1(c4);
        Float f9 = (Float) g2.f5498a.get(w1Var);
        if (f9 != null) {
            float floatValue = f9.floatValue();
            q qVar2 = (q) w1Var.f5702a.f(obj);
            int b9 = qVar2.b();
            for (int i8 = 0; i8 < b9; i8++) {
                qVar2.e(floatValue, i8);
            }
            obj2 = this.f5577f.f5703b.f(qVar2);
        }
        this.f5590s = e.k(3, obj2);
    }

    public final i1 a() {
        return (i1) this.f5580i.getValue();
    }

    public final void c(long j8) {
        if (this.f5584m.e() == -1.0f) {
            this.f5589r = true;
            if (r6.k.a(a().f5534c, a().f5535d)) {
                d(a().f5534c);
            } else {
                d(a().b(j8));
                this.f5587p = a().f(j8);
            }
        }
    }

    public final void d(Object obj) {
        this.f5586o.setValue(obj);
    }

    public final void e(Object obj, boolean z8) {
        i1 i1Var = this.f5582k;
        Object obj2 = i1Var != null ? i1Var.f5534c : null;
        g0.g1 g1Var = this.f5578g;
        boolean a3 = r6.k.a(obj2, g1Var.getValue());
        g0.e1 e1Var = this.f5588q;
        g0.g1 g1Var2 = this.f5580i;
        if (a3) {
            g1Var2.setValue(new i1(this.f5590s, this.f5577f, obj, obj, this.f5587p.c()));
            this.f5585n = true;
            e1Var.e(a().c());
            return;
        }
        g0.g1 g1Var3 = this.f5579h;
        a0 a0Var = (!z8 || this.f5589r) ? (a0) g1Var3.getValue() : ((a0) g1Var3.getValue()) instanceof a1 ? (a0) g1Var3.getValue() : this.f5590s;
        p1 p1Var = this.f5591t;
        long e9 = p1Var.e();
        g0.g1 g1Var4 = p1Var.f5617h;
        g1Var2.setValue(new i1(e9 <= 0 ? a0Var : new b1(a0Var, p1Var.e()), this.f5577f, obj, g1Var.getValue(), this.f5587p));
        e1Var.e(a().c());
        this.f5585n = false;
        g1Var4.setValue(Boolean.TRUE);
        if (p1Var.g()) {
            q0.q qVar = p1Var.f5618i;
            int size = qVar.size();
            long j8 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                n1 n1Var = (n1) qVar.get(i7);
                g0.e1 e1Var2 = n1Var.f5588q;
                j8 = Math.max(j8, ((g0.d2) q0.n.t(e1Var2.f3719g, e1Var2)).f3715c);
                n1Var.c(0L);
            }
            g1Var4.setValue(Boolean.FALSE);
        }
    }

    public final void f(Object obj, Object obj2, a0 a0Var) {
        this.f5578g.setValue(obj2);
        this.f5579h.setValue(a0Var);
        if (r6.k.a(a().f5535d, obj) && r6.k.a(a().f5534c, obj2)) {
            return;
        }
        e(obj, false);
    }

    public final void g(Object obj, a0 a0Var) {
        if (this.f5585n) {
            i1 i1Var = this.f5582k;
            if (r6.k.a(obj, i1Var != null ? i1Var.f5534c : null)) {
                return;
            }
        }
        g0.g1 g1Var = this.f5578g;
        boolean a3 = r6.k.a(g1Var.getValue(), obj);
        g0.c1 c1Var = this.f5584m;
        if (a3 && c1Var.e() == -1.0f) {
            return;
        }
        g1Var.setValue(obj);
        this.f5579h.setValue(a0Var);
        Object value = c1Var.e() == -3.0f ? obj : this.f5586o.getValue();
        g0.g1 g1Var2 = this.f5583l;
        e(value, !((Boolean) g1Var2.getValue()).booleanValue());
        g1Var2.setValue(Boolean.valueOf(c1Var.e() == -3.0f));
        if (c1Var.e() >= 0.0f) {
            d(a().b((long) (c1Var.e() * a().c())));
        } else if (c1Var.e() == -3.0f) {
            d(obj);
        }
        this.f5585n = false;
        c1Var.f(-1.0f);
    }

    @Override // g0.m2
    public final Object getValue() {
        return this.f5586o.getValue();
    }

    public final String toString() {
        return "current value: " + this.f5586o.getValue() + ", target: " + this.f5578g.getValue() + ", spec: " + ((a0) this.f5579h.getValue());
    }
}
