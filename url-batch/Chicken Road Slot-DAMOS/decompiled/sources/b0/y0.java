package b0;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lb0/y0;", "Lc2/x0;", "Lb0/z0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class y0 extends c2.x0 {
    @Override // c2.x0
    public final d1.k d() {
        a1.f fVar = i.f855b;
        e0 e0Var = i.f854a;
        z0 z0Var = new z0();
        z0Var.C = e0Var;
        z0Var.D = e0Var;
        z0Var.E = e0Var;
        z0Var.F = fVar;
        return z0Var;
    }

    @Override // c2.x0
    public final void e(d1.k kVar) {
        z0 z0Var = (z0) kVar;
        a1.f fVar = i.f855b;
        if (z0Var.F != fVar) {
            z0Var.F = fVar;
            e1 e1Var = z0Var.G;
            if (e1Var != null) {
                a aVar = e1Var.f821c;
                if (Intrinsics.a(aVar, z0Var.E)) {
                    return;
                }
                z0Var.E = aVar;
                z0Var.I();
            }
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof y0);
    }

    public final int hashCode() {
        return i.f855b.hashCode();
    }
}
