package F;

import b0.C0352v;
import e2.InterfaceC0422a;
import r.AbstractC0856c;

/* loaded from: classes.dex */
public final class N extends f2.k implements InterfaceC0422a {

    /* renamed from: f, reason: collision with root package name */
    public static final N f1273f = new N(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final N f1274g = new N(0, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final N f1275h = new N(0, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final N f1276i = new N(0, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final N f1277j = new N(0, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final N f1278k = new N(0, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final N f1279l = new N(0, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final N f1280m = new N(0, 7);

    /* renamed from: n, reason: collision with root package name */
    public static final N f1281n = new N(0, 8);

    /* renamed from: o, reason: collision with root package name */
    public static final N f1282o = new N(0, 9);

    /* renamed from: p, reason: collision with root package name */
    public static final N f1283p = new N(0, 10);

    /* renamed from: q, reason: collision with root package name */
    public static final N f1284q = new N(0, 11);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1285e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N(int i3, int i4) {
        super(i3);
        this.f1285e = i4;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f1285e) {
            case 0:
                return O.e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1);
            case 1:
                return Boolean.TRUE;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0352v(C0352v.f5434b);
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                return Boolean.TRUE;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                return new O0.e(48);
            case 5:
                return Boolean.FALSE;
            case 6:
                return new c1();
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return Boolean.FALSE;
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                return new m1();
            case AbstractC0856c.f8037c /* 9 */:
                return new O0.e(0);
            case AbstractC0856c.f8039e /* 10 */:
                return H.x.f2585a;
            case 11:
                return new A1();
            case 12:
                return R1.y.f4171a;
            default:
                return Float.valueOf(0.0f);
        }
    }
}
