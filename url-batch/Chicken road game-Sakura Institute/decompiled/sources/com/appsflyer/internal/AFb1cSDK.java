package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.security.KeyStoreException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFb1cSDK;", "", "Lcom/appsflyer/internal/AFd1lSDK;", "p0", "Lcom/appsflyer/internal/AFd1qSDK;", "p1", "", "valueOf", "(Lcom/appsflyer/internal/AFd1lSDK;Lcom/appsflyer/internal/AFd1qSDK;)V", "", "AFInAppEventType", "()Ljava/lang/String;", "AFKeystoreWrapper", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AFb1cSDK {
    public static final AFb1cSDK INSTANCE = new AFb1cSDK();

    private AFb1cSDK() {
    }

    @JvmStatic
    public static final void valueOf(AFd1lSDK p0, AFd1qSDK p1) {
        int i;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (AFb1uSDK.AFInAppEventParameterName()) {
            AFLogger.afRDLog("OPPO device found");
            i = 23;
        } else {
            i = 18;
        }
        if (Build.VERSION.SDK_INT >= i && !appsFlyerProperties.getBoolean(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            AFLogger.afRDLog(new StringBuilder("OS SDK is=").append(Build.VERSION.SDK_INT).append("; use KeyStore").toString());
            AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(p0.AFKeystoreWrapper);
            if (!aFKeystoreWrapper.AFInAppEventParameterName()) {
                aFKeystoreWrapper.AFKeystoreWrapper = AFb1kSDK.valueOf(p0, p1);
                aFKeystoreWrapper.AFInAppEventType = 0;
                aFKeystoreWrapper.AFInAppEventParameterName(aFKeystoreWrapper.AFKeystoreWrapper());
            } else {
                String AFKeystoreWrapper = aFKeystoreWrapper.AFKeystoreWrapper();
                synchronized (aFKeystoreWrapper.valueOf) {
                    aFKeystoreWrapper.AFInAppEventType++;
                    AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(AFKeystoreWrapper)));
                    try {
                        synchronized (aFKeystoreWrapper.valueOf) {
                            aFKeystoreWrapper.AFInAppEventParameterName.deleteEntry(AFKeystoreWrapper);
                        }
                    } catch (KeyStoreException e) {
                        AFLogger.afErrorLog(new StringBuilder("Exception ").append(e.getMessage()).append(" occurred").toString(), e);
                    }
                }
                aFKeystoreWrapper.AFInAppEventParameterName(aFKeystoreWrapper.AFKeystoreWrapper());
            }
            appsFlyerProperties.set("KSAppsFlyerId", aFKeystoreWrapper.AFInAppEventType());
            appsFlyerProperties.set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.values()));
            return;
        }
        AFLogger.afRDLog(new StringBuilder("OS SDK is=").append(Build.VERSION.SDK_INT).append("; no KeyStore usage").toString());
    }

    public static String AFInAppEventType() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
    }

    public static String AFKeystoreWrapper() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
    }
}
