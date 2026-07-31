package I;

import k2.InterfaceC0550w;

/* renamed from: I.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0127w0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f2391e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f2392f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0133z0 f2393g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y f2394h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0127w0(C0133z0 c0133z0, Y y3, P1.d dVar) {
        super(2, dVar);
        this.f2393g = c0133z0;
        this.f2394h = y3;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0127w0 c0127w0 = new C0127w0(this.f2393g, this.f2394h, dVar);
        c0127w0.f2392f = obj;
        return c0127w0;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0127w0) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f2391e;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
            return L1.z.f2729a;
        }
        I2.l.Q(obj);
        InterfaceC0550w interfaceC0550w = (InterfaceC0550w) this.f2392f;
        this.f2391e = 1;
        this.f2393g.f(interfaceC0550w, this.f2394h, this);
        return aVar;
    }
}
