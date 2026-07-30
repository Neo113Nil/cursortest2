package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFc1lSDK;
import java.io.IOException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
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
