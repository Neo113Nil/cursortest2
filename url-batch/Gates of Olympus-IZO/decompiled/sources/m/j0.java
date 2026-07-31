package m;

/* loaded from: classes.dex */
public final class j0 implements InterfaceC0599i {

    /* renamed from: a, reason: collision with root package name */
    public final A0 f5777a;

    /* renamed from: b, reason: collision with root package name */
    public final y0 f5778b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5779c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5780d;

    /* renamed from: e, reason: collision with root package name */
    public r f5781e;

    /* renamed from: f, reason: collision with root package name */
    public r f5782f;

    /* renamed from: g, reason: collision with root package name */
    public final r f5783g;

    /* renamed from: h, reason: collision with root package name */
    public long f5784h;

    /* renamed from: i, reason: collision with root package name */
    public r f5785i;

    public j0(InterfaceC0602l interfaceC0602l, y0 y0Var, Object obj, Object obj2, r rVar) {
        this.f5777a = interfaceC0602l.a(y0Var);
        this.f5778b = y0Var;
        this.f5779c = obj2;
        this.f5780d = obj;
        this.f5781e = (r) y0Var.f5883a.j(obj);
        Y1.c cVar = y0Var.f5883a;
        this.f5782f = (r) cVar.j(obj2);
        this.f5783g = rVar != null ? AbstractC0595e.e(rVar) : ((r) cVar.j(obj)).c();
        this.f5784h = -1L;
    }

    @Override // m.InterfaceC0599i
    public final boolean a() {
        return this.f5777a.a();
    }

    @Override // m.InterfaceC0599i
    public final Object b(long j3) {
        if (f(j3)) {
            return this.f5779c;
        }
        r c3 = this.f5777a.c(j3, this.f5781e, this.f5782f, this.f5783g);
        int b2 = c3.b();
        for (int i3 = 0; i3 < b2; i3++) {
            if (Float.isNaN(c3.a(i3))) {
                throw new IllegalStateException("AnimationVector cannot contain a NaN. " + c3 + ". Animation: " + this + ", playTimeNanos: " + j3);
            }
        }
        return this.f5778b.f5884b.j(c3);
    }

    @Override // m.InterfaceC0599i
    public final long c() {
        if (this.f5784h < 0) {
            this.f5784h = this.f5777a.d(this.f5781e, this.f5782f, this.f5783g);
        }
        return this.f5784h;
    }

    @Override // m.InterfaceC0599i
    public final y0 d() {
        return this.f5778b;
    }

    @Override // m.InterfaceC0599i
    public final Object e() {
        return this.f5779c;
    }

    @Override // m.InterfaceC0599i
    public final r g(long j3) {
        if (!f(j3)) {
            return this.f5777a.b(j3, this.f5781e, this.f5782f, this.f5783g);
        }
        r rVar = this.f5785i;
        if (rVar != null) {
            return rVar;
        }
        r e3 = this.f5777a.e(this.f5781e, this.f5782f, this.f5783g);
        this.f5785i = e3;
        return e3;
    }

    public final void h(Object obj) {
        if (Z1.i.a(obj, this.f5780d)) {
            return;
        }
        this.f5780d = obj;
        this.f5781e = (r) this.f5778b.f5883a.j(obj);
        this.f5785i = null;
        this.f5784h = -1L;
    }

    public final void i(Object obj) {
        if (Z1.i.a(this.f5779c, obj)) {
            return;
        }
        this.f5779c = obj;
        this.f5782f = (r) this.f5778b.f5883a.j(obj);
        this.f5785i = null;
        this.f5784h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f5780d + " -> " + this.f5779c + ",initial velocity: " + this.f5783g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.f5777a;
    }
}
