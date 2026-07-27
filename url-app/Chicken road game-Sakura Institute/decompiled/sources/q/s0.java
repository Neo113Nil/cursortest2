package q;

import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import r0.InterfaceC1081w;
import z2.C1412P;

/* loaded from: classes.dex */
public final class s0 extends S.n implements InterfaceC1081w {

    /* renamed from: t, reason: collision with root package name */
    public int f9339t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9340u;

    /* renamed from: v, reason: collision with root package name */
    public M2.p f9341v;

    @Override // r0.InterfaceC1081w
    public final InterfaceC0946G i(InterfaceC0947H interfaceC0947H, InterfaceC0944E interfaceC0944E, long j4) {
        InterfaceC0946G t4;
        AbstractC0954O a4 = interfaceC0944E.a(u3.d.a(this.f9339t != 1 ? 0 : M0.a.k(j4), (this.f9339t == 1 || !this.f9340u) ? M0.a.i(j4) : Integer.MAX_VALUE, this.f9339t == 2 ? M0.a.j(j4) : 0, (this.f9339t == 2 || !this.f9340u) ? M0.a.h(j4) : Integer.MAX_VALUE));
        int e4 = kotlin.ranges.b.e(a4.f9005d, M0.a.k(j4), M0.a.i(j4));
        int e5 = kotlin.ranges.b.e(a4.f9006e, M0.a.j(j4), M0.a.h(j4));
        t4 = interfaceC0947H.t(e4, e5, C1412P.c(), new r0(this, e4, a4, e5, interfaceC0947H));
        return t4;
    }
}
