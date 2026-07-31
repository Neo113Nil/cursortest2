package B0;

/* loaded from: classes.dex */
public final class v extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f126h;

    /* renamed from: i, reason: collision with root package name */
    public int f127i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0015p f128j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(C0015p c0015p, I0.b bVar) {
        super(bVar);
        this.f128j = c0015p;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f126h = obj;
        this.f127i |= Integer.MIN_VALUE;
        return this.f128j.a(null, this);
    }
}
