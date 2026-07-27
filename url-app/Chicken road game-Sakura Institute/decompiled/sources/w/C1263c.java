package w;

import G.C0208l;
import G.C0216p;
import kotlin.jvm.functions.Function1;

/* renamed from: w.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1263c extends M2.p implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public static final C1263c f11138d = new C1263c(3);

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        S.o oVar = (S.o) obj;
        C0216p c0216p = (C0216p) obj2;
        ((Number) obj3).intValue();
        c0216p.S(-2126899193);
        long j4 = ((A.k0) c0216p.k(A.l0.f166a)).f160a;
        S.l lVar = S.l.f3977a;
        boolean e4 = c0216p.e(j4);
        Object I3 = c0216p.I();
        if (e4 || I3 == C0208l.f2826a) {
            I3 = new C1262b(j4, 0);
            c0216p.c0(I3);
        }
        S.o h4 = oVar.h(androidx.compose.ui.draw.a.b(lVar, (Function1) I3));
        c0216p.q(false);
        return h4;
    }
}
