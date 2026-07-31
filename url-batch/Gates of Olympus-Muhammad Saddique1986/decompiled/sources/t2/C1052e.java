package t2;

import F.C0090d0;
import u2.AbstractC1151c;

/* renamed from: t2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1052e implements InterfaceC1053f {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1053f f9018d;

    public C1052e(InterfaceC1053f interfaceC1053f) {
        this.f9018d = interfaceC1053f;
    }

    @Override // t2.InterfaceC1053f
    public final Object d(InterfaceC1054g interfaceC1054g, V1.d dVar) {
        f2.u uVar = new f2.u();
        uVar.f5832d = AbstractC1151c.f9682b;
        Object d3 = this.f9018d.d(new C0090d0(this, uVar, interfaceC1054g, 2), dVar);
        return d3 == W1.a.f4608d ? d3 : R1.y.f4171a;
    }
}
