package androidx.compose.ui.focus;

import defpackage.cm1;
import defpackage.eo0;
import defpackage.ul1;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class FocusChangedElement extends cm1 {
    public final Function1 a;

    public FocusChangedElement(Function1 function1) {
        this.a = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusChangedElement) {
            return this.a == ((FocusChangedElement) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        eo0 eo0Var = new eo0();
        eo0Var.A = this.a;
        return eo0Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        ((eo0) ul1Var).A = this.a;
    }
}
