package io.flutter.plugin.editing;

import android.view.WindowInsetsAnimation;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ WindowInsetsAnimation c(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionInfo e(int i3) {
        return new AccessibilityNodeInfo.CollectionInfo(i3, 1, false);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo f(int i3, boolean z) {
        return new AccessibilityNodeInfo.CollectionItemInfo(i3, 1, 0, 1, z);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionInfo i(int i3) {
        return new AccessibilityNodeInfo.CollectionInfo(1, i3, false);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo j(int i3, boolean z) {
        return new AccessibilityNodeInfo.CollectionItemInfo(0, 1, i3, 1, z);
    }
}
