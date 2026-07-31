package m;

/* loaded from: classes.dex */
public final class Y extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public Z f5653d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5654e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5655f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Z f5656g;

    /* renamed from: h, reason: collision with root package name */
    public int f5657h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(Z z3, R1.c cVar) {
        super(cVar);
        this.f5656g = z3;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f5655f = obj;
        this.f5657h |= Integer.MIN_VALUE;
        return Z.j(this.f5656g, this);
    }
}
