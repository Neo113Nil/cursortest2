package I;

import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class R0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f2187e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f2188f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y1.e f2189g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0088c0 f2190h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(Y1.e eVar, InterfaceC0088c0 interfaceC0088c0, P1.d dVar) {
        super(2, dVar);
        this.f2189g = eVar;
        this.f2190h = interfaceC0088c0;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        R0 r02 = new R0(this.f2189g, this.f2190h, dVar);
        r02.f2188f = obj;
        return r02;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((R0) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f2187e;
        if (i3 == 0) {
            I2.l.Q(obj);
            C0112o0 c0112o0 = new C0112o0(this.f2190h, ((InterfaceC0550w) this.f2188f).u());
            this.f2187e = 1;
            if (this.f2189g.g(c0112o0, this) == aVar) {
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
