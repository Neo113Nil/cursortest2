package E;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import f.C0382a;

/* loaded from: classes.dex */
public abstract class d {
    public static Object a(String str, Bundle bundle) {
        return bundle.getParcelable(str, C0382a.class);
    }

    public static String b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }
}
