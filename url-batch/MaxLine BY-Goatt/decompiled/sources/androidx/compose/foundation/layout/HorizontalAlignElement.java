package androidx.compose.foundation.layout;

import defpackage.cm1;
import defpackage.ul1;
import defpackage.wx0;
import defpackage.yn;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class HorizontalAlignElement extends cm1 {
    public final yn a;

    public HorizontalAlignElement(yn ynVar) {
        this.a = ynVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return this.a.equals(horizontalAlignElement.a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        wx0 wx0Var = new wx0();
        wx0Var.A = this.a;
        return wx0Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        ((wx0) ul1Var).A = this.a;
    }
}
