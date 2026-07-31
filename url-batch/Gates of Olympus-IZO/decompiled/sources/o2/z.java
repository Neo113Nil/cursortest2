package o2;

import n2.InterfaceC0701g;

/* loaded from: classes.dex */
public final class z extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6743e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6744f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0701g f6745g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(InterfaceC0701g interfaceC0701g, P1.d dVar) {
        super(2, dVar);
        this.f6745g = interfaceC0701g;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        z zVar = new z(this.f6745g, dVar);
        zVar.f6744f = obj;
        return zVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((z) create(obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6743e;
        if (i3 == 0) {
            I2.l.Q(obj);
            Object obj2 = this.f6744f;
            this.f6743e = 1;
            if (this.f6745g.emit(obj2, this) == aVar) {
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
