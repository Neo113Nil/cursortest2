package p;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class B0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ T f7485h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(T t3, V1.d dVar) {
        super(2, dVar);
        this.f7485h = t3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        B0 b02 = (B0) o((V1.d) obj2, (InterfaceC0835w) obj);
        R1.y yVar = R1.y.f4171a;
        b02.q(yVar);
        return yVar;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new B0(this.f7485h, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        T t3 = this.f7485h;
        t3.f7607f = true;
        t3.f7608g.e(null);
        return R1.y.f4171a;
    }
}
