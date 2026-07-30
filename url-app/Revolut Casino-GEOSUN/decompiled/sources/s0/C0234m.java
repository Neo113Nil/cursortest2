package s0;

/* renamed from: s0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234m extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2909h;

    /* renamed from: i, reason: collision with root package name */
    public int f2910i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0235n f2911j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0234m(C0235n c0235n, w0.d dVar) {
        super(dVar);
        this.f2911j = c0235n;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f2909h = obj;
        this.f2910i |= Integer.MIN_VALUE;
        return this.f2911j.a(null, this);
    }
}
