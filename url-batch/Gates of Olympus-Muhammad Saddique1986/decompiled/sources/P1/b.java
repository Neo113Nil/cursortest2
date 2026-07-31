package P1;

import F.A1;
import F.AbstractC0123u0;
import F.M;
import F.O;
import I.C0143d;
import I.C0167p;
import I.C0173s0;
import R1.y;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.C0352v;
import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final M f3922a;

    /* renamed from: b, reason: collision with root package name */
    public static final M f3923b;

    static {
        long d3 = b0.M.d(4289751611L);
        long d4 = b0.M.d(4286203174L);
        long d5 = b0.M.d(4294372577L);
        long d6 = b0.M.d(4294966262L);
        long d7 = b0.M.d(4281017120L);
        long j3 = C0352v.f5435c;
        f3922a = O.e(d3, j3, b0.M.d(4294105284L), d4, d4, j3, d5, d7, d6, d7, b0.M.d(4293582803L), b0.M.d(4284173892L), -516208);
        long d8 = b0.M.d(4292911991L);
        long d9 = b0.M.d(4281999118L);
        long d10 = b0.M.d(4280293910L);
        long d11 = b0.M.d(4280951584L);
        f3923b = new M(d8, d9, H.a.f2338p, H.a.f2330h, H.a.f2326d, H.a.f2340r, H.a.f2331i, H.a.f2341s, H.a.f2332j, H.a.f2322B, H.a.f2334l, H.a.C, H.a.f2335m, d10, d5, d11, d5, H.a.f2321A, H.a.f2333k, d8, H.a.f2327e, H.a.f2325c, H.a.f2323a, H.a.f2328f, H.a.f2324b, H.a.f2329g, H.a.f2336n, H.a.f2337o, H.a.f2339q, H.a.f2342t, H.a.f2348z, H.a.f2343u, H.a.f2344v, H.a.f2345w, H.a.f2346x, H.a.f2347y);
    }

    public static final void a(final boolean z3, final Q.a aVar, C0167p c0167p, final int i3) {
        c0167p.S(2053721534);
        int i4 = (i3 & 6) == 0 ? i3 | 2 : i3;
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(aVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0167p.x()) {
            c0167p.L();
        } else {
            c0167p.N();
            if ((i3 & 1) == 0 || c0167p.w()) {
                z3 = (((Configuration) c0167p.k(AndroidCompositionLocals_androidKt.f4937a)).uiMode & 48) == 32;
            } else {
                c0167p.L();
            }
            int i5 = i4 & (-15);
            c0167p.q();
            AbstractC0123u0.a(z3 ? f3923b : f3922a, null, new A1(), aVar, c0167p, ((i5 << 6) & 7168) | 384);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new InterfaceC0426e() { // from class: P1.a
                @Override // e2.InterfaceC0426e
                public final Object h(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int U3 = C0143d.U(i3 | 1);
                    Q.a aVar2 = aVar;
                    b.a(z3, aVar2, (C0167p) obj, U3);
                    return y.f4171a;
                }
            };
        }
    }
}
