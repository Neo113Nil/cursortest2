package B3;

import c3.C0297i;
import f3.C0426d;
import f3.InterfaceC0425c;
import f3.InterfaceC0430h;
import g3.EnumC0441a;
import x3.AbstractC1562w;
import x3.C1556p;

/* loaded from: classes.dex */
public final class g extends e {

    /* renamed from: d, reason: collision with root package name */
    public final A3.d f235d;

    public g(A3.d dVar, InterfaceC0430h interfaceC0430h, int i4, z3.a aVar) {
        super(interfaceC0430h, i4, aVar);
        this.f235d = dVar;
    }

    @Override // B3.e
    public final Object a(z3.p pVar, InterfaceC0425c interfaceC0425c) {
        Object collect = this.f235d.collect(new q(pVar), interfaceC0425c);
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        C0297i c0297i = C0297i.f5732a;
        if (collect != enumC0441a) {
            collect = c0297i;
        }
        return collect == enumC0441a ? collect : c0297i;
    }

    @Override // B3.e, A3.d
    public final Object collect(A3.e eVar, InterfaceC0425c interfaceC0425c) {
        int i4 = this.f230b;
        C0297i c0297i = C0297i.f5732a;
        if (i4 == -3) {
            InterfaceC0430h context = interfaceC0425c.getContext();
            Boolean bool = Boolean.FALSE;
            C1556p c1556p = C1556p.f16052g;
            InterfaceC0430h interfaceC0430h = this.f229a;
            InterfaceC0430h f4 = !((Boolean) interfaceC0430h.e(bool, c1556p)).booleanValue() ? context.f(interfaceC0430h) : AbstractC1562w.b(context, interfaceC0430h, false);
            if (kotlin.jvm.internal.i.a(f4, context)) {
                Object collect = this.f235d.collect(eVar, interfaceC0425c);
                EnumC0441a enumC0441a = EnumC0441a.f9038a;
                if (collect != enumC0441a) {
                    collect = c0297i;
                }
                if (collect == enumC0441a) {
                    return collect;
                }
            } else {
                C0426d c0426d = C0426d.f8816a;
                if (kotlin.jvm.internal.i.a(f4.n(c0426d), context.n(c0426d))) {
                    InterfaceC0430h context2 = interfaceC0425c.getContext();
                    if (!(eVar instanceof q)) {
                        eVar = new A3.m(eVar, context2);
                    }
                    Object b4 = k.b(f4, eVar, C3.a.k(f4), new f(this, null), interfaceC0425c);
                    if (b4 == EnumC0441a.f9038a) {
                        return b4;
                    }
                }
            }
        }
        Object collect2 = super.collect(eVar, interfaceC0425c);
        return collect2 == EnumC0441a.f9038a ? collect2 : c0297i;
    }

    @Override // B3.e
    public final String toString() {
        return this.f235d + " -> " + super.toString();
    }
}
