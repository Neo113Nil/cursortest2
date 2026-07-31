package Q;

import I.C0105l;
import I.C0113p;
import I.C0119s0;
import I.C0122u;
import Z1.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final e f3092a = new e(0, new long[0], new Object[0]);

    public static final int a(int i3, int i4) {
        return i3 << (((i4 % 10) * 3) + 1);
    }

    public static final a b(int i3, L1.e eVar, C0113p c0113p) {
        Object G3 = c0113p.G();
        if (G3 == C0105l.f2272a) {
            G3 = new a(i3, eVar, true);
            c0113p.a0(G3);
        }
        a aVar = (a) G3;
        if (!i.a(aVar.f3078f, eVar)) {
            boolean z3 = aVar.f3078f == null;
            aVar.f3078f = eVar;
            if (!z3 && aVar.f3077e) {
                C0119s0 c0119s0 = aVar.f3079g;
                if (c0119s0 != null) {
                    C0122u c0122u = c0119s0.f2345b;
                    if (c0122u != null) {
                        c0122u.p(c0119s0, null);
                    }
                    aVar.f3079g = null;
                }
                ArrayList arrayList = aVar.f3080h;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        C0119s0 c0119s02 = (C0119s0) arrayList.get(i4);
                        C0122u c0122u2 = c0119s02.f2345b;
                        if (c0122u2 != null) {
                            c0122u2.p(c0119s02, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return aVar;
    }

    public static final boolean c(C0119s0 c0119s0, C0119s0 c0119s02) {
        return c0119s0 == null || ((c0119s0 instanceof C0119s0) && (!c0119s0.b() || c0119s0.equals(c0119s02) || i.a(c0119s0.f2346c, c0119s02.f2346c)));
    }
}
