package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFd1aSDK;
import java.io.IOException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class HttpException extends IOException {
    private final AFd1aSDK getMonetizationNetwork;

    public HttpException(Throwable th, AFd1aSDK aFd1aSDK) {
        super(th.getMessage(), th);
        this.getMonetizationNetwork = aFd1aSDK;
    }

    public AFd1aSDK getMetrics() {
        return this.getMonetizationNetwork;
    }
}
