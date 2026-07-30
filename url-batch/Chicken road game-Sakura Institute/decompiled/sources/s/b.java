package s;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public h6.k f7980f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f7981g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f7982h;

    /* renamed from: i, reason: collision with root package name */
    public int f7983i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, j6.c cVar2) {
        super(cVar2);
        this.f7982h = cVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f7981g = obj;
        this.f7983i |= Integer.MIN_VALUE;
        return this.f7982h.l(this);
    }
}
