package o;

/* loaded from: classes.dex */
public final class f0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6509e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ long f6510f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g0 f6511g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, P1.d dVar) {
        super(2, dVar);
        this.f6511g = g0Var;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        f0 f0Var = new f0(this.f6511g, dVar);
        f0Var.f6510f = ((a0.c) obj).f3489a;
        return f0Var;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        long j3 = ((a0.c) obj).f3489a;
        f0 f0Var = new f0(this.f6511g, (P1.d) obj2);
        f0Var.f6510f = j3;
        return f0Var.invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6509e;
        if (i3 == 0) {
            I2.l.Q(obj);
            long j3 = this.f6510f;
            o0 o0Var = this.f6511g.f6516F;
            this.f6509e = 1;
            obj = androidx.compose.foundation.gestures.a.a(o0Var, j3, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return obj;
    }
}
