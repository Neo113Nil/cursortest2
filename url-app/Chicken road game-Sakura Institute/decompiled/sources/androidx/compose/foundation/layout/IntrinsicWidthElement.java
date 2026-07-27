package androidx.compose.foundation.layout;

import S.n;
import kotlin.Metadata;
import l.AbstractC0784j;
import q.C1016U;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class IntrinsicWidthElement extends T {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null) != null;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (AbstractC0784j.d(2) * 31);
    }

    @Override // r0.T
    public final n l() {
        C1016U c1016u = new C1016U();
        c1016u.f9217t = 2;
        c1016u.f9218u = true;
        return c1016u;
    }

    @Override // r0.T
    public final void m(n nVar) {
        C1016U c1016u = (C1016U) nVar;
        c1016u.f9217t = 2;
        c1016u.f9218u = true;
    }
}
