package b1;

/* loaded from: classes.dex */
public final class a extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public c1.n f1899h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1900i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ B.m f1901j;

    /* renamed from: k, reason: collision with root package name */
    public int f1902k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(B.m mVar, H0.d dVar) {
        super(dVar);
        this.f1901j = mVar;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f1900i = obj;
        this.f1902k |= Integer.MIN_VALUE;
        return this.f1901j.k(null, this);
    }
}
