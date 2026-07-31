package e1;

/* renamed from: e1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0338A extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public Throwable f4584e;

    /* renamed from: f, reason: collision with root package name */
    public int f4585f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f4586g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0351N f4587h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4588i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0338A(C0351N c0351n, int i3, P1.d dVar) {
        super(2, dVar);
        this.f4587h = c0351n;
        this.f4588i = i3;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0338A c0338a = new C0338A(this.f4587h, this.f4588i, dVar);
        c0338a.f4586g = ((Boolean) obj).booleanValue();
        return c0338a;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C0338A) create(bool, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int i3;
        boolean z3;
        Y y3;
        boolean z4;
        Q1.a aVar = Q1.a.f3113d;
        boolean z5 = this.f4585f;
        C0351N c0351n = this.f4587h;
        try {
        } catch (Throwable th2) {
            if (z5 != 0) {
                X d3 = c0351n.d();
                this.f4584e = th2;
                this.f4586g = z5;
                this.f4585f = 2;
                Integer a3 = d3.a();
                if (a3 == aVar) {
                    return aVar;
                }
                z3 = z5;
                th = th2;
                obj = a3;
            } else {
                boolean z6 = z5;
                th = th2;
                i3 = this.f4588i;
                z3 = z6;
            }
        }
        if (z5 == 0) {
            I2.l.Q(obj);
            boolean z7 = this.f4586g;
            this.f4586g = z7;
            this.f4585f = 1;
            obj = C0351N.c(c0351n, z7, this);
            z5 = z7;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (z5 != 1) {
                if (z5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = this.f4586g;
                th = this.f4584e;
                I2.l.Q(obj);
                i3 = ((Number) obj).intValue();
                Q q2 = new Q(i3, th);
                z4 = z3;
                y3 = q2;
                return new L1.j(y3, Boolean.valueOf(z4));
            }
            boolean z8 = this.f4586g;
            I2.l.Q(obj);
            z5 = z8;
        }
        y3 = (Y) obj;
        z4 = z5;
        return new L1.j(y3, Boolean.valueOf(z4));
    }
}
