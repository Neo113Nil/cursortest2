package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFe1tSDK;
import java.io.IOException;

/* loaded from: classes3.dex */
public class HttpException extends IOException {
    private final AFe1tSDK values;

    public HttpException(Throwable th, AFe1tSDK aFe1tSDK) {
        super(th.getMessage(), th);
        this.values = aFe1tSDK;
    }

    public AFe1tSDK getMetrics() {
        return this.values;
    }
}
