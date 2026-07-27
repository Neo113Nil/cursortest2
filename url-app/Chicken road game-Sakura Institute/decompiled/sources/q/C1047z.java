package q;

import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import r0.InterfaceC1081w;
import z2.C1412P;

/* renamed from: q.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1047z extends S.n implements InterfaceC1081w {

    /* renamed from: t, reason: collision with root package name */
    public int f9350t;

    /* renamed from: u, reason: collision with root package name */
    public float f9351u;

    @Override // r0.InterfaceC1081w
    public final InterfaceC0946G i(InterfaceC0947H interfaceC0947H, InterfaceC0944E interfaceC0944E, long j4) {
        int k4;
        int i2;
        int h4;
        int i4;
        InterfaceC0946G t4;
        if (!M0.a.e(j4) || this.f9350t == 1) {
            k4 = M0.a.k(j4);
            i2 = M0.a.i(j4);
        } else {
            k4 = kotlin.ranges.b.e(Math.round(M0.a.i(j4) * this.f9351u), M0.a.k(j4), M0.a.i(j4));
            i2 = k4;
        }
        if (!M0.a.d(j4) || this.f9350t == 2) {
            int j5 = M0.a.j(j4);
            h4 = M0.a.h(j4);
            i4 = j5;
        } else {
            i4 = kotlin.ranges.b.e(Math.round(M0.a.h(j4) * this.f9351u), M0.a.j(j4), M0.a.h(j4));
            h4 = i4;
        }
        AbstractC0954O a4 = interfaceC0944E.a(u3.d.a(k4, i2, i4, h4));
        t4 = interfaceC0947H.t(a4.f9005d, a4.f9006e, C1412P.c(), new P0.n(a4, 5));
        return t4;
    }
}
