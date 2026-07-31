package b0;

/* renamed from: b0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0261L implements M0.b {

    /* renamed from: d, reason: collision with root package name */
    public int f4219d;

    /* renamed from: e, reason: collision with root package name */
    public float f4220e;

    /* renamed from: f, reason: collision with root package name */
    public float f4221f;

    /* renamed from: g, reason: collision with root package name */
    public float f4222g;

    /* renamed from: h, reason: collision with root package name */
    public float f4223h;

    /* renamed from: i, reason: collision with root package name */
    public float f4224i;

    /* renamed from: j, reason: collision with root package name */
    public float f4225j;

    /* renamed from: k, reason: collision with root package name */
    public long f4226k;

    /* renamed from: l, reason: collision with root package name */
    public long f4227l;

    /* renamed from: m, reason: collision with root package name */
    public float f4228m;

    /* renamed from: n, reason: collision with root package name */
    public float f4229n;

    /* renamed from: o, reason: collision with root package name */
    public float f4230o;
    public float p;

    /* renamed from: q, reason: collision with root package name */
    public long f4231q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0263N f4232r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4233s;

    /* renamed from: t, reason: collision with root package name */
    public int f4234t;

    /* renamed from: u, reason: collision with root package name */
    public long f4235u;

    /* renamed from: v, reason: collision with root package name */
    public M0.b f4236v;

    /* renamed from: w, reason: collision with root package name */
    public M0.j f4237w;

    /* renamed from: x, reason: collision with root package name */
    public AbstractC0257H f4238x;

    @Override // M0.b
    public final float a() {
        return this.f4236v.a();
    }

    public final void b(float f3) {
        if (this.f4222g == f3) {
            return;
        }
        this.f4219d |= 4;
        this.f4222g = f3;
    }

    public final void d(float f3) {
        if (this.f4220e == f3) {
            return;
        }
        this.f4219d |= 1;
        this.f4220e = f3;
    }

    public final void e(float f3) {
        if (this.f4221f == f3) {
            return;
        }
        this.f4219d |= 2;
        this.f4221f = f3;
    }

    public final void h(long j3) {
        if (C0266Q.a(this.f4231q, j3)) {
            return;
        }
        this.f4219d |= 4096;
        this.f4231q = j3;
    }

    @Override // M0.b
    public final float p() {
        return this.f4236v.p();
    }
}
