package n;

import D.x1;
import G.C0216p;
import G.C0222s0;
import Q.v;
import kotlin.jvm.functions.Function0;
import w.C1269i;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final v f8523a = new v();

    public static void b(j jVar, C1269i c1269i, boolean z4, Function0 function0) {
        S.l lVar = S.l.f3977a;
        jVar.getClass();
        jVar.f8523a.add(new O.a(262103052, true, new i(c1269i, z4, lVar, (L2.c) null, function0)));
    }

    public final void a(c cVar, C0216p c0216p, int i2) {
        c0216p.U(1320309496);
        int i4 = (i2 & 6) == 0 ? (c0216p.f(cVar) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= c0216p.f(this) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else {
            v vVar = this.f8523a;
            int size = vVar.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((L2.c) vVar.get(i5)).g(cVar, c0216p, Integer.valueOf(i4 & 14));
            }
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new x1(i2, 7, this, cVar);
        }
    }
}
