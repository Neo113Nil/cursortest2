package io.appmetrica.analytics.impl;

import android.view.WindowInsetsAnimation;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract /* synthetic */ class Wo {
    public static /* bridge */ /* synthetic */ WindowInsetsAnimation f(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionInfo g(int i4) {
        return new AccessibilityNodeInfo.CollectionInfo(i4, 1, false);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo h(int i4, boolean z) {
        return new AccessibilityNodeInfo.CollectionItemInfo(0, 1, i4, 1, z);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionInfo m(int i4) {
        return new AccessibilityNodeInfo.CollectionInfo(1, i4, false);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo n(int i4, boolean z) {
        return new AccessibilityNodeInfo.CollectionItemInfo(i4, 1, 0, 1, z);
    }
}
