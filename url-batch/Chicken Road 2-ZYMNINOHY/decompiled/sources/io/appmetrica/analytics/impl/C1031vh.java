package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.vh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1031vh {

    /* renamed from: a, reason: collision with root package name */
    public final P5 f12893a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12894b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12895c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f12896d;

    /* renamed from: e, reason: collision with root package name */
    public final Fh f12897e;

    public C1031vh(P5 p5, boolean z, int i4, HashMap hashMap, Fh fh) {
        this.f12893a = p5;
        this.f12894b = z;
        this.f12895c = i4;
        this.f12896d = hashMap;
        this.f12897e = fh;
    }

    public final String toString() {
        return "ReportToSend(report=" + this.f12893a + ", serviceDataReporterType=" + this.f12895c + ", environment=" + this.f12897e + ", isCrashReport=" + this.f12894b + ", trimmedFields=" + this.f12896d + ')';
    }
}
