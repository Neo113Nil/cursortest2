package f1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g0 implements r2.c {

    /* renamed from: d, reason: collision with root package name */
    public int f2644d;

    /* renamed from: e, reason: collision with root package name */
    public float f2645e;

    /* renamed from: f, reason: collision with root package name */
    public float f2646f;

    /* renamed from: g, reason: collision with root package name */
    public float f2647g;

    /* renamed from: h, reason: collision with root package name */
    public float f2648h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public long f2649j;

    /* renamed from: k, reason: collision with root package name */
    public float f2650k;

    /* renamed from: l, reason: collision with root package name */
    public long f2651l;

    /* renamed from: m, reason: collision with root package name */
    public i0 f2652m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2653n;

    /* renamed from: o, reason: collision with root package name */
    public long f2654o;

    /* renamed from: p, reason: collision with root package name */
    public r2.c f2655p;

    /* renamed from: q, reason: collision with root package name */
    public r2.l f2656q;

    /* renamed from: r, reason: collision with root package name */
    public int f2657r;

    /* renamed from: s, reason: collision with root package name */
    public p f2658s;

    public final void a(float f6) {
        if (this.f2647g == f6) {
            return;
        }
        this.f2644d |= 4;
        this.f2647g = f6;
    }

    @Override // r2.c
    public final float b() {
        return this.f2655p.b();
    }

    public final void d(float f6) {
        if (this.f2645e == f6) {
            return;
        }
        this.f2644d |= 1;
        this.f2645e = f6;
    }

    public final void e(float f6) {
        if (this.f2646f == f6) {
            return;
        }
        this.f2644d |= 2;
        this.f2646f = f6;
    }

    public final void f(long j7) {
        if (l0.a(this.f2651l, j7)) {
            return;
        }
        this.f2644d |= 4096;
        this.f2651l = j7;
    }

    @Override // r2.c
    public final float i() {
        return this.f2655p.i();
    }
}
