package P;

/* renamed from: P.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0145j extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public P0.n f2104d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f2105e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ P0.n f2106i;

    /* renamed from: l, reason: collision with root package name */
    public int f2107l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0145j(P0.n nVar, X5.c cVar) {
        super(cVar);
        this.f2106i = nVar;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f2105e = obj;
        this.f2107l |= Integer.MIN_VALUE;
        return this.f2106i.e(this);
    }
}
