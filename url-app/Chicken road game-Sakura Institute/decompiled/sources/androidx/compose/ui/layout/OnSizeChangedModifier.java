package androidx.compose.ui.layout;

import p1.k0;
import q6.c;
import r1.s0;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class OnSizeChangedModifier extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f737a;

    public OnSizeChangedModifier(c cVar) {
        this.f737a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.f737a == ((OnSizeChangedModifier) obj).f737a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f737a.hashCode();
    }

    @Override // r1.s0
    public final n l() {
        k0 k0Var = new k0();
        k0Var.f7055s = this.f737a;
        k0Var.f7056t = j1.c.G(Integer.MIN_VALUE, Integer.MIN_VALUE);
        return k0Var;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        k0 k0Var = (k0) nVar;
        k0Var.f7055s = this.f737a;
        k0Var.f7056t = j1.c.G(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
