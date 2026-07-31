package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.security.KeyStoreException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFc1uSDK;", "", "Lcom/appsflyer/internal/AFd1nSDK;", "p0", "Lcom/appsflyer/internal/AFd1xSDK;", "p1", "", "values", "(Lcom/appsflyer/internal/AFd1nSDK;Lcom/appsflyer/internal/AFd1xSDK;)V", "", "valueOf", "()Ljava/lang/String;", "AFInAppEventParameterName", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AFc1uSDK {
    public static final AFc1uSDK INSTANCE = new AFc1uSDK();

    private AFc1uSDK() {
    }

    @JvmStatic
    public static final void values(AFd1nSDK p0, AFd1xSDK p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (AFb1rSDK.AFInAppEventParameterName()) {
            AFLogger.afRDLog("OPPO device found");
        }
        if (!appsFlyerProperties.getBoolean(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            AFLogger.afRDLog(new StringBuilder("OS SDK is=").append(Build.VERSION.SDK_INT).append("; use KeyStore").toString());
            AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(p0.AFKeystoreWrapper);
            if (!aFKeystoreWrapper.values()) {
                aFKeystoreWrapper.AFKeystoreWrapper = AFb1iSDK.AFKeystoreWrapper(p0, p1);
                aFKeystoreWrapper.valueOf = 0;
                aFKeystoreWrapper.valueOf(aFKeystoreWrapper.AFInAppEventParameterName());
            } else {
                String AFInAppEventParameterName = aFKeystoreWrapper.AFInAppEventParameterName();
                synchronized (aFKeystoreWrapper.AFInAppEventType) {
                    aFKeystoreWrapper.valueOf++;
                    AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(AFInAppEventParameterName)));
                    try {
                        synchronized (aFKeystoreWrapper.AFInAppEventType) {
                            aFKeystoreWrapper.AFInAppEventParameterName.deleteEntry(AFInAppEventParameterName);
                        }
                    } catch (KeyStoreException e) {
                        AFLogger.afErrorLog(new StringBuilder("Exception ").append(e.getMessage()).append(" occurred").toString(), e);
                    }
                }
                aFKeystoreWrapper.valueOf(aFKeystoreWrapper.AFInAppEventParameterName());
            }
            appsFlyerProperties.set("KSAppsFlyerId", aFKeystoreWrapper.AFInAppEventType());
            appsFlyerProperties.set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.AFKeystoreWrapper()));
            return;
        }
        AFLogger.afRDLog(new StringBuilder("OS SDK is=").append(Build.VERSION.SDK_INT).append("; no KeyStore usage").toString());
    }

    public static String valueOf() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
    }

    public static String AFInAppEventParameterName() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
    }
}
