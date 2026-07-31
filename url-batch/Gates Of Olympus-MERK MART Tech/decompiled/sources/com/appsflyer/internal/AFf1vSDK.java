package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.google.common.net.HttpHeaders;

/* loaded from: classes3.dex */
public final class AFf1vSDK extends AFf1rSDK<String> {
    private final String e;
    private final AFi1aSDK v;

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean AFKeystoreWrapper() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final AppsFlyerRequestListener registerClient() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final boolean unregisterClient() {
        return false;
    }

    public AFf1vSDK(AFd1mSDK aFd1mSDK, String str, AFi1aSDK aFi1aSDK) {
        super(AFe1eSDK.IMPRESSIONS, new AFe1eSDK[]{AFe1eSDK.RC_CDN}, aFd1mSDK, str);
        this.e = str;
        this.v = aFi1aSDK;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final AFe1xSDK<String> values(String str) {
        return this.AFLogger.AFInAppEventParameterName(this.e);
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        super.AFInAppEventType();
        AFe1pSDK<Result> aFe1pSDK = ((AFf1rSDK) this).d;
        if (aFe1pSDK != 0) {
            int statusCode = aFe1pSDK.getStatusCode();
            if (statusCode == 200) {
                AFLogger.afInfoLog(new StringBuilder("Cross promotion impressions success: ").append(this.e).toString(), false);
                return;
            }
            if (statusCode == 301 || statusCode == 302) {
                AFLogger.afInfoLog(new StringBuilder("Cross promotion redirection success: ").append(this.e).toString(), false);
                String valueOf = aFe1pSDK.valueOf(HttpHeaders.LOCATION);
                AFi1aSDK aFi1aSDK = this.v;
                if (aFi1aSDK == null || valueOf == null) {
                    return;
                }
                aFi1aSDK.AFInAppEventParameterName = valueOf;
                AFi1aSDK aFi1aSDK2 = this.v;
                Context context = aFi1aSDK2.valueOf.get();
                if (context != null) {
                    try {
                        if (aFi1aSDK2.AFInAppEventParameterName != null) {
                            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFi1aSDK2.AFInAppEventParameterName)).setFlags(268435456));
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
            AFLogger.afInfoLog(new StringBuilder("call to ").append(this.e).append(" failed: ").append(statusCode).toString());
        }
    }
}
