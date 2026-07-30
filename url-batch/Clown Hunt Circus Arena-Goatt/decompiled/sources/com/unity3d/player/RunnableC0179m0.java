package com.unity3d.player;

import android.view.WindowManager;

/* renamed from: com.unity3d.player.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0179m0 implements Runnable {
    public final /* synthetic */ float a;
    public final /* synthetic */ UnityPlayer b;

    public RunnableC0179m0(UnityPlayer unityPlayer, float f) {
        this.b = unityPlayer;
        this.a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WindowManager.LayoutParams attributes = this.b.m_Window.getAttributes();
        attributes.screenBrightness = this.a;
        this.b.m_Window.setAttributes(attributes);
    }
}
