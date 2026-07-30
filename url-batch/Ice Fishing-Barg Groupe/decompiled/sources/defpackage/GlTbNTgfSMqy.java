package defpackage;

import android.app.ActivityOptions;
import android.app.Notification;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class GlTbNTgfSMqy {
    public static int PxuCJdSBwIXG(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getChecked();
    }

    public static CharSequence TSizfFm2Yiuu(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getSupplementalDescription();
    }

    public static boolean Y1f8riQaR6yg(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isFieldRequired();
    }

    public static void a92UlCVFR9N8(Notification.Builder builder) {
        builder.setShortCriticalText(null);
    }

    public static void e9gEMXR7LXtO(ActivityOptions activityOptions, boolean z) {
        activityOptions.setAllowPassThroughOnTouchOutside(z);
    }

    public static int lS5Rgt96tfkO(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExpandedState();
    }
}
