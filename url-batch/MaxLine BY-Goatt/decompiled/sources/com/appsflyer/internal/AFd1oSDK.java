package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFd1oSDK extends AFd1nSDK<String> {
    private final String afInfoLog;
    private final AFg1ySDK getLevel;

    public AFd1oSDK(AFc1zSDK aFc1zSDK, String str, AFg1ySDK aFg1ySDK) {
        super(AFd1vSDK.IMPRESSIONS, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1zSDK, str);
        this.afInfoLog = str;
        this.getLevel = aFg1ySDK;
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final boolean AFInAppEventType() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AFc1nSDK<String> AFKeystoreWrapper(String str) {
        return ((AFd1nSDK) this).afErrorLog.values(this.afInfoLog);
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final boolean afRDLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final void valueOf() {
        super.valueOf();
        AFc1gSDK<Result> aFc1gSDK = ((AFd1nSDK) this).AFLogger;
        if (aFc1gSDK != 0) {
            int statusCode = aFc1gSDK.getStatusCode();
            if (statusCode == 200) {
                StringBuilder sb = new StringBuilder("Cross promotion impressions success: ");
                sb.append(this.afInfoLog);
                AFLogger.afInfoLog(sb.toString(), false);
                return;
            }
            if (statusCode != 301 && statusCode != 302) {
                StringBuilder sb2 = new StringBuilder("call to ");
                sb2.append(this.afInfoLog);
                sb2.append(" failed: ");
                sb2.append(statusCode);
                AFLogger.afInfoLog(sb2.toString());
                return;
            }
            StringBuilder sb3 = new StringBuilder("Cross promotion redirection success: ");
            sb3.append(this.afInfoLog);
            AFLogger.afInfoLog(sb3.toString(), false);
            String AFInAppEventType = aFc1gSDK.AFInAppEventType("Location");
            AFg1ySDK aFg1ySDK = this.getLevel;
            if (aFg1ySDK == null || AFInAppEventType == null) {
                return;
            }
            aFg1ySDK.valueOf = AFInAppEventType;
            Context context = aFg1ySDK.AFInAppEventParameterName.get();
            if (context != null) {
                try {
                    if (aFg1ySDK.valueOf != null) {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFg1ySDK.valueOf)).setFlags(268435456));
                    }
                } catch (Exception e) {
                    AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e)), e);
                }
            }
        }
    }
}
