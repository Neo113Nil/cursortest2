package d7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j0 extends i6.i implements p6.f {

    /* renamed from: h, reason: collision with root package name */
    public int f2378h;
    public /* synthetic */ g i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ int f2379j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k0 f2380k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, g6.c cVar) {
        super(3, cVar);
        this.f2380k = k0Var;
    }

    @Override // p6.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        j0 j0Var = new j0(this.f2380k, (g6.c) obj3);
        j0Var.i = (g) obj;
        j0Var.f2379j = intValue;
        return j0Var.p(c6.m.f1757a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007d, code lost:
    
        if (r0.a(d7.g0.f2362f, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (a7.x.c(Long.MAX_VALUE, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r0.a(d7.g0.f2361e, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        if (r0.a(d7.g0.f2360d, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        if (a7.x.c(0, r7) == r6) goto L32;
     */
    @Override // i6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Object obj) {
        g gVar;
        int i = this.f2378h;
        h6.a aVar = h6.a.f3204d;
        if (i == 0) {
            s6.a.K(obj);
            gVar = this.i;
            if (this.f2379j > 0) {
                this.f2378h = 1;
            } else {
                this.i = gVar;
                this.f2378h = 2;
            }
            return aVar;
        }
        if (i != 1) {
            if (i == 2) {
                gVar = this.i;
                s6.a.K(obj);
                this.i = gVar;
                this.f2378h = 3;
            } else if (i == 3) {
                gVar = this.i;
                s6.a.K(obj);
                this.i = gVar;
                this.f2378h = 4;
            } else if (i == 4) {
                gVar = this.i;
                s6.a.K(obj);
                this.i = null;
                this.f2378h = 5;
            } else if (i != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        s6.a.K(obj);
        return c6.m.f1757a;
    }
}
