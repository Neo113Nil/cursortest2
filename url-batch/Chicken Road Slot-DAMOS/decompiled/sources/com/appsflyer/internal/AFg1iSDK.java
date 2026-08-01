package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import com.appsflyer.AFLogger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFg1iSDK {
    public static boolean getMonetizationNetwork(Context context) {
        boolean isInstantApp;
        if (Build.VERSION.SDK_INT >= 26) {
            isInstantApp = context.getPackageManager().isInstantApp();
            return isInstantApp;
        }
        try {
            context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
            return true;
        } catch (ClassNotFoundException e2) {
            AFLogger.afErrorLogForExcManagerOnly("InstantAppsRuntime not found", e2, true);
            return false;
        }
    }
}
