package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dv1 extends ul1 implements r81 {
    public Function1 A;
    public long B;

    @Override // defpackage.r81
    public final void v(long j) {
        if (x31.a(this.B, j)) {
            return;
        }
        this.A.invoke(new x31(j));
        this.B = j;
    }

    @Override // defpackage.ul1
    public final boolean v0() {
        return true;
    }
}
