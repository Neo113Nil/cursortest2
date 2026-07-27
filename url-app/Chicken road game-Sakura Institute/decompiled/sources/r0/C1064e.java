package r0;

import com.appsflyer.attribution.RequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q.AbstractC1024c;
import s0.C1166s;

/* renamed from: r0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1064e extends M2.p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final C1064e f9779e = new C1064e(1, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final C1064e f9780i = new C1064e(1, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final C1064e f9781j = new C1064e(1, 2);

    /* renamed from: k, reason: collision with root package name */
    public static final C1064e f9782k = new C1064e(1, 3);

    /* renamed from: l, reason: collision with root package name */
    public static final C1064e f9783l = new C1064e(1, 4);

    /* renamed from: m, reason: collision with root package name */
    public static final C1064e f9784m = new C1064e(1, 5);

    /* renamed from: n, reason: collision with root package name */
    public static final C1064e f9785n = new C1064e(1, 6);

    /* renamed from: o, reason: collision with root package name */
    public static final C1064e f9786o = new C1064e(1, 7);

    /* renamed from: p, reason: collision with root package name */
    public static final C1064e f9787p = new C1064e(1, 8);

    /* renamed from: q, reason: collision with root package name */
    public static final C1064e f9788q = new C1064e(1, 9);

    /* renamed from: r, reason: collision with root package name */
    public static final C1064e f9789r = new C1064e(1, 10);

    /* renamed from: s, reason: collision with root package name */
    public static final C1064e f9790s = new C1064e(1, 11);

    /* renamed from: t, reason: collision with root package name */
    public static final C1064e f9791t = new C1064e(1, 12);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9792d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1064e(int i2, int i4) {
        super(i2);
        this.f9792d = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9792d) {
            case 0:
                ((C1062c) obj).D0();
                break;
            case 1:
                k0 k0Var = (k0) obj;
                if (k0Var.N()) {
                    k0Var.f9824e.s0(k0Var);
                }
                break;
            case 2:
                f0 f0Var = ((a0) obj).f9761J;
                if (f0Var != null) {
                    f0Var.invalidate();
                }
                break;
            case 3:
                a0 a0Var = (a0) obj;
                if (a0Var.N()) {
                    C1079u c1079u = a0Var.f9757F;
                    if (c1079u == null) {
                        a0Var.k1(true);
                    } else {
                        C1079u c1079u2 = a0.f9749L;
                        c1079u2.getClass();
                        c1079u2.f9843a = c1079u.f9843a;
                        c1079u2.f9844b = c1079u.f9844b;
                        c1079u2.f9845c = c1079u.f9845c;
                        c1079u2.f9846d = c1079u.f9846d;
                        c1079u2.f9847e = c1079u.f9847e;
                        c1079u2.f9848f = c1079u.f9848f;
                        c1079u2.f9849g = c1079u.f9849g;
                        c1079u2.f9850h = c1079u.f9850h;
                        c1079u2.f9851i = c1079u.f9851i;
                        a0Var.k1(true);
                        if (c1079u2.f9843a != c1079u.f9843a || c1079u2.f9844b != c1079u.f9844b || c1079u2.f9845c != c1079u.f9845c || c1079u2.f9846d != c1079u.f9846d || c1079u2.f9847e != c1079u.f9847e || c1079u2.f9848f != c1079u.f9848f || c1079u2.f9849g != c1079u.f9849g || c1079u2.f9850h != c1079u.f9850h || !Z.U.a(c1079u2.f9851i, c1079u.f9851i)) {
                            E e4 = a0Var.f9762r;
                            L l4 = e4.f9584C;
                            if (l4.f9687n > 0) {
                                if (l4.f9686m || l4.f9685l) {
                                    e4.S(false);
                                }
                                l4.f9691r.u0();
                            }
                            C1166s c1166s = e4.f9602o;
                            if (c1166s != null) {
                                ((I.d) c1166s.f10330M.f9720e.f7976b).b(e4);
                                e4.f9590I = true;
                                c1166s.C(null);
                            }
                        }
                    }
                }
                break;
            case 4:
                d0 d0Var = (d0) obj;
                if (d0Var.N()) {
                    d0Var.f9778d.l0();
                }
                break;
            case 5:
                Intrinsics.d(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                break;
            case 6:
                E e5 = (E) obj;
                if (e5.D()) {
                    e5.S(false);
                }
                break;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                E e6 = (E) obj;
                if (e6.D()) {
                    e6.S(false);
                }
                break;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                E e7 = (E) obj;
                if (e7.D()) {
                    e7.Q(false);
                }
                break;
            case AbstractC1024c.f9242c /* 9 */:
                E e8 = (E) obj;
                if (e8.D()) {
                    e8.Q(false);
                }
                break;
            case 10:
                E e9 = (E) obj;
                if (e9.D()) {
                    E.R(e9, false, 7);
                }
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                E e10 = (E) obj;
                if (e10.D()) {
                    E.T(e10, false, 7);
                }
                break;
            default:
                E e11 = (E) obj;
                if (e11.D()) {
                    e11.B();
                }
                break;
        }
        return Unit.f7487a;
    }
}
