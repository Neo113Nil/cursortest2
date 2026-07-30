package androidx.compose.ui.layout;

import p1.q;
import r1.s0;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class LayoutIdElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f735a;

    public LayoutIdElement(String str) {
        this.f735a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && this.f735a.equals(((LayoutIdElement) obj).f735a);
    }

    public final int hashCode() {
        return this.f735a.hashCode();
    }

    @Override // r1.s0
    public final n l() {
        q qVar = new q();
        qVar.f7075s = this.f735a;
        return qVar;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        ((q) nVar).f7075s = this.f735a;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.f735a) + ')';
    }
}
