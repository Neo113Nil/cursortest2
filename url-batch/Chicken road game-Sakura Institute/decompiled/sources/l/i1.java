package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i1 implements g {

    /* renamed from: a, reason: collision with root package name */
    public final y1 f5532a;

    /* renamed from: b, reason: collision with root package name */
    public final w1 f5533b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5534c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5535d;

    /* renamed from: e, reason: collision with root package name */
    public q f5536e;

    /* renamed from: f, reason: collision with root package name */
    public q f5537f;

    /* renamed from: g, reason: collision with root package name */
    public final q f5538g;

    /* renamed from: h, reason: collision with root package name */
    public long f5539h;

    /* renamed from: i, reason: collision with root package name */
    public q f5540i;

    public i1(k kVar, w1 w1Var, Object obj, Object obj2, q qVar) {
        this.f5532a = kVar.a(w1Var);
        this.f5533b = w1Var;
        this.f5534c = obj2;
        this.f5535d = obj;
        this.f5536e = (q) w1Var.f5702a.f(obj);
        q6.c cVar = w1Var.f5702a;
        this.f5537f = (q) cVar.f(obj2);
        this.f5538g = qVar != null ? e.g(qVar) : ((q) cVar.f(obj)).c();
        this.f5539h = -1L;
    }

    @Override // l.g
    public final boolean a() {
        return this.f5532a.a();
    }

    @Override // l.g
    public final Object b(long j8) {
        if (g(j8)) {
            return this.f5534c;
        }
        q e9 = this.f5532a.e(j8, this.f5536e, this.f5537f, this.f5538g);
        int b9 = e9.b();
        for (int i7 = 0; i7 < b9; i7++) {
            if (Float.isNaN(e9.a(i7))) {
                throw new IllegalStateException("AnimationVector cannot contain a NaN. " + e9 + ". Animation: " + this + ", playTimeNanos: " + j8);
            }
        }
        return this.f5533b.f5703b.f(e9);
    }

    @Override // l.g
    public final long c() {
        if (this.f5539h < 0) {
            this.f5539h = this.f5532a.b(this.f5536e, this.f5537f, this.f5538g);
        }
        return this.f5539h;
    }

    @Override // l.g
    public final w1 d() {
        return this.f5533b;
    }

    @Override // l.g
    public final Object e() {
        return this.f5534c;
    }

    @Override // l.g
    public final q f(long j8) {
        if (!g(j8)) {
            return this.f5532a.f(j8, this.f5536e, this.f5537f, this.f5538g);
        }
        q qVar = this.f5540i;
        if (qVar != null) {
            return qVar;
        }
        q c4 = this.f5532a.c(this.f5536e, this.f5537f, this.f5538g);
        this.f5540i = c4;
        return c4;
    }

    public final void h(Object obj) {
        if (r6.k.a(obj, this.f5535d)) {
            return;
        }
        this.f5535d = obj;
        this.f5536e = (q) this.f5533b.f5702a.f(obj);
        this.f5540i = null;
        this.f5539h = -1L;
    }

    public final void i(Object obj) {
        if (r6.k.a(this.f5534c, obj)) {
            return;
        }
        this.f5534c = obj;
        this.f5537f = (q) this.f5533b.f5702a.f(obj);
        this.f5540i = null;
        this.f5539h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f5535d + " -> " + this.f5534c + ",initial velocity: " + this.f5538g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.f5532a;
    }
}
