package x;

import e2.InterfaceC0426e;
import n0.C0702C;
import q2.AbstractC0837y;
import q2.EnumC0836x;
import q2.InterfaceC0835w;

/* renamed from: x.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1183A extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f9930h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0702C f9931i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Z f9932j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ B.a0 f9933k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1183A(C0702C c0702c, Z z3, B.a0 a0Var, V1.d dVar) {
        super(2, dVar);
        this.f9931i = c0702c;
        this.f9932j = z3;
        this.f9933k = a0Var;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C1183A c1183a = (C1183A) o((V1.d) obj2, (InterfaceC0835w) obj);
        R1.y yVar = R1.y.f4171a;
        c1183a.q(yVar);
        return yVar;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C1183A c1183a = new C1183A(this.f9931i, this.f9932j, this.f9933k, dVar);
        c1183a.f9930h = obj;
        return c1183a;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        InterfaceC0835w interfaceC0835w = (InterfaceC0835w) this.f9930h;
        EnumC0836x enumC0836x = EnumC0836x.f7937g;
        C0702C c0702c = this.f9931i;
        AbstractC0837y.r(interfaceC0835w, null, enumC0836x, new C1211y(c0702c, this.f9932j, null), 1);
        AbstractC0837y.r(interfaceC0835w, null, enumC0836x, new C1212z(c0702c, this.f9933k, null), 1);
        return R1.y.f4171a;
    }
}
