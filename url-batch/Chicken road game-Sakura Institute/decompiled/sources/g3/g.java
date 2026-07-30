package g3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public k f4123f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4124g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f4125h;

    /* renamed from: i, reason: collision with root package name */
    public int f4126i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, j6.c cVar) {
        super(cVar);
        this.f4125h = kVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f4124g = obj;
        this.f4126i |= Integer.MIN_VALUE;
        return this.f4125h.q(this);
    }
}
