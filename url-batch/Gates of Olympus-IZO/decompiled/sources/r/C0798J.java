package r;

import t0.InterfaceC0914w;

/* renamed from: r.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0798J extends U.k implements InterfaceC0914w {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0796H f7010q;

    @Override // t0.InterfaceC0914w
    public final r0.B b(t0.O o3, r0.z zVar, long j3) {
        float f3 = 0;
        if (Float.compare(this.f7010q.b(o3.getLayoutDirection()), f3) < 0 || Float.compare(this.f7010q.d(), f3) < 0 || Float.compare(this.f7010q.a(o3.getLayoutDirection()), f3) < 0 || Float.compare(this.f7010q.c(), f3) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int k3 = o3.k(this.f7010q.a(o3.getLayoutDirection())) + o3.k(this.f7010q.b(o3.getLayoutDirection()));
        int k4 = o3.k(this.f7010q.c()) + o3.k(this.f7010q.d());
        r0.H b2 = zVar.b(I2.l.J(-k3, -k4, j3));
        return o3.Y(I2.l.q(j3, b2.f7114d + k3), I2.l.p(j3, b2.f7115e + k4), M1.v.f2804d, new R.h(b2, o3, this, 9));
    }
}
