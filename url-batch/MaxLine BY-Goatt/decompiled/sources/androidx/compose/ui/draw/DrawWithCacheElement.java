package androidx.compose.ui.draw;

import defpackage.cm1;
import defpackage.hr;
import defpackage.ir;
import defpackage.ul1;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class DrawWithCacheElement extends cm1 {
    public final Function1 a;

    public DrawWithCacheElement(Function1 function1) {
        this.a = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawWithCacheElement) {
            return this.a == ((DrawWithCacheElement) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        return new hr(new ir(), this.a);
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        hr hrVar = (hr) ul1Var;
        hrVar.C = this.a;
        hrVar.G0();
    }
}
