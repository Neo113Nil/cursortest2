package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFc1gSDK;
import java.io.IOException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
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
