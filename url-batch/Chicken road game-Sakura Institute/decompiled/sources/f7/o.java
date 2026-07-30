package f7;

/* loaded from: classes.dex */
public final class o extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public a0.l0 f3524f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3525g;

    /* renamed from: h, reason: collision with root package name */
    public int f3526h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a0.l0 f3527i;

    /* renamed from: j, reason: collision with root package name */
    public Object f3528j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(a0.l0 l0Var, h6.d dVar) {
        super(dVar);
        this.f3527i = l0Var;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f3525g = obj;
        this.f3526h |= Integer.MIN_VALUE;
        return this.f3527i.k(null, this);
    }
}
