package E3;

/* loaded from: classes.dex */
public final class i extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public j f679d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f680e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f681i;

    /* renamed from: l, reason: collision with root package name */
    public int f682l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, X5.c cVar) {
        super(cVar);
        this.f681i = jVar;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f680e = obj;
        this.f682l |= Integer.MIN_VALUE;
        return this.f681i.c(this);
    }
}
