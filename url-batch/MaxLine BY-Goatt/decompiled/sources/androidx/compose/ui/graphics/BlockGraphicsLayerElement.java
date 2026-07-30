package androidx.compose.ui.graphics;

import defpackage.cm1;
import defpackage.ks1;
import defpackage.oo;
import defpackage.s03;
import defpackage.ul1;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class BlockGraphicsLayerElement extends cm1 {
    public final Function1 a;

    public BlockGraphicsLayerElement(Function1 function1) {
        this.a = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BlockGraphicsLayerElement) {
            return this.a == ((BlockGraphicsLayerElement) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        return new oo(this.a);
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        oo ooVar = (oo) ul1Var;
        ooVar.A = this.a;
        ks1 ks1Var = s03.H(ooVar, 2).B;
        if (ks1Var != null) {
            ks1Var.p1(ooVar.A, true);
        }
    }
}
