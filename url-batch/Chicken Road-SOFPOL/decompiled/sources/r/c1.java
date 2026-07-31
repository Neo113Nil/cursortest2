package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c1 implements g {

    /* renamed from: a, reason: collision with root package name */
    public final t1 f6246a;

    /* renamed from: b, reason: collision with root package name */
    public final r1 f6247b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6248c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6249d;

    /* renamed from: e, reason: collision with root package name */
    public p f6250e;

    /* renamed from: f, reason: collision with root package name */
    public p f6251f;

    /* renamed from: g, reason: collision with root package name */
    public final p f6252g;

    /* renamed from: h, reason: collision with root package name */
    public long f6253h;
    public p i;

    public c1(j jVar, r1 r1Var, Object obj, Object obj2, p pVar) {
        this.f6246a = jVar.a(r1Var);
        this.f6247b = r1Var;
        this.f6248c = obj2;
        this.f6249d = obj;
        this.f6250e = (p) r1Var.f6413a.i(obj);
        p6.c cVar = r1Var.f6413a;
        this.f6251f = (p) cVar.i(obj2);
        this.f6252g = pVar != null ? d.f(pVar) : ((p) cVar.i(obj)).c();
        this.f6253h = -1L;
    }

    @Override // r.g
    public final boolean a() {
        return this.f6246a.a();
    }

    @Override // r.g
    public final Object b(long j7) {
        if (g(j7)) {
            return this.f6248c;
        }
        p k3 = this.f6246a.k(j7, this.f6250e, this.f6251f, this.f6252g);
        int b8 = k3.b();
        for (int i = 0; i < b8; i++) {
            if (Float.isNaN(k3.a(i))) {
                i0.b("AnimationVector cannot contain a NaN. " + k3 + ". Animation: " + this + ", playTimeNanos: " + j7);
            }
        }
        return this.f6247b.f6414b.i(k3);
    }

    @Override // r.g
    public final long c() {
        if (this.f6253h < 0) {
            this.f6253h = this.f6246a.m(this.f6250e, this.f6251f, this.f6252g);
        }
        return this.f6253h;
    }

    @Override // r.g
    public final r1 d() {
        return this.f6247b;
    }

    @Override // r.g
    public final Object e() {
        return this.f6248c;
    }

    @Override // r.g
    public final p f(long j7) {
        if (!g(j7)) {
            return this.f6246a.l(j7, this.f6250e, this.f6251f, this.f6252g);
        }
        p pVar = this.i;
        if (pVar != null) {
            return pVar;
        }
        p o2 = this.f6246a.o(this.f6250e, this.f6251f, this.f6252g);
        this.i = o2;
        return o2;
    }

    public final void h(Object obj) {
        if (q6.i.a(obj, this.f6249d)) {
            return;
        }
        this.f6249d = obj;
        this.f6250e = (p) this.f6247b.f6413a.i(obj);
        this.i = null;
        this.f6253h = -1L;
    }

    public final void i(Object obj) {
        if (q6.i.a(this.f6248c, obj)) {
            return;
        }
        this.f6248c = obj;
        this.f6251f = (p) this.f6247b.f6413a.i(obj);
        this.i = null;
        this.f6253h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f6249d + " -> " + this.f6248c + ",initial velocity: " + this.f6252g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.f6246a;
    }
}
