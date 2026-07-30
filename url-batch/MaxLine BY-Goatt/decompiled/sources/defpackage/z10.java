package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z10 implements wl1 {
    public final Function1 a;
    public z63 b;

    public z10(Function1 function1) {
        this.a = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z10) && ((z10) obj).a == this.a;
    }

    @Override // defpackage.wl1
    public final void f(am1 am1Var) {
        z63 z63Var = (z63) am1Var.i(j83.a);
        if (Intrinsics.b(z63Var, this.b)) {
            return;
        }
        this.b = z63Var;
        this.a.invoke(z63Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
