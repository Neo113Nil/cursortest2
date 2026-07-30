package c0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public j f1458f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1459g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j f1460h;

    /* renamed from: i, reason: collision with root package name */
    public int f1461i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, j6.c cVar) {
        super(cVar);
        this.f1460h = jVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f1459g = obj;
        this.f1461i |= Integer.MIN_VALUE;
        return this.f1460h.a(this);
    }
}
