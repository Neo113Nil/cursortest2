package je;

/* loaded from: classes.dex */
public final class o extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5210d;

    /* renamed from: e, reason: collision with root package name */
    public int f5211e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f5212i;

    /* renamed from: r, reason: collision with root package name */
    public i0.g f5213r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l lVar, ld.a aVar) {
        super(aVar);
        this.f5212i = lVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f5210d = obj;
        this.f5211e |= Integer.MIN_VALUE;
        return this.f5212i.c(null, this);
    }
}
