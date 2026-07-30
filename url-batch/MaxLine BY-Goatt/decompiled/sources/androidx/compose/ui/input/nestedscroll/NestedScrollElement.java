package androidx.compose.ui.input.nestedscroll;

import defpackage.cm1;
import defpackage.hr1;
import defpackage.js0;
import defpackage.mr1;
import defpackage.u;
import defpackage.ul1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class NestedScrollElement extends cm1 {
    public final hr1 a;

    public NestedScrollElement(hr1 hr1Var) {
        this.a = hr1Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof NestedScrollElement) && Intrinsics.b(((NestedScrollElement) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        return new mr1(this.a, null);
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        mr1 mr1Var = (mr1) ul1Var;
        mr1Var.A = this.a;
        js0 js0Var = mr1Var.B;
        if (((mr1) js0Var.m) == mr1Var) {
            js0Var.m = null;
        }
        js0 js0Var2 = new js0(6);
        mr1Var.B = js0Var2;
        if (mr1Var.z) {
            js0Var2.m = mr1Var;
            js0Var2.n = null;
            mr1Var.C = null;
            js0Var2.o = new u(23, mr1Var);
            js0Var2.p = mr1Var.u0();
        }
    }
}
