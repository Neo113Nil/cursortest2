package androidx.compose.ui.layout;

import defpackage.cm1;
import defpackage.ul1;
import defpackage.yu1;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class OnGloballyPositionedElement extends cm1 {
    public final Function1 a;

    public OnGloballyPositionedElement(Function1 function1) {
        this.a = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.a == ((OnGloballyPositionedElement) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        yu1 yu1Var = new yu1();
        yu1Var.A = this.a;
        return yu1Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        ((yu1) ul1Var).A = this.a;
    }
}
