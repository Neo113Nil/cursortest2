package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;

/* loaded from: classes3.dex */
public final class AFf1vSDK extends AFf1nSDK<String> {
    private final AFd1sSDK force;
    private final String unregisterClient;
    private final AFj1mSDK w;

    @Override // com.appsflyer.internal.AFf1nSDK
    protected final AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    protected final boolean i() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    public AFf1vSDK(AFd1kSDK aFd1kSDK, String str, AFj1mSDK aFj1mSDK) {
        super(AFf1zSDK.IMPRESSIONS, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, str);
        this.unregisterClient = str;
        this.w = aFj1mSDK;
        this.force = aFd1kSDK.AFInAppEventType();
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    protected final AFe1sSDK<String> AFKeystoreWrapper(String str) {
        String obj;
        AFe1ySDK aFe1ySDK = ((AFf1nSDK) this).AFLogger;
        String AFKeystoreWrapper = this.force.AFKeystoreWrapper();
        if (AFc1tSDK.values(AFKeystoreWrapper)) {
            obj = this.unregisterClient;
        } else {
            obj = Uri.parse(this.unregisterClient).buildUpon().appendQueryParameter("advertising_id", AFKeystoreWrapper).build().toString();
        }
        return aFe1ySDK.AFKeystoreWrapper(obj);
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        super.AFInAppEventType();
        AFe1jSDK<Result> aFe1jSDK = ((AFf1nSDK) this).registerClient;
        if (aFe1jSDK != 0) {
            int statusCode = aFe1jSDK.getStatusCode();
            if (statusCode == 200) {
                AFLogger.afInfoLog(new StringBuilder("Cross promotion impressions success: ").append(this.unregisterClient).toString(), false);
                return;
            }
            if (statusCode == 301 || statusCode == 302) {
                AFLogger.afInfoLog(new StringBuilder("Cross promotion redirection success: ").append(this.unregisterClient).toString(), false);
                String AFInAppEventParameterName = aFe1jSDK.AFInAppEventParameterName("Location");
                AFj1mSDK aFj1mSDK = this.w;
                if (aFj1mSDK == null || AFInAppEventParameterName == null) {
                    return;
                }
                aFj1mSDK.AFKeystoreWrapper = AFInAppEventParameterName;
                AFj1mSDK aFj1mSDK2 = this.w;
                Context context = aFj1mSDK2.AFInAppEventType.get();
                if (context != null) {
                    try {
                        if (aFj1mSDK2.AFKeystoreWrapper != null) {
                            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFj1mSDK2.AFKeystoreWrapper)).setFlags(268435456));
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
            AFLogger.afInfoLog(new StringBuilder("call to ").append(this.unregisterClient).append(" failed: ").append(statusCode).toString());
        }
    }
}
