package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFc1gSDK;
import java.io.IOException;

/* loaded from: classes.dex */
public class ParsingException extends IOException {
    private final AFc1gSDK<String> AFKeystoreWrapper;

    public ParsingException(String str, Throwable th, AFc1gSDK<String> aFc1gSDK) {
        super(str, th);
        this.AFKeystoreWrapper = aFc1gSDK;
    }

    public AFc1gSDK<String> getRawResponse() {
        return this.AFKeystoreWrapper;
    }
}
