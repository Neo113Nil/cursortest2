package I;

/* renamed from: I.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0097h extends Z1.j implements Y1.e {

    /* renamed from: f, reason: collision with root package name */
    public static final C0097h f2258f = new C0097h(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0097h f2259g = new C0097h(2, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2260e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0097h(int i3, int i4) {
        super(i3);
        this.f2260e = i4;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f2260e) {
            case 0:
                C0113p c0113p = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
                    c0113p.L();
                }
                break;
            default:
                C0113p c0113p2 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p2.x()) {
                    c0113p2.L();
                }
                break;
        }
        return L1.z.f2729a;
    }
}
