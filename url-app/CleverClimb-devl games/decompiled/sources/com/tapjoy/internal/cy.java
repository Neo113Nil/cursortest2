package com.tapjoy.internal;

import java.net.URL;

/* loaded from: classes2.dex */
public final class cy {

    /* renamed from: a, reason: collision with root package name */
    public final String f7912a;

    /* renamed from: b, reason: collision with root package name */
    public final URL f7913b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7914c;

    private cy(String str, URL url, String str2) {
        this.f7912a = str;
        this.f7913b = url;
        this.f7914c = str2;
    }

    public static cy a(String str, URL url, String str2) {
        dp.a(str, "VendorKey is null or empty");
        dp.a(url, "ResourceURL is null");
        dp.a(str2, "VerificationParameters is null or empty");
        return new cy(str, url, str2);
    }

    public static cy a(URL url) {
        dp.a(url, "ResourceURL is null");
        return new cy(null, url, null);
    }
}
