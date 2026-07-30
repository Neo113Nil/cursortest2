package Q0;

import android.view.WindowInsetsAnimation;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* bridge */ /* synthetic */ WindowInsetsAnimation f(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionInfo g(int i2) {
        return new AccessibilityNodeInfo.CollectionInfo(i2, 1, false);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo h(int i2, boolean z7) {
        return new AccessibilityNodeInfo.CollectionItemInfo(i2, 1, 0, 1, z7);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionInfo n(int i2) {
        return new AccessibilityNodeInfo.CollectionInfo(1, i2, false);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo o(int i2, boolean z7) {
        return new AccessibilityNodeInfo.CollectionItemInfo(0, 1, i2, 1, z7);
    }
}
