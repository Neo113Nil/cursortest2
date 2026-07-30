package p1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: f, reason: collision with root package name */
    public int f7063f;

    /* renamed from: g, reason: collision with root package name */
    public int f7064g;

    /* renamed from: h, reason: collision with root package name */
    public long f7065h = j1.c.G(0, 0);

    /* renamed from: i, reason: collision with root package name */
    public long f7066i = p0.f7073a;

    /* renamed from: j, reason: collision with root package name */
    public long f7067j = 0;

    public abstract int f0(l lVar);

    public Object g() {
        return null;
    }

    public final int h0() {
        return (int) (this.f7065h >> 32);
    }

    public final void i0() {
        this.f7063f = v1.g.e((int) (this.f7065h >> 32), m2.a.j(this.f7066i), m2.a.h(this.f7066i));
        int e9 = v1.g.e((int) (this.f7065h & 4294967295L), m2.a.i(this.f7066i), m2.a.g(this.f7066i));
        this.f7064g = e9;
        int i7 = this.f7063f;
        long j8 = this.f7065h;
        this.f7067j = a8.m.c((i7 - ((int) (j8 >> 32))) / 2, (e9 - ((int) (j8 & 4294967295L))) / 2);
    }

    public abstract void j0(long j8, float f9, q6.c cVar);

    public final void m0(long j8) {
        if (m2.j.a(this.f7065h, j8)) {
            return;
        }
        this.f7065h = j8;
        i0();
    }

    public final void o0(long j8) {
        if (m2.a.b(this.f7066i, j8)) {
            return;
        }
        this.f7066i = j8;
        i0();
    }
}
