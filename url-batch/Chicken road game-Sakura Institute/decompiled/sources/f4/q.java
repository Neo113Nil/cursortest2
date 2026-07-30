package f4;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f3342f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b6.c f3343g;

    /* renamed from: h, reason: collision with root package name */
    public int f3344h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(b6.c cVar, j6.c cVar2) {
        super(cVar2);
        this.f3343g = cVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f3342f = obj;
        this.f3344h |= Integer.MIN_VALUE;
        return this.f3343g.v(0L, this);
    }
}
