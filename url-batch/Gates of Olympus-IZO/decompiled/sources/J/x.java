package J;

import D1.C0014b;
import I.C0;
import I.C0089d;
import I.C0119s0;
import I.C0120t;
import I.I0;

/* loaded from: classes.dex */
public final class x extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final x f2576c = new x(1, 0, 2);

    @Override // J.C
    public final void a(D d3, C0014b c0014b, I0 i02, C0120t c0120t) {
        int b2 = d3.b(0);
        int o3 = i02.o();
        int i3 = i02.f2153v;
        int E3 = i02.E(i02.f2134b, i02.p(i3));
        int f3 = i02.f(i02.f2134b, i02.p(i3 + 1));
        for (int max = Math.max(E3, f3 - b2); max < f3; max++) {
            Object obj = i02.f2135c[i02.g(max)];
            if (obj instanceof C0) {
                c0120t.h(((C0) obj).f2083a, o3 - max, -1, -1);
            } else if (obj instanceof C0119s0) {
                ((C0119s0) obj).d();
            }
        }
        C0089d.O(b2 > 0);
        int i4 = i02.f2153v;
        int E4 = i02.E(i02.f2134b, i02.p(i4));
        int f4 = i02.f(i02.f2134b, i02.p(i4 + 1)) - b2;
        C0089d.O(f4 >= E4);
        i02.C(f4, b2, i4);
        int i5 = i02.f2141i;
        if (i5 >= E4) {
            i02.f2141i = i5 - b2;
        }
    }

    @Override // J.C
    public final String b(int i3) {
        return I2.l.v(i3, 0) ? "count" : super.b(i3);
    }
}
