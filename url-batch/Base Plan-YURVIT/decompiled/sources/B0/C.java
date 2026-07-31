package B0;

/* loaded from: classes.dex */
public final class C extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f14h;

    /* renamed from: i, reason: collision with root package name */
    public int f15i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ D f16j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d2, I0.b bVar) {
        super(bVar);
        this.f16j = d2;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f14h = obj;
        this.f15i |= Integer.MIN_VALUE;
        return this.f16j.a(null, this);
    }
}
