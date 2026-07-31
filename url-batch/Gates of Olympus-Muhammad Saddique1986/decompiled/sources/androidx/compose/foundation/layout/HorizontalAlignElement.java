package androidx.compose.foundation.layout;

import U.g;
import U.p;
import r.C0840B;
import t0.U;

/* loaded from: classes.dex */
public final class HorizontalAlignElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final g f4808a;

    public HorizontalAlignElement(g gVar) {
        this.f4808a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return this.f4808a.equals(horizontalAlignElement.f4808a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f4808a.f4479a);
    }

    @Override // t0.U
    public final p l() {
        C0840B c0840b = new C0840B();
        c0840b.f7952q = this.f4808a;
        return c0840b;
    }

    @Override // t0.U
    public final void m(p pVar) {
        ((C0840B) pVar).f7952q = this.f4808a;
    }
}
