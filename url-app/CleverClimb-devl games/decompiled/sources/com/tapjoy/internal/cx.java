package com.tapjoy.internal;

/* loaded from: classes2.dex */
public final class cx {

    /* renamed from: a, reason: collision with root package name */
    public final String f7910a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7911b;

    private cx(String str, String str2) {
        this.f7910a = str;
        this.f7911b = str2;
    }

    public static cx a(String str, String str2) {
        dp.a(str, "Name is null or empty");
        dp.a(str2, "Version is null or empty");
        return new cx(str, str2);
    }
}
