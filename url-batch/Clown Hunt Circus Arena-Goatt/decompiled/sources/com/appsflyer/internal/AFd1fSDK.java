package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes.dex */
public final class AFd1fSDK extends AFd1nSDK<String> {
    private final AFe1eSDK afInfoLog;

    @Override // com.appsflyer.internal.AFd1nSDK
    protected final boolean afRDLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    protected final AFc1nSDK<String> AFKeystoreWrapper(String str) {
        String encodeToString = Base64.encodeToString(this.afInfoLog.valueOf(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(encodeToString)));
        ((AFd1nSDK) this).afDebugLog.valueOf(this.afInfoLog.afInfoLog, encodeToString);
        return ((AFd1nSDK) this).afErrorLog.values(this.afInfoLog);
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    protected final AppsFlyerRequestListener afDebugLog() {
        return this.afInfoLog.AFInAppEventType;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFd1fSDK(AFe1eSDK aFe1eSDK, AFc1zSDK aFc1zSDK) {
        super(r0, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1zSDK, new StringBuilder().append(aFe1eSDK.valueOf).append("-").append(valueOf(aFe1eSDK)).toString(), aFe1eSDK.valueOf);
        AFd1vSDK aFd1vSDK;
        if (aFe1eSDK.afWarnLog != null) {
            aFd1vSDK = aFe1eSDK.afWarnLog;
        } else {
            aFd1vSDK = AFd1vSDK.CACHED_EVENT;
        }
        this.afInfoLog = aFe1eSDK;
    }

    private static String valueOf(AFe1eSDK aFe1eSDK) {
        try {
            return new URL(aFe1eSDK.afInfoLog).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }
}
