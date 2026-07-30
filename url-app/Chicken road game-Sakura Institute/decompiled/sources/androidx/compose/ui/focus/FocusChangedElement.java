package androidx.compose.ui.focus;

import q6.c;
import r1.s0;
import r6.k;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class FocusChangedElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f707a;

    public FocusChangedElement(c cVar) {
        this.f707a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && k.a(this.f707a, ((FocusChangedElement) obj).f707a);
    }

    public final int hashCode() {
        return this.f707a.hashCode();
    }

    @Override // r1.s0
    public final n l() {
        x0.a aVar = new x0.a();
        aVar.f9593s = this.f707a;
        return aVar;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        ((x0.a) nVar).f9593s = this.f707a;
    }

    public final String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f707a + ')';
    }
}
