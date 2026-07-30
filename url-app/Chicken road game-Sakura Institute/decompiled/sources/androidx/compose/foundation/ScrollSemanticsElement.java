package androidx.compose.foundation;

import a0.m;
import m.d1;
import m.g1;
import r1.s0;
import r6.k;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class ScrollSemanticsElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final g1 f597a;

    public ScrollSemanticsElement(g1 g1Var) {
        this.f597a = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScrollSemanticsElement) && k.a(this.f597a, ((ScrollSemanticsElement) obj).f597a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + m.e(m.e(this.f597a.hashCode() * 31, 961, false), 31, true);
    }

    @Override // r1.s0
    public final n l() {
        d1 d1Var = new d1();
        d1Var.f6132s = this.f597a;
        d1Var.f6133t = true;
        return d1Var;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        d1 d1Var = (d1) nVar;
        d1Var.f6132s = this.f597a;
        d1Var.f6133t = true;
    }

    public final String toString() {
        return "ScrollSemanticsElement(state=" + this.f597a + ", reverseScrolling=false, flingBehavior=null, isScrollable=true, isVertical=true)";
    }
}
