package D;

/* renamed from: D.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009j extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public C0013n f210h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f211i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0013n f212j;

    /* renamed from: k, reason: collision with root package name */
    public int f213k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0009j(C0013n c0013n, y0.b bVar) {
        super(bVar);
        this.f212j = c0013n;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f211i = obj;
        this.f213k |= Integer.MIN_VALUE;
        return this.f212j.d(this);
    }
}
