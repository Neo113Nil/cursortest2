package F;

/* loaded from: classes.dex */
public final class e0 extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public C0032n f348h;

    /* renamed from: i, reason: collision with root package name */
    public e1.a f349i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f350j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0032n f351k;

    /* renamed from: l, reason: collision with root package name */
    public int f352l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(C0032n c0032n, I0.b bVar) {
        super(bVar);
        this.f351k = c0032n;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f350j = obj;
        this.f352l |= Integer.MIN_VALUE;
        return this.f351k.h(this);
    }
}
