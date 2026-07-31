package n0;

/* loaded from: classes.dex */
public final class z extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f7344g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0700A f7345h;

    /* renamed from: i, reason: collision with root package name */
    public int f7346i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C0700A c0700a, X1.a aVar) {
        super(aVar);
        this.f7345h = c0700a;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f7344g = obj;
        this.f7346i |= Integer.MIN_VALUE;
        return this.f7345h.g(0L, null, this);
    }
}
