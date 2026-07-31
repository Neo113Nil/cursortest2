package L1;

import e2.InterfaceC0426e;
import l1.C0593b;
import l1.C0595d;

/* loaded from: classes.dex */
public final class u extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3390h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A f3391i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(A a3, V1.d dVar) {
        super(2, dVar);
        this.f3391i = a3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        u uVar = (u) o((V1.d) obj2, (C0593b) obj);
        R1.y yVar = R1.y.f4171a;
        uVar.q(yVar);
        return yVar;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        u uVar = new u(this.f3391i, dVar);
        uVar.f3390h = obj;
        return uVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        C0593b c0593b = (C0593b) this.f3390h;
        A a3 = this.f3391i;
        Boolean bool = Boolean.TRUE;
        c0593b.getClass();
        C0595d c0595d = a3.f3346d;
        f2.j.f(c0595d, "key");
        c0593b.c(c0595d, bool);
        return R1.y.f4171a;
    }
}
