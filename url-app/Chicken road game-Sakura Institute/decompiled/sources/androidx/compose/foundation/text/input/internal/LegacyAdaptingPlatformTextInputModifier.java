package androidx.compose.foundation.text.input.internal;

import a0.x0;
import r1.s0;
import r6.k;
import s0.n;
import w.j0;
import y.d;
import y.q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class LegacyAdaptingPlatformTextInputModifier extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f684a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f685b;

    /* renamed from: c, reason: collision with root package name */
    public final x0 f686c;

    public LegacyAdaptingPlatformTextInputModifier(d dVar, j0 j0Var, x0 x0Var) {
        this.f684a = dVar;
        this.f685b = j0Var;
        this.f686c = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return k.a(this.f684a, legacyAdaptingPlatformTextInputModifier.f684a) && k.a(this.f685b, legacyAdaptingPlatformTextInputModifier.f685b) && k.a(this.f686c, legacyAdaptingPlatformTextInputModifier.f686c);
    }

    public final int hashCode() {
        return this.f686c.hashCode() + ((this.f685b.hashCode() + (this.f684a.hashCode() * 31)) * 31);
    }

    @Override // r1.s0
    public final n l() {
        return new q(this.f684a, this.f685b, this.f686c);
    }

    @Override // r1.s0
    public final void m(n nVar) {
        q qVar = (q) nVar;
        if (qVar.f8116r) {
            qVar.f9724s.h();
            qVar.f9724s.k(qVar);
        }
        d dVar = this.f684a;
        qVar.f9724s = dVar;
        if (qVar.f8116r) {
            if (dVar.f9709a != null) {
                throw new IllegalStateException("Expected textInputModifierNode to be null");
            }
            dVar.f9709a = qVar;
        }
        qVar.f9725t = this.f685b;
        qVar.f9726u = this.f686c;
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f684a + ", legacyTextFieldState=" + this.f685b + ", textFieldSelectionManager=" + this.f686c + ')';
    }
}
