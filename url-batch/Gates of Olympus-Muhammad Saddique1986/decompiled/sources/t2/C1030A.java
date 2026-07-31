package t2;

import s2.EnumC0967a;

/* renamed from: t2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1030A implements InterfaceC1043N, InterfaceC1053f, u2.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1072y f8956d;

    public C1030A(InterfaceC1072y interfaceC1072y) {
        this.f8956d = interfaceC1072y;
    }

    @Override // u2.v
    public final InterfaceC1053f b(V1.i iVar, int i3, EnumC0967a enumC0967a) {
        return (((i3 < 0 || i3 >= 2) && i3 != -2) || enumC0967a != EnumC0967a.f8360e) ? AbstractC1035F.l(this, iVar, i3, enumC0967a) : this;
    }

    @Override // t2.InterfaceC1053f
    public final Object d(InterfaceC1054g interfaceC1054g, V1.d dVar) {
        ((C1045P) this.f8956d).d(interfaceC1054g, dVar);
        return W1.a.f4608d;
    }

    @Override // t2.InterfaceC1043N
    public final Object getValue() {
        return ((C1045P) this.f8956d).getValue();
    }
}
