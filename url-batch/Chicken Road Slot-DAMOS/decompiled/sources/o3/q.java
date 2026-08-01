package o3;

import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class q {
    public static AccessibilityNodeInfo.AccessibilityAction a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float b(VelocityTracker velocityTracker, int i3) {
        return velocityTracker.getAxisVelocity(i3);
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int e(ViewConfiguration viewConfiguration, int i3, int i10, int i11) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i3, i10, i11);
    }

    public static int f(ViewConfiguration viewConfiguration, int i3, int i10, int i11) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i3, i10, i11);
    }

    public static boolean g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static boolean h(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static void i(AccessibilityEvent accessibilityEvent, boolean z10) {
        accessibilityEvent.setAccessibilityDataSensitive(z10);
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z10);
    }

    public static void k(TextView textView, int i3, float f3) {
        textView.setLineHeight(i3, f3);
    }
}
