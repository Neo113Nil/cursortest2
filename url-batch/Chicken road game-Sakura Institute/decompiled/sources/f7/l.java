package f7;

/* loaded from: classes.dex */
public final class l extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f3501f;

    /* renamed from: g, reason: collision with root package name */
    public int f3502g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e0.e f3503h;

    /* renamed from: i, reason: collision with root package name */
    public e0.e f3504i;

    /* renamed from: j, reason: collision with root package name */
    public g f3505j;

    /* renamed from: k, reason: collision with root package name */
    public g7.v f3506k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e0.e eVar, h6.d dVar) {
        super(dVar);
        this.f3503h = eVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f3501f = obj;
        this.f3502g |= Integer.MIN_VALUE;
        return this.f3503h.b(null, this);
    }
}
