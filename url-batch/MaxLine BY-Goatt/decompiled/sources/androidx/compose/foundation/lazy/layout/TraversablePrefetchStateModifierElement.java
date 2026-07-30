package androidx.compose.foundation.lazy.layout;

import defpackage.cm1;
import defpackage.sz2;
import defpackage.ul1;
import defpackage.xb1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class TraversablePrefetchStateModifierElement extends cm1 {
    public final xb1 a;

    public TraversablePrefetchStateModifierElement(xb1 xb1Var) {
        this.a = xb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && Intrinsics.b(this.a, ((TraversablePrefetchStateModifierElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        sz2 sz2Var = new sz2();
        sz2Var.A = this.a;
        return sz2Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        ((sz2) ul1Var).A = this.a;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.a + ')';
    }
}
