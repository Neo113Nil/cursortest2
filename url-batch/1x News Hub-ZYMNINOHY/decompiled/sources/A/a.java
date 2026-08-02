package A;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import e.C0304a;

/* loaded from: classes.dex */
public abstract class a {
    public static Object a(Bundle bundle, String str) {
        return bundle.getParcelable(str, C0304a.class);
    }

    public static String b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }
}
