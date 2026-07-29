package com.facebook.ads.internal.protocol;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final AdErrorType f5362a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5363b;

    public a(int i, String str) {
        this(AdErrorType.adErrorTypeFromCode(i), str);
    }

    public a(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.f5362a = adErrorType;
        this.f5363b = str;
    }

    public static a a(AdErrorType adErrorType, String str) {
        return new a(adErrorType, str);
    }

    public static a a(b bVar) {
        return new a(bVar.a(), bVar.b());
    }

    public AdErrorType a() {
        return this.f5362a;
    }

    public String b() {
        return this.f5363b;
    }
}
