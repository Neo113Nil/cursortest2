package androidx.compose.foundation.text.handwriting;

import r1.s0;
import r6.k;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class StylusHandwritingElementWithNegativePadding extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final q6.a f681a;

    public StylusHandwritingElementWithNegativePadding(q6.a aVar) {
        this.f681a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElementWithNegativePadding) && k.a(this.f681a, ((StylusHandwritingElementWithNegativePadding) obj).f681a);
    }

    public final int hashCode() {
        return this.f681a.hashCode();
    }

    @Override // r1.s0
    public final n l() {
        return new x.a(this.f681a);
    }

    @Override // r1.s0
    public final void m(n nVar) {
        ((x.a) nVar).f9589u = this.f681a;
    }

    public final String toString() {
        return "StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=" + this.f681a + ')';
    }
}
