package r;

import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import t0.InterfaceC1009w;

/* loaded from: classes.dex */
public final class V extends U.p implements InterfaceC1009w {

    /* renamed from: q, reason: collision with root package name */
    public float f7998q;

    /* renamed from: r, reason: collision with root package name */
    public float f7999r;

    @Override // t0.InterfaceC1009w
    public final int b(t0.P p3, InterfaceC0884F interfaceC0884F, int i3) {
        int U3 = interfaceC0884F.U(i3);
        int l3 = !O0.e.a(this.f7998q, Float.NaN) ? p3.l(this.f7998q) : 0;
        return U3 < l3 ? l3 : U3;
    }

    @Override // t0.InterfaceC1009w
    public final int c(t0.P p3, InterfaceC0884F interfaceC0884F, int i3) {
        int V2 = interfaceC0884F.V(i3);
        int l3 = !O0.e.a(this.f7999r, Float.NaN) ? p3.l(this.f7999r) : 0;
        return V2 < l3 ? l3 : V2;
    }

    @Override // t0.InterfaceC1009w
    public final int e(t0.P p3, InterfaceC0884F interfaceC0884F, int i3) {
        int O3 = interfaceC0884F.O(i3);
        int l3 = !O0.e.a(this.f7998q, Float.NaN) ? p3.l(this.f7998q) : 0;
        return O3 < l3 ? l3 : O3;
    }

    @Override // t0.InterfaceC1009w
    public final int f(t0.P p3, InterfaceC0884F interfaceC0884F, int i3) {
        int c2 = interfaceC0884F.c(i3);
        int l3 = !O0.e.a(this.f7999r, Float.NaN) ? p3.l(this.f7999r) : 0;
        return c2 < l3 ? l3 : c2;
    }

    @Override // t0.InterfaceC1009w
    public final InterfaceC0886H g(InterfaceC0887I interfaceC0887I, InterfaceC0884F interfaceC0884F, long j3) {
        int j4;
        int i3 = 0;
        if (O0.e.a(this.f7998q, Float.NaN) || O0.a.j(j3) != 0) {
            j4 = O0.a.j(j3);
        } else {
            j4 = interfaceC0887I.l(this.f7998q);
            int h3 = O0.a.h(j3);
            if (j4 > h3) {
                j4 = h3;
            }
            if (j4 < 0) {
                j4 = 0;
            }
        }
        int h4 = O0.a.h(j3);
        if (O0.e.a(this.f7999r, Float.NaN) || O0.a.i(j3) != 0) {
            i3 = O0.a.i(j3);
        } else {
            int l3 = interfaceC0887I.l(this.f7999r);
            int g3 = O0.a.g(j3);
            if (l3 > g3) {
                l3 = g3;
            }
            if (l3 >= 0) {
                i3 = l3;
            }
        }
        AbstractC0893O b3 = interfaceC0884F.b(O2.d.a(j4, h4, i3, O0.a.g(j3)));
        return interfaceC0887I.i0(b3.f8126d, b3.f8127e, S1.v.f4321d, new A.i(b3, 10));
    }
}
