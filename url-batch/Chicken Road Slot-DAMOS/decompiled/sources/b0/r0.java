package b0;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final t0 f892a = new t0(g.f842a, d1.a.f3291x);

    public static final t0 a(c cVar, n0.i0 i0Var, int i3) {
        d1.c cVar2 = d1.a.f3292y;
        if (Intrinsics.a(cVar, g.f842a) && cVar2.equals(d1.a.f3291x)) {
            i0Var.W(-1073830487);
            i0Var.p(false);
            return f892a;
        }
        i0Var.W(-1073779616);
        boolean z10 = (((i3 & 14) ^ 6) > 4 && i0Var.f(cVar)) || (i3 & 6) == 4;
        Object L = i0Var.L();
        if (z10 || L == n0.k.f6729a) {
            L = new t0(cVar, cVar2);
            i0Var.g0(L);
        }
        t0 t0Var = (t0) L;
        i0Var.p(false);
        return t0Var;
    }
}
