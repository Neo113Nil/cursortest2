package I0;

import e2.InterfaceC0424c;

/* renamed from: I0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0191d extends f2.k implements InterfaceC0424c {

    /* renamed from: f, reason: collision with root package name */
    public static final C0191d f3036f = new C0191d(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0191d f3037g = new C0191d(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final C0191d f3038h = new C0191d(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final C0191d f3039i = new C0191d(1, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final C0191d f3040j = new C0191d(1, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final C0191d f3041k = new C0191d(1, 5);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3042e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0191d(int i3, int i4) {
        super(i3);
        this.f3042e = i4;
    }

    @Override // e2.InterfaceC0424c
    public final /* synthetic */ Object n(Object obj) {
        switch (this.f3042e) {
            case 0:
                float[] fArr = ((b0.G) obj).f5350a;
                break;
            case 1:
                float[] fArr2 = ((b0.G) obj).f5350a;
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                int i3 = ((l) obj).f3070a;
                break;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                break;
            default:
                int i4 = ((l) obj).f3070a;
                break;
        }
        return R1.y.f4171a;
    }
}
