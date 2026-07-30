package s0;

/* loaded from: classes.dex */
public final class w extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2950h;

    /* renamed from: i, reason: collision with root package name */
    public int f2951i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0235n f2952j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C0235n c0235n, w0.d dVar) {
        super(dVar);
        this.f2952j = c0235n;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f2950h = obj;
        this.f2951i |= Integer.MIN_VALUE;
        return this.f2952j.a(null, this);
    }
}
