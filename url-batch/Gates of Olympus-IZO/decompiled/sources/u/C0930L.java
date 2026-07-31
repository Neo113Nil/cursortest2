package u;

import k2.InterfaceC0550w;

/* renamed from: u.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0930L extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f8017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0931M f8018f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8019g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0930L(C0931M c0931m, int i3, P1.d dVar) {
        super(2, dVar);
        this.f8018f = c0931m;
        this.f8019g = i3;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0930L(this.f8018f, this.f8019g, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0930L) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f8017e;
        if (i3 == 0) {
            I2.l.Q(obj);
            InterfaceC0927I interfaceC0927I = this.f8018f.f8021r;
            this.f8017e = 1;
            if (interfaceC0927I.f(this.f8019g, this) == aVar) {
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
