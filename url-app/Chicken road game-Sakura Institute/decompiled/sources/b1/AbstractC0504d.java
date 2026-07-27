package b1;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: b1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0504d {
    public static Object a(int i2, float f4, float f5, float f6) {
        return new AccessibilityNodeInfo.RangeInfo(i2, f4, f5, f6);
    }

    public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
