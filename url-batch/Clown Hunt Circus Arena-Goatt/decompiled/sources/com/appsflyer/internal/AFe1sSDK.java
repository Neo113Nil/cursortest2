package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.AFd1tSDK.AnonymousClass5;
import com.google.firebase.iid.ServiceStarter;

/* loaded from: classes.dex */
public final class AFe1sSDK {
    public static String AFKeystoreWrapper = new StringBuilder("https://%sregister.%s/api/v").append(AFa1dSDK.values).toString();
    public final AFb1fSDK values;

    public AFe1sSDK(Context context) {
        this.values = AFa1dSDK.valueOf().valueOf(context);
    }

    public static boolean AFInAppEventParameterName(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            Class.forName("com.google.firebase.messaging.FirebaseMessagingService");
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest declarations: ", th);
        }
        return AFa1cSDK.AFInAppEventParameterName(context, new Intent(ServiceStarter.ACTION_MESSAGING_EVENT, null, context, FirebaseMessagingServiceListener.class));
    }

    public static boolean AFInAppEventType(AFb1fSDK aFb1fSDK) {
        return aFb1fSDK.AFKeystoreWrapper("sentRegisterRequestToAF");
    }

    public static void AFKeystoreWrapper(String str) {
        AFc1zSDK AFInAppEventParameterName = AFa1dSDK.valueOf().AFInAppEventParameterName();
        AFd1gSDK aFd1gSDK = new AFd1gSDK(str, AFInAppEventParameterName);
        AFd1tSDK level = AFInAppEventParameterName.getLevel();
        level.AFKeystoreWrapper.execute(level.new AnonymousClass5(aFd1gSDK));
    }

    public final AFb1oSDK AFKeystoreWrapper() {
        String string;
        String string2;
        String valueOf = this.values.valueOf("afUninstallToken", (String) null);
        long values = this.values.values("afUninstallToken_received_time", 0L);
        boolean AFKeystoreWrapper2 = this.values.AFKeystoreWrapper("afUninstallToken_queued");
        this.values.valueOf("afUninstallToken_queued", false);
        if (valueOf == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            valueOf = string2.split(",")[r0.length - 1];
        }
        if (values == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] split = string.split(",");
            if (split.length >= 2) {
                try {
                    values = Long.parseLong(split[split.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (valueOf != null) {
            return new AFb1oSDK(valueOf, values, AFKeystoreWrapper2);
        }
        return null;
    }
}
