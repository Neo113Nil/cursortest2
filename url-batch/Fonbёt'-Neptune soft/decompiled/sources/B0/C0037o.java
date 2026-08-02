package B0;

/* renamed from: B0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037o extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f170h;

    /* renamed from: i, reason: collision with root package name */
    public int f171i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0038p f172j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0037o(C0038p c0038p, H0.d dVar) {
        super(dVar);
        this.f172j = c0038p;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f170h = obj;
        this.f171i |= Integer.MIN_VALUE;
        return this.f172j.a(null, this);
    }
}
