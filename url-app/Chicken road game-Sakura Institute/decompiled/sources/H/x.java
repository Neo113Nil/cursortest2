package H;

import A.C0020p;
import B1.C0097d;
import G.B0;
import G.C0192d;
import G.C0222s0;
import G.C0223t;
import G.H0;

/* loaded from: classes.dex */
public final class x extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final x f3221c = new x(1, 0, 2);

    @Override // H.C
    public final void a(C0020p c0020p, C0097d c0097d, H0 h02, C0223t c0223t) {
        int d4 = c0020p.d(0);
        int o4 = h02.o();
        int i2 = h02.f2706v;
        int E3 = h02.E(h02.f2686b, h02.p(i2));
        int f4 = h02.f(h02.f2686b, h02.p(i2 + 1));
        for (int max = Math.max(E3, f4 - d4); max < f4; max++) {
            Object obj = h02.f2687c[h02.g(max)];
            if (obj instanceof B0) {
                c0223t.h(((B0) obj).f2637a, o4 - max, -1, -1);
            } else if (obj instanceof C0222s0) {
                ((C0222s0) obj).d();
            }
        }
        C0192d.P(d4 > 0);
        int i4 = h02.f2706v;
        int E4 = h02.E(h02.f2686b, h02.p(i4));
        int f5 = h02.f(h02.f2686b, h02.p(i4 + 1)) - d4;
        C0192d.P(f5 >= E4);
        h02.C(f5, d4, i4);
        int i5 = h02.f2693i;
        if (i5 >= E4) {
            h02.f2693i = i5 - d4;
        }
    }

    @Override // H.C
    public final String b(int i2) {
        return u3.l.a0(i2, 0) ? "count" : super.b(i2);
    }
}
