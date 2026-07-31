package androidx.compose.foundation.lazy.layout;

import U.k;
import Z1.i;
import t0.T;
import u.C0925G;
import u.V;

/* loaded from: classes.dex */
final class TraversablePrefetchStateModifierElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final C0925G f3653a;

    public TraversablePrefetchStateModifierElement(C0925G c0925g) {
        this.f3653a = c0925g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && i.a(this.f3653a, ((TraversablePrefetchStateModifierElement) obj).f3653a);
    }

    @Override // t0.T
    public final k h() {
        V v3 = new V();
        v3.f8049q = this.f3653a;
        return v3;
    }

    public final int hashCode() {
        return this.f3653a.hashCode();
    }

    @Override // t0.T
    public final void i(k kVar) {
        ((V) kVar).f8049q = this.f3653a;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f3653a + ')';
    }
}
