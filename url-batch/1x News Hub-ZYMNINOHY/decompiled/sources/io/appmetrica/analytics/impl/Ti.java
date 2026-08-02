package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public final class Ti {

    /* renamed from: a, reason: collision with root package name */
    public final Revenue f6714a;

    /* renamed from: b, reason: collision with root package name */
    public final Ym f6715b;

    /* renamed from: c, reason: collision with root package name */
    public final C0527gn f6716c;

    /* renamed from: d, reason: collision with root package name */
    public final C0527gn f6717d;

    /* renamed from: e, reason: collision with root package name */
    public final PublicLogger f6718e;

    public Ti(Revenue revenue, PublicLogger publicLogger) {
        this.f6718e = publicLogger;
        this.f6714a = revenue;
        this.f6715b = new Ym(30720, "revenue payload", publicLogger);
        this.f6716c = new C0527gn(new Ym(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.f6717d = new C0527gn(new C0372an(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}
