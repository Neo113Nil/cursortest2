package m;

/* loaded from: classes.dex */
public final class h0 extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z1.t f5750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f5751f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0599i f5752g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0603m f5753h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Y1.c f5754i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Z1.t tVar, float f3, InterfaceC0599i interfaceC0599i, C0603m c0603m, Y1.c cVar) {
        super(1);
        this.f5750e = tVar;
        this.f5751f = f3;
        this.f5752g = interfaceC0599i;
        this.f5753h = c0603m;
        this.f5754i = cVar;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = this.f5750e.f3480d;
        Z1.i.c(obj2);
        AbstractC0595e.f((C0601k) obj2, longValue, this.f5751f, this.f5752g, this.f5753h, this.f5754i);
        return L1.z.f2729a;
    }
}
