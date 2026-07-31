package androidx.compose.ui.layout;

import u1.q;
import w1.x0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
final class LayoutIdElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f558a;

    public LayoutIdElement(String str) {
        this.f558a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && this.f558a.equals(((LayoutIdElement) obj).f558a);
    }

    @Override // w1.x0
    public final l f() {
        q qVar = new q();
        qVar.f7257r = this.f558a;
        return qVar;
    }

    @Override // w1.x0
    public final void g(l lVar) {
        ((q) lVar).f7257r = this.f558a;
    }

    public final int hashCode() {
        return this.f558a.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.f558a) + ')';
    }
}
