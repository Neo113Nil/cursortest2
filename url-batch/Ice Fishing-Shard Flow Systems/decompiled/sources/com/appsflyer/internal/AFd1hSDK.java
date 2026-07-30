package com.appsflyer.internal;

import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public enum AFd1hSDK {
    TEXT("text/plain"),
    JSON("application/json"),
    OCTET_STREAM("application/octet-stream"),
    XML("application/xml"),
    HTML("text/html"),
    FORM("application/x-www-form-urlencoded"),
    IMAGE_JPEG("image/jpeg"),
    IMAGE_PNG("image/png");

    public final String getCurrencyIso4217Code;

    AFd1hSDK(String str) {
        this.getCurrencyIso4217Code = str;
    }
}
