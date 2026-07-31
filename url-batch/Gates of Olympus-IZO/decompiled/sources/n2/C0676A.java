package n2;

import m2.EnumC0626a;

/* renamed from: n2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0676A implements InterfaceC0690O, InterfaceC0700f, o2.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0719y f6272d;

    public C0676A(InterfaceC0719y interfaceC0719y) {
        this.f6272d = interfaceC0719y;
    }

    @Override // o2.p
    public final InterfaceC0700f b(P1.i iVar, int i3, EnumC0626a enumC0626a) {
        return (((i3 < 0 || i3 >= 2) && i3 != -2) || enumC0626a != EnumC0626a.f5930e) ? AbstractC0682G.k(this, iVar, i3, enumC0626a) : this;
    }

    @Override // n2.InterfaceC0700f
    public final Object collect(InterfaceC0701g interfaceC0701g, P1.d dVar) {
        ((C0692Q) this.f6272d).collect(interfaceC0701g, dVar);
        return Q1.a.f3113d;
    }

    @Override // n2.InterfaceC0690O
    public final Object getValue() {
        return ((C0692Q) this.f6272d).getValue();
    }
}
