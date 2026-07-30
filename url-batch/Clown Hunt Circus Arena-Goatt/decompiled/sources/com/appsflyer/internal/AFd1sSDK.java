package com.appsflyer.internal;

import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class AFd1sSDK extends AFd1nSDK<String> {
    private final UUID AFLogger$LogLevel;
    private final Map<String, String> AFVersionDeclaration;
    private final LinkGenerator.ResponseListener afErrorLogForExcManagerOnly;
    private final AFb1cSDK afInfoLog;
    private final String afWarnLog;
    private final String getLevel;

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final long AFKeystoreWrapper() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    protected final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    protected final boolean afRDLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    protected final boolean afWarnLog() {
        return false;
    }

    public AFd1sSDK(AFc1zSDK aFc1zSDK, UUID uuid, String str, Map<String, String> map, String str2, LinkGenerator.ResponseListener responseListener) {
        super(AFd1vSDK.ONELINK, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1zSDK, uuid.toString());
        this.afInfoLog = aFc1zSDK.AFInAppEventParameterName();
        this.AFLogger$LogLevel = uuid;
        this.getLevel = str;
        this.AFVersionDeclaration = new HashMap(map);
        this.afErrorLogForExcManagerOnly = responseListener;
        this.afWarnLog = str2;
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final void valueOf() {
        super.valueOf();
        LinkGenerator.ResponseListener responseListener = this.afErrorLogForExcManagerOnly;
        if (responseListener != null) {
            if (this.AFKeystoreWrapper == AFd1ySDK.SUCCESS && ((AFd1nSDK) this).AFLogger != null) {
                responseListener.onResponse((String) ((AFd1nSDK) this).AFLogger.getBody());
                return;
            }
            Throwable afInfoLog = afInfoLog();
            if (afInfoLog instanceof ParsingException) {
                if (((ParsingException) afInfoLog).getRawResponse().isSuccessful()) {
                    responseListener.onResponseError("Can't parse one link data");
                    return;
                } else {
                    responseListener.onResponse(getLevel());
                    return;
                }
            }
            responseListener.onResponse(getLevel());
        }
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    protected final AFc1nSDK<String> AFKeystoreWrapper(String str) {
        return ((AFd1nSDK) this).afErrorLog.valueOf(this.getLevel, this.AFVersionDeclaration, this.afWarnLog, this.AFLogger$LogLevel, str);
    }

    private String getLevel() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_DOMAIN);
        String packageName = this.afInfoLog.values.AFInAppEventParameterName.getPackageName();
        LinkGenerator addParameters = new LinkGenerator("af_app_invites").setBaseURL(this.getLevel, string, packageName).addParameter("af_siteid", packageName).addParameters(this.AFVersionDeclaration);
        AFa1dSDK.valueOf();
        String values = AFa1dSDK.values();
        if (values != null) {
            addParameters.setReferrerCustomerId(values);
        }
        return addParameters.generateLink();
    }
}
