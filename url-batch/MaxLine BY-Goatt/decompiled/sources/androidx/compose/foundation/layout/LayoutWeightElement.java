package androidx.compose.foundation.layout;

import defpackage.cm1;
import defpackage.ul1;
import defpackage.w91;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class LayoutWeightElement extends cm1 {
    public final float a;
    public final boolean b;

    public LayoutWeightElement(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.a == layoutWeightElement.a && this.b == layoutWeightElement.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        w91 w91Var = new w91();
        w91Var.A = this.a;
        w91Var.B = this.b;
        return w91Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        w91 w91Var = (w91) ul1Var;
        w91Var.A = this.a;
        w91Var.B = this.b;
    }
}
