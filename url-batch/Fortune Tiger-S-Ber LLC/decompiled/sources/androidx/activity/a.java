package androidx.activity;

import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import android.window.BackEvent;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class a {
    public static AccessibilityNodeInfo.AccessibilityAction a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float b(VelocityTracker velocityTracker, int i4) {
        return velocityTracker.getAxisVelocity(i4);
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int e(ViewConfiguration viewConfiguration, int i4, int i5, int i6) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i4, i5, i6);
    }

    public static int f(ViewConfiguration viewConfiguration, int i4, int i5, int i6) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i4, i5, i6);
    }

    public static boolean g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static float h(BackEvent backEvent) {
        return backEvent.getProgress();
    }

    public static void i(TextView textView, int i4, float f4) {
        textView.setLineHeight(i4, f4);
    }

    public static int j(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    public static float k(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    public static float l(BackEvent backEvent) {
        return backEvent.getTouchY();
    }
}
