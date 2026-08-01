package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFe1wSDK;
import java.io.IOException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class ParsingException extends IOException {
    private final AFe1wSDK<String> getCurrencyIso4217Code;

    public ParsingException(String str, Throwable th, AFe1wSDK<String> aFe1wSDK) {
        super(str, th);
        this.getCurrencyIso4217Code = aFe1wSDK;
    }

    public AFe1wSDK<String> getRawResponse() {
        return this.getCurrencyIso4217Code;
    }
}
