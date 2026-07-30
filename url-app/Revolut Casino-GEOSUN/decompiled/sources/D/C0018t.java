package D;

/* renamed from: D.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0018t extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f263h;

    /* renamed from: i, reason: collision with root package name */
    public int f264i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0019u f265j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0018t(C0019u c0019u, w0.d dVar) {
        super(dVar);
        this.f265j = c0019u;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f263h = obj;
        this.f264i |= Integer.MIN_VALUE;
        return this.f265j.a(null, this);
    }
}
