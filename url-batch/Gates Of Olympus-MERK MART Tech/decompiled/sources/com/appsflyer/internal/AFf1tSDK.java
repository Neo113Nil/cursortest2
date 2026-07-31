package com.appsflyer.internal;

import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class AFf1tSDK extends AFf1rSDK<String> {
    private final LinkGenerator.ResponseListener afInfoLog;
    private final String e;
    private final String force;
    private final Map<String, String> i;
    private final LinkGenerator v;
    private final UUID w;

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final boolean afInfoLog() {
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

    public AFf1tSDK(AFd1mSDK aFd1mSDK, UUID uuid, String str, Map<String, String> map, String str2, LinkGenerator.ResponseListener responseListener, LinkGenerator linkGenerator) {
        super(AFe1eSDK.ONELINK, new AFe1eSDK[]{AFe1eSDK.RC_CDN}, aFd1mSDK, uuid.toString());
        this.w = uuid;
        this.e = str;
        this.i = new HashMap(map);
        this.afInfoLog = responseListener;
        this.force = str2;
        this.v = linkGenerator;
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        super.AFInAppEventType();
        LinkGenerator.ResponseListener responseListener = this.afInfoLog;
        if (responseListener != null) {
            if (this.AFKeystoreWrapper == AFe1bSDK.SUCCESS && ((AFf1rSDK) this).d != null) {
                responseListener.onResponse((String) ((AFf1rSDK) this).d.getBody());
                return;
            }
            Throwable AFLogger = AFLogger();
            if (AFLogger instanceof ParsingException) {
                if (((ParsingException) AFLogger).getRawResponse().isSuccessful()) {
                    responseListener.onResponseError("Can't parse one link data");
                    return;
                } else {
                    responseListener.onResponse(this.v.generateLink());
                    return;
                }
            }
            responseListener.onResponse(this.v.generateLink());
        }
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final AFe1xSDK<String> values(String str) {
        return this.AFLogger.AFInAppEventParameterName(this.e, this.i, this.force, this.w, str);
    }
}
