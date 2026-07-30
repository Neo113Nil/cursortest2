package androidx.compose.foundation.layout;

import defpackage.cm1;
import defpackage.pc0;
import defpackage.ul1;
import defpackage.w23;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends cm1 {
    public final float a;
    public final float b;

    public UnspecifiedConstraintsElement(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return pc0.a(this.a, unspecifiedConstraintsElement.a) && pc0.a(this.b, unspecifiedConstraintsElement.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        w23 w23Var = new w23();
        w23Var.A = this.a;
        w23Var.B = this.b;
        return w23Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        w23 w23Var = (w23) ul1Var;
        w23Var.A = this.a;
        w23Var.B = this.b;
    }
}
