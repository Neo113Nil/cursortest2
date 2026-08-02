package I;

/* loaded from: classes.dex */
public final class W extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public Y f595h;

    /* renamed from: i, reason: collision with root package name */
    public S f596i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f597j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f598k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y f599l;

    /* renamed from: m, reason: collision with root package name */
    public int f600m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Y y2, J0.b bVar) {
        super(bVar);
        this.f599l = y2;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f598k = obj;
        this.f600m |= Integer.MIN_VALUE;
        return this.f599l.a(null, this);
    }
}
