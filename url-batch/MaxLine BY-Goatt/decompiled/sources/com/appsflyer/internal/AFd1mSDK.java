package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1tSDK.AnonymousClass5;
import com.facebook.internal.ServerProtocol;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFd1mSDK extends AFd1uSDK<Boolean> {
    private static volatile boolean afInfoLog = false;
    private final AFa1fSDK AFLogger;
    private final AFd1tSDK afDebugLog;
    private Boolean afErrorLog;
    private final AFc1zSDK afRDLog;

    public AFd1mSDK(AFc1zSDK aFc1zSDK) {
        super(AFd1vSDK.LOAD_CACHE, new AFd1vSDK[0], "LoadCachedRequests");
        this.AFLogger = aFc1zSDK.AppsFlyer2dXConversionCallback();
        this.afDebugLog = aFc1zSDK.getLevel();
        this.afRDLog = aFc1zSDK;
    }

    private static String AFKeystoreWrapper(AFa1rSDK aFa1rSDK) {
        long currentTimeMillis = System.currentTimeMillis();
        long parseLong = Long.parseLong(aFa1rSDK.AFKeystoreWrapper, 10);
        String str = aFa1rSDK.values;
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("isCachedRequest", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE).appendQueryParameter("timeincache", String.valueOf((currentTimeMillis - parseLong) / 1000)).toString();
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("Couldn't parse the uri", e);
            return str;
        }
    }

    public static boolean afRDLog() {
        return afInfoLog;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final boolean AFInAppEventType() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final AFd1ySDK values() {
        for (AFa1rSDK aFa1rSDK : this.AFLogger.AFKeystoreWrapper()) {
            StringBuilder sb = new StringBuilder("CACHE: resending request: ");
            sb.append(aFa1rSDK.values);
            AFLogger.afInfoLog(sb.toString());
            try {
                AFe1eSDK aFe1eSDK = new AFe1eSDK(AFKeystoreWrapper(aFa1rSDK), aFa1rSDK.valueOf(), aFa1rSDK.AFKeystoreWrapper, aFa1rSDK.AFInAppEventParameterName);
                AFd1tSDK aFd1tSDK = this.afDebugLog;
                aFd1tSDK.AFKeystoreWrapper.execute(aFd1tSDK.new AnonymousClass5(new AFd1fSDK(aFe1eSDK, this.afRDLog)));
            } catch (Exception e) {
                AFLogger.afErrorLog("QUEUE: Failed to resend cached request", e);
            }
        }
        this.afErrorLog = Boolean.TRUE;
        afInfoLog = true;
        return AFd1ySDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final long AFKeystoreWrapper() {
        return 30000L;
    }
}
