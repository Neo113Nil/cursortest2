package androidx.compose.foundation.lazy.layout;

import U.p;
import f2.j;
import t.C0971A;
import t.N;
import t0.U;

/* loaded from: classes.dex */
final class TraversablePrefetchStateModifierElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final C0971A f4838a;

    public TraversablePrefetchStateModifierElement(C0971A c0971a) {
        this.f4838a = c0971a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && j.a(this.f4838a, ((TraversablePrefetchStateModifierElement) obj).f4838a);
    }

    public final int hashCode() {
        return this.f4838a.hashCode();
    }

    @Override // t0.U
    public final p l() {
        N n3 = new N();
        n3.f8460q = this.f4838a;
        return n3;
    }

    @Override // t0.U
    public final void m(p pVar) {
        ((N) pVar).f8460q = this.f4838a;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f4838a + ')';
    }
}
