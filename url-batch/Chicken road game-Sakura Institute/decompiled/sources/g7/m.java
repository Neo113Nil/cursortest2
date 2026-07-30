package g7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4503f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f4504g;

    /* renamed from: h, reason: collision with root package name */
    public int f4505h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, h6.d dVar) {
        super(dVar);
        this.f4504g = nVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f4503f = obj;
        this.f4505h |= Integer.MIN_VALUE;
        return this.f4504g.k(null, this);
    }
}
