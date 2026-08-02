package B0;

/* loaded from: classes.dex */
public final class B extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f84h;

    /* renamed from: i, reason: collision with root package name */
    public int f85i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0038p f86j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C0038p c0038p, H0.d dVar) {
        super(dVar);
        this.f86j = c0038p;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f84h = obj;
        this.f85i |= Integer.MIN_VALUE;
        return this.f86j.a(null, this);
    }
}
