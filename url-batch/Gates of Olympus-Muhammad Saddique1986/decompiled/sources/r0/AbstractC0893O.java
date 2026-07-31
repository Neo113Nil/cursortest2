package r0;

import e2.InterfaceC0424c;

/* renamed from: r0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0893O {

    /* renamed from: d, reason: collision with root package name */
    public int f8126d;

    /* renamed from: e, reason: collision with root package name */
    public int f8127e;

    /* renamed from: f, reason: collision with root package name */
    public long f8128f = O2.d.d(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public long f8129g = AbstractC0895Q.f8134a;

    /* renamed from: h, reason: collision with root package name */
    public long f8130h = 0;

    public abstract int W(C0915l c0915l);

    public final int c0() {
        return (int) (this.f8128f >> 32);
    }

    public final void e0() {
        this.f8126d = O2.d.y((int) (this.f8128f >> 32), O0.a.j(this.f8129g), O0.a.h(this.f8129g));
        int y3 = O2.d.y((int) (this.f8128f & 4294967295L), O0.a.i(this.f8129g), O0.a.g(this.f8129g));
        this.f8127e = y3;
        int i3 = this.f8126d;
        long j3 = this.f8128f;
        this.f8130h = l0.c.c((i3 - ((int) (j3 >> 32))) / 2, (y3 - ((int) (j3 & 4294967295L))) / 2);
    }

    public abstract void f0(long j3, float f3, InterfaceC0424c interfaceC0424c);

    public final void g0(long j3) {
        if (O0.j.a(this.f8128f, j3)) {
            return;
        }
        this.f8128f = j3;
        e0();
    }

    public final void m0(long j3) {
        if (O0.a.b(this.f8129g, j3)) {
            return;
        }
        this.f8129g = j3;
        e0();
    }

    public Object t() {
        return null;
    }
}
