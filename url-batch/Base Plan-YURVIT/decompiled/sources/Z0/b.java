package Z0;

/* loaded from: classes.dex */
public final class b extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public Y0.p f1075h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1076i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f1077j;

    /* renamed from: k, reason: collision with root package name */
    public int f1078k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, I0.b bVar) {
        super(bVar);
        this.f1077j = cVar;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f1076i = obj;
        this.f1078k |= Integer.MIN_VALUE;
        return this.f1077j.a(null, this);
    }
}
