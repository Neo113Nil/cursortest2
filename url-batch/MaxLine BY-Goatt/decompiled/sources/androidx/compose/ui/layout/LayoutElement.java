package androidx.compose.ui.layout;

import defpackage.cm1;
import defpackage.ul1;
import defpackage.xt0;
import defpackage.z81;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class LayoutElement extends cm1 {
    public final xt0 a;

    public LayoutElement(xt0 xt0Var) {
        this.a = xt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutElement) {
            return this.a == ((LayoutElement) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        z81 z81Var = new z81();
        z81Var.A = this.a;
        return z81Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        ((z81) ul1Var).A = this.a;
    }
}
