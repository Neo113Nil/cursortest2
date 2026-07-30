package androidx.compose.foundation.layout;

import defpackage.cm1;
import defpackage.q40;
import defpackage.ul1;
import defpackage.wl0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class FillElement extends cm1 {
    public final int a;
    public final float b;

    public FillElement(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.a == fillElement.a && this.b == fillElement.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (q40.u(this.a) * 31);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        wl0 wl0Var = new wl0();
        wl0Var.A = this.a;
        wl0Var.B = this.b;
        return wl0Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        wl0 wl0Var = (wl0) ul1Var;
        wl0Var.A = this.a;
        wl0Var.B = this.b;
    }
}
