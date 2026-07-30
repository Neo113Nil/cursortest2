package z0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n0 implements m2.b {

    /* renamed from: f, reason: collision with root package name */
    public int f10014f;

    /* renamed from: g, reason: collision with root package name */
    public float f10015g;

    /* renamed from: h, reason: collision with root package name */
    public float f10016h;

    /* renamed from: i, reason: collision with root package name */
    public float f10017i;

    /* renamed from: j, reason: collision with root package name */
    public float f10018j;

    /* renamed from: k, reason: collision with root package name */
    public long f10019k;

    /* renamed from: l, reason: collision with root package name */
    public long f10020l;

    /* renamed from: m, reason: collision with root package name */
    public float f10021m;

    /* renamed from: n, reason: collision with root package name */
    public long f10022n;

    /* renamed from: o, reason: collision with root package name */
    public p0 f10023o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10024p;

    /* renamed from: q, reason: collision with root package name */
    public long f10025q;

    /* renamed from: r, reason: collision with root package name */
    public m2.b f10026r;

    /* renamed from: s, reason: collision with root package name */
    public m2.k f10027s;

    /* renamed from: t, reason: collision with root package name */
    public j0 f10028t;

    @Override // m2.b
    public final float a() {
        return this.f10026r.a();
    }

    public final void b(float f9) {
        if (this.f10017i == f9) {
            return;
        }
        this.f10014f |= 4;
        this.f10017i = f9;
    }

    public final void c(long j8) {
        if (u.c(this.f10019k, j8)) {
            return;
        }
        this.f10014f |= 64;
        this.f10019k = j8;
    }

    public final void e(boolean z8) {
        if (this.f10024p != z8) {
            this.f10014f |= 16384;
            this.f10024p = z8;
        }
    }

    public final void f(float f9) {
        if (this.f10015g == f9) {
            return;
        }
        this.f10014f |= 1;
        this.f10015g = f9;
    }

    public final void g(float f9) {
        if (this.f10016h == f9) {
            return;
        }
        this.f10014f |= 2;
        this.f10016h = f9;
    }

    public final void h(float f9) {
        if (this.f10018j == f9) {
            return;
        }
        this.f10014f |= 32;
        this.f10018j = f9;
    }

    public final void i(p0 p0Var) {
        if (r6.k.a(this.f10023o, p0Var)) {
            return;
        }
        this.f10014f |= 8192;
        this.f10023o = p0Var;
    }

    public final void j(long j8) {
        if (u.c(this.f10020l, j8)) {
            return;
        }
        this.f10014f |= 128;
        this.f10020l = j8;
    }

    public final void k(long j8) {
        if (s0.a(this.f10022n, j8)) {
            return;
        }
        this.f10014f |= 4096;
        this.f10022n = j8;
    }

    @Override // m2.b
    public final float m() {
        return this.f10026r.m();
    }
}
