package s0;

/* loaded from: classes.dex */
public final class y extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2958h;

    /* renamed from: i, reason: collision with root package name */
    public int f2959i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0235n f2960j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C0235n c0235n, w0.d dVar) {
        super(dVar);
        this.f2960j = c0235n;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f2958h = obj;
        this.f2959i |= Integer.MIN_VALUE;
        return this.f2960j.a(null, this);
    }
}
