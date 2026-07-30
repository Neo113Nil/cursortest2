package k1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5321f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b1.b f5322g;

    /* renamed from: h, reason: collision with root package name */
    public int f5323h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b1.b bVar, j6.c cVar) {
        super(cVar);
        this.f5322g = bVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f5321f = obj;
        this.f5323h |= Integer.MIN_VALUE;
        return this.f5322g.f(0L, 0L, this);
    }
}
