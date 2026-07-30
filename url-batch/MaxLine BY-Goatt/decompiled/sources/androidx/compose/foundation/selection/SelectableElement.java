package androidx.compose.foundation.selection;

import defpackage.bn1;
import defpackage.cm1;
import defpackage.fb2;
import defpackage.in1;
import defpackage.q40;
import defpackage.ul1;
import defpackage.yh2;
import defpackage.zg2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class SelectableElement extends cm1 {
    public final boolean a;
    public final bn1 b;
    public final boolean c;
    public final fb2 d;
    public final Function0 e;

    public SelectableElement(boolean z, bn1 bn1Var, boolean z2, fb2 fb2Var, Function0 function0) {
        this.a = z;
        this.b = bn1Var;
        this.c = z2;
        this.d = fb2Var;
        this.e = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.a == selectableElement.a && Intrinsics.b(this.b, selectableElement.b) && this.c == selectableElement.c && this.d.equals(selectableElement.d) && this.e == selectableElement.e;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        bn1 bn1Var = this.b;
        return this.e.hashCode() + q40.e(this.d.a, in1.i((hashCode + (bn1Var != null ? bn1Var.hashCode() : 0)) * 961, 31, this.c), 31);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        zg2 zg2Var = new zg2(this.b, null, this.c, null, this.d, this.e);
        zg2Var.U = this.a;
        return zg2Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        zg2 zg2Var = (zg2) ul1Var;
        boolean z = zg2Var.U;
        boolean z2 = this.a;
        if (z != z2) {
            zg2Var.U = z2;
            yh2.l(zg2Var);
        }
        zg2Var.M0(this.b, null, this.c, null, this.d, this.e);
    }
}
