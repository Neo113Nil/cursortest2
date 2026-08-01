package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends wd.p implements Function1 {
    public static final d A;

    /* renamed from: e, reason: collision with root package name */
    public static final d f1511e;

    /* renamed from: i, reason: collision with root package name */
    public static final d f1512i;

    /* renamed from: r, reason: collision with root package name */
    public static final d f1513r;

    /* renamed from: s, reason: collision with root package name */
    public static final d f1514s;

    /* renamed from: t, reason: collision with root package name */
    public static final d f1515t;

    /* renamed from: u, reason: collision with root package name */
    public static final d f1516u;

    /* renamed from: v, reason: collision with root package name */
    public static final d f1517v;

    /* renamed from: w, reason: collision with root package name */
    public static final d f1518w;

    /* renamed from: x, reason: collision with root package name */
    public static final d f1519x;

    /* renamed from: y, reason: collision with root package name */
    public static final d f1520y;

    /* renamed from: z, reason: collision with root package name */
    public static final d f1521z;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1522d;

    static {
        int i3 = 1;
        f1511e = new d(i3, 0);
        f1512i = new d(i3, 1);
        f1513r = new d(i3, 2);
        f1514s = new d(i3, 3);
        f1515t = new d(i3, 4);
        f1516u = new d(i3, 5);
        f1517v = new d(i3, 6);
        f1518w = new d(i3, 7);
        f1519x = new d(i3, 8);
        f1520y = new d(i3, 9);
        f1521z = new d(i3, 10);
        A = new d(i3, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i3, int i10) {
        super(i3);
        this.f1522d = i10;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [c2.k1, d1.k] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1522d) {
            case 0:
                g gVar = (g) obj;
                g0 g0Var = gVar instanceof g0 ? (g0) gVar : null;
                if (g0Var != null && g0Var.f1549d0) {
                    z1.a.b("Apply is called on deactivated node " + gVar);
                }
                return Unit.f5554a;
            case 1:
                s1 s1Var = (s1) obj;
                if (s1Var.o()) {
                    o0 o0Var = s1Var.f1669e;
                    if (!o0Var.f1635x) {
                        Function1 d10 = s1Var.f1668d.d();
                        s.h0 h0Var = o0Var.A;
                        if (d10 != null) {
                            o0Var.e0(s1Var, 9223372034707292159L, 0L);
                            o0Var.f1632u = d10;
                        } else if (h0Var != null) {
                            Object[] objArr = h0Var.f8314c;
                            long[] jArr = h0Var.f8312a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                while (true) {
                                    long j = jArr[i3];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i10 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i11 = 0; i11 < i10; i11++) {
                                            if ((255 & j) < 128) {
                                                o0Var.q0((s.i0) objArr[(i3 << 3) + i11]);
                                            }
                                            j >>= 8;
                                        }
                                        if (i10 != 8) {
                                        }
                                    }
                                    if (i3 != length) {
                                        i3++;
                                    }
                                }
                            }
                            h0Var.a();
                        }
                    }
                }
                return Unit.f5554a;
            case 2:
                o1 o1Var = ((i1) obj).Y;
                if (o1Var != null) {
                    ((d2.i1) o1Var).c();
                }
                return Unit.f5554a;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                i1 i1Var = (i1) obj;
                g0 g0Var2 = i1Var.B;
                try {
                    if (i1Var.o()) {
                        i1Var.a1(true);
                    }
                    return Unit.f5554a;
                } catch (Throwable th) {
                    g0Var2.U(th);
                    throw null;
                }
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                l1 l1Var = (l1) obj;
                if (l1Var.o()) {
                    l1Var.f1612d.h();
                }
                return Unit.f5554a;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                g0 g0Var3 = (g0) obj;
                if (g0Var3.E()) {
                    g0Var3.Q(false);
                }
                return Unit.f5554a;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                g0 g0Var4 = (g0) obj;
                if (g0Var4.E()) {
                    g0Var4.Q(false);
                }
                return Unit.f5554a;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                g0 g0Var5 = (g0) obj;
                if (g0Var5.E()) {
                    g0Var5.O(false);
                }
                return Unit.f5554a;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                g0 g0Var6 = (g0) obj;
                if (g0Var6.E()) {
                    g0Var6.O(false);
                }
                return Unit.f5554a;
            case 9:
                g0 g0Var7 = (g0) obj;
                if (g0Var7.E()) {
                    g0.P(g0Var7, false, 7);
                }
                return Unit.f5554a;
            case 10:
                g0 g0Var8 = (g0) obj;
                if (g0Var8.E()) {
                    g0.R(g0Var8, false, 7);
                }
                return Unit.f5554a;
            default:
                g0 g0Var9 = (g0) obj;
                if (g0Var9.E()) {
                    g0Var9.C();
                }
                return Unit.f5554a;
        }
    }
}
