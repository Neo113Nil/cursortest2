package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final w1 f5425a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5426b;

    /* renamed from: c, reason: collision with root package name */
    public final l f5427c;

    /* renamed from: d, reason: collision with root package name */
    public final g0.g1 f5428d;

    /* renamed from: e, reason: collision with root package name */
    public final g0.g1 f5429e;

    /* renamed from: f, reason: collision with root package name */
    public final o0 f5430f;

    /* renamed from: g, reason: collision with root package name */
    public final q f5431g;

    /* renamed from: h, reason: collision with root package name */
    public final q f5432h;

    /* renamed from: i, reason: collision with root package name */
    public final q f5433i;

    /* renamed from: j, reason: collision with root package name */
    public final q f5434j;

    public d(Object obj, w1 w1Var, Object obj2) {
        this.f5425a = w1Var;
        this.f5426b = obj2;
        l lVar = new l(w1Var, obj, null, 60);
        this.f5427c = lVar;
        Boolean bool = Boolean.FALSE;
        g0.t0 t0Var = g0.t0.f3903k;
        this.f5428d = g0.d.J(bool, t0Var);
        this.f5429e = g0.d.J(obj, t0Var);
        this.f5430f = new o0();
        new a1(obj2);
        q qVar = lVar.f5564h;
        boolean z8 = qVar instanceof m;
        q qVar2 = z8 ? e.f5463e : qVar instanceof n ? e.f5464f : qVar instanceof o ? e.f5465g : e.f5466h;
        this.f5431g = qVar2;
        q qVar3 = z8 ? e.f5459a : qVar instanceof n ? e.f5460b : qVar instanceof o ? e.f5461c : e.f5462d;
        this.f5432h = qVar3;
        this.f5433i = qVar2;
        this.f5434j = qVar3;
    }

    public static final Object a(d dVar, Object obj) {
        w1 w1Var = dVar.f5425a;
        q qVar = dVar.f5434j;
        q qVar2 = dVar.f5433i;
        if (!r6.k.a(qVar2, dVar.f5431g) || !r6.k.a(qVar, dVar.f5432h)) {
            q qVar3 = (q) w1Var.f5702a.f(obj);
            int b9 = qVar3.b();
            boolean z8 = false;
            for (int i7 = 0; i7 < b9; i7++) {
                if (qVar3.a(i7) < qVar2.a(i7) || qVar3.a(i7) > qVar.a(i7)) {
                    qVar3.e(v1.g.d(qVar3.a(i7), qVar2.a(i7), qVar.a(i7)), i7);
                    z8 = true;
                }
            }
            if (z8) {
                return w1Var.f5703b.f(qVar3);
            }
        }
        return obj;
    }

    public static final void b(d dVar) {
        l lVar = dVar.f5427c;
        lVar.f5564h.d();
        lVar.f5565i = Long.MIN_VALUE;
        dVar.f5428d.setValue(Boolean.FALSE);
    }

    public static Object c(d dVar, Object obj, k kVar, q6.c cVar, h6.d dVar2, int i7) {
        Object f9 = dVar.f5425a.f5703b.f(dVar.f5427c.f5564h);
        q6.c cVar2 = (i7 & 8) != 0 ? null : cVar;
        Object d8 = dVar.d();
        w1 w1Var = dVar.f5425a;
        return o0.a(dVar.f5430f, new b(dVar, f9, new i1(kVar, w1Var, d8, obj, (q) w1Var.f5702a.f(f9)), dVar.f5427c.f5565i, cVar2, null), dVar2);
    }

    public final Object d() {
        return this.f5427c.f5563g.getValue();
    }

    public final Object e(h6.d dVar, Object obj) {
        Object a3 = o0.a(this.f5430f, new c(this, obj, null), dVar);
        return a3 == i6.a.f4956f ? a3 : d6.z.f2639a;
    }

    public /* synthetic */ d(Object obj, w1 w1Var, Object obj2, int i7) {
        this(obj, w1Var, (i7 & 4) != 0 ? null : obj2);
    }
}
