package f7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l0 extends j6.i implements q6.f {

    /* renamed from: g, reason: collision with root package name */
    public int f3507g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ g f3508h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ int f3509i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n0 f3510j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, h6.d dVar) {
        super(3, dVar);
        this.f3510j = n0Var;
    }

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        l0 l0Var = new l0(this.f3510j, (h6.d) obj3);
        l0Var.f3508h = (g) obj;
        l0Var.f3509i = intValue;
        return l0Var.invokeSuspend(d6.z.f2639a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0083, code lost:
    
        if (r0.k(f7.h0.f3482h, r12) == r9) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (c7.a0.e(r1, r12) == r9) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r0.k(f7.h0.f3481g, r12) == r9) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r13.k(f7.h0.f3480f, r12) == r9) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g gVar;
        n0 n0Var = this.f3510j;
        long j8 = n0Var.f3523b;
        int i7 = this.f3507g;
        i6.a aVar = i6.a.f4956f;
        if (i7 == 0) {
            d6.a.e(obj);
            g gVar2 = this.f3508h;
            if (this.f3509i > 0) {
                this.f3507g = 1;
            } else {
                long j9 = n0Var.f3522a;
                this.f3508h = gVar2;
                this.f3507g = 2;
                if (c7.a0.e(j9, this) != aVar) {
                    gVar = gVar2;
                    if (j8 > 0) {
                    }
                    this.f3508h = null;
                    this.f3507g = 5;
                }
            }
            return aVar;
        }
        if (i7 != 1) {
            if (i7 == 2) {
                gVar = this.f3508h;
                d6.a.e(obj);
                if (j8 > 0) {
                    this.f3508h = gVar;
                    this.f3507g = 3;
                }
                this.f3508h = null;
                this.f3507g = 5;
            } else if (i7 == 3) {
                gVar = this.f3508h;
                d6.a.e(obj);
                this.f3508h = gVar;
                this.f3507g = 4;
            } else if (i7 == 4) {
                gVar = this.f3508h;
                d6.a.e(obj);
                this.f3508h = null;
                this.f3507g = 5;
            } else if (i7 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        d6.a.e(obj);
        return d6.z.f2639a;
    }
}
