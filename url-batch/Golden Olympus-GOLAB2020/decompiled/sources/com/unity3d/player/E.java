package com.unity3d.player;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import java.util.concurrent.Semaphore;

/* loaded from: classes2.dex */
public final class E implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Semaphore f22007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnityAccessibilityDelegate f22008b;

    public E(UnityAccessibilityDelegate unityAccessibilityDelegate, Semaphore semaphore) {
        this.f22008b = unityAccessibilityDelegate;
        this.f22007a = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AccessibilityManager accessibilityManager;
        CaptioningManager captioningManager;
        try {
            UnityAccessibilityDelegate unityAccessibilityDelegate = this.f22008b;
            accessibilityManager = unityAccessibilityDelegate.f22085c;
            if (accessibilityManager != null) {
                unityAccessibilityDelegate.f22086d = new P(unityAccessibilityDelegate);
            }
            UnityAccessibilityDelegate unityAccessibilityDelegate2 = this.f22008b;
            captioningManager = unityAccessibilityDelegate2.f22087e;
            if (captioningManager != null) {
                unityAccessibilityDelegate2.f22088f = new S(this.f22008b);
            }
            this.f22007a.release();
        } catch (Throwable th) {
            this.f22007a.release();
            throw th;
        }
    }
}
