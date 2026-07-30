package androidx.compose.foundation.lazy.layout;

import r1.s0;
import r6.k;
import s.l0;
import s.y;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class TraversablePrefetchStateModifierElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final y f650a;

    public TraversablePrefetchStateModifierElement(y yVar) {
        this.f650a = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && k.a(this.f650a, ((TraversablePrefetchStateModifierElement) obj).f650a);
    }

    public final int hashCode() {
        return this.f650a.hashCode();
    }

    @Override // r1.s0
    public final n l() {
        l0 l0Var = new l0();
        l0Var.f8036s = this.f650a;
        return l0Var;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        ((l0) nVar).f8036s = this.f650a;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f650a + ')';
    }
}
