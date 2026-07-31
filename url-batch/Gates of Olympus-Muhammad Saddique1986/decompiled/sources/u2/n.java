package u2;

import e2.InterfaceC0427f;
import q2.AbstractC0837y;
import s2.EnumC0967a;
import t2.InterfaceC1053f;
import t2.InterfaceC1054g;

/* loaded from: classes.dex */
public final class n extends i {

    /* renamed from: h, reason: collision with root package name */
    public final X1.i f9711h;

    /* JADX WARN: Multi-variable type inference failed */
    public n(InterfaceC0427f interfaceC0427f, InterfaceC1053f interfaceC1053f, V1.i iVar, int i3, EnumC0967a enumC0967a) {
        super(i3, iVar, enumC0967a, interfaceC1053f);
        this.f9711h = (X1.i) interfaceC0427f;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X1.i, e2.f] */
    @Override // u2.AbstractC1155g
    public final AbstractC1155g g(V1.i iVar, int i3, EnumC0967a enumC0967a) {
        return new n(this.f9711h, this.f9697g, iVar, i3, enumC0967a);
    }

    @Override // u2.i
    public final Object j(InterfaceC1054g interfaceC1054g, V1.d dVar) {
        Object e3 = AbstractC0837y.e(new m(this, interfaceC1054g, null), dVar);
        return e3 == W1.a.f4608d ? e3 : R1.y.f4171a;
    }
}
