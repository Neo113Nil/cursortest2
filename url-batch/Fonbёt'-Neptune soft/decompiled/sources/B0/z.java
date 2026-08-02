package B0;

/* loaded from: classes.dex */
public final class z extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f215h;

    /* renamed from: i, reason: collision with root package name */
    public int f216i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0038p f217j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C0038p c0038p, H0.d dVar) {
        super(dVar);
        this.f217j = c0038p;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f215h = obj;
        this.f216i |= Integer.MIN_VALUE;
        return this.f217j.a(null, this);
    }
}
