package m;

/* loaded from: classes.dex */
public final class g0 extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z1.t f5742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5743f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0599i f5744g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f5745h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0603m f5746i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f5747j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Y1.c f5748k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Z1.t tVar, Object obj, InterfaceC0599i interfaceC0599i, r rVar, C0603m c0603m, float f3, Y1.c cVar) {
        super(1);
        this.f5742e = tVar;
        this.f5743f = obj;
        this.f5744g = interfaceC0599i;
        this.f5745h = rVar;
        this.f5746i = c0603m;
        this.f5747j = f3;
        this.f5748k = cVar;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        long longValue = ((Number) obj).longValue();
        InterfaceC0599i interfaceC0599i = this.f5744g;
        y0 d3 = interfaceC0599i.d();
        Object e3 = interfaceC0599i.e();
        f0 f0Var = new f0(this.f5746i, 0);
        C0601k c0601k = new C0601k(this.f5743f, d3, this.f5745h, longValue, e3, longValue, f0Var);
        AbstractC0595e.f(c0601k, longValue, this.f5747j, this.f5744g, this.f5746i, this.f5748k);
        this.f5742e.f3480d = c0601k;
        return L1.z.f2729a;
    }
}
