package c3;

import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class e {
    public static g a(boolean z8, int i7, int i8, int i9, int i10, boolean z9, String str, String str2) {
        return new g(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z8).setColumnIndex(i7).setRowIndex(i8).setColumnSpan(i9).setRowSpan(i10).setSelected(z9).setRowTitle(str).setColumnTitle(str2).build());
    }

    public static i b(AccessibilityNodeInfo accessibilityNodeInfo, int i7, int i8) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i7, i8);
        if (child != null) {
            return new i((Object) child);
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

    public static i f(AccessibilityNodeInfo accessibilityNodeInfo, int i7) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i7);
        if (parent != null) {
            return new i((Object) parent);
        }
        return null;
    }

    public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z8) {
        accessibilityNodeInfo.setTextSelectable(z8);
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
