package io.flutter.view;

import android.app.ApplicationExitInfo;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ ApplicationExitInfo c(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionInfo g(int i7) {
        return new AccessibilityNodeInfo.CollectionInfo(i7, 1, false);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo h(int i7, boolean z5) {
        return new AccessibilityNodeInfo.CollectionItemInfo(i7, 1, 0, 1, z5);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionInfo k(int i7) {
        return new AccessibilityNodeInfo.CollectionInfo(1, i7, false);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo l(int i7, boolean z5) {
        return new AccessibilityNodeInfo.CollectionItemInfo(0, 1, i7, 1, z5);
    }
}
