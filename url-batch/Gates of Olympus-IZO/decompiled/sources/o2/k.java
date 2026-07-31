package o2;

import k2.InterfaceC0550w;
import n2.InterfaceC0701g;

/* loaded from: classes.dex */
public final class k extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6714e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f6715f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0701g f6716g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6717h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, InterfaceC0701g interfaceC0701g, Object obj, P1.d dVar) {
        super(2, dVar);
        this.f6715f = nVar;
        this.f6716g = interfaceC0701g;
        this.f6717h = obj;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new k(this.f6715f, this.f6716g, this.f6717h, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((k) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [R1.i, Y1.f] */
    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6714e;
        if (i3 == 0) {
            I2.l.Q(obj);
            ?? r4 = this.f6715f.f6727h;
            this.f6714e = 1;
            if (r4.f(this.f6716g, this.f6717h, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return L1.z.f2729a;
    }
}
