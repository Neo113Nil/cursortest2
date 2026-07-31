package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o0 extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public int f6376h;
    public /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6377j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6378k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s0 f6379l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l1 f6380m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f6381n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(Object obj, Object obj2, s0 s0Var, l1 l1Var, float f6, g6.c cVar) {
        super(2, cVar);
        this.f6377j = obj;
        this.f6378k = obj2;
        this.f6379l = s0Var;
        this.f6380m = l1Var;
        this.f6381n = f6;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        return ((o0) l((g6.c) obj2, (a7.u) obj)).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        o0 o0Var = new o0(this.f6377j, this.f6378k, this.f6379l, this.f6380m, this.f6381n, cVar);
        o0Var.i = obj;
        return o0Var;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        int i = this.f6376h;
        c6.m mVar = c6.m.f1757a;
        s0 s0Var = this.f6379l;
        if (i == 0) {
            s6.a.K(obj);
            a7.u uVar = (a7.u) this.i;
            Object obj2 = this.f6377j;
            Object obj3 = this.f6378k;
            g6.c cVar = null;
            if (q6.i.a(obj2, obj3)) {
                s0Var.f6429n = null;
                if (q6.i.a(s0Var.f6419c.getValue(), obj2)) {
                    return mVar;
                }
            } else {
                s0.g(s0Var);
            }
            boolean a8 = q6.i.a(obj2, obj3);
            float f6 = this.f6381n;
            if (!a8) {
                l1 l1Var = this.f6380m;
                l1Var.p(obj2);
                l1Var.n(0L);
                s0Var.f6418b.setValue(obj2);
                l1Var.j(f6);
            }
            s0Var.p(f6);
            if (s0Var.f6428m.h()) {
                a7.x.n(uVar, null, new a0.p0(s0Var, cVar, 4), 3);
            } else {
                s0Var.f6427l = Long.MIN_VALUE;
            }
            this.f6376h = 1;
            Object j7 = s0.j(s0Var, this);
            h6.a aVar = h6.a.f3204d;
            if (j7 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s6.a.K(obj);
        }
        s0Var.o();
        return mVar;
    }
}
