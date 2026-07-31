package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class AFe1xSDK<ResponseBody> {
    private final AFe1jSDK<ResponseBody> AFInAppEventParameterName;
    private final ExecutorService AFInAppEventType;
    private final AFe1rSDK AFKeystoreWrapper;
    private final AtomicBoolean valueOf = new AtomicBoolean(false);
    public final AFe1nSDK values;

    public AFe1xSDK(AFe1nSDK aFe1nSDK, ExecutorService executorService, AFe1rSDK aFe1rSDK, AFe1jSDK<ResponseBody> aFe1jSDK) {
        this.values = aFe1nSDK;
        this.AFInAppEventType = executorService;
        this.AFKeystoreWrapper = aFe1rSDK;
        this.AFInAppEventParameterName = aFe1jSDK;
    }

    public final AFe1pSDK<ResponseBody> AFInAppEventType() throws IOException {
        if (!this.valueOf.getAndSet(true)) {
            AFe1pSDK<String> values = this.AFKeystoreWrapper.values(this.values);
            try {
                return new AFe1pSDK<>(this.AFInAppEventParameterName.AFInAppEventType(values.getBody()), values.AFKeystoreWrapper, values.values, values.AFInAppEventParameterName, values.AFInAppEventType);
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("could not parse raw response - execute", e);
                throw new ParsingException(e.getMessage(), e, values);
            }
        }
        throw new IllegalStateException("Http call is already executed");
    }
}
