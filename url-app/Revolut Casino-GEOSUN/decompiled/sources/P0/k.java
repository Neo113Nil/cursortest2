package P0;

/* loaded from: classes.dex */
public final class k extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public l f794h;

    /* renamed from: i, reason: collision with root package name */
    public Object f795i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f796j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l f797k;

    /* renamed from: l, reason: collision with root package name */
    public int f798l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, w0.d dVar) {
        super(dVar);
        this.f797k = lVar;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f796j = obj;
        this.f798l |= Integer.MIN_VALUE;
        return this.f797k.a(null, this);
    }
}
