package Q;

import I.C0159l;
import I.C0167p;
import I.C0173s0;
import I.C0176u;
import f2.j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final e f3958a = new e(0, new long[0], new Object[0]);

    public static final int a(int i3, int i4) {
        return i3 << (((i4 % 10) * 3) + 1);
    }

    public static final a b(int i3, R1.e eVar, C0167p c0167p) {
        Object G3 = c0167p.G();
        if (G3 == C0159l.f2829a) {
            G3 = new a(i3, eVar, true);
            c0167p.a0(G3);
        }
        a aVar = (a) G3;
        if (!j.a(aVar.f3944f, eVar)) {
            boolean z3 = aVar.f3944f == null;
            aVar.f3944f = eVar;
            if (!z3 && aVar.f3943e) {
                C0173s0 c0173s0 = aVar.f3945g;
                if (c0173s0 != null) {
                    C0176u c0176u = c0173s0.f2904b;
                    if (c0176u != null) {
                        c0176u.p(c0173s0, null);
                    }
                    aVar.f3945g = null;
                }
                ArrayList arrayList = aVar.f3946h;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        C0173s0 c0173s02 = (C0173s0) arrayList.get(i4);
                        C0176u c0176u2 = c0173s02.f2904b;
                        if (c0176u2 != null) {
                            c0176u2.p(c0173s02, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return aVar;
    }

    public static final boolean c(C0173s0 c0173s0, C0173s0 c0173s02) {
        return c0173s0 == null || ((c0173s0 instanceof C0173s0) && (!c0173s0.b() || c0173s0.equals(c0173s02) || j.a(c0173s0.f2905c, c0173s02.f2905c)));
    }
}
