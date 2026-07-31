package androidx.compose.foundation.layout;

import U.i;
import U.p;
import r.C0865l;
import t0.U;

/* loaded from: classes.dex */
final class BoxChildDataElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final i f4804a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4805b;

    public BoxChildDataElement(i iVar, boolean z3) {
        this.f4804a = iVar;
        this.f4805b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        if (boxChildDataElement == null) {
            return false;
        }
        return this.f4804a.equals(boxChildDataElement.f4804a) && this.f4805b == boxChildDataElement.f4805b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4805b) + (this.f4804a.hashCode() * 31);
    }

    @Override // t0.U
    public final p l() {
        C0865l c0865l = new C0865l();
        c0865l.f8057q = this.f4804a;
        c0865l.f8058r = this.f4805b;
        return c0865l;
    }

    @Override // t0.U
    public final void m(p pVar) {
        C0865l c0865l = (C0865l) pVar;
        c0865l.f8057q = this.f4804a;
        c0865l.f8058r = this.f4805b;
    }
}
