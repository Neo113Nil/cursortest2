package je;

/* loaded from: classes.dex */
public final class p extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5214d;

    /* renamed from: e, reason: collision with root package name */
    public int f5215e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.g f5216i;

    /* renamed from: r, reason: collision with root package name */
    public Object f5217r;

    /* renamed from: s, reason: collision with root package name */
    public int f5218s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(i0.g gVar, ld.a aVar) {
        super(aVar);
        this.f5216i = gVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f5214d = obj;
        this.f5215e |= Integer.MIN_VALUE;
        return this.f5216i.b(null, this);
    }
}
