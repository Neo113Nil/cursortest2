package com.unity3d.player;

import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class D0 implements Runnable {
    public final /* synthetic */ UnityPlayerForActivityOrService a;

    public D0(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.a = unityPlayerForActivityOrService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N view = this.a.getView();
        if (view != null) {
            com.unity3d.player.a.D d = view.c;
            FrameLayout frameLayout = view.b.getFrameLayout();
            com.unity3d.player.a.C c = d.b;
            if (c != null && c.getParent() != null) {
                frameLayout.removeView(d.b);
            }
            view.c.b = null;
        }
    }
}
