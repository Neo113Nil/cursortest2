package com.unity3d.player;

import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class T0 implements Runnable {
    public final /* synthetic */ UnityPlayerForGameActivity a;

    public T0(UnityPlayerForGameActivity unityPlayerForGameActivity) {
        this.a = unityPlayerForGameActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.a.C c;
        com.unity3d.player.a.C c2;
        UnityPlayerForGameActivity unityPlayerForGameActivity = this.a;
        c = unityPlayerForGameActivity.m_PersistentUnitySurface;
        FrameLayout frameLayout = unityPlayerForGameActivity.getFrameLayout();
        com.unity3d.player.a.B b = c.b;
        if (b != null && b.getParent() != null) {
            frameLayout.removeView(c.b);
        }
        c2 = this.a.m_PersistentUnitySurface;
        c2.b = null;
    }
}
