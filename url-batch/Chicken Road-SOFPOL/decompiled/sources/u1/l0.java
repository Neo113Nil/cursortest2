package u1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: d, reason: collision with root package name */
    public int f7230d;

    /* renamed from: e, reason: collision with root package name */
    public int f7231e;

    /* renamed from: f, reason: collision with root package name */
    public long f7232f;

    /* renamed from: g, reason: collision with root package name */
    public long f7233g = n0.f7246a;

    /* renamed from: h, reason: collision with root package name */
    public long f7234h = 0;

    public l0() {
        long j7 = 0;
        this.f7232f = (j7 & 4294967295L) | (j7 << 32);
    }

    public int Q() {
        return (int) (this.f7232f & 4294967295L);
    }

    public int S() {
        return (int) (this.f7232f >> 32);
    }

    public final void T() {
        this.f7230d = r2.o.t((int) (this.f7232f >> 32), r2.a.j(this.f7233g), r2.a.h(this.f7233g));
        this.f7231e = r2.o.t((int) (this.f7232f & 4294967295L), r2.a.i(this.f7233g), r2.a.g(this.f7233g));
        int i = this.f7230d;
        long j7 = this.f7232f;
        this.f7234h = (((i - ((int) (j7 >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j7 & 4294967295L))) / 2));
    }

    public abstract void U(long j7, float f6, p6.c cVar);

    public final void W(long j7) {
        if (r2.k.a(this.f7232f, j7)) {
            return;
        }
        this.f7232f = j7;
        T();
    }

    public final void X(long j7) {
        if (r2.a.b(this.f7233g, j7)) {
            return;
        }
        this.f7233g = j7;
        T();
    }

    public abstract Object g();
}
