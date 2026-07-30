package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import defpackage.lh;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFc1nSDK<ResponseBody> {
    private final AFc1fSDK<ResponseBody> AFInAppEventParameterName;
    private final AtomicBoolean AFInAppEventType = new AtomicBoolean(false);
    private final AFc1mSDK AFKeystoreWrapper;
    public final AFb1ySDK valueOf;
    private final ExecutorService values;

    public AFc1nSDK(AFb1ySDK aFb1ySDK, ExecutorService executorService, AFc1mSDK aFc1mSDK, AFc1fSDK<ResponseBody> aFc1fSDK) {
        this.valueOf = aFb1ySDK;
        this.values = executorService;
        this.AFKeystoreWrapper = aFc1mSDK;
        this.AFInAppEventParameterName = aFc1fSDK;
    }

    public final AFc1gSDK<ResponseBody> AFInAppEventParameterName() {
        if (this.AFInAppEventType.getAndSet(true)) {
            lh.g("Http call is already executed");
            return null;
        }
        AFc1gSDK<String> AFInAppEventType = this.AFKeystoreWrapper.AFInAppEventType(this.valueOf);
        try {
            return new AFc1gSDK<>(this.AFInAppEventParameterName.values(AFInAppEventType.getBody()), AFInAppEventType.AFKeystoreWrapper, AFInAppEventType.valueOf, AFInAppEventType.values, AFInAppEventType.AFInAppEventParameterName);
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("could not parse raw response - execute", e);
            throw new ParsingException(e.getMessage(), e, AFInAppEventType);
        }
    }
}
