package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.AFe1cSDK.AnonymousClass5;

/* loaded from: classes3.dex */
public final class AFf1bSDK {
    public static String AFInAppEventParameterName = new StringBuilder("https://%sregister.%s/api/v").append(AFb1tSDK.values).toString();
    public final AFd1xSDK AFKeystoreWrapper;

    public AFf1bSDK(Context context) {
        this.AFKeystoreWrapper = AFb1tSDK.AFInAppEventType().values(context);
    }

    public static boolean values(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            Class.forName("com.google.firebase.messaging.FirebaseMessagingService");
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1jSDK.UNINSTALL, "An error occurred while trying to verify manifest declarations: ", th);
        }
        return AFb1rSDK.values(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class));
    }

    public static boolean values(AFd1xSDK aFd1xSDK) {
        return aFd1xSDK.values("sentRegisterRequestToAF");
    }

    public static void AFInAppEventParameterName(String str) {
        AFd1mSDK values = AFb1tSDK.AFInAppEventType().values();
        AFf1hSDK aFf1hSDK = new AFf1hSDK(str, values);
        AFe1cSDK i = values.i();
        i.AFInAppEventParameterName.execute(i.new AnonymousClass5(aFf1hSDK));
    }

    public final AFg1ySDK valueOf() {
        String string;
        String string2;
        String AFInAppEventType = this.AFKeystoreWrapper.AFInAppEventType("afUninstallToken", (String) null);
        long AFInAppEventType2 = this.AFKeystoreWrapper.AFInAppEventType("afUninstallToken_received_time", 0L);
        boolean values = this.AFKeystoreWrapper.values("afUninstallToken_queued");
        this.AFKeystoreWrapper.AFInAppEventParameterName("afUninstallToken_queued", false);
        if (AFInAppEventType == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            AFInAppEventType = string2.split(",")[r0.length - 1];
        }
        if (AFInAppEventType2 == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] split = string.split(",");
            if (split.length >= 2) {
                try {
                    AFInAppEventType2 = Long.parseLong(split[split.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (AFInAppEventType != null) {
            return new AFg1ySDK(AFInAppEventType, AFInAppEventType2, values);
        }
        return null;
    }
}
