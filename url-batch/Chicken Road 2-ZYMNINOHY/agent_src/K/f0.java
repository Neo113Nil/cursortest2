package K;

import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;

/* loaded from: classes.dex */
public final class f0 extends h3.g implements o3.p {
    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        return new f0(2, interfaceC0425c);
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) create((A3.e) obj, (InterfaceC0425c) obj2);
        C0297i c0297i = C0297i.f5732a;
        f0Var.invokeSuspend(c0297i);
        return c0297i;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        O3.l.w(obj);
        return C0297i.f5732a;
    }
}
