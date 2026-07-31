package F;

/* loaded from: classes.dex */
public final class C extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public P f229h;

    /* renamed from: i, reason: collision with root package name */
    public l0 f230i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f231j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f232k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P f233l;

    /* renamed from: m, reason: collision with root package name */
    public int f234m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(P p2, I0.b bVar) {
        super(bVar);
        this.f233l = p2;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f232k = obj;
        this.f234m |= Integer.MIN_VALUE;
        return P.d(this.f233l, false, this);
    }
}
