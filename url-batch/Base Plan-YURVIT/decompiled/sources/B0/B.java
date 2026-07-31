package B0;

/* loaded from: classes.dex */
public final class B extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f11h;

    /* renamed from: i, reason: collision with root package name */
    public int f12i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0015p f13j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C0015p c0015p, I0.b bVar) {
        super(bVar);
        this.f13j = c0015p;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f11h = obj;
        this.f12i |= Integer.MIN_VALUE;
        return this.f13j.a(null, this);
    }
}
