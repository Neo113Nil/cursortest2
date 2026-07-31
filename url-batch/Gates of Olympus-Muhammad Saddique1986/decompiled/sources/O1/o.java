package O1;

import F.A1;
import F.B1;
import F.M;
import F.O;
import F.x1;
import I.C0167p;
import e2.InterfaceC0427f;
import h2.AbstractC0508a;
import r.S;
import s.C0934c;

/* loaded from: classes.dex */
public final class o implements InterfaceC0427f {

    /* renamed from: e, reason: collision with root package name */
    public static final o f3831e = new o(0);

    /* renamed from: f, reason: collision with root package name */
    public static final o f3832f = new o(1);

    /* renamed from: g, reason: collision with root package name */
    public static final o f3833g = new o(2);

    /* renamed from: h, reason: collision with root package name */
    public static final o f3834h = new o(3);

    /* renamed from: i, reason: collision with root package name */
    public static final o f3835i = new o(4);

    /* renamed from: j, reason: collision with root package name */
    public static final o f3836j = new o(5);

    /* renamed from: k, reason: collision with root package name */
    public static final o f3837k = new o(6);

    /* renamed from: l, reason: collision with root package name */
    public static final o f3838l = new o(7);

    /* renamed from: m, reason: collision with root package name */
    public static final o f3839m = new o(8);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3840d;

    public /* synthetic */ o(int i3) {
        this.f3840d = i3;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f3840d) {
            case 0:
                C0167p c0167p = (C0167p) obj2;
                int intValue = ((Number) obj3).intValue();
                f2.j.f((S) obj, "$this$TextButton");
                if ((intValue & 17) == 16 && c0167p.x()) {
                    c0167p.L();
                } else {
                    x1.b("Edit", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p, 6, 0, 131070);
                }
                break;
            case 1:
                C0167p c0167p2 = (C0167p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                f2.j.f((S) obj, "$this$TextButton");
                if ((intValue2 & 17) == 16 && c0167p2.x()) {
                    c0167p2.L();
                } else {
                    x1.b("Save", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p2, 6, 0, 131070);
                }
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                C0167p c0167p3 = (C0167p) obj2;
                int intValue3 = ((Number) obj3).intValue();
                f2.j.f((S) obj, "$this$TextButton");
                if ((intValue3 & 17) == 16 && c0167p3.x()) {
                    c0167p3.L();
                } else {
                    x1.b("Cancel", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p3, 6, 0, 131070);
                }
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                C0167p c0167p4 = (C0167p) obj2;
                int intValue4 = ((Number) obj3).intValue();
                f2.j.f((C0934c) obj, "$this$item");
                if ((intValue4 & 17) == 16 && c0167p4.x()) {
                    c0167p4.L();
                } else {
                    AbstractC0508a.g("Recent haircuts", c0167p4, 6);
                }
                break;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                C0167p c0167p5 = (C0167p) obj2;
                int intValue5 = ((Number) obj3).intValue();
                f2.j.f((C0934c) obj, "$this$item");
                if ((intValue5 & 17) == 16 && c0167p5.x()) {
                    c0167p5.L();
                } else {
                    x1.b("No haircuts logged yet. Add one from the Log tab.", null, ((M) c0167p5.k(O.f1301a)).f1256s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((A1) c0167p5.k(B1.f1124a)).f1110k, c0167p5, 6, 0, 65530);
                }
                break;
            case 5:
                C0167p c0167p6 = (C0167p) obj2;
                int intValue6 = ((Number) obj3).intValue();
                f2.j.f((C0934c) obj, "$this$item");
                if ((intValue6 & 17) == 16 && c0167p6.x()) {
                    c0167p6.L();
                } else {
                    AbstractC0508a.g("By service", c0167p6, 6);
                }
                break;
            case 6:
                C0167p c0167p7 = (C0167p) obj2;
                int intValue7 = ((Number) obj3).intValue();
                f2.j.f((C0934c) obj, "$this$item");
                if ((intValue7 & 17) == 16 && c0167p7.x()) {
                    c0167p7.L();
                } else {
                    x1.b("Log haircuts to see a breakdown by service.", null, ((M) c0167p7.k(O.f1301a)).f1256s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((A1) c0167p7.k(B1.f1124a)).f1110k, c0167p7, 6, 0, 65530);
                }
                break;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                C0167p c0167p8 = (C0167p) obj2;
                int intValue8 = ((Number) obj3).intValue();
                f2.j.f((S) obj, "$this$TextButton");
                if ((intValue8 & 17) == 16 && c0167p8.x()) {
                    c0167p8.L();
                } else {
                    x1.b("Save", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p8, 6, 0, 131070);
                }
                break;
            default:
                C0167p c0167p9 = (C0167p) obj2;
                int intValue9 = ((Number) obj3).intValue();
                f2.j.f((S) obj, "$this$TextButton");
                if ((intValue9 & 17) == 16 && c0167p9.x()) {
                    c0167p9.L();
                } else {
                    x1.b("Cancel", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p9, 6, 0, 131070);
                }
                break;
        }
        return R1.y.f4171a;
    }
}
