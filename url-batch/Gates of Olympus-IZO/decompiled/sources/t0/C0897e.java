package t0;

import b0.C0266Q;
import f.AbstractC0382a;
import h1.C0438i;
import u0.C0997t;

/* renamed from: t0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0897e extends Z1.j implements Y1.c {

    /* renamed from: f, reason: collision with root package name */
    public static final C0897e f7896f = new C0897e(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0897e f7897g = new C0897e(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final C0897e f7898h = new C0897e(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final C0897e f7899i = new C0897e(1, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final C0897e f7900j = new C0897e(1, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final C0897e f7901k = new C0897e(1, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final C0897e f7902l = new C0897e(1, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final C0897e f7903m = new C0897e(1, 7);

    /* renamed from: n, reason: collision with root package name */
    public static final C0897e f7904n = new C0897e(1, 8);

    /* renamed from: o, reason: collision with root package name */
    public static final C0897e f7905o = new C0897e(1, 9);
    public static final C0897e p = new C0897e(1, 10);

    /* renamed from: q, reason: collision with root package name */
    public static final C0897e f7906q = new C0897e(1, 11);

    /* renamed from: r, reason: collision with root package name */
    public static final C0897e f7907r = new C0897e(1, 12);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7908e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0897e(int i3, int i4) {
        super(i3);
        this.f7908e = i4;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f7908e) {
            case 0:
                ((C0895c) obj).x0();
                break;
            case 1:
                k0 k0Var = (k0) obj;
                if (k0Var.H()) {
                    k0Var.f7935e.b0(k0Var);
                }
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                f0 f0Var = ((a0) obj).f7876G;
                if (f0Var != null) {
                    f0Var.invalidate();
                }
                break;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                a0 a0Var = (a0) obj;
                if (a0Var.H()) {
                    C0912u c0912u = a0Var.C;
                    if (c0912u == null) {
                        a0Var.V0(true);
                    } else {
                        C0912u c0912u2 = a0.f7870I;
                        c0912u2.getClass();
                        c0912u2.f7957a = c0912u.f7957a;
                        c0912u2.f7958b = c0912u.f7958b;
                        c0912u2.f7959c = c0912u.f7959c;
                        c0912u2.f7960d = c0912u.f7960d;
                        c0912u2.f7961e = c0912u.f7961e;
                        c0912u2.f7962f = c0912u.f7962f;
                        c0912u2.f7963g = c0912u.f7963g;
                        c0912u2.f7964h = c0912u.f7964h;
                        c0912u2.f7965i = c0912u.f7965i;
                        a0Var.V0(true);
                        if (c0912u2.f7957a != c0912u.f7957a || c0912u2.f7958b != c0912u.f7958b || c0912u2.f7959c != c0912u.f7959c || c0912u2.f7960d != c0912u.f7960d || c0912u2.f7961e != c0912u.f7961e || c0912u2.f7962f != c0912u.f7962f || c0912u2.f7963g != c0912u.f7963g || c0912u2.f7964h != c0912u.f7964h || !C0266Q.a(c0912u2.f7965i, c0912u.f7965i)) {
                            D d3 = a0Var.f7877o;
                            L l3 = d3.f7736y;
                            if (l3.f7810n > 0) {
                                if (l3.f7809m || l3.f7808l) {
                                    d3.Q(false);
                                }
                                l3.f7813r.e0();
                            }
                            C0997t c0997t = d3.f7724l;
                            if (c0997t != null) {
                                ((K.d) c0997t.f8416J.f7841e.f484e).b(d3);
                                d3.f7712E = true;
                                c0997t.D(null);
                            }
                        }
                    }
                }
                break;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                d0 d0Var = (d0) obj;
                if (d0Var.H()) {
                    d0Var.f7895d.d0();
                }
                break;
            case 5:
                Z1.i.d(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                break;
            case 6:
                D d4 = (D) obj;
                if (d4.B()) {
                    d4.Q(false);
                }
                break;
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                D d5 = (D) obj;
                if (d5.B()) {
                    d5.Q(false);
                }
                break;
            case 8:
                D d6 = (D) obj;
                if (d6.B()) {
                    d6.O(false);
                }
                break;
            case AbstractC0382a.f4777a /* 9 */:
                D d7 = (D) obj;
                if (d7.B()) {
                    d7.O(false);
                }
                break;
            case AbstractC0382a.f4779c /* 10 */:
                D d8 = (D) obj;
                if (d8.B()) {
                    D.P(d8, false, 7);
                }
                break;
            case 11:
                D d9 = (D) obj;
                if (d9.B()) {
                    D.R(d9, false, 7);
                }
                break;
            default:
                D d10 = (D) obj;
                if (d10.B()) {
                    d10.z();
                }
                break;
        }
        return L1.z.f2729a;
    }
}
