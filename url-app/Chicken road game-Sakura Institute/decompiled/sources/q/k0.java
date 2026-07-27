package q;

import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import r0.InterfaceC1081w;
import z2.C1412P;

/* loaded from: classes.dex */
public final class k0 extends S.n implements InterfaceC1081w {

    /* renamed from: t, reason: collision with root package name */
    public float f9272t;

    /* renamed from: u, reason: collision with root package name */
    public float f9273u;

    @Override // r0.InterfaceC1081w
    public final int b(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        int X3 = interfaceC0944E.X(i2);
        int l4 = !M0.e.a(this.f9272t, Float.NaN) ? o4.l(this.f9272t) : 0;
        return X3 < l4 ? l4 : X3;
    }

    @Override // r0.InterfaceC1081w
    public final int c(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        int S3 = interfaceC0944E.S(i2);
        int l4 = !M0.e.a(this.f9272t, Float.NaN) ? o4.l(this.f9272t) : 0;
        return S3 < l4 ? l4 : S3;
    }

    @Override // r0.InterfaceC1081w
    public final int d(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        int Z3 = interfaceC0944E.Z(i2);
        int l4 = !M0.e.a(this.f9273u, Float.NaN) ? o4.l(this.f9273u) : 0;
        return Z3 < l4 ? l4 : Z3;
    }

    @Override // r0.InterfaceC1081w
    public final int f(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        int b4 = interfaceC0944E.b(i2);
        int l4 = !M0.e.a(this.f9273u, Float.NaN) ? o4.l(this.f9273u) : 0;
        return b4 < l4 ? l4 : b4;
    }

    @Override // r0.InterfaceC1081w
    public final InterfaceC0946G i(InterfaceC0947H interfaceC0947H, InterfaceC0944E interfaceC0944E, long j4) {
        int k4;
        InterfaceC0946G t4;
        int i2 = 0;
        if (M0.e.a(this.f9272t, Float.NaN) || M0.a.k(j4) != 0) {
            k4 = M0.a.k(j4);
        } else {
            k4 = interfaceC0947H.l(this.f9272t);
            int i4 = M0.a.i(j4);
            if (k4 > i4) {
                k4 = i4;
            }
            if (k4 < 0) {
                k4 = 0;
            }
        }
        int i5 = M0.a.i(j4);
        if (M0.e.a(this.f9273u, Float.NaN) || M0.a.j(j4) != 0) {
            i2 = M0.a.j(j4);
        } else {
            int l4 = interfaceC0947H.l(this.f9273u);
            int h4 = M0.a.h(j4);
            if (l4 > h4) {
                l4 = h4;
            }
            if (l4 >= 0) {
                i2 = l4;
            }
        }
        AbstractC0954O a4 = interfaceC0944E.a(u3.d.a(k4, i5, i2, M0.a.h(j4)));
        t4 = interfaceC0947H.t(a4.f9005d, a4.f9006e, C1412P.c(), new P0.n(a4, 8));
        return t4;
    }
}
