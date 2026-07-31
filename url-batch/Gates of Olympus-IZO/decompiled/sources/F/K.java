package F;

import b0.C0288u;
import f.AbstractC0382a;
import h1.C0438i;

/* loaded from: classes.dex */
public final class K extends Z1.j implements Y1.a {

    /* renamed from: f, reason: collision with root package name */
    public static final K f1030f = new K(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final K f1031g = new K(0, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final K f1032h = new K(0, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final K f1033i = new K(0, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final K f1034j = new K(0, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final K f1035k = new K(0, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final K f1036l = new K(0, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final K f1037m = new K(0, 7);

    /* renamed from: n, reason: collision with root package name */
    public static final K f1038n = new K(0, 8);

    /* renamed from: o, reason: collision with root package name */
    public static final K f1039o = new K(0, 9);
    public static final K p = new K(0, 10);

    /* renamed from: q, reason: collision with root package name */
    public static final K f1040q = new K(0, 11);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1041e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i3, int i4) {
        super(i3);
        this.f1041e = i4;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f1041e) {
            case 0:
                return L.e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1);
            case 1:
                return Boolean.TRUE;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0288u(C0288u.f4292b);
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                return Boolean.TRUE;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                return new M0.e(48);
            case 5:
                return Boolean.FALSE;
            case 6:
                return new C0078z0();
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                return Boolean.FALSE;
            case 8:
                return new O0();
            case AbstractC0382a.f4777a /* 9 */:
                return new M0.e(0);
            case AbstractC0382a.f4779c /* 10 */:
                return H.t.f1846a;
            case 11:
                return new a1();
            case 12:
                return L1.z.f2729a;
            default:
                return Float.valueOf(0.0f);
        }
    }
}
