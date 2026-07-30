package androidx.compose.foundation.layout;

import defpackage.ay1;
import defpackage.cm1;
import defpackage.ul1;
import defpackage.wx1;
import defpackage.yx1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class PaddingValuesElement extends cm1 {
    public final yx1 a;

    public PaddingValuesElement(yx1 yx1Var, wx1 wx1Var) {
        this.a = yx1Var;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return Intrinsics.b(this.a, paddingValuesElement.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        ay1 ay1Var = new ay1();
        ay1Var.A = this.a;
        return ay1Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        ((ay1) ul1Var).A = this.a;
    }
}
