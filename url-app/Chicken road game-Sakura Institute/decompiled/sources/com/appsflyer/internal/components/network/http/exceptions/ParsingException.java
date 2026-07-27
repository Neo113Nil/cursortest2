package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFe1jSDK;
import java.io.IOException;

/* loaded from: classes.dex */
public class ParsingException extends IOException {
    private final AFe1jSDK<String> AFKeystoreWrapper;

    public ParsingException(String str, Throwable th, AFe1jSDK<String> aFe1jSDK) {
        super(str, th);
        this.AFKeystoreWrapper = aFe1jSDK;
    }

    public AFe1jSDK<String> getRawResponse() {
        return this.AFKeystoreWrapper;
    }
}
