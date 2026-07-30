package R;

/* loaded from: classes.dex */
public final class b extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public c f2357d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f2358e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f2359i;

    /* renamed from: l, reason: collision with root package name */
    public int f2360l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, X5.c cVar2) {
        super(cVar2);
        this.f2359i = cVar;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f2358e = obj;
        this.f2360l |= Integer.MIN_VALUE;
        return this.f2359i.a(null, this);
    }
}
