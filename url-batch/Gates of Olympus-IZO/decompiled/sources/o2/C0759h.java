package o2;

import n2.InterfaceC0701g;

/* renamed from: o2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0759h extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6710e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6711f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f6712g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0759h(i iVar, P1.d dVar) {
        super(2, dVar);
        this.f6712g = iVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0759h c0759h = new C0759h(this.f6712g, dVar);
        c0759h.f6711f = obj;
        return c0759h;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0759h) create((InterfaceC0701g) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6710e;
        if (i3 == 0) {
            I2.l.Q(obj);
            InterfaceC0701g interfaceC0701g = (InterfaceC0701g) this.f6711f;
            this.f6710e = 1;
            if (this.f6712g.i(interfaceC0701g, this) == aVar) {
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
