package com.unity3d.player;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import java.util.concurrent.Semaphore;

/* renamed from: com.unity3d.player.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC0174z implements Runnable {
    public final /* synthetic */ Semaphore a;
    public final /* synthetic */ UnityAccessibilityDelegate b;

    public RunnableC0174z(UnityAccessibilityDelegate unityAccessibilityDelegate, Semaphore semaphore) {
        this.b = unityAccessibilityDelegate;
        this.a = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AccessibilityManager accessibilityManager;
        CaptioningManager captioningManager;
        try {
            UnityAccessibilityDelegate unityAccessibilityDelegate = this.b;
            accessibilityManager = unityAccessibilityDelegate.c;
            if (accessibilityManager != null) {
                unityAccessibilityDelegate.d = new J(unityAccessibilityDelegate);
            }
            UnityAccessibilityDelegate unityAccessibilityDelegate2 = this.b;
            captioningManager = unityAccessibilityDelegate2.e;
            if (captioningManager != null) {
                unityAccessibilityDelegate2.f = new L(this.b);
            }
        } finally {
            this.a.release();
        }
    }
}
