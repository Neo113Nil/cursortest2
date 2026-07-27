package Z;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class M implements M0.b {

    /* renamed from: A, reason: collision with root package name */
    public I f4465A;

    /* renamed from: d, reason: collision with root package name */
    public int f4466d;

    /* renamed from: e, reason: collision with root package name */
    public float f4467e;

    /* renamed from: i, reason: collision with root package name */
    public float f4468i;

    /* renamed from: j, reason: collision with root package name */
    public float f4469j;

    /* renamed from: k, reason: collision with root package name */
    public float f4470k;

    /* renamed from: l, reason: collision with root package name */
    public float f4471l;

    /* renamed from: m, reason: collision with root package name */
    public float f4472m;

    /* renamed from: n, reason: collision with root package name */
    public long f4473n;

    /* renamed from: o, reason: collision with root package name */
    public long f4474o;

    /* renamed from: p, reason: collision with root package name */
    public float f4475p;

    /* renamed from: q, reason: collision with root package name */
    public float f4476q;

    /* renamed from: r, reason: collision with root package name */
    public float f4477r;

    /* renamed from: s, reason: collision with root package name */
    public float f4478s;

    /* renamed from: t, reason: collision with root package name */
    public long f4479t;

    /* renamed from: u, reason: collision with root package name */
    public P f4480u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4481v;

    /* renamed from: w, reason: collision with root package name */
    public int f4482w;

    /* renamed from: x, reason: collision with root package name */
    public long f4483x;

    /* renamed from: y, reason: collision with root package name */
    public M0.b f4484y;

    /* renamed from: z, reason: collision with root package name */
    public M0.k f4485z;

    public final void a(float f4) {
        if (this.f4469j == f4) {
            return;
        }
        this.f4466d |= 4;
        this.f4469j = f4;
    }

    public final void b(long j4) {
        if (C0323u.c(this.f4473n, j4)) {
            return;
        }
        this.f4466d |= 64;
        this.f4473n = j4;
    }

    public final void c(boolean z4) {
        if (this.f4481v != z4) {
            this.f4466d |= 16384;
            this.f4481v = z4;
        }
    }

    public final void d(float f4) {
        if (this.f4467e == f4) {
            return;
        }
        this.f4466d |= 1;
        this.f4467e = f4;
    }

    @Override // M0.b
    public final float e() {
        return this.f4484y.e();
    }

    public final void f(float f4) {
        if (this.f4468i == f4) {
            return;
        }
        this.f4466d |= 2;
        this.f4468i = f4;
    }

    public final void g(float f4) {
        if (this.f4472m == f4) {
            return;
        }
        this.f4466d |= 32;
        this.f4472m = f4;
    }

    public final void i(P p4) {
        if (Intrinsics.a(this.f4480u, p4)) {
            return;
        }
        this.f4466d |= 8192;
        this.f4480u = p4;
    }

    public final void j(long j4) {
        if (C0323u.c(this.f4474o, j4)) {
            return;
        }
        this.f4466d |= 128;
        this.f4474o = j4;
    }

    public final void k(long j4) {
        if (U.a(this.f4479t, j4)) {
            return;
        }
        this.f4466d |= 4096;
        this.f4479t = j4;
    }

    @Override // M0.b
    public final float q() {
        return this.f4484y.q();
    }
}
