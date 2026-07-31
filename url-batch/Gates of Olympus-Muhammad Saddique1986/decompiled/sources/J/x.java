package J;

import B.C0014o;
import I.B0;
import I.C0143d;
import I.C0173s0;
import I.C0174t;
import I.H0;

/* loaded from: classes.dex */
public final class x extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final x f3151c = new x(1, 0, 2);

    @Override // J.C
    public final void a(C0014o c0014o, G1.m mVar, H0 h02, C0174t c0174t) {
        int d3 = c0014o.d(0);
        int o3 = h02.o();
        int i3 = h02.f2708v;
        int E3 = h02.E(h02.f2688b, h02.p(i3));
        int f3 = h02.f(h02.f2688b, h02.p(i3 + 1));
        for (int max = Math.max(E3, f3 - d3); max < f3; max++) {
            Object obj = h02.f2689c[h02.g(max)];
            if (obj instanceof B0) {
                c0174t.h(((B0) obj).f2639a, o3 - max, -1, -1);
            } else if (obj instanceof C0173s0) {
                ((C0173s0) obj).d();
            }
        }
        C0143d.P(d3 > 0);
        int i4 = h02.f2708v;
        int E4 = h02.E(h02.f2688b, h02.p(i4));
        int f4 = h02.f(h02.f2688b, h02.p(i4 + 1)) - d3;
        C0143d.P(f4 >= E4);
        h02.C(f4, d3, i4);
        int i5 = h02.f2695i;
        if (i5 >= E4) {
            h02.f2695i = i5 - d3;
        }
    }

    @Override // J.C
    public final String b(int i3) {
        return O2.l.Z(i3, 0) ? "count" : super.b(i3);
    }
}
