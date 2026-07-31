package com.appsflyer.internal;

import com.ironsource.cc;
import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public enum AFd1gSDK {
    TEXT("text/plain"),
    JSON(cc.f15719L),
    OCTET_STREAM("application/octet-stream"),
    XML("application/xml"),
    HTML("text/html"),
    FORM("application/x-www-form-urlencoded"),
    IMAGE_JPEG("image/jpeg"),
    IMAGE_PNG("image/png");

    public final String getRevenue;

    AFd1gSDK(String str) {
        this.getRevenue = str;
    }
}
