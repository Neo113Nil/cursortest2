package com.appsflyer.internal;

import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class AFf1rSDK extends AFf1nSDK<String> {
    private final UUID afInfoLog;
    private final String force;

    /* renamed from: i, reason: collision with root package name */
    private final LinkGenerator.ResponseListener f5920i;
    private final String unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private final Map<String, String> f5921v;

    /* renamed from: w, reason: collision with root package name */
    private final LinkGenerator f5922w;

    public AFf1rSDK(AFd1kSDK aFd1kSDK, UUID uuid, String str, Map<String, String> map, String str2, LinkGenerator.ResponseListener responseListener, LinkGenerator linkGenerator) {
        super(AFf1zSDK.ONELINK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1kSDK, uuid.toString());
        this.afInfoLog = uuid;
        this.unregisterClient = str;
        this.f5921v = new HashMap(map);
        this.f5920i = responseListener;
        this.force = str2;
        this.f5922w = linkGenerator;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        ResponseNetwork responseNetwork;
        super.AFInAppEventType();
        LinkGenerator.ResponseListener responseListener = this.f5920i;
        if (responseListener != null) {
            if (this.values == AFe1bSDK.SUCCESS && (responseNetwork = ((AFf1nSDK) this).registerClient) != null) {
                responseListener.onResponse((String) responseNetwork.getBody());
                return;
            }
            Throwable unregisterClient = unregisterClient();
            if (!(unregisterClient instanceof ParsingException)) {
                responseListener.onResponse(this.f5922w.generateLink());
            } else if (((ParsingException) unregisterClient).getRawResponse().isSuccessful()) {
                responseListener.onResponseError("Can't parse one link data");
            } else {
                responseListener.onResponse(this.f5922w.generateLink());
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AFe1sSDK<String> AFKeystoreWrapper(String str) {
        return ((AFf1nSDK) this).AFLogger.AFInAppEventParameterName(this.unregisterClient, this.f5921v, this.force, this.afInfoLog, str);
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean i() {
        return false;
    }
}
