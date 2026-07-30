package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h1 extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public i1 f2005f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2006g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i1 f2007h;

    /* renamed from: i, reason: collision with root package name */
    public int f2008i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(i1 i1Var, j6.c cVar) {
        super(cVar);
        this.f2007h = i1Var;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f2006g = obj;
        this.f2008i |= Integer.MIN_VALUE;
        return this.f2007h.b(this);
    }
}
