package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.google.firebase.encoders.json.BuildConfig;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFd1fSDK extends AFd1nSDK<String> {
    private final AFe1eSDK afInfoLog;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFd1fSDK(AFe1eSDK aFe1eSDK, AFc1zSDK aFc1zSDK) {
        super(r2, r3, aFc1zSDK, r0.toString(), aFe1eSDK.valueOf);
        AFd1vSDK aFd1vSDK = aFe1eSDK.afWarnLog;
        AFd1vSDK aFd1vSDK2 = aFd1vSDK == null ? AFd1vSDK.CACHED_EVENT : aFd1vSDK;
        AFd1vSDK[] aFd1vSDKArr = {AFd1vSDK.RC_CDN};
        StringBuilder sb = new StringBuilder();
        sb.append(aFe1eSDK.valueOf);
        sb.append("-");
        sb.append(valueOf(aFe1eSDK));
        this.afInfoLog = aFe1eSDK;
    }

    private static String valueOf(AFe1eSDK aFe1eSDK) {
        try {
            return new URL(aFe1eSDK.afInfoLog).getHost();
        } catch (MalformedURLException unused) {
            return BuildConfig.FLAVOR;
        }
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AFc1nSDK<String> AFKeystoreWrapper(String str) {
        String encodeToString = Base64.encodeToString(this.afInfoLog.valueOf(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(encodeToString)));
        ((AFd1nSDK) this).afDebugLog.valueOf(this.afInfoLog.afInfoLog, encodeToString);
        return ((AFd1nSDK) this).afErrorLog.values(this.afInfoLog);
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AppsFlyerRequestListener afDebugLog() {
        return this.afInfoLog.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final boolean afRDLog() {
        return false;
    }
}
