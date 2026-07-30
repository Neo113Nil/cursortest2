package k1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5324f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b1.b f5325g;

    /* renamed from: h, reason: collision with root package name */
    public int f5326h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(b1.b bVar, j6.c cVar) {
        super(cVar);
        this.f5325g = bVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f5324f = obj;
        this.f5326h |= Integer.MIN_VALUE;
        return this.f5325g.g(0L, this);
    }
}
