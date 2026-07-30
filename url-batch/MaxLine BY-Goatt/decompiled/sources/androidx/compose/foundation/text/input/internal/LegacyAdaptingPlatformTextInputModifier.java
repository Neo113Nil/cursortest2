package androidx.compose.foundation.text.input.internal;

import defpackage.cm1;
import defpackage.ea;
import defpackage.gv2;
import defpackage.lh;
import defpackage.nc1;
import defpackage.sc1;
import defpackage.ul1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class LegacyAdaptingPlatformTextInputModifier extends cm1 {
    public final ea a;
    public final sc1 b;
    public final gv2 c;

    public LegacyAdaptingPlatformTextInputModifier(ea eaVar, sc1 sc1Var, gv2 gv2Var) {
        this.a = eaVar;
        this.b = sc1Var;
        this.c = gv2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LegacyAdaptingPlatformTextInputModifier) {
            LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
            return Intrinsics.b(this.a, legacyAdaptingPlatformTextInputModifier.a) && this.b == legacyAdaptingPlatformTextInputModifier.b && this.c == legacyAdaptingPlatformTextInputModifier.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        return new nc1(this.a, this.b, this.c);
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        nc1 nc1Var = (nc1) ul1Var;
        if (nc1Var.z) {
            nc1Var.A.g();
            nc1Var.A.k(nc1Var);
        }
        ea eaVar = this.a;
        nc1Var.A = eaVar;
        if (nc1Var.z) {
            if (eaVar.a != null) {
                lh.g("Expected textInputModifierNode to be null");
                return;
            }
            eaVar.a = nc1Var;
        }
        nc1Var.B = this.b;
        nc1Var.C = this.c;
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.b + ", textFieldSelectionManager=" + this.c + ')';
    }
}
