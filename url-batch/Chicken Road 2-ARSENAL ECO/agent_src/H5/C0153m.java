package H5;

import o5.InterfaceC0564d;
import p5.EnumC0580a;
import u0.AbstractC0676f;

/* renamed from: H5.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153m extends g0 implements InterfaceC0152l {
    public final Object T(InterfaceC0564d interfaceC0564d) {
        Object r6;
        while (true) {
            Object C6 = C();
            if (C6 instanceof U) {
                if (Q(C6) >= 0) {
                    c0 c0Var = new c0(AbstractC0676f.m(interfaceC0564d), this);
                    c0Var.r();
                    c0Var.t(new C0145e(1, G(false, true, new I(2, c0Var))));
                    r6 = c0Var.q();
                    EnumC0580a enumC0580a = EnumC0580a.f5697f;
                    break;
                }
            } else {
                if (C6 instanceof C0156p) {
                    throw ((C0156p) C6).f1093a;
                }
                r6 = AbstractC0165z.r(C6);
            }
        }
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        return r6;
    }

    public final boolean U(Object obj) {
        Object S3;
        do {
            S3 = S(C(), obj);
            if (S3 == AbstractC0165z.f1117d) {
                return false;
            }
            if (S3 == AbstractC0165z.f1118e) {
                return true;
            }
        } while (S3 == AbstractC0165z.f1119f);
        return true;
    }
}
