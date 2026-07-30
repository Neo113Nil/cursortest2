package com.unity3d.player;

import android.view.accessibility.CaptioningManager;
import java.util.Objects;

/* loaded from: classes.dex */
public final class T extends CaptioningManager.CaptioningChangeListener {
    public final /* synthetic */ UnityAccessibilityDelegate a;

    public T(UnityAccessibilityDelegate unityAccessibilityDelegate) {
        CaptioningManager captioningManager;
        CaptioningManager captioningManager2;
        this.a = unityAccessibilityDelegate;
        captioningManager = unityAccessibilityDelegate.e;
        captioningManager.addCaptioningChangeListener(this);
        captioningManager2 = unityAccessibilityDelegate.e;
        onEnabledChanged(captioningManager2.isEnabled());
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onEnabledChanged(boolean z) {
        UnityPlayer unityPlayer;
        UnityPlayer unityPlayer2;
        unityPlayer = this.a.a;
        Objects.requireNonNull(unityPlayer);
        S s = new S(unityPlayer, z);
        unityPlayer2 = this.a.a;
        unityPlayer2.invokeOnMainThread((Runnable) s);
    }

    public void cleanup() {
        CaptioningManager captioningManager;
        captioningManager = this.a.e;
        captioningManager.removeCaptioningChangeListener(this);
    }
}
