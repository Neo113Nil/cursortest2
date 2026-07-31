package o2;

import k2.AbstractC0552y;
import m2.EnumC0626a;
import n2.InterfaceC0700f;
import n2.InterfaceC0701g;

/* loaded from: classes.dex */
public final class n extends i {

    /* renamed from: h, reason: collision with root package name */
    public final R1.i f6727h;

    /* JADX WARN: Multi-variable type inference failed */
    public n(Y1.f fVar, InterfaceC0700f interfaceC0700f, P1.i iVar, int i3, EnumC0626a enumC0626a) {
        super(i3, iVar, enumC0626a, interfaceC0700f);
        this.f6727h = (R1.i) fVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [R1.i, Y1.f] */
    @Override // o2.AbstractC0758g
    public final AbstractC0758g f(P1.i iVar, int i3, EnumC0626a enumC0626a) {
        return new n(this.f6727h, this.f6713g, iVar, i3, enumC0626a);
    }

    @Override // o2.i
    public final Object i(InterfaceC0701g interfaceC0701g, P1.d dVar) {
        Object d3 = AbstractC0552y.d(new m(this, interfaceC0701g, null), dVar);
        return d3 == Q1.a.f3113d ? d3 : L1.z.f2729a;
    }
}
