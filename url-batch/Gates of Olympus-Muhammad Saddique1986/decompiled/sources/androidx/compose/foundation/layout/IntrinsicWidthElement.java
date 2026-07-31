package androidx.compose.foundation.layout;

import U.p;
import m.AbstractC0625j;
import r.C0845G;
import t0.U;

/* loaded from: classes.dex */
final class IntrinsicWidthElement extends U {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null) != null;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (AbstractC0625j.b(2) * 31);
    }

    @Override // t0.U
    public final p l() {
        C0845G c0845g = new C0845G();
        c0845g.f7968q = 2;
        c0845g.f7969r = true;
        return c0845g;
    }

    @Override // t0.U
    public final void m(p pVar) {
        C0845G c0845g = (C0845G) pVar;
        c0845g.f7968q = 2;
        c0845g.f7969r = true;
    }
}
