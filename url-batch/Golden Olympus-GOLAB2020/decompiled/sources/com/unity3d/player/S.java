package com.unity3d.player;

import android.view.accessibility.CaptioningManager;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class S extends CaptioningManager.CaptioningChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityAccessibilityDelegate f22076a;

    public S(UnityAccessibilityDelegate unityAccessibilityDelegate) {
        CaptioningManager captioningManager;
        CaptioningManager captioningManager2;
        this.f22076a = unityAccessibilityDelegate;
        captioningManager = unityAccessibilityDelegate.f22087e;
        captioningManager.addCaptioningChangeListener(this);
        captioningManager2 = unityAccessibilityDelegate.f22087e;
        onEnabledChanged(captioningManager2.isEnabled());
    }

    public void cleanup() {
        CaptioningManager captioningManager;
        captioningManager = this.f22076a.f22087e;
        captioningManager.removeCaptioningChangeListener(this);
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onEnabledChanged(boolean z4) {
        UnityPlayer unityPlayer;
        UnityPlayer unityPlayer2;
        unityPlayer = this.f22076a.f22083a;
        Objects.requireNonNull(unityPlayer);
        Q q4 = new Q(unityPlayer, z4);
        unityPlayer2 = this.f22076a.f22083a;
        unityPlayer2.invokeOnMainThread((Runnable) q4);
    }
}
