package b1;

/* loaded from: classes.dex */
public final class b extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public a1.p f1903h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1904i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f1905j;

    /* renamed from: k, reason: collision with root package name */
    public int f1906k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, J0.b bVar) {
        super(bVar);
        this.f1905j = cVar;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f1904i = obj;
        this.f1906k |= Integer.MIN_VALUE;
        return this.f1905j.a(null, this);
    }
}
