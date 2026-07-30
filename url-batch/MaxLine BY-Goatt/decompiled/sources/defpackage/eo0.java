package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class eo0 extends ul1 implements go0 {
    public Function1 A;
    public xo0 B;

    @Override // defpackage.go0
    public final void X(xo0 xo0Var) {
        if (Intrinsics.b(this.B, xo0Var)) {
            return;
        }
        this.B = xo0Var;
        this.A.invoke(xo0Var);
    }
}
