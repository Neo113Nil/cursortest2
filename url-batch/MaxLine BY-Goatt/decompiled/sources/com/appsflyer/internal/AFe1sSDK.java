package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.AFd1tSDK.AnonymousClass5;
import com.google.firebase.messaging.FirebaseMessagingService;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFe1sSDK {
    public static String AFKeystoreWrapper;
    public final AFb1fSDK values;

    static {
        StringBuilder sb = new StringBuilder("https://%sregister.%s/api/v");
        sb.append(AFa1dSDK.values);
        AFKeystoreWrapper = sb.toString();
    }

    public AFe1sSDK(Context context) {
        this.values = AFa1dSDK.valueOf().valueOf(context);
    }

    public static boolean AFInAppEventParameterName(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            String str = FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT;
            return AFa1cSDK.AFInAppEventParameterName(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class));
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest declarations: ", th);
            return false;
        }
    }

    public static boolean AFInAppEventType(AFb1fSDK aFb1fSDK) {
        return aFb1fSDK.AFKeystoreWrapper("sentRegisterRequestToAF");
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

    public static void AFKeystoreWrapper(String str) {
        AFc1zSDK AFInAppEventParameterName = AFa1dSDK.valueOf().AFInAppEventParameterName();
        AFd1gSDK aFd1gSDK = new AFd1gSDK(str, AFInAppEventParameterName);
        AFd1tSDK level = AFInAppEventParameterName.getLevel();
        level.AFKeystoreWrapper.execute(level.new AnonymousClass5(aFd1gSDK));
    }
}
