package I;

/* loaded from: classes.dex */
public final class e0 extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public C0079n f629h;

    /* renamed from: i, reason: collision with root package name */
    public g1.a f630i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f631j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0079n f632k;

    /* renamed from: l, reason: collision with root package name */
    public int f633l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(C0079n c0079n, J0.b bVar) {
        super(bVar);
        this.f632k = c0079n;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f631j = obj;
        this.f633l |= Integer.MIN_VALUE;
        return this.f632k.g(this);
    }
}
