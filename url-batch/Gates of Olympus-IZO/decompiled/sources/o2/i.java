package o2;

import k2.AbstractC0552y;
import k2.C0545q;
import m2.EnumC0626a;
import n2.InterfaceC0700f;
import n2.InterfaceC0701g;

/* loaded from: classes.dex */
public abstract class i extends AbstractC0758g {

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0700f f6713g;

    public i(int i3, P1.i iVar, EnumC0626a enumC0626a, InterfaceC0700f interfaceC0700f) {
        super(iVar, i3, enumC0626a);
        this.f6713g = interfaceC0700f;
    }

    @Override // o2.AbstractC0758g, n2.InterfaceC0700f
    public final Object collect(InterfaceC0701g interfaceC0701g, P1.d dVar) {
        Object collect;
        L1.z zVar = L1.z.f2729a;
        if (this.f6708e == -3) {
            P1.i context = dVar.getContext();
            Boolean bool = Boolean.FALSE;
            C0545q c0545q = new C0545q(0);
            P1.i iVar = this.f6707d;
            P1.i o3 = !((Boolean) iVar.r(bool, c0545q)).booleanValue() ? context.o(iVar) : AbstractC0552y.g(context, iVar, false);
            if (Z1.i.a(o3, context)) {
                collect = i(interfaceC0701g, dVar);
                if (collect != Q1.a.f3113d) {
                    return zVar;
                }
            } else {
                P1.e eVar = P1.e.f3072d;
                if (Z1.i.a(o3.k(eVar), context.k(eVar))) {
                    P1.i context2 = dVar.getContext();
                    if (!(interfaceC0701g instanceof w) && !(interfaceC0701g instanceof r)) {
                        interfaceC0701g = new l.q(interfaceC0701g, context2);
                    }
                    collect = AbstractC0754c.a(o3, interfaceC0701g, p2.a.m(o3), new C0759h(this, null), dVar);
                    if (collect != Q1.a.f3113d) {
                        return zVar;
                    }
                }
            }
            return collect;
        }
        collect = super.collect(interfaceC0701g, dVar);
        if (collect != Q1.a.f3113d) {
            return zVar;
        }
        return collect;
    }

    @Override // o2.AbstractC0758g
    public final Object e(m2.r rVar, C0757f c0757f) {
        Object i3 = i(new w(rVar), c0757f);
        return i3 == Q1.a.f3113d ? i3 : L1.z.f2729a;
    }

    public abstract Object i(InterfaceC0701g interfaceC0701g, P1.d dVar);

    @Override // o2.AbstractC0758g
    public final String toString() {
        return this.f6713g + " -> " + super.toString();
    }
}
