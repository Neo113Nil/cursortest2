package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

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

    public final AFc1gSDK<ResponseBody> AFInAppEventParameterName() throws IOException {
        if (!this.AFInAppEventType.getAndSet(true)) {
            AFc1gSDK<String> AFInAppEventType = this.AFKeystoreWrapper.AFInAppEventType(this.valueOf);
            try {
                return new AFc1gSDK<>(this.AFInAppEventParameterName.values(AFInAppEventType.getBody()), AFInAppEventType.AFKeystoreWrapper, AFInAppEventType.valueOf, AFInAppEventType.values, AFInAppEventType.AFInAppEventParameterName);
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("could not parse raw response - execute", e);
                throw new ParsingException(e.getMessage(), e, AFInAppEventType);
            }
        }
        throw new IllegalStateException("Http call is already executed");
    }
}
