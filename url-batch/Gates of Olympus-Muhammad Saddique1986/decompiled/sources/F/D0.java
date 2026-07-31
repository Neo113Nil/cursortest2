package F;

import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import t0.AbstractC0993f;
import t0.InterfaceC0998k;
import t0.InterfaceC1009w;

/* loaded from: classes.dex */
public final class D0 extends U.p implements InterfaceC0998k, InterfaceC1009w {
    @Override // t0.InterfaceC1009w
    public final InterfaceC0886H g(InterfaceC0887I interfaceC0887I, InterfaceC0884F interfaceC0884F, long j3) {
        float f3 = 0;
        float u3 = O2.d.u(((O0.e) AbstractC0993f.i(this, AbstractC0121t0.f1816a)).f3731d, f3);
        AbstractC0893O b3 = interfaceC0884F.b(j3);
        boolean z3 = this.f4501p && !Float.isNaN(u3) && Float.compare(u3, f3) > 0;
        int l3 = Float.isNaN(u3) ? 0 : interfaceC0887I.l(u3);
        int max = z3 ? Math.max(b3.f8126d, l3) : b3.f8126d;
        int max2 = z3 ? Math.max(b3.f8127e, l3) : b3.f8127e;
        return interfaceC0887I.i0(max, max2, S1.v.f4321d, new C0(max, b3, max2));
    }
}
