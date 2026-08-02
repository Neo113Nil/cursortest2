package I;

/* loaded from: classes.dex */
public final class X extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public Y f601h;

    /* renamed from: i, reason: collision with root package name */
    public Object f602i;

    /* renamed from: j, reason: collision with root package name */
    public Object f603j;

    /* renamed from: k, reason: collision with root package name */
    public a0 f604k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f605l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y f606m;

    /* renamed from: n, reason: collision with root package name */
    public int f607n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Y y2, J0.b bVar) {
        super(bVar);
        this.f606m = y2;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f605l = obj;
        this.f607n |= Integer.MIN_VALUE;
        return this.f606m.b(null, this);
    }
}
