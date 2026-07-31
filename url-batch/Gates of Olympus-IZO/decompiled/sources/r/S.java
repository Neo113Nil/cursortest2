package r;

import t0.InterfaceC0914w;

/* loaded from: classes.dex */
public final class S extends U.k implements InterfaceC0914w {

    /* renamed from: q, reason: collision with root package name */
    public float f7024q;

    /* renamed from: r, reason: collision with root package name */
    public float f7025r;

    @Override // t0.InterfaceC0914w
    public final r0.B b(t0.O o3, r0.z zVar, long j3) {
        int j4;
        int i3 = 0;
        if (M0.e.a(this.f7024q, Float.NaN) || M0.a.j(j3) != 0) {
            j4 = M0.a.j(j3);
        } else {
            j4 = o3.k(this.f7024q);
            int h3 = M0.a.h(j3);
            if (j4 > h3) {
                j4 = h3;
            }
            if (j4 < 0) {
                j4 = 0;
            }
        }
        int h4 = M0.a.h(j3);
        if (M0.e.a(this.f7025r, Float.NaN) || M0.a.i(j3) != 0) {
            i3 = M0.a.i(j3);
        } else {
            int k3 = o3.k(this.f7025r);
            int g3 = M0.a.g(j3);
            if (k3 > g3) {
                k3 = g3;
            }
            if (k3 >= 0) {
                i3 = k3;
            }
        }
        r0.H b2 = zVar.b(I2.l.a(j4, h4, i3, M0.a.g(j3)));
        return o3.Y(b2.f7114d, b2.f7115e, M1.v.f2804d, new Y.g(b2, 6));
    }
}
