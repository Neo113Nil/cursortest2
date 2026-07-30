package androidx.compose.foundation.layout;

import defpackage.cm1;
import defpackage.d93;
import defpackage.in1;
import defpackage.q40;
import defpackage.ul1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class WrapContentElement extends cm1 {
    public final int a;
    public final Function2 b;
    public final Object c;

    public WrapContentElement(int i, Function2 function2, Object obj) {
        this.a = i;
        this.b = function2;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.a == wrapContentElement.a && this.c.equals(wrapContentElement.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + in1.i(q40.u(this.a) * 31, 31, false);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        d93 d93Var = new d93();
        d93Var.A = this.a;
        d93Var.B = this.b;
        return d93Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        d93 d93Var = (d93) ul1Var;
        d93Var.A = this.a;
        d93Var.B = this.b;
    }
}
