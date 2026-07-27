package b1;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: b1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0505e {
    public static C0507g a(boolean z4, int i2, int i4, int i5, int i6, boolean z5, String str, String str2) {
        new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z4).setColumnIndex(i2).setRowIndex(i4).setColumnSpan(i5).setRowSpan(i6).setSelected(z5).setRowTitle(str).setColumnTitle(str2).build();
        return new C0507g();
    }

    public static C0508h b(AccessibilityNodeInfo accessibilityNodeInfo, int i2, int i4) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i2, i4);
        if (child != null) {
            return new C0508h(child, 0);
        }
        return null;
    }

    public static String c(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    public static String d(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    public static C0508h f(AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i2);
        if (parent != null) {
            return new C0508h(parent, 0);
        }
        return null;
    }

    public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z4) {
        accessibilityNodeInfo.setTextSelectable(z4);
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
