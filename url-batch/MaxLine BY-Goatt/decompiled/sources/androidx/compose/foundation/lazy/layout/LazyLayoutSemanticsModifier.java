package androidx.compose.foundation.lazy.layout;

import defpackage.cm1;
import defpackage.ec1;
import defpackage.in1;
import defpackage.ul1;
import defpackage.ww1;
import defpackage.yh2;
import defpackage.zb1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends cm1 {
    public final Function0 a;
    public final zb1 b;
    public final ww1 c;
    public final boolean d;

    public LazyLayoutSemanticsModifier(Function0 function0, zb1 zb1Var, ww1 ww1Var, boolean z) {
        this.a = function0;
        this.b = zb1Var;
        this.c = ww1Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.a == lazyLayoutSemanticsModifier.a && Intrinsics.b(this.b, lazyLayoutSemanticsModifier.b) && this.c == lazyLayoutSemanticsModifier.c && this.d == lazyLayoutSemanticsModifier.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + in1.i((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        return new ec1(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        ec1 ec1Var = (ec1) ul1Var;
        ec1Var.A = this.a;
        ec1Var.B = this.b;
        ww1 ww1Var = ec1Var.C;
        ww1 ww1Var2 = this.c;
        if (ww1Var != ww1Var2) {
            ec1Var.C = ww1Var2;
            yh2.l(ec1Var);
        }
        boolean z = ec1Var.D;
        boolean z2 = this.d;
        if (z == z2) {
            return;
        }
        ec1Var.D = z2;
        ec1Var.G0();
        yh2.l(ec1Var);
    }
}
