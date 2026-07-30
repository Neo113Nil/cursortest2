package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class JLGWdXyAxbxj {
    public static PackageInfo PxuCJdSBwIXG(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static String TSizfFm2Yiuu(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean Y1f8riQaR6yg(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static final void a92UlCVFR9N8(ap1 ap1Var, e9 e9Var) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (e9Var == null || (findOnBackInvokedDispatcher = ap1Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(e9Var);
    }

    public static final void e9gEMXR7LXtO(ap1 ap1Var, e9 e9Var) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (e9Var == null || (findOnBackInvokedDispatcher = ap1Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, e9Var);
    }

    public static ArrayList lS5Rgt96tfkO(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }
}
