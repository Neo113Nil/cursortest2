package je;

/* loaded from: classes.dex */
public final class s extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5225d;

    /* renamed from: e, reason: collision with root package name */
    public int f5226e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.g f5227i;

    /* renamed from: r, reason: collision with root package name */
    public Object f5228r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(i0.g gVar, ld.a aVar) {
        super(aVar);
        this.f5227i = gVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f5225d = obj;
        this.f5226e |= Integer.MIN_VALUE;
        return this.f5227i.b(null, this);
    }
}
