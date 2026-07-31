package r2;

import q2.EnumC3383a;
import s2.C3417h;
import s2.p;

/* loaded from: classes3.dex */
abstract /* synthetic */ class l {
    public static final InterfaceC3396f a(InterfaceC3396f interfaceC3396f, int i4, EnumC3383a enumC3383a) {
        if (i4 < 0 && i4 != -2 && i4 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i4).toString());
        }
        if (i4 == -1 && enumC3383a != EnumC3383a.f43420b) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i4 == -1) {
            enumC3383a = EnumC3383a.f43421c;
            i4 = 0;
        }
        int i5 = i4;
        EnumC3383a enumC3383a2 = enumC3383a;
        if (interfaceC3396f instanceof s2.p) {
            return p.a.a((s2.p) interfaceC3396f, null, i5, enumC3383a2, 1, null);
        }
        return new C3417h(interfaceC3396f, null, i5, enumC3383a2, 2, null);
    }

    public static /* synthetic */ InterfaceC3396f b(InterfaceC3396f interfaceC3396f, int i4, EnumC3383a enumC3383a, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = -2;
        }
        if ((i5 & 2) != 0) {
            enumC3383a = EnumC3383a.f43420b;
        }
        return AbstractC3398h.b(interfaceC3396f, i4, enumC3383a);
    }
}
