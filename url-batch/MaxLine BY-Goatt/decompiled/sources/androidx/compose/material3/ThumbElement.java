package androidx.compose.material3;

import defpackage.b41;
import defpackage.cm1;
import defpackage.mx2;
import defpackage.ul1;
import defpackage.yj1;
import defpackage.zm3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class ThumbElement extends cm1 {
    public final b41 a;
    public final boolean b;

    public ThumbElement(b41 b41Var, boolean z) {
        this.a = b41Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        return Intrinsics.b(this.a, thumbElement.a) && this.b == thumbElement.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        mx2 mx2Var = new mx2();
        mx2Var.A = this.a;
        mx2Var.B = this.b;
        mx2Var.F = Float.NaN;
        mx2Var.G = Float.NaN;
        return mx2Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        mx2 mx2Var = (mx2) ul1Var;
        mx2Var.A = this.a;
        boolean z = mx2Var.B;
        boolean z2 = this.b;
        if (z != z2) {
            zm3.C(mx2Var);
        }
        mx2Var.B = z2;
        if (mx2Var.E == null && !Float.isNaN(mx2Var.G)) {
            mx2Var.E = yj1.a(mx2Var.G);
        }
        if (mx2Var.D != null || Float.isNaN(mx2Var.F)) {
            return;
        }
        mx2Var.D = yj1.a(mx2Var.F);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.a + ", checked=" + this.b + ')';
    }
}
