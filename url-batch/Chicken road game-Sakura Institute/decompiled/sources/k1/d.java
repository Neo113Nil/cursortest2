package k1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public e f5333f;

    /* renamed from: g, reason: collision with root package name */
    public long f5334g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f5335h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f5336i;

    /* renamed from: j, reason: collision with root package name */
    public int f5337j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, j6.c cVar) {
        super(cVar);
        this.f5336i = eVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f5335h = obj;
        this.f5337j |= Integer.MIN_VALUE;
        return this.f5336i.D0(0L, this);
    }
}
