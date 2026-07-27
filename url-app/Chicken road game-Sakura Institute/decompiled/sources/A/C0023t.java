package A;

/* renamed from: A.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0023t implements InterfaceC0015k {

    /* renamed from: b, reason: collision with root package name */
    public static final C0023t f183b = new C0023t(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0023t f184c = new C0023t(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C0022s f185d = new C0022s(0);

    /* renamed from: e, reason: collision with root package name */
    public static final C0022s f186e = new C0022s(1);

    /* renamed from: f, reason: collision with root package name */
    public static final C0022s f187f = new C0022s(2);

    /* renamed from: g, reason: collision with root package name */
    public static final C0022s f188g = new C0022s(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189a;

    public /* synthetic */ C0023t(int i2) {
        this.f189a = i2;
    }

    @Override // A.InterfaceC0015k
    public long a(C0020p c0020p, int i2) {
        switch (this.f189a) {
            case 0:
                String str = ((A0.I) c0020p.f175e).f289a.f279a.f328a;
                return M1.a.j(w.M.o(str, i2), w.M.n(str, i2));
            default:
                return ((A0.I) c0020p.f175e).k(i2);
        }
    }
}
