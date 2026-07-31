package u;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u0 extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7099h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0 f7100j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ long f7101k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(x0 x0Var, long j7, g6.c cVar, int i) {
        super(2, cVar);
        this.f7099h = i;
        this.f7100j = x0Var;
        this.f7101k = j7;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f7099h) {
            case 0:
                return ((u0) l((g6.c) obj2, (a7.u) obj)).p(c6.m.f1757a);
            case 1:
                return ((u0) l((g6.c) obj2, (a7.u) obj)).p(c6.m.f1757a);
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return ((u0) l((g6.c) obj2, (a7.u) obj)).p(c6.m.f1757a);
            default:
                long j7 = ((e1.b) obj).f2455a;
                u0 u0Var = new u0(this.f7100j, (g6.c) obj2);
                u0Var.f7101k = j7;
                return u0Var.p(c6.m.f1757a);
        }
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f7099h) {
            case 0:
                return new u0(this.f7100j, this.f7101k, cVar, 0);
            case 1:
                return new u0(this.f7100j, this.f7101k, cVar, 1);
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return new u0(this.f7100j, this.f7101k, cVar, 2);
            default:
                u0 u0Var = new u0(this.f7100j, cVar);
                u0Var.f7101k = ((e1.b) obj).f2455a;
                return u0Var;
        }
    }

    @Override // i6.a
    public final Object p(Object obj) {
        switch (this.f7099h) {
            case 0:
                int i = this.i;
                if (i == 0) {
                    s6.a.K(obj);
                    e1 e1Var = this.f7100j.H;
                    long j7 = this.f7101k;
                    this.i = 1;
                    Object b8 = e1Var.b(j7, false, this);
                    h6.a aVar = h6.a.f3204d;
                    if (b8 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return c6.m.f1757a;
            case 1:
                int i8 = this.i;
                if (i8 == 0) {
                    s6.a.K(obj);
                    e1 e1Var2 = this.f7100j.H;
                    v0 v0Var = new v0(this.f7101k, null);
                    this.i = 1;
                    Object f6 = e1Var2.f(t.j0.f6795e, v0Var, this);
                    h6.a aVar2 = h6.a.f3204d;
                    if (f6 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return c6.m.f1757a;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                int i9 = this.i;
                if (i9 == 0) {
                    s6.a.K(obj);
                    e1 e1Var3 = this.f7100j.H;
                    long j8 = this.f7101k;
                    this.i = 1;
                    Object b9 = e1Var3.b(j8, true, this);
                    h6.a aVar3 = h6.a.f3204d;
                    if (b9 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return c6.m.f1757a;
            default:
                int i10 = this.i;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                    return obj;
                }
                s6.a.K(obj);
                long j9 = this.f7101k;
                e1 e1Var4 = this.f7100j.H;
                this.i = 1;
                Object a8 = r0.a(e1Var4, j9, this);
                h6.a aVar4 = h6.a.f3204d;
                return a8 == aVar4 ? aVar4 : a8;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(x0 x0Var, g6.c cVar) {
        super(2, cVar);
        this.f7099h = 3;
        this.f7100j = x0Var;
    }
}
