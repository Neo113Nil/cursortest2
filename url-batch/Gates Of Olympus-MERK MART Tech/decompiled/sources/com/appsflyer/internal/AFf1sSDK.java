package com.appsflyer.internal;

import android.net.Uri;
import androidx.work.WorkRequest;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1cSDK.AnonymousClass5;

/* loaded from: classes3.dex */
public final class AFf1sSDK extends AFe1dSDK<Boolean> {
    private static volatile boolean AFLogger = false;
    private final AFe1cSDK d;
    private final AFd1mSDK e;
    private Boolean registerClient;
    private final AFb1uSDK unregisterClient;

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean AFKeystoreWrapper() {
        return false;
    }

    public AFf1sSDK(AFd1mSDK aFd1mSDK) {
        super(AFe1eSDK.LOAD_CACHE, new AFe1eSDK[0], "LoadCachedRequests");
        this.unregisterClient = aFd1mSDK.afWarnLog();
        this.d = aFd1mSDK.i();
        this.e = aFd1mSDK;
    }

    public static boolean unregisterClient() {
        return AFLogger;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK values() throws Exception {
        for (AFb1mSDK aFb1mSDK : this.unregisterClient.valueOf()) {
            AFLogger.INSTANCE.i(AFg1jSDK.CACHE, new StringBuilder("resending request: ").append(aFb1mSDK.AFInAppEventParameterName).toString());
            try {
                AFg1cSDK aFg1cSDK = new AFg1cSDK(AFInAppEventParameterName(aFb1mSDK), aFb1mSDK.AFInAppEventType(), aFb1mSDK.valueOf, aFb1mSDK.values);
                AFe1cSDK aFe1cSDK = this.d;
                aFe1cSDK.AFInAppEventParameterName.execute(aFe1cSDK.new AnonymousClass5(new AFf1mSDK(aFg1cSDK, this.e)));
            } catch (Exception e) {
                AFLogger.INSTANCE.e(AFg1jSDK.QUEUE, "Failed to resend cached request", e);
            }
        }
        this.registerClient = Boolean.TRUE;
        AFLogger = true;
        return AFe1bSDK.SUCCESS;
    }

    private static String AFInAppEventParameterName(AFb1mSDK aFb1mSDK) {
        long currentTimeMillis = System.currentTimeMillis();
        long parseLong = Long.parseLong(aFb1mSDK.valueOf, 10);
        String str = aFb1mSDK.AFInAppEventParameterName;
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("isCachedRequest", "true").appendQueryParameter("timeincache", String.valueOf((currentTimeMillis - parseLong) / 1000)).toString();
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("Couldn't parse the uri", e);
            return str;
        }
    }
}
