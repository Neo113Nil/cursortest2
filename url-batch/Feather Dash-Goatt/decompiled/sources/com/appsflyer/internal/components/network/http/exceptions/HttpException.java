package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFd1dSDK;
import java.io.IOException;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class HttpException extends IOException {
    private final AFd1dSDK getRevenue;

    public HttpException(Throwable th, AFd1dSDK aFd1dSDK) {
        super(th.getMessage(), th);
        this.getRevenue = aFd1dSDK;
    }

    public AFd1dSDK getMetrics() {
        return this.getRevenue;
    }
}
