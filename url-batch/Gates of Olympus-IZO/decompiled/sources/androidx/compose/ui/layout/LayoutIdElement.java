package androidx.compose.ui.layout;

import U.k;
import r0.C0839l;
import t0.T;

/* loaded from: classes.dex */
final class LayoutIdElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final String f3735a;

    public LayoutIdElement(String str) {
        this.f3735a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && this.f3735a.equals(((LayoutIdElement) obj).f3735a);
    }

    @Override // t0.T
    public final k h() {
        C0839l c0839l = new C0839l();
        c0839l.f7149q = this.f3735a;
        return c0839l;
    }

    public final int hashCode() {
        return this.f3735a.hashCode();
    }

    @Override // t0.T
    public final void i(k kVar) {
        ((C0839l) kVar).f7149q = this.f3735a;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.f3735a) + ')';
    }
}
