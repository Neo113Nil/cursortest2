package androidx.compose.foundation.layout;

import defpackage.cm1;
import defpackage.pi;
import defpackage.ul1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class AspectRatioElement extends cm1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null) == null) {
            return false;
        }
        ((AspectRatioElement) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(1.0f) * 31);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        pi piVar = new pi();
        piVar.A = 1.0f;
        return piVar;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        ((pi) ul1Var).A = 1.0f;
    }
}
