package O;

import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.C0225u;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC1332g;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final e f3630a = new e(0, new long[0], new Object[0]);

    public static final int a(int i2, int i4) {
        return i2 << (((i4 % 10) * 3) + 1);
    }

    public static final a b(int i2, InterfaceC1332g interfaceC1332g, C0216p c0216p) {
        Object I3 = c0216p.I();
        if (I3 == C0208l.f2826a) {
            I3 = new a(i2, true, interfaceC1332g);
            c0216p.c0(I3);
        }
        a aVar = (a) I3;
        if (!Intrinsics.a(aVar.f3621i, interfaceC1332g)) {
            boolean z4 = aVar.f3621i == null;
            aVar.f3621i = interfaceC1332g;
            if (!z4 && aVar.f3620e) {
                C0222s0 c0222s0 = aVar.f3622j;
                if (c0222s0 != null) {
                    C0225u c0225u = c0222s0.f2901b;
                    if (c0225u != null) {
                        c0225u.p(c0222s0, null);
                    }
                    aVar.f3622j = null;
                }
                ArrayList arrayList = aVar.f3623k;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        C0222s0 c0222s02 = (C0222s0) arrayList.get(i4);
                        C0225u c0225u2 = c0222s02.f2901b;
                        if (c0225u2 != null) {
                            c0225u2.p(c0222s02, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return aVar;
    }

    public static final boolean c(C0222s0 c0222s0, C0222s0 c0222s02) {
        return c0222s0 == null || ((c0222s0 instanceof C0222s0) && (!c0222s0.b() || c0222s0.equals(c0222s02) || Intrinsics.a(c0222s0.f2902c, c0222s02.f2902c)));
    }
}
