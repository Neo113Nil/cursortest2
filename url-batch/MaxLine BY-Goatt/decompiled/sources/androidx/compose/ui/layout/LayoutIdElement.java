package androidx.compose.ui.layout;

import defpackage.cm1;
import defpackage.ul1;
import defpackage.w81;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class LayoutIdElement extends cm1 {
    public final String a;

    public LayoutIdElement(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && this.a.equals(((LayoutIdElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        w81 w81Var = new w81();
        w81Var.A = this.a;
        return w81Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        ((w81) ul1Var).A = this.a;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.a) + ')';
    }
}
