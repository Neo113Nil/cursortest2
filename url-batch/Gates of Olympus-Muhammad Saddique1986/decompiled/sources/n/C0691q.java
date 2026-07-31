package n;

import e2.InterfaceC0424c;

/* renamed from: n.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0691q extends f2.k implements InterfaceC0424c {

    /* renamed from: f, reason: collision with root package name */
    public static final C0691q f7187f = new C0691q(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0691q f7188g = new C0691q(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final C0691q f7189h = new C0691q(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final C0691q f7190i = new C0691q(1, 3);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7191e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0691q(int i3, int i4) {
        super(i3);
        this.f7191e = i4;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f7191e) {
            case 0:
                ((t0.G) obj).b();
                return R1.y.f4171a;
            case 1:
                return R1.y.f4171a;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((Number) obj).longValue();
                return R1.y.f4171a;
            default:
                return new y0(((Number) obj).intValue());
        }
    }
}
