package io.appmetrica.analytics.idsync.impl;

import java.util.Map;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final String f9878a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9879b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9880c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9881d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9882e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f9883f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f9884g;

    public D(String str, boolean z, String str2, boolean z4, int i4, byte[] bArr, Map map) {
        this.f9878a = str;
        this.f9879b = z;
        this.f9880c = str2;
        this.f9881d = z4;
        this.f9882e = i4;
        this.f9883f = bArr;
        this.f9884g = map;
    }

    public final String toString() {
        return "RequestResult(type='" + this.f9878a + "', isCompleted=" + this.f9879b + ", url=" + this.f9880c + ", responseCodeIsValid=" + this.f9881d + ", responseCode=" + this.f9882e + ", responseBody=" + this.f9883f + ", responseHeaders=" + this.f9884g + ')';
    }
}
