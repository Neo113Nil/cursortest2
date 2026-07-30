package r1;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends r6.l implements q6.c {

    /* renamed from: h, reason: collision with root package name */
    public static final e f7741h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f7742i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f7743j;

    /* renamed from: k, reason: collision with root package name */
    public static final e f7744k;

    /* renamed from: l, reason: collision with root package name */
    public static final e f7745l;

    /* renamed from: m, reason: collision with root package name */
    public static final e f7746m;

    /* renamed from: n, reason: collision with root package name */
    public static final e f7747n;

    /* renamed from: o, reason: collision with root package name */
    public static final e f7748o;

    /* renamed from: p, reason: collision with root package name */
    public static final e f7749p;

    /* renamed from: q, reason: collision with root package name */
    public static final e f7750q;

    /* renamed from: r, reason: collision with root package name */
    public static final e f7751r;

    /* renamed from: s, reason: collision with root package name */
    public static final e f7752s;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7753g;

    static {
        int i7 = 1;
        f7741h = new e(i7, 0);
        f7742i = new e(i7, 1);
        f7743j = new e(i7, 2);
        f7744k = new e(i7, 3);
        f7745l = new e(i7, 4);
        f7746m = new e(i7, 5);
        f7747n = new e(i7, 6);
        f7748o = new e(i7, 7);
        f7749p = new e(i7, 8);
        f7750q = new e(i7, 9);
        f7751r = new e(i7, 10);
        f7752s = new e(i7, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i7, int i8) {
        super(i7);
        this.f7753g = i8;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f7753g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((c) obj).C0();
                break;
            case 1:
                k1 k1Var = (k1) obj;
                if (k1Var.z()) {
                    k1Var.f7830g.q0(k1Var);
                }
                break;
            case 2:
                f1 f1Var = ((a1) obj).I;
                if (f1Var != null) {
                    f1Var.invalidate();
                }
                break;
            case 3:
                a1 a1Var = (a1) obj;
                if (a1Var.z()) {
                    u uVar = a1Var.E;
                    if (uVar == null) {
                        a1Var.i1(true);
                    } else {
                        u uVar2 = a1.K;
                        uVar2.getClass();
                        uVar2.f7900a = uVar.f7900a;
                        uVar2.f7901b = uVar.f7901b;
                        uVar2.f7902c = uVar.f7902c;
                        uVar2.f7903d = uVar.f7903d;
                        a1Var.i1(true);
                        if (uVar2.f7900a != uVar.f7900a || uVar2.f7901b != uVar.f7901b || uVar2.f7902c != uVar.f7902c || !z0.s0.a(uVar2.f7903d, uVar.f7903d)) {
                            d0 d0Var = a1Var.f7700q;
                            l0 l0Var = d0Var.B;
                            if (l0Var.f7844n > 0) {
                                if (l0Var.f7843m || l0Var.f7842l) {
                                    d0Var.S(false);
                                }
                                l0Var.f7848r.s0();
                            }
                            g1 g1Var = d0Var.f7727n;
                            if (g1Var != null) {
                                s1.r rVar = (s1.r) g1Var;
                                ((i0.d) rVar.L.f7895e.f7527g).b(d0Var);
                                d0Var.H = true;
                                rVar.C(null);
                            }
                        }
                    }
                }
                break;
            case 4:
                d1 d1Var = (d1) obj;
                if (d1Var.z()) {
                    d1Var.f7740f.I();
                }
                break;
            case 5:
                d0 d0Var2 = (d0) obj;
                if (d0Var2.E()) {
                    d0Var2.S(false);
                }
                break;
            case 6:
                d0 d0Var3 = (d0) obj;
                if (d0Var3.E()) {
                    d0Var3.S(false);
                }
                break;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                d0 d0Var4 = (d0) obj;
                if (d0Var4.E()) {
                    d0Var4.Q(false);
                }
                break;
            case 8:
                d0 d0Var5 = (d0) obj;
                if (d0Var5.E()) {
                    d0Var5.Q(false);
                }
                break;
            case q.c.f7259c /* 9 */:
                d0 d0Var6 = (d0) obj;
                if (d0Var6.E()) {
                    d0.R(d0Var6, false, 7);
                }
                break;
            case q.c.f7261e /* 10 */:
                d0 d0Var7 = (d0) obj;
                if (d0Var7.E()) {
                    d0.T(d0Var7, false, 7);
                }
                break;
            default:
                d0 d0Var8 = (d0) obj;
                if (d0Var8.E()) {
                    d0Var8.C();
                }
                break;
        }
        return d6.z.f2639a;
    }
}
