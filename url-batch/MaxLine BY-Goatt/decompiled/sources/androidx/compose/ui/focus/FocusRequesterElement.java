package androidx.compose.ui.focus;

import defpackage.cm1;
import defpackage.to0;
import defpackage.ul1;
import defpackage.vo0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class FocusRequesterElement extends cm1 {
    public final to0 a;

    public FocusRequesterElement(to0 to0Var) {
        this.a = to0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && Intrinsics.b(this.a, ((FocusRequesterElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        vo0 vo0Var = new vo0();
        vo0Var.A = this.a;
        return vo0Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        vo0 vo0Var = (vo0) ul1Var;
        vo0Var.A.a.k(vo0Var);
        to0 to0Var = this.a;
        vo0Var.A = to0Var;
        to0Var.a.b(vo0Var);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ')';
    }
}
