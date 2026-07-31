package r;

import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import t0.InterfaceC1009w;

/* renamed from: r.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0851M extends U.p implements InterfaceC1009w {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0849K f7983q;

    @Override // t0.InterfaceC1009w
    public final InterfaceC0886H g(InterfaceC0887I interfaceC0887I, InterfaceC0884F interfaceC0884F, long j3) {
        float f3 = 0;
        if (Float.compare(this.f7983q.b(interfaceC0887I.getLayoutDirection()), f3) < 0 || Float.compare(this.f7983q.d(), f3) < 0 || Float.compare(this.f7983q.a(interfaceC0887I.getLayoutDirection()), f3) < 0 || Float.compare(this.f7983q.c(), f3) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int l3 = interfaceC0887I.l(this.f7983q.a(interfaceC0887I.getLayoutDirection())) + interfaceC0887I.l(this.f7983q.b(interfaceC0887I.getLayoutDirection()));
        int l4 = interfaceC0887I.l(this.f7983q.c()) + interfaceC0887I.l(this.f7983q.d());
        AbstractC0893O b3 = interfaceC0884F.b(O2.d.Y(-l3, -l4, j3));
        return interfaceC0887I.i0(O2.d.D(j3, b3.f8126d + l3), O2.d.C(j3, b3.f8127e + l4), S1.v.f4321d, new R.h(b3, interfaceC0887I, this, 9));
    }
}
