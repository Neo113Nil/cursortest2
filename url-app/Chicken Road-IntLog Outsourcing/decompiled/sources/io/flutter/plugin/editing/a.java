package io.flutter.plugin.editing;

import android.view.WindowInsetsAnimation;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ WindowInsetsAnimation g(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionInfo i(int i2) {
        return new AccessibilityNodeInfo.CollectionInfo(i2, 1, false);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo j(int i2, boolean z) {
        return new AccessibilityNodeInfo.CollectionItemInfo(i2, 1, 0, 1, z);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionInfo p(int i2) {
        return new AccessibilityNodeInfo.CollectionInfo(1, i2, false);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo q(int i2, boolean z) {
        return new AccessibilityNodeInfo.CollectionItemInfo(0, 1, i2, 1, z);
    }
}
