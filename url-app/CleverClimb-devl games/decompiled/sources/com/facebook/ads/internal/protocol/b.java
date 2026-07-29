package com.facebook.ads.internal.protocol;

/* loaded from: classes.dex */
public class b extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final AdErrorType f5364a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5365b;

    public b(AdErrorType adErrorType, String str) {
        this(adErrorType, str, null);
    }

    public b(AdErrorType adErrorType, String str, Throwable th) {
        super(str, th);
        this.f5364a = adErrorType;
        this.f5365b = str;
    }

    public AdErrorType a() {
        return this.f5364a;
    }

    public String b() {
        return this.f5365b;
    }
}
