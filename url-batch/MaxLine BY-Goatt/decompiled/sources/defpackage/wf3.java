package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wf3 extends oe3 {
    public final bl3 g;

    public wf3(bl3 bl3Var) {
        this.g = bl3Var;
    }

    @Override // defpackage.ve3
    public final int e() {
        return System.identityHashCode(this.g);
    }

    @Override // defpackage.ve3
    public final void i(String str, String str2, Bundle bundle, long j) {
        this.g.onEvent(str, str2, bundle, j);
    }
}
