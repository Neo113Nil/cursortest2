package androidx.compose.foundation;

import a0.m;
import m.g1;
import m.h1;
import r1.s0;
import r6.k;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final g1 f598a;

    public ScrollingLayoutElement(g1 g1Var) {
        this.f598a = g1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ScrollingLayoutElement) {
            return k.a(this.f598a, ((ScrollingLayoutElement) obj).f598a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + m.e(this.f598a.hashCode() * 31, 31, false);
    }

    @Override // r1.s0
    public final n l() {
        h1 h1Var = new h1();
        h1Var.f6171s = this.f598a;
        h1Var.f6172t = true;
        return h1Var;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        h1 h1Var = (h1) nVar;
        h1Var.f6171s = this.f598a;
        h1Var.f6172t = true;
    }
}
