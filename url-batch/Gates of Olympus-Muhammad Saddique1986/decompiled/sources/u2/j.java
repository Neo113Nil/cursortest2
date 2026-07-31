package u2;

import s2.EnumC0967a;
import t2.InterfaceC1053f;
import t2.InterfaceC1054g;

/* loaded from: classes.dex */
public final class j extends i {
    @Override // u2.AbstractC1155g
    public final AbstractC1155g g(V1.i iVar, int i3, EnumC0967a enumC0967a) {
        return new j(i3, iVar, enumC0967a, this.f9697g);
    }

    @Override // u2.AbstractC1155g
    public final InterfaceC1053f h() {
        return this.f9697g;
    }

    @Override // u2.i
    public final Object j(InterfaceC1054g interfaceC1054g, V1.d dVar) {
        Object d3 = this.f9697g.d(interfaceC1054g, dVar);
        return d3 == W1.a.f4608d ? d3 : R1.y.f4171a;
    }
}
