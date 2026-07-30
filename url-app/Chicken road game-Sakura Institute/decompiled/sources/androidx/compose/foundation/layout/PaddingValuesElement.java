package androidx.compose.foundation.layout;

import q.h0;
import q.i0;
import r1.s0;
import r6.k;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class PaddingValuesElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f626a;

    public PaddingValuesElement(h0 h0Var) {
        this.f626a = h0Var;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return k.a(this.f626a, paddingValuesElement.f626a);
    }

    public final int hashCode() {
        return this.f626a.hashCode();
    }

    @Override // r1.s0
    public final n l() {
        i0 i0Var = new i0();
        i0Var.f7290s = this.f626a;
        return i0Var;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        ((i0) nVar).f7290s = this.f626a;
    }
}
