package com.facebook.ads.internal.o;

/* loaded from: classes.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    private final a f5276a;

    /* renamed from: b, reason: collision with root package name */
    private final com.facebook.ads.internal.h.c f5277b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5278c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5279d;
    private final String e;

    enum a {
        UNKNOWN,
        ERROR,
        ADS
    }

    f(a aVar) {
        this(aVar, null, null, null, null);
    }

    f(a aVar, com.facebook.ads.internal.h.c cVar, String str, String str2, String str3) {
        this.f5276a = aVar;
        this.f5277b = cVar;
        this.f5278c = str;
        this.f5279d = str2;
        this.e = str3;
    }

    public com.facebook.ads.internal.h.c a() {
        return this.f5277b;
    }

    a b() {
        return this.f5276a;
    }

    String c() {
        return this.f5278c;
    }

    String d() {
        return this.f5279d;
    }

    String e() {
        return this.e;
    }
}
