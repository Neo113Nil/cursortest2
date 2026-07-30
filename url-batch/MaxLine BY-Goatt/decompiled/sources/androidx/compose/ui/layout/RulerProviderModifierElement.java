package androidx.compose.ui.layout;

import defpackage.a31;
import defpackage.cm1;
import defpackage.i91;
import defpackage.kc2;
import defpackage.s03;
import defpackage.ul1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class RulerProviderModifierElement extends cm1 {
    public final a31 a;

    public RulerProviderModifierElement(a31 a31Var) {
        this.a = a31Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        RulerProviderModifierElement rulerProviderModifierElement = obj instanceof RulerProviderModifierElement ? (RulerProviderModifierElement) obj : null;
        return (rulerProviderModifierElement != null ? rulerProviderModifierElement.a : null) == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        return new kc2(this.a);
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        kc2 kc2Var = (kc2) ul1Var;
        a31 a31Var = kc2Var.A;
        a31 a31Var2 = this.a;
        if (a31Var != a31Var2) {
            kc2Var.A = a31Var2;
            i91.W(s03.J(kc2Var), false, 7);
        }
    }
}
