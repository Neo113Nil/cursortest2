package H4;

import D4.AbstractC0024y;
import k4.C1219e;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public abstract class h extends f {

    /* renamed from: d, reason: collision with root package name */
    public final G4.d f1178d;

    public h(G4.d dVar, InterfaceC1223i interfaceC1223i, int i2, int i3) {
        super(interfaceC1223i, i2, i3);
        this.f1178d = dVar;
    }

    @Override // H4.f
    public final Object b(F4.q qVar, InterfaceC1218d interfaceC1218d) {
        Object d6 = d(new z(qVar), interfaceC1218d);
        return d6 == EnumC1260a.f11058a ? d6 : f4.v.f5689a;
    }

    public abstract Object d(G4.e eVar, InterfaceC1218d interfaceC1218d);

    @Override // H4.f, G4.d
    public final Object i(G4.e eVar, InterfaceC1218d interfaceC1218d) {
        Object i2;
        f4.v vVar = f4.v.f5689a;
        if (this.f1173b == -3) {
            InterfaceC1223i context = interfaceC1218d.getContext();
            Boolean bool = Boolean.FALSE;
            D4.r rVar = D4.r.f531g;
            InterfaceC1223i interfaceC1223i = this.f1172a;
            InterfaceC1223i A5 = !((Boolean) interfaceC1223i.q(bool, rVar)).booleanValue() ? context.A(interfaceC1223i) : AbstractC0024y.f(context, interfaceC1223i, false);
            if (kotlin.jvm.internal.i.a(A5, context)) {
                i2 = d(eVar, interfaceC1218d);
                if (i2 != EnumC1260a.f11058a) {
                    return vVar;
                }
            } else {
                C1219e c1219e = C1219e.f10719a;
                if (kotlin.jvm.internal.i.a(A5.o(c1219e), context.o(c1219e))) {
                    InterfaceC1223i context2 = interfaceC1218d.getContext();
                    if (!(eVar instanceof z ? true : eVar instanceof s)) {
                        eVar = new G4.l(eVar, context2);
                    }
                    i2 = t.b(A5, eVar, I4.a.m(A5), new g(this, null), interfaceC1218d);
                    EnumC1260a enumC1260a = EnumC1260a.f11058a;
                    if (i2 != enumC1260a) {
                        i2 = vVar;
                    }
                    if (i2 != enumC1260a) {
                        return vVar;
                    }
                }
            }
            return i2;
        }
        i2 = super.i(eVar, interfaceC1218d);
        if (i2 != EnumC1260a.f11058a) {
            return vVar;
        }
        return i2;
    }

    @Override // H4.f
    public final String toString() {
        return this.f1178d + " -> " + super.toString();
    }
}
