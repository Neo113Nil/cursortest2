package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.net.URL;

/* loaded from: classes3.dex */
public final class ta2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f32268a;

    /* renamed from: b, reason: collision with root package name */
    private final URL f32269b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32270c;

    private ta2(String str, URL url, String str2) {
        this.f32268a = str;
        this.f32269b = url;
        this.f32270c = str2;
    }

    public static ta2 a(String str, URL url, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("VendorKey is null or empty");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("VerificationParameters is null or empty");
        }
        return new ta2(str, url, str2);
    }

    public final String b() {
        return this.f32268a;
    }

    public final String c() {
        return this.f32270c;
    }

    public static ta2 a(URL url) {
        return new ta2(null, url, null);
    }

    public final URL a() {
        return this.f32269b;
    }
}
