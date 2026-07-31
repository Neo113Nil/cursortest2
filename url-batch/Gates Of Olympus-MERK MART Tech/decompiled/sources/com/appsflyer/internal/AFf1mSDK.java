package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes3.dex */
public final class AFf1mSDK extends AFf1rSDK<String> {
    private final AFg1cSDK e;

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final boolean unregisterClient() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final AFe1xSDK<String> values(String str) {
        String encodeToString = Base64.encodeToString(this.e.values(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(encodeToString)));
        ((AFf1rSDK) this).registerClient.AFInAppEventParameterName(this.e.registerClient, encodeToString);
        return this.AFLogger.AFInAppEventParameterName(this.e);
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean AFKeystoreWrapper() {
        AFe1eSDK aFe1eSDK;
        AFg1cSDK aFg1cSDK = this.e;
        if (aFg1cSDK.afInfoLog != null) {
            aFe1eSDK = aFg1cSDK.afInfoLog;
        } else {
            aFe1eSDK = AFe1eSDK.CACHED_EVENT;
        }
        return (aFe1eSDK == AFe1eSDK.ARS_VALIDATE && ((AFf1rSDK) this).d != null && ((AFf1rSDK) this).d.getStatusCode() == 424) || super.AFKeystoreWrapper();
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final AppsFlyerRequestListener registerClient() {
        return this.e.valueOf;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFf1mSDK(AFg1cSDK aFg1cSDK, AFd1mSDK aFd1mSDK) {
        super(r0, new AFe1eSDK[]{AFe1eSDK.RC_CDN}, aFd1mSDK, new StringBuilder().append(aFg1cSDK.AFInAppEventParameterName).append("-").append(AFKeystoreWrapper(aFg1cSDK)).toString(), aFg1cSDK.AFInAppEventParameterName);
        AFe1eSDK aFe1eSDK;
        if (aFg1cSDK.afInfoLog != null) {
            aFe1eSDK = aFg1cSDK.afInfoLog;
        } else {
            aFe1eSDK = AFe1eSDK.CACHED_EVENT;
        }
        this.e = aFg1cSDK;
    }

    private static String AFKeystoreWrapper(AFg1cSDK aFg1cSDK) {
        try {
            return new URL(aFg1cSDK.registerClient).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }
}
