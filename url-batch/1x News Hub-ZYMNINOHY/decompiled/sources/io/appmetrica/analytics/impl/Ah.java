package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class Ah {

    /* renamed from: a, reason: collision with root package name */
    public final W5 f5753a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5754b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5755c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f5756d;

    /* renamed from: e, reason: collision with root package name */
    public final Kh f5757e;

    public Ah(W5 w5, boolean z, int i3, HashMap hashMap, Kh kh) {
        this.f5753a = w5;
        this.f5754b = z;
        this.f5755c = i3;
        this.f5756d = hashMap;
        this.f5757e = kh;
    }

    public final String toString() {
        return "ReportToSend(report=" + this.f5753a + ", serviceDataReporterType=" + this.f5755c + ", environment=" + this.f5757e + ", isCrashReport=" + this.f5754b + ", trimmedFields=" + this.f5756d + ')';
    }
}
