package D;

/* renamed from: D.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0021w extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public S f272h;

    /* renamed from: i, reason: collision with root package name */
    public U0.d f273i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f274j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f275k;

    /* renamed from: l, reason: collision with root package name */
    public int f276l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0021w(S s2, y0.b bVar) {
        super(bVar);
        this.f275k = s2;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f274j = obj;
        this.f276l |= Integer.MIN_VALUE;
        return S.a(this.f275k, this);
    }
}
