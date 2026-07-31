package com.unity3d.player;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes2.dex */
class DisplayCutoutSupport {
    private static final String CMD_ARG_FORCE_RENDER_OUTSIDE_SAFEAREA = "-force-render-outside-safearea=";
    private static final String RENDER_OUTSIDE_SAFEAREA = "unity.render-outside-safearea";
    private static int s_DisplayCutoutSupport = -1;

    DisplayCutoutSupport() {
    }

    static boolean getDisplayCutoutSupport(Activity activity) {
        ApplicationInfo applicationInfo;
        int i4 = s_DisplayCutoutSupport;
        if (i4 != -1) {
            return i4 == 1;
        }
        try {
            String stringExtra = activity.getIntent().getStringExtra(PluginErrorDetails.Platform.UNITY);
            if (stringExtra != null) {
                if (stringExtra.contains("-force-render-outside-safearea=true")) {
                    s_DisplayCutoutSupport = 1;
                } else if (stringExtra.contains("-force-render-outside-safearea=false")) {
                    s_DisplayCutoutSupport = 0;
                }
            }
            if (s_DisplayCutoutSupport == -1 && (applicationInfo = activity.getPackageManager().getApplicationInfo(activity.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN)) != null) {
                s_DisplayCutoutSupport = applicationInfo.metaData.getBoolean(RENDER_OUTSIDE_SAFEAREA) ? 1 : 0;
            }
        } catch (Exception unused) {
            s_DisplayCutoutSupport = 0;
        }
        return s_DisplayCutoutSupport == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setLayoutCutoutMode(Activity activity) {
        int i4;
        if (activity == null || activity.getWindow() == null || !PlatformSupport.PIE_SUPPORT) {
            return;
        }
        if (!PlatformSupport.VANILLA_ICE_CREAM_SUPPORT) {
            if (!PlatformSupport.RED_VELVET_CAKE_SUPPORT) {
                i4 = getDisplayCutoutSupport(activity);
            } else if (!getDisplayCutoutSupport(activity)) {
                i4 = 0;
            }
            activity.getWindow().getAttributes().layoutInDisplayCutoutMode = i4;
        }
        i4 = 3;
        activity.getWindow().getAttributes().layoutInDisplayCutoutMode = i4;
    }
}
