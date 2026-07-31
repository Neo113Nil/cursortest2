package E;

/* loaded from: classes.dex */
public final class i extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public p f964g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f965h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f966i;

    /* renamed from: j, reason: collision with root package name */
    public int f967j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, X1.c cVar) {
        super(cVar);
        this.f966i = pVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f965h = obj;
        this.f967j |= Integer.MIN_VALUE;
        return this.f966i.a(this);
    }
}
