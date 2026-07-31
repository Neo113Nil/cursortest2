package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class Ih {

    /* renamed from: a, reason: collision with root package name */
    public final C2773l6 f37763a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f37764b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37765c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f37766d;

    /* renamed from: e, reason: collision with root package name */
    public final Sh f37767e;

    public Ih(C2773l6 c2773l6, boolean z4, int i4, HashMap hashMap, Sh sh) {
        this.f37763a = c2773l6;
        this.f37764b = z4;
        this.f37765c = i4;
        this.f37766d = hashMap;
        this.f37767e = sh;
    }

    public final String toString() {
        return "ReportToSend(report=" + this.f37763a + ", serviceDataReporterType=" + this.f37765c + ", environment=" + this.f37767e + ", isCrashReport=" + this.f37764b + ", trimmedFields=" + this.f37766d + ')';
    }
}
