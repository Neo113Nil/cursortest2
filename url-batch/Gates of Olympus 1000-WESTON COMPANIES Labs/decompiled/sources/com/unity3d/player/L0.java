package com.unity3d.player;

import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class L0 implements Runnable {
    public final /* synthetic */ UnityPlayerForGameActivity a;

    public L0(UnityPlayerForGameActivity unityPlayerForGameActivity) {
        this.a = unityPlayerForGameActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.a.D d;
        com.unity3d.player.a.D d2;
        UnityPlayerForGameActivity unityPlayerForGameActivity = this.a;
        d = unityPlayerForGameActivity.m_PersistentUnitySurface;
        FrameLayout frameLayout = unityPlayerForGameActivity.getFrameLayout();
        com.unity3d.player.a.C c = d.b;
        if (c != null && c.getParent() != null) {
            frameLayout.removeView(d.b);
        }
        d2 = this.a.m_PersistentUnitySurface;
        d2.b = null;
    }
}
