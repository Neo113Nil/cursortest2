package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public final class Oi {

    /* renamed from: a, reason: collision with root package name */
    public final Revenue f10758a;

    /* renamed from: b, reason: collision with root package name */
    public final Um f10759b;

    /* renamed from: c, reason: collision with root package name */
    public final C0572dn f10760c;

    /* renamed from: d, reason: collision with root package name */
    public final C0572dn f10761d;

    /* renamed from: e, reason: collision with root package name */
    public final PublicLogger f10762e;

    public Oi(Revenue revenue, PublicLogger publicLogger) {
        this.f10762e = publicLogger;
        this.f10758a = revenue;
        this.f10759b = new Um(30720, "revenue payload", publicLogger);
        this.f10760c = new C0572dn(new Um(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.f10761d = new C0572dn(new Xm(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}
