package androidx.compose.ui.input.rotary;

import defpackage.cm1;
import defpackage.o3;
import defpackage.sb2;
import defpackage.ul1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class RotaryInputElement extends cm1 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof RotaryInputElement);
    }

    public final int hashCode() {
        return o3.q.hashCode() * 31;
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        o3 o3Var = o3.q;
        sb2 sb2Var = new sb2();
        sb2Var.A = o3Var;
        return sb2Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        ((sb2) ul1Var).A = o3.q;
    }
}
