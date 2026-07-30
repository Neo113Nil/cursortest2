package P0;

/* loaded from: classes.dex */
public final class b extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public O0.p f766h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f767i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f768j;

    /* renamed from: k, reason: collision with root package name */
    public int f769k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, y0.b bVar) {
        super(bVar);
        this.f768j = cVar;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f767i = obj;
        this.f769k |= Integer.MIN_VALUE;
        return this.f768j.a(null, this);
    }
}
