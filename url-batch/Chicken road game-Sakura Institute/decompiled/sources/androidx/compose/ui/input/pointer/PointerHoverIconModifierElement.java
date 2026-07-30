package androidx.compose.ui.input.pointer;

import l1.a;
import l1.p;
import r1.s0;
import s0.n;
import w.g0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends s0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        a aVar = g0.f9239b;
        return aVar.equals(aVar);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (1008 * 31);
    }

    @Override // r1.s0
    public final n l() {
        return new p();
    }

    @Override // r1.s0
    public final void m(n nVar) {
        p pVar = (p) nVar;
        a aVar = g0.f9239b;
        pVar.getClass();
        if (aVar.equals(aVar) || !pVar.f5824s) {
            return;
        }
        pVar.B0();
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + g0.f9239b + ", overrideDescendants=false)";
    }
}
