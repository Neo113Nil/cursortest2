package androidx.compose.ui.semantics;

import defpackage.cm1;
import defpackage.sh2;
import defpackage.ul1;
import defpackage.vh2;
import defpackage.w30;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends cm1 implements vh2 {
    public final boolean a;
    public final Function1 b;

    public AppendedSemanticsElement(Function1 function1, boolean z) {
        this.a = z;
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.a == appendedSemanticsElement.a && this.b == appendedSemanticsElement.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        return new w30(this.a, false, this.b);
    }

    @Override // defpackage.vh2
    public final sh2 l() {
        sh2 sh2Var = new sh2();
        sh2Var.o = this.a;
        this.b.invoke(sh2Var);
        return sh2Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        w30 w30Var = (w30) ul1Var;
        w30Var.A = this.a;
        w30Var.C = this.b;
    }
}
