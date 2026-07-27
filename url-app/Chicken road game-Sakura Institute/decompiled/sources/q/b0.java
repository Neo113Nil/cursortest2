package q;

import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import r0.InterfaceC1081w;
import z2.C1412P;

/* loaded from: classes.dex */
public final class b0 extends S.n implements InterfaceC1081w {

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC1021Z f9239t;

    @Override // r0.InterfaceC1081w
    public final InterfaceC0946G i(InterfaceC0947H interfaceC0947H, InterfaceC0944E interfaceC0944E, long j4) {
        InterfaceC0946G t4;
        float f4 = 0;
        if (Float.compare(this.f9239t.b(interfaceC0947H.getLayoutDirection()), f4) < 0 || Float.compare(this.f9239t.d(), f4) < 0 || Float.compare(this.f9239t.a(interfaceC0947H.getLayoutDirection()), f4) < 0 || Float.compare(this.f9239t.c(), f4) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int l4 = interfaceC0947H.l(this.f9239t.a(interfaceC0947H.getLayoutDirection())) + interfaceC0947H.l(this.f9239t.b(interfaceC0947H.getLayoutDirection()));
        int l5 = interfaceC0947H.l(this.f9239t.c()) + interfaceC0947H.l(this.f9239t.d());
        AbstractC0954O a4 = interfaceC0944E.a(u3.d.Q(-l4, -l5, j4));
        t4 = interfaceC0947H.t(u3.d.s(j4, a4.f9005d + l4), u3.d.r(j4, a4.f9006e + l5), C1412P.c(), new P.h(a4, interfaceC0947H, this, 10));
        return t4;
    }
}
