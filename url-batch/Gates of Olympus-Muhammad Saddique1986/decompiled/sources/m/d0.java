package m;

import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class d0 implements InterfaceC0624i {

    /* renamed from: a, reason: collision with root package name */
    public final w0 f6767a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f6768b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6769c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6770d;

    /* renamed from: e, reason: collision with root package name */
    public r f6771e;

    /* renamed from: f, reason: collision with root package name */
    public r f6772f;

    /* renamed from: g, reason: collision with root package name */
    public final r f6773g;

    /* renamed from: h, reason: collision with root package name */
    public long f6774h;

    /* renamed from: i, reason: collision with root package name */
    public r f6775i;

    public d0(InterfaceC0627l interfaceC0627l, u0 u0Var, Object obj, Object obj2, r rVar) {
        this.f6767a = interfaceC0627l.a(u0Var);
        this.f6768b = u0Var;
        this.f6769c = obj2;
        this.f6770d = obj;
        this.f6771e = (r) u0Var.f6889a.n(obj);
        InterfaceC0424c interfaceC0424c = u0Var.f6889a;
        this.f6772f = (r) interfaceC0424c.n(obj2);
        this.f6773g = rVar != null ? AbstractC0620e.f(rVar) : ((r) interfaceC0424c.n(obj)).c();
        this.f6774h = -1L;
    }

    @Override // m.InterfaceC0624i
    public final boolean a() {
        return this.f6767a.a();
    }

    @Override // m.InterfaceC0624i
    public final Object b(long j3) {
        if (f(j3)) {
            return this.f6769c;
        }
        r f3 = this.f6767a.f(j3, this.f6771e, this.f6772f, this.f6773g);
        int b3 = f3.b();
        for (int i3 = 0; i3 < b3; i3++) {
            if (Float.isNaN(f3.a(i3))) {
                throw new IllegalStateException("AnimationVector cannot contain a NaN. " + f3 + ". Animation: " + this + ", playTimeNanos: " + j3);
            }
        }
        return this.f6768b.f6890b.n(f3);
    }

    @Override // m.InterfaceC0624i
    public final long c() {
        if (this.f6774h < 0) {
            this.f6774h = this.f6767a.g(this.f6771e, this.f6772f, this.f6773g);
        }
        return this.f6774h;
    }

    @Override // m.InterfaceC0624i
    public final u0 d() {
        return this.f6768b;
    }

    @Override // m.InterfaceC0624i
    public final Object e() {
        return this.f6769c;
    }

    @Override // m.InterfaceC0624i
    public final r g(long j3) {
        if (!f(j3)) {
            return this.f6767a.d(j3, this.f6771e, this.f6772f, this.f6773g);
        }
        r rVar = this.f6775i;
        if (rVar != null) {
            return rVar;
        }
        r h3 = this.f6767a.h(this.f6771e, this.f6772f, this.f6773g);
        this.f6775i = h3;
        return h3;
    }

    public final void h(Object obj) {
        if (f2.j.a(obj, this.f6770d)) {
            return;
        }
        this.f6770d = obj;
        this.f6771e = (r) this.f6768b.f6889a.n(obj);
        this.f6775i = null;
        this.f6774h = -1L;
    }

    public final void i(Object obj) {
        if (f2.j.a(this.f6769c, obj)) {
            return;
        }
        this.f6769c = obj;
        this.f6772f = (r) this.f6768b.f6889a.n(obj);
        this.f6775i = null;
        this.f6774h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f6770d + " -> " + this.f6769c + ",initial velocity: " + this.f6773g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.f6767a;
    }
}
