package com.unity3d.player.a;

import com.unity3d.player.P0;

/* loaded from: classes2.dex */
public final class X implements Runnable {
    public final /* synthetic */ Z a;

    public X(Z z) {
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Z z = this.a;
        P0 p0 = z.f;
        if (p0 != null) {
            z.a.addViewToPlayer(p0, true);
            Z z2 = this.a;
            z2.i = true;
            z2.f.requestFocus();
        }
    }
}
