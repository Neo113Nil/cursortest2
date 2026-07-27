package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;

/* loaded from: classes.dex */
public final class AFf1vSDK extends AFf1nSDK<String> {
    private final AFd1sSDK force;
    private final String unregisterClient;

    /* renamed from: w, reason: collision with root package name */
    private final AFj1mSDK f5928w;

    public AFf1vSDK(AFd1kSDK aFd1kSDK, String str, AFj1mSDK aFj1mSDK) {
        super(AFf1zSDK.IMPRESSIONS, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, str);
        this.unregisterClient = str;
        this.f5928w = aFj1mSDK;
        this.force = aFd1kSDK.AFInAppEventType();
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        super.AFInAppEventType();
        AFe1jSDK<Result> aFe1jSDK = ((AFf1nSDK) this).registerClient;
        if (aFe1jSDK != 0) {
            int statusCode = aFe1jSDK.getStatusCode();
            if (statusCode == 200) {
                StringBuilder sb = new StringBuilder("Cross promotion impressions success: ");
                sb.append(this.unregisterClient);
                AFLogger.afInfoLog(sb.toString(), false);
                return;
            }
            if (statusCode != 301 && statusCode != 302) {
                StringBuilder sb2 = new StringBuilder("call to ");
                sb2.append(this.unregisterClient);
                sb2.append(" failed: ");
                sb2.append(statusCode);
                AFLogger.afInfoLog(sb2.toString());
                return;
            }
            StringBuilder sb3 = new StringBuilder("Cross promotion redirection success: ");
            sb3.append(this.unregisterClient);
            AFLogger.afInfoLog(sb3.toString(), false);
            String AFInAppEventParameterName = aFe1jSDK.AFInAppEventParameterName("Location");
            AFj1mSDK aFj1mSDK = this.f5928w;
            if (aFj1mSDK == null || AFInAppEventParameterName == null) {
                return;
            }
            aFj1mSDK.AFKeystoreWrapper = AFInAppEventParameterName;
            Context context = aFj1mSDK.AFInAppEventType.get();
            if (context != null) {
                try {
                    if (aFj1mSDK.AFKeystoreWrapper != null) {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFj1mSDK.AFKeystoreWrapper)).setFlags(268435456));
                    }
                } catch (Exception e4) {
                    AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e4)), e4);
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AFe1sSDK<String> AFKeystoreWrapper(String str) {
        AFe1ySDK aFe1ySDK = ((AFf1nSDK) this).AFLogger;
        String AFKeystoreWrapper = this.force.AFKeystoreWrapper();
        return aFe1ySDK.AFKeystoreWrapper(AFc1tSDK.values(AFKeystoreWrapper) ? this.unregisterClient : Uri.parse(this.unregisterClient).buildUpon().appendQueryParameter("advertising_id", AFKeystoreWrapper).build().toString());
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean i() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }
}
