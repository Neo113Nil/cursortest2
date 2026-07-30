package f7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f3450f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0.l0 f3451g;

    /* renamed from: h, reason: collision with root package name */
    public int f3452h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a0.l0 l0Var, h6.d dVar) {
        super(dVar);
        this.f3451g = l0Var;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f3450f = obj;
        this.f3452h |= Integer.MIN_VALUE;
        return this.f3451g.k(null, this);
    }
}
