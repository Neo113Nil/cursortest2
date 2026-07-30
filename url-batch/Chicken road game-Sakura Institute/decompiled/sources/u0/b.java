package u0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public c f8941f;

    /* renamed from: g, reason: collision with root package name */
    public e7.b f8942g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f8943h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f8944i;

    /* renamed from: j, reason: collision with root package name */
    public int f8945j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, j6.c cVar2) {
        super(cVar2);
        this.f8944i = cVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f8943h = obj;
        this.f8945j |= Integer.MIN_VALUE;
        return this.f8944i.a(this);
    }
}
