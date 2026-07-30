package androidx.compose.foundation.layout;

import q.e0;
import r1.s0;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class LayoutWeightElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f620a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f621b;

    public LayoutWeightElement(float f9, boolean z8) {
        this.f620a = f9;
        this.f621b = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.f620a == layoutWeightElement.f620a && this.f621b == layoutWeightElement.f621b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f621b) + (Float.hashCode(this.f620a) * 31);
    }

    @Override // r1.s0
    public final n l() {
        e0 e0Var = new e0();
        e0Var.f7274s = this.f620a;
        e0Var.f7275t = this.f621b;
        return e0Var;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        e0 e0Var = (e0) nVar;
        e0Var.f7274s = this.f620a;
        e0Var.f7275t = this.f621b;
    }
}
