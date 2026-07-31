package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.bj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2523bj {

    /* renamed from: a, reason: collision with root package name */
    public final Revenue f38732a;

    /* renamed from: b, reason: collision with root package name */
    public final Um f38733b;

    /* renamed from: c, reason: collision with root package name */
    public final C2554cn f38734c;

    /* renamed from: d, reason: collision with root package name */
    public final C2554cn f38735d;

    /* renamed from: e, reason: collision with root package name */
    public final PublicLogger f38736e;

    public C2523bj(Revenue revenue, PublicLogger publicLogger) {
        this.f38736e = publicLogger;
        this.f38732a = revenue;
        this.f38733b = new Um(30720, "revenue payload", publicLogger);
        this.f38734c = new C2554cn(new Um(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.f38735d = new C2554cn(new Wm(1000, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}
