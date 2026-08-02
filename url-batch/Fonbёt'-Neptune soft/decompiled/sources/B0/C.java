package B0;

/* loaded from: classes.dex */
public final class C extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f87h;

    /* renamed from: i, reason: collision with root package name */
    public int f88i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ D f89j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d2, H0.d dVar) {
        super(dVar);
        this.f89j = d2;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f87h = obj;
        this.f88i |= Integer.MIN_VALUE;
        return this.f89j.a(null, this);
    }
}
