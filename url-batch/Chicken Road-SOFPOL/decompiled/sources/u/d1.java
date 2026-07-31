package u;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d1 extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public long f6952h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ long f6953j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e1 f6954k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e1 e1Var, g6.c cVar) {
        super(2, cVar);
        this.f6954k = e1Var;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        long j7 = ((r2.q) obj).f6537a;
        d1 d1Var = new d1(this.f6954k, (g6.c) obj2);
        d1Var.f6953j = j7;
        return d1Var.p(c6.m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        d1 d1Var = new d1(this.f6954k, cVar);
        d1Var.f6953j = ((r2.q) obj).f6537a;
        return d1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (r15 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    @Override // i6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Object obj) {
        long j7;
        long j8;
        long j9;
        long j10;
        int i = this.i;
        e1 e1Var = this.f6954k;
        h6.a aVar = h6.a.f3204d;
        if (i == 0) {
            s6.a.K(obj);
            j7 = this.f6953j;
            c5.x xVar = e1Var.f6967f;
            this.f6953j = j7;
            this.i = 1;
            obj = xVar.h(j7, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j10 = this.f6952h;
                    j9 = this.f6953j;
                    s6.a.K(obj);
                    return new r2.q(r2.q.d(j9, r2.q.d(j10, ((r2.q) obj).f6537a)));
                }
                j8 = this.f6952h;
                j7 = this.f6953j;
                s6.a.K(obj);
                long j11 = ((r2.q) obj).f6537a;
                c5.x xVar2 = e1Var.f6967f;
                long d8 = r2.q.d(j8, j11);
                this.f6953j = j7;
                this.f6952h = j11;
                this.i = 3;
                obj = xVar2.g(d8, j11, this);
                if (obj != aVar) {
                    j9 = j7;
                    j10 = j11;
                    return new r2.q(r2.q.d(j9, r2.q.d(j10, ((r2.q) obj).f6537a)));
                }
                return aVar;
            }
            j7 = this.f6953j;
            s6.a.K(obj);
        }
        long d9 = r2.q.d(j7, ((r2.q) obj).f6537a);
        this.f6953j = j7;
        this.f6952h = d9;
        this.i = 2;
        obj = e1Var.a(d9, this);
        if (obj != aVar) {
            j8 = d9;
            long j112 = ((r2.q) obj).f6537a;
            c5.x xVar22 = e1Var.f6967f;
            long d82 = r2.q.d(j8, j112);
            this.f6953j = j7;
            this.f6952h = j112;
            this.i = 3;
            obj = xVar22.g(d82, j112, this);
            if (obj != aVar) {
            }
        }
        return aVar;
    }
}
