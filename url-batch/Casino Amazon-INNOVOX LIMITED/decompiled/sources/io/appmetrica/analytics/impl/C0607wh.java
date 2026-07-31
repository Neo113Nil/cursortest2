package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.wh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0607wh {

    /* renamed from: a, reason: collision with root package name */
    public final Q5 f1550a;
    public final boolean b;
    public final int c;
    public final HashMap d;
    public final Gh e;

    public C0607wh(Q5 q5, boolean z, int i, HashMap hashMap, Gh gh) {
        this.f1550a = q5;
        this.b = z;
        this.c = i;
        this.d = hashMap;
        this.e = gh;
    }

    public final String toString() {
        return "ReportToSend(report=" + this.f1550a + ", serviceDataReporterType=" + this.c + ", environment=" + this.e + ", isCrashReport=" + this.b + ", trimmedFields=" + this.d + ')';
    }
}
