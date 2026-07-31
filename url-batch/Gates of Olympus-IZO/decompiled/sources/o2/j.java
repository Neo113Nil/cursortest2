package o2;

import m2.EnumC0626a;
import n2.InterfaceC0700f;
import n2.InterfaceC0701g;

/* loaded from: classes.dex */
public final class j extends i {
    @Override // o2.AbstractC0758g
    public final AbstractC0758g f(P1.i iVar, int i3, EnumC0626a enumC0626a) {
        return new j(i3, iVar, enumC0626a, this.f6713g);
    }

    @Override // o2.AbstractC0758g
    public final InterfaceC0700f g() {
        return this.f6713g;
    }

    @Override // o2.i
    public final Object i(InterfaceC0701g interfaceC0701g, P1.d dVar) {
        Object collect = this.f6713g.collect(interfaceC0701g, dVar);
        return collect == Q1.a.f3113d ? collect : L1.z.f2729a;
    }
}
