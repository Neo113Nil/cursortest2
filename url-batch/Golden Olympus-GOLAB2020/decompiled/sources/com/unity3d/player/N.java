package com.unity3d.player;

import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class N extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityAccessibilityDelegate f22045a;

    public N(UnityAccessibilityDelegate unityAccessibilityDelegate) {
        this.f22045a = unityAccessibilityDelegate;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i4) {
        SurfaceView surfaceView;
        boolean populateNodeInfo;
        SurfaceView surfaceView2;
        SurfaceView surfaceView3;
        int[] rootNodeIds;
        SurfaceView surfaceView4;
        if (i4 != -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
            surfaceView = this.f22045a.f22084b;
            populateNodeInfo = UnityAccessibilityDelegate.populateNodeInfo(obtain, i4, surfaceView);
            if (populateNodeInfo) {
                return obtain;
            }
            return null;
        }
        surfaceView2 = this.f22045a.f22084b;
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(surfaceView2);
        surfaceView3 = this.f22045a.f22084b;
        Object parent = surfaceView3.getParent();
        if (parent instanceof View) {
            obtain2.setParent((View) parent);
        }
        rootNodeIds = UnityAccessibilityDelegate.getRootNodeIds();
        if (rootNodeIds != null) {
            for (int i5 : rootNodeIds) {
                surfaceView4 = this.f22045a.f22084b;
                obtain2.addChild(surfaceView4, i5);
            }
        }
        return obtain2;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i4, int i5, Bundle bundle) {
        boolean isNodeSlider;
        boolean isNodeScrollable;
        UnityPlayer unityPlayer;
        UnityPlayer unityPlayer2;
        UnityPlayer unityPlayer3;
        UnityPlayer unityPlayer4;
        boolean isNodeDismissable;
        UnityPlayer unityPlayer5;
        UnityPlayer unityPlayer6;
        boolean isNodeInvokable;
        UnityPlayer unityPlayer7;
        UnityPlayer unityPlayer8;
        if (i5 == 64) {
            return this.f22045a.sendEventForVirtualViewId(i4, 32768);
        }
        if (i5 == 128) {
            return this.f22045a.sendEventForVirtualViewId(i4, 65536);
        }
        if (i5 == 16) {
            isNodeInvokable = UnityAccessibilityDelegate.isNodeInvokable(i4);
            if (!isNodeInvokable) {
                return false;
            }
            unityPlayer7 = this.f22045a.f22083a;
            Objects.requireNonNull(unityPlayer7);
            J j4 = new J(this, unityPlayer7, i4);
            unityPlayer8 = this.f22045a.f22083a;
            unityPlayer8.invokeOnMainThread((Runnable) j4);
            return true;
        }
        if (i5 == 4096 || i5 == 8192) {
            isNodeSlider = UnityAccessibilityDelegate.isNodeSlider(i4);
            if (isNodeSlider) {
                unityPlayer3 = this.f22045a.f22083a;
                Objects.requireNonNull(unityPlayer3);
                K k4 = new K(this, unityPlayer3, i5, i4);
                unityPlayer4 = this.f22045a.f22083a;
                unityPlayer4.invokeOnMainThread((Runnable) k4);
                return true;
            }
            isNodeScrollable = UnityAccessibilityDelegate.isNodeScrollable(i4);
            if (isNodeScrollable) {
                unityPlayer = this.f22045a.f22083a;
                Objects.requireNonNull(unityPlayer);
                L l4 = new L(unityPlayer, i4, i5);
                unityPlayer2 = this.f22045a.f22083a;
                unityPlayer2.invokeOnMainThread((Runnable) l4);
                return true;
            }
        }
        if (i5 != 1048576) {
            return false;
        }
        isNodeDismissable = UnityAccessibilityDelegate.isNodeDismissable(i4);
        if (!isNodeDismissable) {
            return false;
        }
        unityPlayer5 = this.f22045a.f22083a;
        Objects.requireNonNull(unityPlayer5);
        M m4 = new M(unityPlayer5, i4);
        unityPlayer6 = this.f22045a.f22083a;
        unityPlayer6.invokeOnMainThread((Runnable) m4);
        return true;
    }
}
