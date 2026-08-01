package b0;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final z f921a = new z(g.f843b, d1.a.f3293z);

    public static final z a(f fVar, d1.b bVar, n0.i0 i0Var, int i3) {
        if (Intrinsics.a(fVar, g.f843b) && bVar.equals(d1.a.f3293z)) {
            i0Var.W(-1446604504);
            i0Var.p(false);
            return f921a;
        }
        i0Var.W(-1446550657);
        boolean z10 = true;
        boolean z11 = (((i3 & 14) ^ 6) > 4 && i0Var.f(fVar)) || (i3 & 6) == 4;
        if ((((i3 & 112) ^ 48) <= 32 || !i0Var.f(bVar)) && (i3 & 48) != 32) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object L = i0Var.L();
        if (z12 || L == n0.k.f6729a) {
            L = new z(fVar, bVar);
            i0Var.g0(L);
        }
        z zVar = (z) L;
        i0Var.p(false);
        return zVar;
    }
}
