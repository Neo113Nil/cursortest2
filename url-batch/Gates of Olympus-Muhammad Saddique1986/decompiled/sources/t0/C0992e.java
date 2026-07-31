package t0;

import e2.InterfaceC0424c;
import r.AbstractC0856c;
import u0.C1123s;

/* renamed from: t0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0992e extends f2.k implements InterfaceC0424c {

    /* renamed from: f, reason: collision with root package name */
    public static final C0992e f8728f = new C0992e(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0992e f8729g = new C0992e(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final C0992e f8730h = new C0992e(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final C0992e f8731i = new C0992e(1, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final C0992e f8732j = new C0992e(1, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final C0992e f8733k = new C0992e(1, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final C0992e f8734l = new C0992e(1, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final C0992e f8735m = new C0992e(1, 7);

    /* renamed from: n, reason: collision with root package name */
    public static final C0992e f8736n = new C0992e(1, 8);

    /* renamed from: o, reason: collision with root package name */
    public static final C0992e f8737o = new C0992e(1, 9);

    /* renamed from: p, reason: collision with root package name */
    public static final C0992e f8738p = new C0992e(1, 10);

    /* renamed from: q, reason: collision with root package name */
    public static final C0992e f8739q = new C0992e(1, 11);

    /* renamed from: r, reason: collision with root package name */
    public static final C0992e f8740r = new C0992e(1, 12);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8741e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0992e(int i3, int i4) {
        super(i3);
        this.f8741e = i4;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f8741e) {
            case 0:
                ((C0990c) obj).A0();
                break;
            case 1:
                l0 l0Var = (l0) obj;
                if (l0Var.L()) {
                    l0Var.f8769e.o0(l0Var);
                }
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                g0 g0Var = ((b0) obj).f8710G;
                if (g0Var != null) {
                    g0Var.invalidate();
                }
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                b0 b0Var = (b0) obj;
                if (b0Var.L()) {
                    C1007u c1007u = b0Var.C;
                    if (c1007u == null) {
                        b0Var.g1(true);
                    } else {
                        C1007u c1007u2 = b0.f8702I;
                        c1007u2.getClass();
                        c1007u2.f8791a = c1007u.f8791a;
                        c1007u2.f8792b = c1007u.f8792b;
                        c1007u2.f8793c = c1007u.f8793c;
                        c1007u2.f8794d = c1007u.f8794d;
                        c1007u2.f8795e = c1007u.f8795e;
                        c1007u2.f8796f = c1007u.f8796f;
                        c1007u2.f8797g = c1007u.f8797g;
                        c1007u2.f8798h = c1007u.f8798h;
                        c1007u2.f8799i = c1007u.f8799i;
                        b0Var.g1(true);
                        if (c1007u2.f8791a != c1007u.f8791a || c1007u2.f8792b != c1007u.f8792b || c1007u2.f8793c != c1007u.f8793c || c1007u2.f8794d != c1007u.f8794d || c1007u2.f8795e != c1007u.f8795e || c1007u2.f8796f != c1007u.f8796f || c1007u2.f8797g != c1007u.f8797g || c1007u2.f8798h != c1007u.f8798h || !b0.U.a(c1007u2.f8799i, c1007u.f8799i)) {
                            E e3 = b0Var.f8711o;
                            M m3 = e3.f8562z;
                            if (m3.f8638n > 0) {
                                if (m3.f8637m || m3.f8636l) {
                                    e3.S(false);
                                }
                                m3.f8642r.q0();
                            }
                            C1123s c1123s = e3.f8548l;
                            if (c1123s != null) {
                                ((K.d) c1123s.f9460J.f8671e.f10466e).b(e3);
                                e3.f8536F = true;
                                c1123s.D(null);
                            }
                        }
                    }
                }
                break;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                e0 e0Var = (e0) obj;
                if (e0Var.L()) {
                    e0Var.f8742d.e0();
                }
                break;
            case 5:
                f2.j.d(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                break;
            case 6:
                E e4 = (E) obj;
                if (e4.D()) {
                    e4.S(false);
                }
                break;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                E e5 = (E) obj;
                if (e5.D()) {
                    e5.S(false);
                }
                break;
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                E e6 = (E) obj;
                if (e6.D()) {
                    e6.Q(false);
                }
                break;
            case AbstractC0856c.f8037c /* 9 */:
                E e7 = (E) obj;
                if (e7.D()) {
                    e7.Q(false);
                }
                break;
            case AbstractC0856c.f8039e /* 10 */:
                E e8 = (E) obj;
                if (e8.D()) {
                    E.R(e8, false, 7);
                }
                break;
            case 11:
                E e9 = (E) obj;
                if (e9.D()) {
                    E.T(e9, false, 7);
                }
                break;
            default:
                E e10 = (E) obj;
                if (e10.D()) {
                    e10.B();
                }
                break;
        }
        return R1.y.f4171a;
    }
}
