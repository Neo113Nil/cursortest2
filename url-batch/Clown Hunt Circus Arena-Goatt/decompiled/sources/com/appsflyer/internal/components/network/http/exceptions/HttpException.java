package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFc1lSDK;
import java.io.IOException;

/* loaded from: classes.dex */
public class HttpException extends IOException {
    private final AFc1lSDK AFKeystoreWrapper;

    public HttpException(Throwable th, AFc1lSDK aFc1lSDK) {
        super(th.getMessage(), th);
        this.AFKeystoreWrapper = aFc1lSDK;
    }

    public AFc1lSDK getMetrics() {
        return this.AFKeystoreWrapper;
    }
}
