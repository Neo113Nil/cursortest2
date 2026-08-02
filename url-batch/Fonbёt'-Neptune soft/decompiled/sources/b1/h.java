package b1;

/* loaded from: classes.dex */
public final class h extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f1918h;

    /* renamed from: i, reason: collision with root package name */
    public int f1919i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f1920j;

    /* renamed from: k, reason: collision with root package name */
    public Object f1921k;

    /* renamed from: l, reason: collision with root package name */
    public e f1922l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, H0.d dVar) {
        super(dVar);
        this.f1920j = iVar;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f1918h = obj;
        this.f1919i |= Integer.MIN_VALUE;
        return this.f1920j.k(null, this);
    }
}
