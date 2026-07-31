package r0;

import e2.AbstractC0381e;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: d, reason: collision with root package name */
    public int f7114d;

    /* renamed from: e, reason: collision with root package name */
    public int f7115e;

    /* renamed from: f, reason: collision with root package name */
    public long f7116f = I2.l.e(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public long f7117g = J.f7122a;

    /* renamed from: h, reason: collision with root package name */
    public long f7118h = 0;

    public abstract int L(C0837j c0837j);

    public final int N() {
        return (int) (this.f7116f >> 32);
    }

    public final void O() {
        this.f7114d = AbstractC0381e.r((int) (this.f7116f >> 32), M0.a.j(this.f7117g), M0.a.h(this.f7117g));
        int r3 = AbstractC0381e.r((int) (this.f7116f & 4294967295L), M0.a.i(this.f7117g), M0.a.g(this.f7117g));
        this.f7115e = r3;
        int i3 = this.f7114d;
        long j3 = this.f7116f;
        this.f7118h = I2.d.c((i3 - ((int) (j3 >> 32))) / 2, (r3 - ((int) (j3 & 4294967295L))) / 2);
    }

    public abstract void Q(long j3, float f3, Y1.c cVar);

    public final void T(long j3) {
        if (M0.i.a(this.f7116f, j3)) {
            return;
        }
        this.f7116f = j3;
        O();
    }

    public final void U(long j3) {
        if (M0.a.b(this.f7117g, j3)) {
            return;
        }
        this.f7117g = j3;
        O();
    }

    public abstract Object r();
}
