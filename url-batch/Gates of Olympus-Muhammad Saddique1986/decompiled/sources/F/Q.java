package F;

import I.C0167p;
import e2.InterfaceC0426e;
import r0.InterfaceC0884F;

/* loaded from: classes.dex */
public final class Q extends f2.k implements InterfaceC0426e {

    /* renamed from: f, reason: collision with root package name */
    public static final Q f1311f = new Q(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final Q f1312g = new Q(2, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final Q f1313h = new Q(2, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final Q f1314i = new Q(2, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final Q f1315j = new Q(2, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final Q f1316k = new Q(2, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final Q f1317l = new Q(2, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final Q f1318m = new Q(2, 7);

    /* renamed from: n, reason: collision with root package name */
    public static final Q f1319n = new Q(2, 8);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1320e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(int i3, int i4) {
        super(i3);
        this.f1320e = i4;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f1320e) {
            case 0:
                C0167p c0167p = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
                    c0167p.L();
                }
                return R1.y.f4171a;
            case 1:
                C0167p c0167p2 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p2.x()) {
                    c0167p2.L();
                }
                return R1.y.f4171a;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                C0167p c0167p3 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p3.x()) {
                    c0167p3.L();
                }
                return R1.y.f4171a;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                C0167p c0167p4 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p4.x()) {
                    c0167p4.L();
                }
                return R1.y.f4171a;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                C0167p c0167p5 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p5.x()) {
                    c0167p5.L();
                }
                return R1.y.f4171a;
            case 5:
                return Integer.valueOf(((InterfaceC0884F) obj).c(((Number) obj2).intValue()));
            case 6:
                return Integer.valueOf(((InterfaceC0884F) obj).U(((Number) obj2).intValue()));
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return Integer.valueOf(((InterfaceC0884F) obj).V(((Number) obj2).intValue()));
            default:
                return Integer.valueOf(((InterfaceC0884F) obj).O(((Number) obj2).intValue()));
        }
    }
}
