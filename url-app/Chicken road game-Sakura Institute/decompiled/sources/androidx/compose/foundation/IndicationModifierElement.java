package androidx.compose.foundation;

import m.k0;
import m.l0;
import p.i;
import r1.l;
import r1.s0;
import r6.k;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class IndicationModifierElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final i f592a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f593b;

    public IndicationModifierElement(i iVar, l0 l0Var) {
        this.f592a = iVar;
        this.f593b = l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return k.a(this.f592a, indicationModifierElement.f592a) && k.a(this.f593b, indicationModifierElement.f593b);
    }

    public final int hashCode() {
        return this.f593b.hashCode() + (this.f592a.hashCode() * 31);
    }

    @Override // r1.s0
    public final n l() {
        l a3 = this.f593b.a(this.f592a);
        k0 k0Var = new k0();
        k0Var.f6193u = a3;
        k0Var.A0(a3);
        return k0Var;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        k0 k0Var = (k0) nVar;
        l a3 = this.f593b.a(this.f592a);
        k0Var.B0(k0Var.f6193u);
        k0Var.f6193u = a3;
        k0Var.A0(a3);
    }
}
