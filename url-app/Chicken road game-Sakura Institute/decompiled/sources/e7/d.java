package e7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f2843f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f2844g;

    /* renamed from: h, reason: collision with root package name */
    public int f2845h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, j6.c cVar) {
        super(cVar);
        this.f2844g = eVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f2843f = obj;
        this.f2845h |= Integer.MIN_VALUE;
        Object C = this.f2844g.C(null, 0, 0L, this);
        return C == i6.a.f4956f ? C : new l(C);
    }
}
