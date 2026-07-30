package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.google.common.net.HttpHeaders;

/* loaded from: classes.dex */
public final class AFd1oSDK extends AFd1nSDK<String> {
    private final String afInfoLog;
    private final AFg1ySDK getLevel;

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final boolean AFInAppEventType() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    protected final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    protected final boolean afRDLog() {
        return false;
    }

    public AFd1oSDK(AFc1zSDK aFc1zSDK, String str, AFg1ySDK aFg1ySDK) {
        super(AFd1vSDK.IMPRESSIONS, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1zSDK, str);
        this.afInfoLog = str;
        this.getLevel = aFg1ySDK;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    protected final AFc1nSDK<String> AFKeystoreWrapper(String str) {
        return ((AFd1nSDK) this).afErrorLog.values(this.afInfoLog);
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final void valueOf() {
        super.valueOf();
        AFc1gSDK<Result> aFc1gSDK = ((AFd1nSDK) this).AFLogger;
        if (aFc1gSDK != 0) {
            int statusCode = aFc1gSDK.getStatusCode();
            if (statusCode == 200) {
                AFLogger.afInfoLog(new StringBuilder("Cross promotion impressions success: ").append(this.afInfoLog).toString(), false);
                return;
            }
            if (statusCode == 301 || statusCode == 302) {
                AFLogger.afInfoLog(new StringBuilder("Cross promotion redirection success: ").append(this.afInfoLog).toString(), false);
                String AFInAppEventType = aFc1gSDK.AFInAppEventType(HttpHeaders.LOCATION);
                AFg1ySDK aFg1ySDK = this.getLevel;
                if (aFg1ySDK == null || AFInAppEventType == null) {
                    return;
                }
                aFg1ySDK.valueOf = AFInAppEventType;
                AFg1ySDK aFg1ySDK2 = this.getLevel;
                Context context = aFg1ySDK2.AFInAppEventParameterName.get();
                if (context != null) {
                    try {
                        if (aFg1ySDK2.valueOf != null) {
                            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFg1ySDK2.valueOf)).setFlags(268435456));
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e)), e);
                        return;
                    }
                }
                return;
            }
            AFLogger.afInfoLog(new StringBuilder("call to ").append(this.afInfoLog).append(" failed: ").append(statusCode).toString());
        }
    }
}
