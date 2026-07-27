package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.security.KeyStoreException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFb1cSDK {
    public static final AFb1cSDK INSTANCE = new AFb1cSDK();

    private AFb1cSDK() {
    }

    public static String AFInAppEventType() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
    }

    public static String AFKeystoreWrapper() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
    }

    public static final void valueOf(AFd1lSDK aFd1lSDK, AFd1qSDK aFd1qSDK) {
        int i2;
        Intrinsics.checkNotNullParameter(aFd1lSDK, "");
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (AFb1uSDK.AFInAppEventParameterName()) {
            AFLogger.afRDLog("OPPO device found");
            i2 = 23;
        } else {
            i2 = 18;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < i2 || appsFlyerProperties.getBoolean(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            StringBuilder sb = new StringBuilder("OS SDK is=");
            sb.append(i4);
            sb.append("; no KeyStore usage");
            AFLogger.afRDLog(sb.toString());
            return;
        }
        StringBuilder sb2 = new StringBuilder("OS SDK is=");
        sb2.append(i4);
        sb2.append("; use KeyStore");
        AFLogger.afRDLog(sb2.toString());
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(aFd1lSDK.AFKeystoreWrapper);
        if (aFKeystoreWrapper.AFInAppEventParameterName()) {
            String AFKeystoreWrapper = aFKeystoreWrapper.AFKeystoreWrapper();
            synchronized (aFKeystoreWrapper.valueOf) {
                aFKeystoreWrapper.AFInAppEventType++;
                AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(AFKeystoreWrapper)));
                try {
                    synchronized (aFKeystoreWrapper.valueOf) {
                        aFKeystoreWrapper.AFInAppEventParameterName.deleteEntry(AFKeystoreWrapper);
                    }
                } catch (KeyStoreException e4) {
                    StringBuilder sb3 = new StringBuilder("Exception ");
                    sb3.append(e4.getMessage());
                    sb3.append(" occurred");
                    AFLogger.afErrorLog(sb3.toString(), e4);
                }
            }
            aFKeystoreWrapper.AFInAppEventParameterName(aFKeystoreWrapper.AFKeystoreWrapper());
        } else {
            aFKeystoreWrapper.AFKeystoreWrapper = AFb1kSDK.valueOf(aFd1lSDK, aFd1qSDK);
            aFKeystoreWrapper.AFInAppEventType = 0;
            aFKeystoreWrapper.AFInAppEventParameterName(aFKeystoreWrapper.AFKeystoreWrapper());
        }
        appsFlyerProperties.set("KSAppsFlyerId", aFKeystoreWrapper.AFInAppEventType());
        appsFlyerProperties.set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.values()));
    }
}
