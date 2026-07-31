package androidx.compose.foundation.lazy.layout;

import a0.m1;
import a0.n0;
import q6.i;
import w1.x0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
final class TraversablePrefetchStateModifierElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f512a;

    public TraversablePrefetchStateModifierElement(n0 n0Var) {
        this.f512a = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && i.a(this.f512a, ((TraversablePrefetchStateModifierElement) obj).f512a);
    }

    @Override // w1.x0
    public final l f() {
        m1 m1Var = new m1();
        m1Var.f116r = this.f512a;
        return m1Var;
    }

    @Override // w1.x0
    public final void g(l lVar) {
        ((m1) lVar).f116r = this.f512a;
    }

    public final int hashCode() {
        return this.f512a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f512a + ')';
    }
}
