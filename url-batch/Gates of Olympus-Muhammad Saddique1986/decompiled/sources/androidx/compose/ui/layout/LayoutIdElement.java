package androidx.compose.ui.layout;

import U.p;
import r0.C0920q;
import t0.U;

/* loaded from: classes.dex */
final class LayoutIdElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final String f4934a;

    public LayoutIdElement(String str) {
        this.f4934a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && this.f4934a.equals(((LayoutIdElement) obj).f4934a);
    }

    public final int hashCode() {
        return this.f4934a.hashCode();
    }

    @Override // t0.U
    public final p l() {
        C0920q c0920q = new C0920q();
        c0920q.f8171q = this.f4934a;
        return c0920q;
    }

    @Override // t0.U
    public final void m(p pVar) {
        ((C0920q) pVar).f8171q = this.f4934a;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.f4934a) + ')';
    }
}
