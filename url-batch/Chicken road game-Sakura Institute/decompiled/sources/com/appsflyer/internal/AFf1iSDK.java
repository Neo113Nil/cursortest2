package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes3.dex */
public final class AFf1iSDK extends AFf1nSDK<String> {
    private final AFh1qSDK unregisterClient;

    @Override // com.appsflyer.internal.AFf1nSDK
    protected final boolean i() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    protected final AFe1sSDK<String> AFKeystoreWrapper(String str) {
        String encodeToString = Base64.encodeToString(this.unregisterClient.AFKeystoreWrapper(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(encodeToString)));
        ((AFf1nSDK) this).e.valueOf(this.unregisterClient.registerClient, encodeToString);
        return ((AFf1nSDK) this).AFLogger.AFInAppEventType(this.unregisterClient);
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        AFf1zSDK aFf1zSDK;
        AFh1qSDK aFh1qSDK = this.unregisterClient;
        if (aFh1qSDK.v != null) {
            aFf1zSDK = aFh1qSDK.v;
        } else {
            aFf1zSDK = AFf1zSDK.CACHED_EVENT;
        }
        return (aFf1zSDK == AFf1zSDK.ARS_VALIDATE && ((AFf1nSDK) this).registerClient != null && ((AFf1nSDK) this).registerClient.getStatusCode() == 424) || super.valueOf();
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    protected final AppsFlyerRequestListener e() {
        return this.unregisterClient.values;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFf1iSDK(AFh1qSDK aFh1qSDK, AFd1kSDK aFd1kSDK) {
        super(r0, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1kSDK, new StringBuilder().append(aFh1qSDK.AFKeystoreWrapper).append("-").append(AFInAppEventType(aFh1qSDK)).toString(), aFh1qSDK.AFKeystoreWrapper);
        AFf1zSDK aFf1zSDK;
        if (aFh1qSDK.v != null) {
            aFf1zSDK = aFh1qSDK.v;
        } else {
            aFf1zSDK = AFf1zSDK.CACHED_EVENT;
        }
        this.unregisterClient = aFh1qSDK;
    }

    private static String AFInAppEventType(AFh1qSDK aFh1qSDK) {
        try {
            return new URL(aFh1qSDK.registerClient).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }
}
