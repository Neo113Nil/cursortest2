package B;

/* renamed from: B.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0017s implements InterfaceC0010k {

    /* renamed from: b, reason: collision with root package name */
    public static final C0017s f439b = new C0017s(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0017s f440c = new C0017s(1);

    /* renamed from: d, reason: collision with root package name */
    public static final r f441d = new r(0);

    /* renamed from: e, reason: collision with root package name */
    public static final r f442e = new r(1);

    /* renamed from: f, reason: collision with root package name */
    public static final r f443f = new r(2);

    /* renamed from: g, reason: collision with root package name */
    public static final r f444g = new r(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f445a;

    public /* synthetic */ C0017s(int i3) {
        this.f445a = i3;
    }

    @Override // B.InterfaceC0010k
    public long a(C0014o c0014o, int i3) {
        switch (this.f445a) {
            case 0:
                String str = ((C0.H) c0014o.f431e).f557a.f547a.f596a;
                return O2.l.J(x.N.o(str, i3), x.N.n(str, i3));
            default:
                return ((C0.H) c0014o.f431e).k(i3);
        }
    }
}
