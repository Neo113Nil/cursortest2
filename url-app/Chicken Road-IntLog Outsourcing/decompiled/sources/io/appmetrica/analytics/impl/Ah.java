package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class Ah {

    /* renamed from: a, reason: collision with root package name */
    public final W5 f6530a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6531b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6532c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f6533d;

    /* renamed from: e, reason: collision with root package name */
    public final Kh f6534e;

    public Ah(W5 w5, boolean z, int i2, HashMap hashMap, Kh kh) {
        this.f6530a = w5;
        this.f6531b = z;
        this.f6532c = i2;
        this.f6533d = hashMap;
        this.f6534e = kh;
    }

    public final String toString() {
        return "ReportToSend(report=" + this.f6530a + ", serviceDataReporterType=" + this.f6532c + ", environment=" + this.f6534e + ", isCrashReport=" + this.f6531b + ", trimmedFields=" + this.f6533d + ')';
    }
}
