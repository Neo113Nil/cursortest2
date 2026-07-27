package M;

import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* renamed from: M.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0088q extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f1743b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0088q(k0 k0Var, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f1743b = k0Var;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        C0088q c0088q = new C0088q(this.f1743b, interfaceC1218d);
        c0088q.f1742a = obj;
        return c0088q;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0088q) create((k0) obj, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        e5.g.y(obj);
        k0 k0Var = (k0) this.f1742a;
        return Boolean.valueOf((k0Var instanceof C0075d) && k0Var.f1717a <= this.f1743b.f1717a);
    }
}
