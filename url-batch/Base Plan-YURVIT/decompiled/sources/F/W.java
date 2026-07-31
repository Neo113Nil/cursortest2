package F;

/* loaded from: classes.dex */
public final class W extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public Y f314h;

    /* renamed from: i, reason: collision with root package name */
    public S f315i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f316j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f317k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y f318l;

    /* renamed from: m, reason: collision with root package name */
    public int f319m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Y y2, I0.b bVar) {
        super(bVar);
        this.f318l = y2;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f317k = obj;
        this.f319m |= Integer.MIN_VALUE;
        return this.f318l.a(null, this);
    }
}
