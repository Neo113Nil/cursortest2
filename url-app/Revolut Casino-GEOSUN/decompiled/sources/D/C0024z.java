package D;

/* renamed from: D.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0024z extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public S f285h;

    /* renamed from: i, reason: collision with root package name */
    public U0.d f286i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f287j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f288k;

    /* renamed from: l, reason: collision with root package name */
    public int f289l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0024z(S s2, y0.b bVar) {
        super(bVar);
        this.f288k = s2;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f287j = obj;
        this.f289l |= Integer.MIN_VALUE;
        return S.c(this.f288k, this);
    }
}
