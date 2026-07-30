package androidx.compose.foundation;

import defpackage.bn1;
import defpackage.cm1;
import defpackage.cp0;
import defpackage.ul1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class FocusableElement extends cm1 {
    public final bn1 a;

    public FocusableElement(bn1 bn1Var) {
        this.a = bn1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return Intrinsics.b(this.a, ((FocusableElement) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        bn1 bn1Var = this.a;
        if (bn1Var != null) {
            return bn1Var.hashCode();
        }
        return 0;
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        return new cp0(this.a);
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        ((cp0) ul1Var).J0(this.a);
    }
}
