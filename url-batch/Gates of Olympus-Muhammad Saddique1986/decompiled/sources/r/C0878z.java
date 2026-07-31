package r;

import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import t0.InterfaceC1009w;

/* renamed from: r.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0878z extends U.p implements InterfaceC1009w {

    /* renamed from: q, reason: collision with root package name */
    public int f8096q;

    /* renamed from: r, reason: collision with root package name */
    public float f8097r;

    @Override // t0.InterfaceC1009w
    public final InterfaceC0886H g(InterfaceC0887I interfaceC0887I, InterfaceC0884F interfaceC0884F, long j3) {
        int j4;
        int h3;
        int g3;
        int i3;
        if (!O0.a.d(j3) || this.f8096q == 1) {
            j4 = O0.a.j(j3);
            h3 = O0.a.h(j3);
        } else {
            j4 = O2.d.y(Math.round(O0.a.h(j3) * this.f8097r), O0.a.j(j3), O0.a.h(j3));
            h3 = j4;
        }
        if (!O0.a.c(j3) || this.f8096q == 2) {
            int i4 = O0.a.i(j3);
            g3 = O0.a.g(j3);
            i3 = i4;
        } else {
            i3 = O2.d.y(Math.round(O0.a.g(j3) * this.f8097r), O0.a.i(j3), O0.a.g(j3));
            g3 = i3;
        }
        AbstractC0893O b3 = interfaceC0884F.b(O2.d.a(j4, h3, i3, g3));
        return interfaceC0887I.i0(b3.f8126d, b3.f8127e, S1.v.f4321d, new A.i(b3, 7));
    }
}
