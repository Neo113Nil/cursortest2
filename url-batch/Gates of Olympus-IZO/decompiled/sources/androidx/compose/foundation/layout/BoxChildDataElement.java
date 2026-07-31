package androidx.compose.foundation.layout;

import H2.AbstractC0080b;
import U.d;
import U.k;
import r.C0815l;
import t0.T;

/* loaded from: classes.dex */
final class BoxChildDataElement extends T {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null) == null) {
            return false;
        }
        d dVar = U.a.f3284h;
        return dVar.equals(dVar);
    }

    @Override // t0.T
    public final k h() {
        C0815l c0815l = new C0815l();
        c0815l.f7068q = U.a.f3284h;
        return c0815l;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC0080b.a(0.0f, Float.hashCode(0.0f) * 31, 31);
    }

    @Override // t0.T
    public final void i(k kVar) {
        ((C0815l) kVar).f7068q = U.a.f3284h;
    }
}
