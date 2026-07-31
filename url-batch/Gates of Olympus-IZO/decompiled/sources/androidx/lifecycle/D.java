package androidx.lifecycle;

import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class D extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f3946e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f3947f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y1.e f3948g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Y1.e eVar, P1.d dVar) {
        super(2, dVar);
        this.f3948g = eVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        D d3 = new D(this.f3948g, dVar);
        d3.f3947f = obj;
        return d3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((D) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f3946e;
        if (i3 == 0) {
            I2.l.Q(obj);
            InterfaceC0550w interfaceC0550w = (InterfaceC0550w) this.f3947f;
            this.f3946e = 1;
            if (this.f3948g.g(interfaceC0550w, this) == aVar) {
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
