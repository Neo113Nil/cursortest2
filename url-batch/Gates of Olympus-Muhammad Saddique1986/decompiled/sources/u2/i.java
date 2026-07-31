package u2;

import F.C0090d0;
import q2.AbstractC0837y;
import q2.C0830q;
import s2.EnumC0967a;
import t2.InterfaceC1053f;
import t2.InterfaceC1054g;

/* loaded from: classes.dex */
public abstract class i extends AbstractC1155g {

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1053f f9697g;

    public i(int i3, V1.i iVar, EnumC0967a enumC0967a, InterfaceC1053f interfaceC1053f) {
        super(iVar, i3, enumC0967a);
        this.f9697g = interfaceC1053f;
    }

    @Override // u2.AbstractC1155g, t2.InterfaceC1053f
    public final Object d(InterfaceC1054g interfaceC1054g, V1.d dVar) {
        Object d3;
        R1.y yVar = R1.y.f4171a;
        int i3 = this.f9692e;
        W1.a aVar = W1.a.f4608d;
        if (i3 == -3) {
            V1.i t3 = dVar.t();
            Boolean bool = Boolean.FALSE;
            C0830q c0830q = new C0830q(0);
            V1.i iVar = this.f9691d;
            V1.i d4 = !((Boolean) iVar.e(bool, c0830q)).booleanValue() ? t3.d(iVar) : AbstractC0837y.h(t3, iVar, false);
            if (f2.j.a(d4, t3)) {
                d3 = j(interfaceC1054g, dVar);
                if (d3 != aVar) {
                    return yVar;
                }
            } else {
                V1.e eVar = V1.e.f4557d;
                if (f2.j.a(d4.v(eVar), t3.v(eVar))) {
                    V1.i t4 = dVar.t();
                    if (!(interfaceC1054g instanceof C1145C) && !(interfaceC1054g instanceof x)) {
                        interfaceC1054g = new C0090d0(interfaceC1054g, t4);
                    }
                    d3 = AbstractC1151c.a(d4, interfaceC1054g, v2.a.m(d4), new C1156h(this, null), dVar);
                    if (d3 != aVar) {
                        return yVar;
                    }
                }
            }
            return d3;
        }
        d3 = super.d(interfaceC1054g, dVar);
        if (d3 != aVar) {
            return yVar;
        }
        return d3;
    }

    @Override // u2.AbstractC1155g
    public final Object f(s2.t tVar, C1154f c1154f) {
        Object j3 = j(new C1145C(tVar), c1154f);
        return j3 == W1.a.f4608d ? j3 : R1.y.f4171a;
    }

    public abstract Object j(InterfaceC1054g interfaceC1054g, V1.d dVar);

    @Override // u2.AbstractC1155g
    public final String toString() {
        return this.f9697g + " -> " + super.toString();
    }
}
