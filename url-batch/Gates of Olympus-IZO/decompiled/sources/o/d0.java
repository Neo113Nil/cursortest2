package o;

import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class d0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6498e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0 f6499f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f6500g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g0 g0Var, long j3, P1.d dVar) {
        super(2, dVar);
        this.f6499f = g0Var;
        this.f6500g = j3;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new d0(this.f6499f, this.f6500g, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((d0) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6498e;
        if (i3 == 0) {
            I2.l.Q(obj);
            o0 o0Var = this.f6499f.f6516F;
            n.X x3 = n.X.f6037e;
            c0 c0Var = new c0(this.f6500g, null);
            this.f6498e = 1;
            if (o0Var.e(x3, c0Var, this) == aVar) {
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
