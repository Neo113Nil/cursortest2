package com.unity3d.player.a;

import com.unity3d.player.C0133a0;
import com.unity3d.player.P0;

/* loaded from: classes2.dex */
public final class Y implements Runnable {
    public final /* synthetic */ Z a;

    public Y(Z z) {
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Z z = this.a;
        P0 p0 = z.f;
        if (p0 != null) {
            z.a.removeViewFromPlayer(p0);
            z.i = false;
            z.f.destroyPlayer();
            z.f = null;
            C0133a0 c0133a0 = z.c;
            if (c0133a0 != null) {
                c0133a0.a();
            }
        }
        this.a.a.onResume();
    }
}
