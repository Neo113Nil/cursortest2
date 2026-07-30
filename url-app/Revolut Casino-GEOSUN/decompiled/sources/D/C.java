package D;

/* loaded from: classes.dex */
public final class C extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public S f61h;

    /* renamed from: i, reason: collision with root package name */
    public int f62i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f63j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f64k;

    /* renamed from: l, reason: collision with root package name */
    public int f65l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(S s2, y0.b bVar) {
        super(bVar);
        this.f64k = s2;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f63j = obj;
        this.f65l |= Integer.MIN_VALUE;
        return this.f64k.h(this);
    }
}
