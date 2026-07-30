package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFe1ySDK;
import java.io.IOException;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class ParsingException extends IOException {
    private final AFe1ySDK<String> getRevenue;

    public ParsingException(String str, Throwable th, AFe1ySDK<String> aFe1ySDK) {
        super(str, th);
        this.getRevenue = aFe1ySDK;
    }

    public AFe1ySDK<String> getRawResponse() {
        return this.getRevenue;
    }
}
