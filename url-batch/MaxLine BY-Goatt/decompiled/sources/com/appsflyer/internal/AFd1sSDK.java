package com.appsflyer.internal;

import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFd1sSDK extends AFd1nSDK<String> {
    private final UUID AFLogger$LogLevel;
    private final Map<String, String> AFVersionDeclaration;
    private final LinkGenerator.ResponseListener afErrorLogForExcManagerOnly;
    private final AFb1cSDK afInfoLog;
    private final String afWarnLog;
    private final String getLevel;

    public AFd1sSDK(AFc1zSDK aFc1zSDK, UUID uuid, String str, Map<String, String> map, String str2, LinkGenerator.ResponseListener responseListener) {
        super(AFd1vSDK.ONELINK, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1zSDK, uuid.toString());
        this.afInfoLog = aFc1zSDK.AFInAppEventParameterName();
        this.AFLogger$LogLevel = uuid;
        this.getLevel = str;
        this.AFVersionDeclaration = new HashMap(map);
        this.afErrorLogForExcManagerOnly = responseListener;
        this.afWarnLog = str2;
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

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AFc1nSDK<String> AFKeystoreWrapper(String str) {
        return ((AFd1nSDK) this).afErrorLog.valueOf(this.getLevel, this.AFVersionDeclaration, this.afWarnLog, this.AFLogger$LogLevel, str);
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final boolean afRDLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final boolean afWarnLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final void valueOf() {
        ResponseNetwork responseNetwork;
        super.valueOf();
        LinkGenerator.ResponseListener responseListener = this.afErrorLogForExcManagerOnly;
        if (responseListener != null) {
            if (this.AFKeystoreWrapper == AFd1ySDK.SUCCESS && (responseNetwork = ((AFd1nSDK) this).AFLogger) != null) {
                responseListener.onResponse((String) responseNetwork.getBody());
                return;
            }
            Throwable afInfoLog = afInfoLog();
            if (!(afInfoLog instanceof ParsingException)) {
                responseListener.onResponse(getLevel());
            } else if (((ParsingException) afInfoLog).getRawResponse().isSuccessful()) {
                responseListener.onResponseError("Can't parse one link data");
            } else {
                responseListener.onResponse(getLevel());
            }
        }
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final long AFKeystoreWrapper() {
        return 3000L;
    }
}
