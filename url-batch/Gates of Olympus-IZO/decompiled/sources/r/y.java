package r;

import e2.AbstractC0381e;
import t0.InterfaceC0914w;

/* loaded from: classes.dex */
public final class y extends U.k implements InterfaceC0914w {

    /* renamed from: q, reason: collision with root package name */
    public int f7106q;

    /* renamed from: r, reason: collision with root package name */
    public float f7107r;

    @Override // t0.InterfaceC0914w
    public final r0.B b(t0.O o3, r0.z zVar, long j3) {
        int j4;
        int h3;
        int g3;
        int i3;
        if (!M0.a.d(j3) || this.f7106q == 1) {
            j4 = M0.a.j(j3);
            h3 = M0.a.h(j3);
        } else {
            j4 = AbstractC0381e.r(Math.round(M0.a.h(j3) * this.f7107r), M0.a.j(j3), M0.a.h(j3));
            h3 = j4;
        }
        if (!M0.a.c(j3) || this.f7106q == 2) {
            int i4 = M0.a.i(j3);
            g3 = M0.a.g(j3);
            i3 = i4;
        } else {
            i3 = AbstractC0381e.r(Math.round(M0.a.g(j3) * this.f7107r), M0.a.i(j3), M0.a.g(j3));
            g3 = i3;
        }
        r0.H b2 = zVar.b(I2.l.a(j4, h3, i3, g3));
        return o3.Y(b2.f7114d, b2.f7115e, M1.v.f2804d, new Y.g(b2, 4));
    }
}
