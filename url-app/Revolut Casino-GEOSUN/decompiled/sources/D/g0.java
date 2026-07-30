package D;

/* loaded from: classes.dex */
public final class g0 extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public C0013n f191h;

    /* renamed from: i, reason: collision with root package name */
    public U0.a f192i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f193j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0013n f194k;

    /* renamed from: l, reason: collision with root package name */
    public int f195l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(C0013n c0013n, y0.b bVar) {
        super(bVar);
        this.f194k = c0013n;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f193j = obj;
        this.f195l |= Integer.MIN_VALUE;
        return this.f194k.h(this);
    }
}
