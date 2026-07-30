package androidx.compose.ui.focus;

import r1.s0;
import r6.k;
import x0.n;
import x0.p;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class FocusRequesterElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final n f710a;

    public FocusRequesterElement(n nVar) {
        this.f710a = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && k.a(this.f710a, ((FocusRequesterElement) obj).f710a);
    }

    public final int hashCode() {
        return this.f710a.hashCode();
    }

    @Override // r1.s0
    public final s0.n l() {
        p pVar = new p();
        pVar.f9627s = this.f710a;
        return pVar;
    }

    @Override // r1.s0
    public final void m(s0.n nVar) {
        p pVar = (p) nVar;
        pVar.f9627s.f9626a.n(pVar);
        n nVar2 = this.f710a;
        pVar.f9627s = nVar2;
        nVar2.f9626a.b(pVar);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f710a + ')';
    }
}
