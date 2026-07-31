package r;

import t0.InterfaceC0914w;

/* renamed from: r.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0795G extends U.k implements InterfaceC0914w {

    /* renamed from: q, reason: collision with root package name */
    public float f7001q;

    /* renamed from: r, reason: collision with root package name */
    public float f7002r;

    /* renamed from: s, reason: collision with root package name */
    public float f7003s;

    /* renamed from: t, reason: collision with root package name */
    public float f7004t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7005u;

    @Override // t0.InterfaceC0914w
    public final r0.B b(t0.O o3, r0.z zVar, long j3) {
        int k3 = o3.k(this.f7003s) + o3.k(this.f7001q);
        int k4 = o3.k(this.f7004t) + o3.k(this.f7002r);
        r0.H b2 = zVar.b(I2.l.J(-k3, -k4, j3));
        return o3.Y(I2.l.q(j3, b2.f7114d + k3), I2.l.p(j3, b2.f7115e + k4), M1.v.f2804d, new R.h(this, b2, o3, 8));
    }
}
