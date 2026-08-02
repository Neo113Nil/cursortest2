package x3;

import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import g3.EnumC0441a;

/* renamed from: x3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1552l extends d0 implements InterfaceC1551k {
    public final Object Q(h3.g gVar) {
        Object l4;
        while (true) {
            Object A4 = A();
            if (A4 instanceof InterfaceC1538M) {
                if (N(A4) >= 0) {
                    Z z = new Z(AbstractC0347t0.m(gVar), this);
                    z.r();
                    z.t(new C1530E(AbstractC1562w.f(this, false, new S(1, z), 3)));
                    l4 = z.q();
                    EnumC0441a enumC0441a = EnumC0441a.f9038a;
                    break;
                }
            } else {
                if (A4 instanceof C1554n) {
                    throw ((C1554n) A4).f16048a;
                }
                l4 = AbstractC1562w.l(A4);
            }
        }
        EnumC0441a enumC0441a2 = EnumC0441a.f9038a;
        return l4;
    }
}
