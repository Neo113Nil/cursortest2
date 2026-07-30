package androidx.compose.ui.focus;

import r1.s0;
import s0.n;
import x0.h;
import x0.k;
import x0.m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class FocusPropertiesElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final k f709a;

    public FocusPropertiesElement(k kVar) {
        this.f709a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && r6.k.a(this.f709a, ((FocusPropertiesElement) obj).f709a);
    }

    public final int hashCode() {
        return h.f9606h.hashCode();
    }

    @Override // r1.s0
    public final n l() {
        m mVar = new m();
        mVar.f9623s = this.f709a;
        return mVar;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        ((m) nVar).f9623s = this.f709a;
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.f709a + ')';
    }
}
