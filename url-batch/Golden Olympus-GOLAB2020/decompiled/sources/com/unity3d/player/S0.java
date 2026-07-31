package com.unity3d.player;

import android.widget.FrameLayout;
import h1.C2441b;
import h1.C2442c;

/* loaded from: classes2.dex */
public final class S0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForGameActivity f22077a;

    public S0(UnityPlayerForGameActivity unityPlayerForGameActivity) {
        this.f22077a = unityPlayerForGameActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2442c c2442c;
        C2442c c2442c2;
        UnityPlayerForGameActivity unityPlayerForGameActivity = this.f22077a;
        c2442c = unityPlayerForGameActivity.m_PersistentUnitySurface;
        FrameLayout frameLayout = unityPlayerForGameActivity.getFrameLayout();
        C2441b c2441b = c2442c.f36733b;
        if (c2441b != null && c2441b.getParent() != null) {
            frameLayout.removeView(c2442c.f36733b);
        }
        c2442c2 = this.f22077a.m_PersistentUnitySurface;
        c2442c2.f36733b = null;
    }
}
