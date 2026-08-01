package je;

/* loaded from: classes.dex */
public final class k extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5181d;

    /* renamed from: e, reason: collision with root package name */
    public int f5182e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f5183i;

    /* renamed from: r, reason: collision with root package name */
    public f f5184r;

    /* renamed from: s, reason: collision with root package name */
    public ke.q f5185s;

    /* renamed from: t, reason: collision with root package name */
    public int f5186t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, ld.a aVar) {
        super(aVar);
        this.f5183i = lVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f5181d = obj;
        this.f5182e |= Integer.MIN_VALUE;
        return this.f5183i.c(null, this);
    }
}
