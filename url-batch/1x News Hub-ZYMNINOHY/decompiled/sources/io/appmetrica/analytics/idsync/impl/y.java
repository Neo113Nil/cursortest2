package io.appmetrica.analytics.idsync.impl;

import java.util.Map;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f5681a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5682b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5683c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5684d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5685e;
    public final byte[] f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f5686g;

    public y(String str, boolean z, String str2, boolean z2, int i3, byte[] bArr, Map map) {
        this.f5681a = str;
        this.f5682b = z;
        this.f5683c = str2;
        this.f5684d = z2;
        this.f5685e = i3;
        this.f = bArr;
        this.f5686g = map;
    }

    public final String toString() {
        return "RequestResult(type='" + this.f5681a + "', isCompleted=" + this.f5682b + ", url=" + this.f5683c + ", responseCodeIsValid=" + this.f5684d + ", responseCode=" + this.f5685e + ", responseBody=" + this.f + ", responseHeaders=" + this.f5686g + ')';
    }
}
