package n;

/* renamed from: n.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0662q extends Z1.j implements Y1.c {

    /* renamed from: f, reason: collision with root package name */
    public static final C0662q f6141f = new C0662q(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0662q f6142g = new C0662q(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final C0662q f6143h = new C0662q(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6144e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0662q(int i3, int i4) {
        super(i3);
        this.f6144e = i4;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f6144e) {
            case 0:
                ((t0.F) obj).b();
                return L1.z.f2729a;
            case 1:
                return L1.z.f2729a;
            default:
                return new k0(((Number) obj).intValue());
        }
    }
}
