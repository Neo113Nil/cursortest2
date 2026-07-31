package com.unity3d.player;

import android.app.Activity;
import android.content.pm.ApplicationInfo;

/* renamed from: com.unity3d.player.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0049x {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r0 == false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Activity activity) {
        int i;
        boolean z;
        if (activity == null || activity.getWindow() == null || !PlatformSupport.PIE_SUPPORT) {
            return;
        }
        if (!PlatformSupport.VANILLA_ICE_CREAM_SUPPORT) {
            i = 0;
            i = 0;
            i = 0;
            if (PlatformSupport.RED_VELVET_CAKE_SUPPORT) {
                try {
                    ApplicationInfo applicationInfo = activity.getPackageManager().getApplicationInfo(activity.getPackageName(), 128);
                    if (applicationInfo != null) {
                        z = applicationInfo.metaData.getBoolean("unity.render-outside-safearea");
                    }
                } catch (Exception unused) {
                }
                z = false;
            } else {
                try {
                    ApplicationInfo applicationInfo2 = activity.getPackageManager().getApplicationInfo(activity.getPackageName(), 128);
                    if (applicationInfo2 != null) {
                        i = applicationInfo2.metaData.getBoolean("unity.render-outside-safearea");
                    }
                } catch (Exception unused2) {
                }
            }
            activity.getWindow().getAttributes().layoutInDisplayCutoutMode = i;
        }
        i = 3;
        activity.getWindow().getAttributes().layoutInDisplayCutoutMode = i;
    }
}
