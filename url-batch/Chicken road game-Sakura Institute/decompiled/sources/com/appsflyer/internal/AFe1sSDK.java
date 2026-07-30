package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class AFe1sSDK<ResponseBody> {
    public final AFe1nSDK AFInAppEventParameterName;
    private final AFe1qSDK AFInAppEventType;
    private final AtomicBoolean AFKeystoreWrapper = new AtomicBoolean(false);
    private final ExecutorService valueOf;
    private final AFe1iSDK<ResponseBody> values;

    public AFe1sSDK(AFe1nSDK aFe1nSDK, ExecutorService executorService, AFe1qSDK aFe1qSDK, AFe1iSDK<ResponseBody> aFe1iSDK) {
        this.AFInAppEventParameterName = aFe1nSDK;
        this.valueOf = executorService;
        this.AFInAppEventType = aFe1qSDK;
        this.values = aFe1iSDK;
    }

    public final AFe1jSDK<ResponseBody> AFInAppEventType() throws IOException {
        if (!this.AFKeystoreWrapper.getAndSet(true)) {
            AFe1jSDK<String> AFKeystoreWrapper = this.AFInAppEventType.AFKeystoreWrapper(this.AFInAppEventParameterName);
            try {
                return new AFe1jSDK<>(this.values.AFInAppEventType(AFKeystoreWrapper.getBody()), AFKeystoreWrapper.AFKeystoreWrapper, AFKeystoreWrapper.values, AFKeystoreWrapper.AFInAppEventType, AFKeystoreWrapper.AFInAppEventParameterName);
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("could not parse raw response - execute", e);
                throw new ParsingException(e.getMessage(), e, AFKeystoreWrapper);
            }
        }
        throw new IllegalStateException("Http call is already executed");
    }
}
