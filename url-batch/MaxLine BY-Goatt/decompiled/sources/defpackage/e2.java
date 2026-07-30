package defpackage;

import android.app.ActivityOptions;
import android.app.Notification;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.BackEvent;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class e2 {
    public static final sq1 a(BackEvent backEvent) {
        backEvent.getClass();
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new sq1(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static int b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getChecked();
    }

    public static int c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExpandedState();
    }

    public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getSupplementalDescription();
    }

    public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isFieldRequired();
    }

    public static void f(ActivityOptions activityOptions, boolean z) {
        activityOptions.setAllowPassThroughOnTouchOutside(z);
    }

    public static void g(Notification.Builder builder) {
        builder.setShortCriticalText(null);
    }
}
