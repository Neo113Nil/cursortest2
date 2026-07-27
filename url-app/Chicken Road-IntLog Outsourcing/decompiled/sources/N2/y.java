package N2;

import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class y extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P.d f2152b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2153c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(P.d dVar, boolean z, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f2152b = dVar;
        this.f2153c = z;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        y yVar = new y(this.f2152b, this.f2153c, interfaceC1218d);
        yVar.f2151a = obj;
        return yVar;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        y yVar = (y) create((P.b) obj, (InterfaceC1218d) obj2);
        f4.v vVar = f4.v.f5689a;
        yVar.invokeSuspend(vVar);
        return vVar;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        e5.g.y(obj);
        ((P.b) this.f2151a).d(this.f2152b, Boolean.valueOf(this.f2153c));
        return f4.v.f5689a;
    }
}
