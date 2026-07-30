package f4;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f3313f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f3314g;

    /* renamed from: h, reason: collision with root package name */
    public int f3315h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, j6.c cVar) {
        super(cVar);
        this.f3314g = gVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f3313f = obj;
        this.f3315h |= Integer.MIN_VALUE;
        return this.f3314g.a(this);
    }
}
