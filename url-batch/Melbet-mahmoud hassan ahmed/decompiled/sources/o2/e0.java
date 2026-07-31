package o2;

import r0.u2;

/* loaded from: classes.dex */
public final class e0 implements t {

    /* renamed from: f, reason: collision with root package name */
    private final d f19708f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19709g;

    /* renamed from: h, reason: collision with root package name */
    private long f19710h;

    /* renamed from: i, reason: collision with root package name */
    private long f19711i;

    /* renamed from: j, reason: collision with root package name */
    private u2 f19712j = u2.f21046i;

    public e0(d dVar) {
        this.f19708f = dVar;
    }

    public void a(long j7) {
        this.f19710h = j7;
        if (this.f19709g) {
            this.f19711i = this.f19708f.a();
        }
    }

    public void b() {
        if (this.f19709g) {
            return;
        }
        this.f19711i = this.f19708f.a();
        this.f19709g = true;
    }

    public void c() {
        if (this.f19709g) {
            a(z());
            this.f19709g = false;
        }
    }

    @Override // o2.t
    public u2 d() {
        return this.f19712j;
    }

    @Override // o2.t
    public void e(u2 u2Var) {
        if (this.f19709g) {
            a(z());
        }
        this.f19712j = u2Var;
    }

    @Override // o2.t
    public long z() {
        long j7 = this.f19710h;
        if (!this.f19709g) {
            return j7;
        }
        long a7 = this.f19708f.a() - this.f19711i;
        u2 u2Var = this.f19712j;
        return j7 + (u2Var.f21048f == 1.0f ? m0.B0(a7) : u2Var.b(a7));
    }
}
