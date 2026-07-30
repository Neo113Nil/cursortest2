package s1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f8350f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f8351g;

    /* renamed from: h, reason: collision with root package name */
    public int f8352h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, j6.c cVar) {
        super(cVar);
        this.f8351g = rVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f8350f = obj;
        this.f8352h |= Integer.MIN_VALUE;
        this.f8351g.G(null, this);
        return i6.a.f4956f;
    }
}
