package N2;

import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class B extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P.d f2041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f2042c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(P.d dVar, double d6, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f2041b = dVar;
        this.f2042c = d6;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        B b6 = new B(this.f2041b, this.f2042c, interfaceC1218d);
        b6.f2040a = obj;
        return b6;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        B b6 = (B) create((P.b) obj, (InterfaceC1218d) obj2);
        f4.v vVar = f4.v.f5689a;
        b6.invokeSuspend(vVar);
        return vVar;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        e5.g.y(obj);
        ((P.b) this.f2040a).d(this.f2041b, new Double(this.f2042c));
        return f4.v.f5689a;
    }
}
