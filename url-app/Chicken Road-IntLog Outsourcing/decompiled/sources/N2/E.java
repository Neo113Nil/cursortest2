package N2;

import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class E extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P.d f2052b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f2053c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(P.d dVar, long j2, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f2052b = dVar;
        this.f2053c = j2;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        E e3 = new E(this.f2052b, this.f2053c, interfaceC1218d);
        e3.f2051a = obj;
        return e3;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        E e3 = (E) create((P.b) obj, (InterfaceC1218d) obj2);
        f4.v vVar = f4.v.f5689a;
        e3.invokeSuspend(vVar);
        return vVar;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        e5.g.y(obj);
        ((P.b) this.f2051a).d(this.f2052b, new Long(this.f2053c));
        return f4.v.f5689a;
    }
}
