package com.youappi.sdk.utils;

/* loaded from: classes2.dex */
public enum Environment {
    STUB("https://sdkstub.youappi.com"),
    PRODUCTION("https://sdk.youappi.com"),
    STAGING("https://stgsdk.youappi.com"),
    QA("https://qa1sdk.youappi.com");

    private final String _url;

    Environment(String str) {
        this._url = str;
    }

    public String getUrl() {
        return this._url;
    }
}
