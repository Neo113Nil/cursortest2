package O1;

import F.AbstractC0119s0;
import F.M;
import F.O;
import F.x1;
import I.C0167p;
import b0.C0352v;
import b0.T;
import e2.InterfaceC0426e;
import h0.AbstractC0454G;
import h0.C0462e;
import h0.C0463f;
import h0.C0467j;
import h0.C0471n;
import h2.AbstractC0508a;
import java.util.ArrayList;
import r.AbstractC0856c;

/* loaded from: classes.dex */
public final class n implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public static final n f3813e = new n(0);

    /* renamed from: f, reason: collision with root package name */
    public static final n f3814f = new n(1);

    /* renamed from: g, reason: collision with root package name */
    public static final n f3815g = new n(2);

    /* renamed from: h, reason: collision with root package name */
    public static final n f3816h = new n(3);

    /* renamed from: i, reason: collision with root package name */
    public static final n f3817i = new n(4);

    /* renamed from: j, reason: collision with root package name */
    public static final n f3818j = new n(5);

    /* renamed from: k, reason: collision with root package name */
    public static final n f3819k = new n(6);

    /* renamed from: l, reason: collision with root package name */
    public static final n f3820l = new n(7);

    /* renamed from: m, reason: collision with root package name */
    public static final n f3821m = new n(8);

    /* renamed from: n, reason: collision with root package name */
    public static final n f3822n = new n(9);

    /* renamed from: o, reason: collision with root package name */
    public static final n f3823o = new n(10);

    /* renamed from: p, reason: collision with root package name */
    public static final n f3824p = new n(11);

    /* renamed from: q, reason: collision with root package name */
    public static final n f3825q = new n(12);

    /* renamed from: r, reason: collision with root package name */
    public static final n f3826r = new n(13);

    /* renamed from: s, reason: collision with root package name */
    public static final n f3827s = new n(14);

    /* renamed from: t, reason: collision with root package name */
    public static final n f3828t = new n(15);

    /* renamed from: u, reason: collision with root package name */
    public static final n f3829u = new n(16);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3830d;

    public /* synthetic */ n(int i3) {
        this.f3830d = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        R1.y yVar = R1.y.f4171a;
        switch (this.f3830d) {
            case 0:
                C0167p c0167p = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p.x()) {
                    x1.b("Client", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p, 6, 0, 131070);
                    break;
                } else {
                    c0167p.L();
                    break;
                }
            case 1:
                C0167p c0167p2 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p2.x()) {
                    AbstractC0119s0.a(AbstractC0508a.D(), null, null, 0L, c0167p2, 48, 12);
                    break;
                } else {
                    c0167p2.L();
                    break;
                }
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                C0167p c0167p3 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p3.x()) {
                    AbstractC0119s0.a(O2.d.P(), "Delete", null, ((M) c0167p3.k(O.f1301a)).f1260w, c0167p3, 48, 4);
                    break;
                } else {
                    c0167p3.L();
                    break;
                }
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                C0167p c0167p4 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p4.x()) {
                    x1.b("Name", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p4, 6, 0, 131070);
                    break;
                } else {
                    c0167p4.L();
                    break;
                }
                break;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                C0167p c0167p5 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p5.x()) {
                    x1.b("Phone (optional)", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p5, 6, 0, 131070);
                    break;
                } else {
                    c0167p5.L();
                    break;
                }
                break;
            case 5:
                C0167p c0167p6 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p6.x()) {
                    x1.b("Note (optional)", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p6, 6, 0, 131070);
                    break;
                } else {
                    c0167p6.L();
                    break;
                }
            case 6:
                C0167p c0167p7 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p7.x()) {
                    AbstractC0119s0.a(O2.d.P(), "Delete", null, ((M) c0167p7.k(O.f1301a)).f1260w, c0167p7, 48, 4);
                    break;
                } else {
                    c0167p7.L();
                    break;
                }
                break;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                C0167p c0167p8 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p8.x()) {
                    x1.b("Walk-in name", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p8, 6, 0, 131070);
                    break;
                } else {
                    c0167p8.L();
                    break;
                }
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                C0167p c0167p9 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p9.x()) {
                    x1.b("Service", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p9, 6, 0, 131070);
                    break;
                } else {
                    c0167p9.L();
                    break;
                }
                break;
            case AbstractC0856c.f8037c /* 9 */:
                C0167p c0167p10 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p10.x()) {
                    x1.b("Price", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p10, 6, 0, 131070);
                    break;
                } else {
                    c0167p10.L();
                    break;
                }
                break;
            case AbstractC0856c.f8039e /* 10 */:
                C0167p c0167p11 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p11.x()) {
                    x1.b("Note (optional)", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p11, 6, 0, 131070);
                    break;
                } else {
                    c0167p11.L();
                    break;
                }
            case 11:
                C0167p c0167p12 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p12.x()) {
                    x1.b("Haircut", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p12, 6, 0, 131070);
                    break;
                } else {
                    c0167p12.L();
                    break;
                }
                break;
            case 12:
                C0167p c0167p13 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p13.x()) {
                    AbstractC0119s0.a(AbstractC0508a.D(), null, null, 0L, c0167p13, 48, 12);
                    break;
                } else {
                    c0167p13.L();
                    break;
                }
            case 13:
                C0167p c0167p14 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p14.x()) {
                    x1.b("Log a haircut", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p14, 6, 0, 131070);
                    break;
                } else {
                    c0167p14.L();
                    break;
                }
                break;
            case 14:
                C0167p c0167p15 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p15.x()) {
                    x1.b("Client", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p15, 6, 0, 131070);
                    break;
                } else {
                    c0167p15.L();
                    break;
                }
                break;
            case AbstractC0856c.f8041g /* 15 */:
                C0167p c0167p16 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p16.x()) {
                    C0463f c0463f = l0.c.f6578d;
                    if (c0463f == null) {
                        C0462e c0462e = new C0462e("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = AbstractC0454G.f5881a;
                        T t3 = new T(C0352v.f5434b);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new C0471n(7.0f, 10.0f));
                        arrayList.add(new h0.u(5.0f, 5.0f));
                        arrayList.add(new h0.u(5.0f, -5.0f));
                        arrayList.add(C0467j.f5990c);
                        C0462e.a(c0462e, arrayList, t3);
                        c0463f = c0462e.b();
                        l0.c.f6578d = c0463f;
                    }
                    AbstractC0119s0.a(c0463f, null, null, 0L, c0167p16, 48, 12);
                    break;
                } else {
                    c0167p16.L();
                    break;
                }
            default:
                C0167p c0167p17 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p17.x()) {
                    x1.b("Walk-in", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p17, 6, 0, 131070);
                    break;
                } else {
                    c0167p17.L();
                    break;
                }
        }
        return yVar;
    }
}
