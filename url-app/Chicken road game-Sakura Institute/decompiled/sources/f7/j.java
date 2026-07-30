package f7;

/* loaded from: classes.dex */
public final class j extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f3491f;

    /* renamed from: g, reason: collision with root package name */
    public int f3492g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f3493h;

    /* renamed from: i, reason: collision with root package name */
    public Object f3494i;

    /* renamed from: j, reason: collision with root package name */
    public g f3495j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, h6.d dVar) {
        super(dVar);
        this.f3493h = kVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f3491f = obj;
        this.f3492g |= Integer.MIN_VALUE;
        return this.f3493h.b(null, this);
    }
}
