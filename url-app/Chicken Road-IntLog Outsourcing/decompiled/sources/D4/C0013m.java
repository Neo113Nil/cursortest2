package D4;

import k4.InterfaceC1218d;
import l4.EnumC1260a;

/* renamed from: D4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0013m extends g0 implements InterfaceC0012l {
    public final Object W(InterfaceC1218d interfaceC1218d) {
        Object u5;
        while (true) {
            Object D5 = D();
            if (D5 instanceof U) {
                if (T(D5) >= 0) {
                    c0 c0Var = new c0(B0.f.F(interfaceC1218d), this);
                    c0Var.s();
                    c0Var.u(new C0005e(1, H(false, true, new H(2, c0Var))));
                    u5 = c0Var.r();
                    EnumC1260a enumC1260a = EnumC1260a.f11058a;
                    break;
                }
            } else {
                if (D5 instanceof C0016p) {
                    throw ((C0016p) D5).f526a;
                }
                u5 = AbstractC0024y.u(D5);
            }
        }
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        return u5;
    }
}
