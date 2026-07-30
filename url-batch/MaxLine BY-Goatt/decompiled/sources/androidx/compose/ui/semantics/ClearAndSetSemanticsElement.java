package androidx.compose.ui.semantics;

import defpackage.bl0;
import defpackage.cm1;
import defpackage.sh2;
import defpackage.ul1;
import defpackage.vh2;
import defpackage.w30;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ClearAndSetSemanticsElement extends cm1 implements vh2 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ClearAndSetSemanticsElement);
    }

    public final int hashCode() {
        return bl0.P.hashCode();
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        return new w30(false, true, bl0.P);
    }

    @Override // defpackage.vh2
    public final sh2 l() {
        sh2 sh2Var = new sh2();
        sh2Var.o = false;
        sh2Var.p = true;
        Unit unit = Unit.a;
        return sh2Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        ((w30) ul1Var).C = bl0.P;
    }
}
