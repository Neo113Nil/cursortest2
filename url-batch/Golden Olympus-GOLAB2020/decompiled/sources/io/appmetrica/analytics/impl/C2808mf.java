package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.mf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2808mf {

    /* renamed from: a, reason: collision with root package name */
    public final String f39446a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39447b;

    public C2808mf(String str, String str2) {
        this.f39446a = str;
        this.f39447b = a(str2);
    }

    public final String a(String str) {
        if (str == null) {
            return this.f39446a;
        }
        return this.f39446a + str;
    }
}
