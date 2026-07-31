package x;

import e2.InterfaceC0426e;
import n0.C0702C;
import q2.AbstractC0837y;
import q2.EnumC0836x;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class U extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f10006h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0702C f10007i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Z f10008j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(C0702C c0702c, Z z3, V1.d dVar) {
        super(2, dVar);
        this.f10007i = c0702c;
        this.f10008j = z3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((U) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        U u3 = new U(this.f10007i, this.f10008j, dVar);
        u3.f10006h = obj;
        return u3;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        InterfaceC0835w interfaceC0835w = (InterfaceC0835w) this.f10006h;
        EnumC0836x enumC0836x = EnumC0836x.f7937g;
        C0702C c0702c = this.f10007i;
        Z z3 = this.f10008j;
        AbstractC0837y.r(interfaceC0835w, null, enumC0836x, new S(c0702c, z3, null), 1);
        return AbstractC0837y.r(interfaceC0835w, null, enumC0836x, new T(c0702c, z3, null), 1);
    }
}
