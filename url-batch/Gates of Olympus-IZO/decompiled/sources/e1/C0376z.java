package e1;

/* renamed from: e1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0376z extends R1.i implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public Throwable f4763e;

    /* renamed from: f, reason: collision with root package name */
    public int f4764f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0351N f4765g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0376z(C0351N c0351n, P1.d dVar) {
        super(1, dVar);
        this.f4765g = c0351n;
    }

    @Override // R1.a
    public final P1.d create(P1.d dVar) {
        return new C0376z(this.f4765g, dVar);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        Y y3;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f4764f;
        C0351N c0351n = this.f4765g;
        try {
        } catch (Throwable th2) {
            X d3 = c0351n.d();
            this.f4763e = th2;
            this.f4764f = 2;
            Integer a3 = d3.a();
            if (a3 == aVar) {
                return aVar;
            }
            th = th2;
            obj = a3;
        }
        if (i3 == 0) {
            I2.l.Q(obj);
            this.f4764f = 1;
            obj = C0351N.c(c0351n, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.f4763e;
                I2.l.Q(obj);
                y3 = new Q(((Number) obj).intValue(), th);
                return new L1.j(y3, Boolean.TRUE);
            }
            I2.l.Q(obj);
        }
        y3 = (Y) obj;
        return new L1.j(y3, Boolean.TRUE);
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        return ((C0376z) create((P1.d) obj)).invokeSuspend(L1.z.f2729a);
    }
}
