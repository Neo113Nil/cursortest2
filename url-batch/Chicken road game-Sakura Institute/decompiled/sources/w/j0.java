package w;

import g0.g1;
import g0.p1;
import s1.h2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public m0 f9255a;

    /* renamed from: b, reason: collision with root package name */
    public final p1 f9256b;

    /* renamed from: c, reason: collision with root package name */
    public final h2 f9257c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.room.c f9258d;

    /* renamed from: e, reason: collision with root package name */
    public g2.c0 f9259e;

    /* renamed from: f, reason: collision with root package name */
    public final g1 f9260f;

    /* renamed from: g, reason: collision with root package name */
    public final g1 f9261g;

    /* renamed from: h, reason: collision with root package name */
    public p1.p f9262h;

    /* renamed from: i, reason: collision with root package name */
    public final g1 f9263i;

    /* renamed from: j, reason: collision with root package name */
    public a2.g f9264j;

    /* renamed from: k, reason: collision with root package name */
    public final g1 f9265k;

    /* renamed from: l, reason: collision with root package name */
    public final g1 f9266l;

    /* renamed from: m, reason: collision with root package name */
    public final g1 f9267m;

    /* renamed from: n, reason: collision with root package name */
    public final g1 f9268n;

    /* renamed from: o, reason: collision with root package name */
    public final g1 f9269o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9270p;

    /* renamed from: q, reason: collision with root package name */
    public final g1 f9271q;

    /* renamed from: r, reason: collision with root package name */
    public final b1.b f9272r;

    /* renamed from: s, reason: collision with root package name */
    public q6.c f9273s;

    /* renamed from: t, reason: collision with root package name */
    public final p f9274t;

    /* renamed from: u, reason: collision with root package name */
    public final p f9275u;

    /* renamed from: v, reason: collision with root package name */
    public final f7.i0 f9276v;

    /* renamed from: w, reason: collision with root package name */
    public long f9277w;

    /* renamed from: x, reason: collision with root package name */
    public final g1 f9278x;

    /* renamed from: y, reason: collision with root package name */
    public final g1 f9279y;

    public j0(m0 m0Var, p1 p1Var, h2 h2Var) {
        this.f9255a = m0Var;
        this.f9256b = p1Var;
        this.f9257c = h2Var;
        androidx.room.c cVar = new androidx.room.c(6);
        a2.g gVar = a2.h.f387a;
        long j8 = a2.j0.f406b;
        g2.w wVar = new g2.w(gVar, j8, (a2.j0) null);
        cVar.f1069g = wVar;
        cVar.f1070h = new g2.j(gVar, wVar.f4066b);
        this.f9258d = cVar;
        Boolean bool = Boolean.FALSE;
        g0.t0 t0Var = g0.t0.f3903k;
        this.f9260f = g0.d.J(bool, t0Var);
        this.f9261g = g0.d.J(new m2.e(0), t0Var);
        this.f9263i = g0.d.J(null, t0Var);
        this.f9265k = g0.d.J(a0.f9183f, t0Var);
        this.f9266l = g0.d.J(bool, t0Var);
        this.f9267m = g0.d.J(bool, t0Var);
        this.f9268n = g0.d.J(bool, t0Var);
        this.f9269o = g0.d.J(bool, t0Var);
        this.f9270p = true;
        this.f9271q = g0.d.J(Boolean.TRUE, t0Var);
        this.f9272r = new b1.b(h2Var);
        this.f9273s = e.f9212k;
        this.f9274t = new p(this, 5);
        this.f9275u = new p(this, 4);
        this.f9276v = z0.l0.g();
        this.f9277w = z0.u.f10057g;
        this.f9278x = g0.d.J(new a2.j0(j8), t0Var);
        this.f9279y = g0.d.J(new a2.j0(j8), t0Var);
    }

    public final a0 a() {
        return (a0) this.f9265k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f9260f.getValue()).booleanValue();
    }

    public final p1.p c() {
        p1.p pVar = this.f9262h;
        if (pVar == null || !pVar.O()) {
            return null;
        }
        return pVar;
    }

    public final z0 d() {
        return (z0) this.f9263i.getValue();
    }

    public final void e(long j8) {
        this.f9279y.setValue(new a2.j0(j8));
    }

    public final void f(long j8) {
        this.f9278x.setValue(new a2.j0(j8));
    }
}
