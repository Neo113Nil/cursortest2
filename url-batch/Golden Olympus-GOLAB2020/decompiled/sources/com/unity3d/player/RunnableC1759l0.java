package com.unity3d.player;

import android.view.WindowManager;

/* renamed from: com.unity3d.player.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1759l0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f22193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnityPlayer f22194b;

    public RunnableC1759l0(UnityPlayer unityPlayer, float f4) {
        this.f22194b = unityPlayer;
        this.f22193a = f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WindowManager.LayoutParams attributes = this.f22194b.m_Window.getAttributes();
        attributes.screenBrightness = this.f22193a;
        this.f22194b.m_Window.setAttributes(attributes);
    }
}
