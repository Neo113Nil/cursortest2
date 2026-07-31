package u;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b1 extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public e1 f6938h;
    public q6.r i;

    /* renamed from: j, reason: collision with root package name */
    public long f6939j;

    /* renamed from: k, reason: collision with root package name */
    public int f6940k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6941l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e1 f6942m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q6.r f6943n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f6944o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(e1 e1Var, q6.r rVar, long j7, g6.c cVar) {
        super(2, cVar);
        this.f6942m = e1Var;
        this.f6943n = rVar;
        this.f6944o = j7;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        return ((b1) l((g6.c) obj2, (c1) obj)).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        b1 b1Var = new b1(this.f6942m, this.f6943n, this.f6944o, cVar);
        b1Var.f6941l = obj;
        return b1Var;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        e1 e1Var;
        q6.r rVar;
        long j7;
        e1 e1Var2;
        int i = this.f6940k;
        j0 j0Var = j0.f7028e;
        if (i == 0) {
            s6.a.K(obj);
            c1 c1Var = (c1) this.f6941l;
            e1Var = this.f6942m;
            a1 a1Var = new a1(e1Var, c1Var);
            i iVar = e1Var.f6964c;
            q6.r rVar2 = this.f6943n;
            long j8 = rVar2.f6204d;
            j0 j0Var2 = e1Var.f6965d;
            long j9 = this.f6944o;
            float d8 = e1Var.d(j0Var2 == j0Var ? r2.q.b(j9) : r2.q.c(j9));
            this.f6941l = e1Var;
            this.f6938h = e1Var;
            this.i = rVar2;
            this.f6939j = j8;
            this.f6940k = 1;
            iVar.getClass();
            obj = a7.x.u(iVar.f7014b, new h(d8, iVar, a1Var, null), this);
            h6.a aVar = h6.a.f3204d;
            if (obj == aVar) {
                return aVar;
            }
            rVar = rVar2;
            j7 = j8;
            e1Var2 = e1Var;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = this.f6939j;
            rVar = this.i;
            e1Var = this.f6938h;
            e1Var2 = (e1) this.f6941l;
            s6.a.K(obj);
        }
        float d9 = e1Var2.d(((Number) obj).floatValue());
        rVar.f6204d = e1Var.f6965d == j0Var ? r2.q.a(j7, d9, 0.0f, 2) : r2.q.a(j7, 0.0f, d9, 1);
        return c6.m.f1757a;
    }
}
