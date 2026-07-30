package s0;

/* loaded from: classes.dex */
public final class s extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2931h;

    /* renamed from: i, reason: collision with root package name */
    public int f2932i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0235n f2933j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(C0235n c0235n, w0.d dVar) {
        super(dVar);
        this.f2933j = c0235n;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f2931h = obj;
        this.f2932i |= Integer.MIN_VALUE;
        return this.f2933j.a(null, this);
    }
}
