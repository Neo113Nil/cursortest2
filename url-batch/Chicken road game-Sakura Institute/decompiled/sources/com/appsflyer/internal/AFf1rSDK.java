package com.appsflyer.internal;

import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class AFf1rSDK extends AFf1nSDK<String> {
    private final UUID afInfoLog;
    private final String force;
    private final LinkGenerator.ResponseListener i;
    private final String unregisterClient;
    private final Map<String, String> v;
    private final LinkGenerator w;

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    protected final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    protected final AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    protected final boolean i() {
        return false;
    }

    public AFf1rSDK(AFd1kSDK aFd1kSDK, UUID uuid, String str, Map<String, String> map, String str2, LinkGenerator.ResponseListener responseListener, LinkGenerator linkGenerator) {
        super(AFf1zSDK.ONELINK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1kSDK, uuid.toString());
        this.afInfoLog = uuid;
        this.unregisterClient = str;
        this.v = new HashMap(map);
        this.i = responseListener;
        this.force = str2;
        this.w = linkGenerator;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        super.AFInAppEventType();
        LinkGenerator.ResponseListener responseListener = this.i;
        if (responseListener != null) {
            if (this.values == AFe1bSDK.SUCCESS && ((AFf1nSDK) this).registerClient != null) {
                responseListener.onResponse((String) ((AFf1nSDK) this).registerClient.getBody());
                return;
            }
            Throwable unregisterClient = unregisterClient();
            if (unregisterClient instanceof ParsingException) {
                if (((ParsingException) unregisterClient).getRawResponse().isSuccessful()) {
                    responseListener.onResponseError("Can't parse one link data");
                    return;
                } else {
                    responseListener.onResponse(this.w.generateLink());
                    return;
                }
            }
            responseListener.onResponse(this.w.generateLink());
        }
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    protected final AFe1sSDK<String> AFKeystoreWrapper(String str) {
        return ((AFf1nSDK) this).AFLogger.AFInAppEventParameterName(this.unregisterClient, this.v, this.force, this.afInfoLog, str);
    }
}
