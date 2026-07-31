package o;

import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class b0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0 f6490f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f6491g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(g0 g0Var, long j3, P1.d dVar) {
        super(2, dVar);
        this.f6490f = g0Var;
        this.f6491g = j3;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new b0(this.f6490f, this.f6491g, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((b0) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6489e;
        if (i3 == 0) {
            I2.l.Q(obj);
            o0 o0Var = this.f6490f.f6516F;
            n.X x3 = n.X.f6037e;
            C0725a0 c0725a0 = new C0725a0(this.f6491g, null);
            this.f6489e = 1;
            if (o0Var.e(x3, c0725a0, this) == aVar) {
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
