package y3;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class w extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8953h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ boolean f8954j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b0 f8955k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8956l;

    /* renamed from: m, reason: collision with root package name */
    public Object f8957m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(b0 b0Var, int i, g6.c cVar, int i8) {
        super(2, cVar);
        this.f8953h = i8;
        this.f8955k = b0Var;
        this.f8956l = i;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        int i = this.f8953h;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        g6.c cVar = (g6.c) obj2;
        switch (i) {
        }
        return ((w) l(cVar, bool)).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f8953h) {
            case 0:
                w wVar = new w(this.f8955k, this.f8956l, cVar, 0);
                wVar.f8954j = ((Boolean) obj).booleanValue();
                return wVar;
            default:
                w wVar2 = new w(this.f8955k, this.f8956l, cVar, 1);
                wVar2.f8954j = ((Boolean) obj).booleanValue();
                return wVar2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        if (r7 == r4) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // i6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Object obj) {
        Throwable th;
        int i;
        s0 s0Var;
        boolean z3;
        boolean z7;
        boolean z8;
        boolean z9;
        Object obj2;
        int i8;
        switch (this.f8953h) {
            case 0:
                boolean z10 = this.i;
                b0 b0Var = this.f8955k;
                h6.a aVar = h6.a.f3204d;
                try {
                } catch (Throwable th2) {
                    if (z10 != 0) {
                        r0 g3 = b0Var.g();
                        this.f8957m = th2;
                        this.f8954j = z10;
                        this.i = 2;
                        Integer a8 = g3.a();
                        if (a8 == aVar) {
                            return aVar;
                        }
                        th = th2;
                        obj = a8;
                        z8 = z10;
                    } else {
                        th = th2;
                        i = this.f8956l;
                        z7 = z10;
                    }
                }
                if (z10 == 0) {
                    s6.a.K(obj);
                    boolean z11 = this.f8954j;
                    this.f8954j = z11;
                    this.i = 1;
                    obj = b0.f(b0Var, z11, this);
                    z10 = z11;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (z10 != 1) {
                        if (z10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z12 = this.f8954j;
                        th = (Throwable) this.f8957m;
                        s6.a.K(obj);
                        z8 = z12;
                        i = ((Number) obj).intValue();
                        z7 = z8;
                        s0Var = new n0(th, i);
                        z3 = z7;
                        return new c6.f(s0Var, Boolean.valueOf(z3));
                    }
                    boolean z13 = this.f8954j;
                    s6.a.K(obj);
                    z10 = z13;
                }
                s0Var = (s0) obj;
                z3 = z10;
                return new c6.f(s0Var, Boolean.valueOf(z3));
            default:
                int i9 = this.i;
                b0 b0Var2 = this.f8955k;
                Object obj3 = h6.a.f3204d;
                if (i9 == 0) {
                    s6.a.K(obj);
                    z9 = this.f8954j;
                    this.f8954j = z9;
                    this.i = 1;
                    obj = b0Var2.i(this);
                    break;
                } else {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.f8957m;
                        s6.a.K(obj);
                        i8 = ((Number) obj).intValue();
                        obj3 = new c(obj2 != null ? obj2.hashCode() : 0, i8, obj2);
                        return obj3;
                    }
                    z9 = this.f8954j;
                    s6.a.K(obj);
                }
                if (!z9) {
                    obj2 = obj;
                    i8 = this.f8956l;
                    obj3 = new c(obj2 != null ? obj2.hashCode() : 0, i8, obj2);
                    return obj3;
                }
                r0 g7 = b0Var2.g();
                this.f8957m = obj;
                this.i = 2;
                Integer a9 = g7.a();
                if (a9 != obj3) {
                    obj2 = obj;
                    obj = a9;
                    i8 = ((Number) obj).intValue();
                    obj3 = new c(obj2 != null ? obj2.hashCode() : 0, i8, obj2);
                }
                return obj3;
        }
    }
}
