package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public final class Ti {

    /* renamed from: a, reason: collision with root package name */
    public final Revenue f7543a;

    /* renamed from: b, reason: collision with root package name */
    public final Ym f7544b;

    /* renamed from: c, reason: collision with root package name */
    public final C0678gn f7545c;

    /* renamed from: d, reason: collision with root package name */
    public final C0678gn f7546d;

    /* renamed from: e, reason: collision with root package name */
    public final PublicLogger f7547e;

    public Ti(Revenue revenue, PublicLogger publicLogger) {
        this.f7547e = publicLogger;
        this.f7543a = revenue;
        this.f7544b = new Ym(30720, "revenue payload", publicLogger);
        this.f7545c = new C0678gn(new Ym(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.f7546d = new C0678gn(new C0523an(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}
