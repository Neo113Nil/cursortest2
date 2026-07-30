package P0;

/* loaded from: classes.dex */
public final class a extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public Q0.n f762h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f763i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ A.j f764j;

    /* renamed from: k, reason: collision with root package name */
    public int f765k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(A.j jVar, w0.d dVar) {
        super(dVar);
        this.f764j = jVar;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f763i = obj;
        this.f765k |= Integer.MIN_VALUE;
        return this.f764j.d(null, this);
    }
}
