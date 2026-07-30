package f7;

/* loaded from: classes.dex */
public final class r extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public a0.l0 f3545f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3546g;

    /* renamed from: h, reason: collision with root package name */
    public int f3547h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a0.l0 f3548i;

    /* renamed from: j, reason: collision with root package name */
    public Object f3549j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a0.l0 l0Var, h6.d dVar) {
        super(dVar);
        this.f3548i = l0Var;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f3546g = obj;
        this.f3547h |= Integer.MIN_VALUE;
        return this.f3548i.k(null, this);
    }
}
