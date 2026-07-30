package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1jSDK;
import com.facebook.internal.AnalyticsEvents;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFa1xSDK implements AFb1jSDK {
    private static IntentFilter AFKeystoreWrapper = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    @Override // com.appsflyer.internal.AFb1jSDK
    public final AFb1jSDK.AFa1xSDK AFInAppEventParameterName(Context context) {
        String str = null;
        float f = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver(null, AFKeystoreWrapper);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, -1)) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    str = intExtra != 1 ? intExtra != 2 ? intExtra != 4 ? "other" : "wireless" : "usb" : "ac";
                } else {
                    str = "no";
                }
                int intExtra2 = registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("Device that failed to register receiver", th);
        }
        return new AFb1jSDK.AFa1xSDK(f, str);
    }
}
