package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class w30 extends ul1 implements xh2 {
    public boolean A;
    public final boolean B;
    public Function1 C;

    public w30(boolean z, boolean z2, Function1 function1) {
        this.A = z;
        this.B = z2;
        this.C = function1;
    }

    @Override // defpackage.xh2
    public final void M(sh2 sh2Var) {
        this.C.invoke(sh2Var);
    }

    @Override // defpackage.xh2
    public final boolean i0() {
        return this.B;
    }

    @Override // defpackage.xh2
    public final boolean k0() {
        return this.A;
    }
}
