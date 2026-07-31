package o;

import k2.AbstractC0552y;

/* loaded from: classes.dex */
public final class k0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public o0 f6559e;

    /* renamed from: f, reason: collision with root package name */
    public Z1.s f6560f;

    /* renamed from: g, reason: collision with root package name */
    public long f6561g;

    /* renamed from: h, reason: collision with root package name */
    public int f6562h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6563i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o0 f6564j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Z1.s f6565k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f6566l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(o0 o0Var, Z1.s sVar, long j3, P1.d dVar) {
        super(2, dVar);
        this.f6564j = o0Var;
        this.f6565k = sVar;
        this.f6566l = j3;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        k0 k0Var = new k0(this.f6564j, this.f6565k, this.f6566l, dVar);
        k0Var.f6563i = obj;
        return k0Var;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((k0) create((l0) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        o0 o0Var;
        Z1.s sVar;
        long j3;
        o0 o0Var2;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6562h;
        J j4 = J.f6444e;
        if (i3 == 0) {
            I2.l.Q(obj);
            l0 l0Var = (l0) this.f6563i;
            o0Var = this.f6564j;
            j0 j0Var = new j0(o0Var, l0Var);
            C0737m c0737m = o0Var.f6594c;
            sVar = this.f6565k;
            long j5 = sVar.f3479d;
            J j6 = o0Var.f6595d;
            long j7 = this.f6566l;
            float c3 = o0Var.c(j6 == j4 ? M0.n.b(j7) : M0.n.c(j7));
            this.f6563i = o0Var;
            this.f6559e = o0Var;
            this.f6560f = sVar;
            this.f6561g = j5;
            this.f6562h = 1;
            c0737m.getClass();
            obj = AbstractC0552y.y(c0737m.f6575b, new C0736l(c3, c0737m, j0Var, null), this);
            if (obj == aVar) {
                return aVar;
            }
            j3 = j5;
            o0Var2 = o0Var;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = this.f6561g;
            sVar = this.f6560f;
            o0Var = this.f6559e;
            o0Var2 = (o0) this.f6563i;
            I2.l.Q(obj);
        }
        float c4 = o0Var2.c(((Number) obj).floatValue());
        sVar.f3479d = o0Var.f6595d == j4 ? M0.n.a(j3, c4, 0.0f, 2) : M0.n.a(j3, 0.0f, c4, 1);
        return L1.z.f2729a;
    }
}
