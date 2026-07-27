package androidx.compose.foundation.lazy.layout;

import S.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import r0.T;
import s.C1096L;
import s.z;

@Metadata
/* loaded from: classes.dex */
final class TraversablePrefetchStateModifierElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final z f5093a;

    public TraversablePrefetchStateModifierElement(z zVar) {
        this.f5093a = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && Intrinsics.a(this.f5093a, ((TraversablePrefetchStateModifierElement) obj).f5093a);
    }

    public final int hashCode() {
        return this.f5093a.hashCode();
    }

    @Override // r0.T
    public final n l() {
        C1096L c1096l = new C1096L();
        c1096l.f9913t = this.f5093a;
        return c1096l;
    }

    @Override // r0.T
    public final void m(n nVar) {
        ((C1096L) nVar).f9913t = this.f5093a;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f5093a + ')';
    }
}
