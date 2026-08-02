package B0;

/* loaded from: classes.dex */
public final class v extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f196h;

    /* renamed from: i, reason: collision with root package name */
    public int f197i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0038p f198j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(C0038p c0038p, H0.d dVar) {
        super(dVar);
        this.f198j = c0038p;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f196h = obj;
        this.f197i |= Integer.MIN_VALUE;
        return this.f198j.a(null, this);
    }
}
