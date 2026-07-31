package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p2 extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5041h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f5042j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p6.e f5043k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z0 f5044l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2(p6.e eVar, z0 z0Var, g6.c cVar, int i) {
        super(2, cVar);
        this.f5041h = i;
        this.f5043k = eVar;
        this.f5044l = z0Var;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        a7.u uVar = (a7.u) obj;
        g6.c cVar = (g6.c) obj2;
        switch (this.f5041h) {
        }
        return ((p2) l(cVar, uVar)).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f5041h) {
            case 0:
                p2 p2Var = new p2(this.f5043k, this.f5044l, cVar, 0);
                p2Var.f5042j = obj;
                return p2Var;
            default:
                p2 p2Var2 = new p2(this.f5043k, this.f5044l, cVar, 1);
                p2Var2.f5042j = obj;
                return p2Var2;
        }
    }

    @Override // i6.a
    public final Object p(Object obj) {
        switch (this.f5041h) {
            case 0:
                int i = this.i;
                if (i == 0) {
                    s6.a.K(obj);
                    q1 q1Var = new q1(this.f5044l, ((a7.u) this.f5042j).h());
                    this.i = 1;
                    Object g3 = this.f5043k.g(q1Var, this);
                    h6.a aVar = h6.a.f3204d;
                    if (g3 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return c6.m.f1757a;
            default:
                int i8 = this.i;
                if (i8 == 0) {
                    s6.a.K(obj);
                    q1 q1Var2 = new q1(this.f5044l, ((a7.u) this.f5042j).h());
                    this.i = 1;
                    Object g7 = this.f5043k.g(q1Var2, this);
                    h6.a aVar2 = h6.a.f3204d;
                    if (g7 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return c6.m.f1757a;
        }
    }
}
