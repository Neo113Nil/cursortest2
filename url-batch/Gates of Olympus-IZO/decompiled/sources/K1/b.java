package K1;

import F.AbstractC0035d0;
import F.J;
import F.L;
import F.a1;
import I.C0089d;
import I.C0113p;
import I.C0119s0;
import L1.z;
import Y1.e;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.AbstractC0259J;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2662a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f2663b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f2664c;

    /* renamed from: d, reason: collision with root package name */
    public static final J f2665d;

    /* renamed from: e, reason: collision with root package name */
    public static final J f2666e;

    static {
        long c3 = AbstractC0259J.c(4284103202L);
        f2662a = c3;
        long c4 = AbstractC0259J.c(4282264604L);
        long c5 = AbstractC0259J.c(4291271267L);
        f2663b = c5;
        long c6 = AbstractC0259J.c(4293383089L);
        long c7 = AbstractC0259J.c(4289758251L);
        f2664c = c7;
        long c8 = AbstractC0259J.c(4294372569L);
        long c9 = AbstractC0259J.c(4280950808L);
        f2665d = L.e(c3, c8, c6, c4, c7, c8, c5, c8, c9, AbstractC0259J.c(4294702310L), c9, c6, c4, -516720);
        long c10 = AbstractC0259J.c(4280293391L);
        long c11 = AbstractC0259J.c(4280950808L);
        f2666e = new J(c5, c4, c3, c6, H.a.f1601d, c7, c9, H.a.f1611n, H.a.f1605h, c6, H.a.f1606i, H.a.f1618v, H.a.f1607j, c10, c6, c11, c6, c4, c5, c5, H.a.f1602e, H.a.f1600c, H.a.f1598a, H.a.f1603f, H.a.f1599b, H.a.f1604g, H.a.f1608k, H.a.f1609l, H.a.f1610m, H.a.f1612o, H.a.f1617u, H.a.p, H.a.f1613q, H.a.f1614r, H.a.f1615s, H.a.f1616t);
    }

    public static final void a(final boolean z3, final Q.a aVar, C0113p c0113p, final int i3) {
        c0113p.S(1829456956);
        int i4 = (i3 & 6) == 0 ? i3 | 2 : i3;
        if ((i3 & 48) == 0) {
            i4 |= c0113p.h(aVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0113p.x()) {
            c0113p.L();
        } else {
            c0113p.N();
            if ((i3 & 1) == 0 || c0113p.w()) {
                z3 = (((Configuration) c0113p.k(AndroidCompositionLocals_androidKt.f3737a)).uiMode & 48) == 32;
            } else {
                c0113p.L();
            }
            int i5 = i4 & (-15);
            c0113p.q();
            AbstractC0035d0.a(z3 ? f2666e : f2665d, null, new a1(), aVar, c0113p, ((i5 << 6) & 7168) | 384);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new e() { // from class: K1.a
                @Override // Y1.e
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int T2 = C0089d.T(i3 | 1);
                    Q.a aVar2 = aVar;
                    b.a(z3, aVar2, (C0113p) obj, T2);
                    return z.f2729a;
                }
            };
        }
    }
}
