package com.unity3d.player;

import android.app.Activity;
import android.content.pm.ApplicationInfo;

/* renamed from: com.unity3d.player.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0150j {
    public static boolean a(Activity activity) {
        try {
            ApplicationInfo applicationInfo = activity.getPackageManager().getApplicationInfo(activity.getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData.getBoolean("unity.render-outside-safearea");
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Activity activity) {
        int i;
        if (activity == null || activity.getWindow() == null || !PlatformSupport.PIE_SUPPORT) {
            return;
        }
        if (!PlatformSupport.VANILLA_ICE_CREAM_SUPPORT) {
            if (PlatformSupport.RED_VELVET_CAKE_SUPPORT) {
                if (!a(activity)) {
                    i = 0;
                }
            } else {
                i = a(activity);
            }
            activity.getWindow().getAttributes().layoutInDisplayCutoutMode = i;
        }
        i = 3;
        activity.getWindow().getAttributes().layoutInDisplayCutoutMode = i;
    }
}
