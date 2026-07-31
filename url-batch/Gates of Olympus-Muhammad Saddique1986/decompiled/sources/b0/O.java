package b0;

/* loaded from: classes.dex */
public final class O implements O0.b {

    /* renamed from: d, reason: collision with root package name */
    public int f5359d;

    /* renamed from: e, reason: collision with root package name */
    public float f5360e;

    /* renamed from: f, reason: collision with root package name */
    public float f5361f;

    /* renamed from: g, reason: collision with root package name */
    public float f5362g;

    /* renamed from: h, reason: collision with root package name */
    public float f5363h;

    /* renamed from: i, reason: collision with root package name */
    public float f5364i;

    /* renamed from: j, reason: collision with root package name */
    public float f5365j;

    /* renamed from: k, reason: collision with root package name */
    public long f5366k;

    /* renamed from: l, reason: collision with root package name */
    public long f5367l;

    /* renamed from: m, reason: collision with root package name */
    public float f5368m;

    /* renamed from: n, reason: collision with root package name */
    public float f5369n;

    /* renamed from: o, reason: collision with root package name */
    public float f5370o;

    /* renamed from: p, reason: collision with root package name */
    public float f5371p;

    /* renamed from: q, reason: collision with root package name */
    public long f5372q;

    /* renamed from: r, reason: collision with root package name */
    public Q f5373r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5374s;

    /* renamed from: t, reason: collision with root package name */
    public int f5375t;

    /* renamed from: u, reason: collision with root package name */
    public long f5376u;

    /* renamed from: v, reason: collision with root package name */
    public O0.b f5377v;

    /* renamed from: w, reason: collision with root package name */
    public O0.k f5378w;

    /* renamed from: x, reason: collision with root package name */
    public K f5379x;

    @Override // O0.b
    public final float a() {
        return this.f5377v.a();
    }

    public final void b(float f3) {
        if (this.f5362g == f3) {
            return;
        }
        this.f5359d |= 4;
        this.f5362g = f3;
    }

    public final void c(long j3) {
        if (C0352v.c(this.f5366k, j3)) {
            return;
        }
        this.f5359d |= 64;
        this.f5366k = j3;
    }

    public final void e(boolean z3) {
        if (this.f5374s != z3) {
            this.f5359d |= 16384;
            this.f5374s = z3;
        }
    }

    public final void f(float f3) {
        if (this.f5360e == f3) {
            return;
        }
        this.f5359d |= 1;
        this.f5360e = f3;
    }

    public final void g(float f3) {
        if (this.f5361f == f3) {
            return;
        }
        this.f5359d |= 2;
        this.f5361f = f3;
    }

    public final void h(float f3) {
        if (this.f5365j == f3) {
            return;
        }
        this.f5359d |= 32;
        this.f5365j = f3;
    }

    public final void i(Q q3) {
        if (f2.j.a(this.f5373r, q3)) {
            return;
        }
        this.f5359d |= 8192;
        this.f5373r = q3;
    }

    public final void j(long j3) {
        if (C0352v.c(this.f5367l, j3)) {
            return;
        }
        this.f5359d |= 128;
        this.f5367l = j3;
    }

    public final void m(long j3) {
        if (U.a(this.f5372q, j3)) {
            return;
        }
        this.f5359d |= 4096;
        this.f5372q = j3;
    }

    @Override // O0.b
    public final float r() {
        return this.f5377v.r();
    }
}
