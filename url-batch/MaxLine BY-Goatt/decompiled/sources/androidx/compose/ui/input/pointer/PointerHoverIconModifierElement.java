package androidx.compose.ui.input.pointer;

import defpackage.cm1;
import defpackage.o70;
import defpackage.p22;
import defpackage.ul1;
import defpackage.va;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends cm1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        va vaVar = o70.i;
        return vaVar.equals(vaVar);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (1008 * 31);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        va vaVar = o70.i;
        p22 p22Var = new p22();
        p22Var.A = vaVar;
        return p22Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        p22 p22Var = (p22) ul1Var;
        va vaVar = o70.i;
        if (Intrinsics.b(p22Var.A, vaVar)) {
            return;
        }
        p22Var.A = vaVar;
        if (p22Var.B) {
            p22Var.I0();
        }
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + o70.i + ", overrideDescendants=false)";
    }
}
