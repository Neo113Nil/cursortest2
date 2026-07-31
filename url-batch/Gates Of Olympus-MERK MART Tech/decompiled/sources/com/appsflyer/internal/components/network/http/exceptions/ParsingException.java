package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFe1pSDK;
import java.io.IOException;

/* loaded from: classes3.dex */
public class ParsingException extends IOException {
    private final AFe1pSDK<String> AFInAppEventType;

    public ParsingException(String str, Throwable th, AFe1pSDK<String> aFe1pSDK) {
        super(str, th);
        this.AFInAppEventType = aFe1pSDK;
    }

    public AFe1pSDK<String> getRawResponse() {
        return this.AFInAppEventType;
    }
}
