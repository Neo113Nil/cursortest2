package com.unity3d.player;

import android.view.SurfaceView;
import android.view.accessibility.AccessibilityManager;
import com.unity3d.player.UnityAccessibilityDelegate.a;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class P implements AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityAccessibilityDelegate f22063a;

    public P(UnityAccessibilityDelegate unityAccessibilityDelegate) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        this.f22063a = unityAccessibilityDelegate;
        accessibilityManager = unityAccessibilityDelegate.f22085c;
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager2 = unityAccessibilityDelegate.f22085c;
        accessibilityManager2.addTouchExplorationStateChangeListener(this);
        accessibilityManager3 = unityAccessibilityDelegate.f22085c;
        if (accessibilityManager3.isEnabled()) {
            onAccessibilityStateChanged(true);
        }
    }

    public void cleanup() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        accessibilityManager = this.f22063a.f22085c;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager2 = this.f22063a.f22085c;
        accessibilityManager2.removeTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z4) {
        SurfaceView surfaceView;
        SurfaceView surfaceView2;
        SurfaceView surfaceView3;
        SurfaceView surfaceView4;
        AccessibilityManager accessibilityManager;
        if (!z4) {
            surfaceView = this.f22063a.f22084b;
            surfaceView.setAccessibilityDelegate(null);
            surfaceView2 = this.f22063a.f22084b;
            surfaceView2.setWillNotDraw(true);
            onTouchExplorationStateChanged(false);
            return;
        }
        UnityAccessibilityDelegate unityAccessibilityDelegate = this.f22063a;
        surfaceView3 = unityAccessibilityDelegate.f22084b;
        surfaceView3.setAccessibilityDelegate(unityAccessibilityDelegate);
        surfaceView4 = this.f22063a.f22084b;
        surfaceView4.setWillNotDraw(false);
        accessibilityManager = this.f22063a.f22085c;
        onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z4) {
        AccessibilityManager accessibilityManager;
        SurfaceView surfaceView;
        boolean z5;
        UnityPlayer unityPlayer;
        UnityPlayer unityPlayer2;
        SurfaceView surfaceView2;
        accessibilityManager = this.f22063a.f22085c;
        boolean z6 = accessibilityManager.isEnabled() && z4;
        if (z6) {
            UnityAccessibilityDelegate unityAccessibilityDelegate = this.f22063a;
            surfaceView2 = unityAccessibilityDelegate.f22084b;
            surfaceView2.setOnHoverListener(unityAccessibilityDelegate.new a());
        } else {
            surfaceView = this.f22063a.f22084b;
            surfaceView.setOnHoverListener(null);
        }
        UnityAccessibilityDelegate unityAccessibilityDelegate2 = this.f22063a;
        z5 = unityAccessibilityDelegate2.f22091i;
        if (z5 == z6) {
            return;
        }
        unityAccessibilityDelegate2.f22091i = z6;
        unityPlayer = unityAccessibilityDelegate2.f22083a;
        Objects.requireNonNull(unityPlayer);
        O o4 = new O(unityPlayer, z6);
        unityPlayer2 = this.f22063a.f22083a;
        unityPlayer2.invokeOnMainThread((Runnable) o4);
    }
}
