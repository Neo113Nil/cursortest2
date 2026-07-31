package t;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: t.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0646f {
    public static int a(AppOpsManager appOpsManager, String str, int i7, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i7, str2);
    }

    public static String b(Context context) {
        return context.getOpPackageName();
    }

    public static AppOpsManager c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
