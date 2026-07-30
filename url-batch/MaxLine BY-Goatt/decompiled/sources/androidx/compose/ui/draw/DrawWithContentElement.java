package androidx.compose.ui.draw;

import defpackage.ce0;
import defpackage.cm1;
import defpackage.ul1;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class DrawWithContentElement extends cm1 {
    public final Function1 a;

    public DrawWithContentElement(Function1 function1) {
        this.a = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawWithContentElement) {
            return this.a == ((DrawWithContentElement) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        ce0 ce0Var = new ce0();
        ce0Var.A = this.a;
        return ce0Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        ((ce0) ul1Var).A = this.a;
    }
}
