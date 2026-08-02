package I;

/* loaded from: classes.dex */
public final class C extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public P f511h;

    /* renamed from: i, reason: collision with root package name */
    public k0 f512i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f513j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f514k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P f515l;

    /* renamed from: m, reason: collision with root package name */
    public int f516m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(P p2, H0.d dVar) {
        super(dVar);
        this.f515l = p2;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f514k = obj;
        this.f516m |= Integer.MIN_VALUE;
        return P.e(this.f515l, false, this);
    }
}
