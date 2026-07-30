package D;

/* loaded from: classes.dex */
public final class D extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public S f66h;

    /* renamed from: i, reason: collision with root package name */
    public m0 f67i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f68j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f69k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f70l;

    /* renamed from: m, reason: collision with root package name */
    public int f71m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(S s2, w0.d dVar) {
        super(dVar);
        this.f70l = s2;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f69k = obj;
        this.f71m |= Integer.MIN_VALUE;
        return S.d(this.f70l, false, this);
    }
}
