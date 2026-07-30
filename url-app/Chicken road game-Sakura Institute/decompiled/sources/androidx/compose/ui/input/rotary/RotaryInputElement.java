package androidx.compose.ui.input.rotary;

import r1.s0;
import s0.n;
import s1.m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class RotaryInputElement extends s0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        Object obj2 = m.f8282j;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return m.f8282j.hashCode() * 31;
    }

    @Override // r1.s0
    public final n l() {
        m mVar = m.f8282j;
        n1.a aVar = new n1.a();
        aVar.f6498s = mVar;
        return aVar;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        ((n1.a) nVar).f6498s = m.f8282j;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + m.f8282j + ", onPreRotaryScrollEvent=null)";
    }
}
