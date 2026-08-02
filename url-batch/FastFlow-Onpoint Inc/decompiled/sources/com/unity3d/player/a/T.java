package com.unity3d.player.a;

import com.unity3d.player.C0026a0;
import com.unity3d.player.P0;

/* loaded from: classes.dex */
public final class T implements Runnable {
    public final /* synthetic */ U a;

    public T(U u) {
        this.a = u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Z z = this.a.a.h;
        P0 p0 = z.f;
        if (p0 != null) {
            z.a.removeViewFromPlayer(p0);
            z.i = false;
            z.f.destroyPlayer();
            z.f = null;
            C0026a0 c0026a0 = z.c;
            if (c0026a0 != null) {
                c0026a0.a();
            }
        }
        this.a.a.h.a.onResume();
    }
}
