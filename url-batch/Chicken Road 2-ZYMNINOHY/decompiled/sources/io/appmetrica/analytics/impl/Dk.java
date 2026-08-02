package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class Dk {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f10207a;

    /* renamed from: b, reason: collision with root package name */
    public final Uk f10208b;

    /* renamed from: c, reason: collision with root package name */
    public final Gk f10209c;

    /* renamed from: d, reason: collision with root package name */
    public long f10210d;

    /* renamed from: e, reason: collision with root package name */
    public long f10211e;

    /* renamed from: f, reason: collision with root package name */
    public AtomicLong f10212f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10213g;

    /* renamed from: h, reason: collision with root package name */
    public volatile Sk f10214h;

    /* renamed from: i, reason: collision with root package name */
    public long f10215i;

    /* renamed from: j, reason: collision with root package name */
    public long f10216j;

    /* renamed from: k, reason: collision with root package name */
    public final SystemTimeProvider f10217k;

    public Dk(X4 x4, Uk uk, Gk gk, SystemTimeProvider systemTimeProvider) {
        this.f10207a = x4;
        this.f10208b = uk;
        this.f10209c = gk;
        this.f10217k = systemTimeProvider;
        a();
    }

    public final void a() {
        Gk gk = this.f10209c;
        long elapsedRealtime = this.f10217k.elapsedRealtime();
        Long l4 = gk.f10333c;
        if (l4 != null) {
            elapsedRealtime = l4.longValue();
        }
        this.f10211e = elapsedRealtime;
        Long l5 = this.f10209c.f10332b;
        this.f10210d = l5 == null ? -1L : l5.longValue();
        Long l6 = this.f10209c.f10335e;
        this.f10212f = new AtomicLong(l6 == null ? 0L : l6.longValue());
        Boolean bool = this.f10209c.f10336f;
        this.f10213g = bool == null ? true : bool.booleanValue();
        Long l7 = this.f10209c.f10337g;
        long longValue = l7 != null ? l7.longValue() : 0L;
        this.f10215i = longValue;
        Gk gk2 = this.f10209c;
        long j4 = longValue - this.f10211e;
        Long l8 = gk2.f10338h;
        if (l8 != null) {
            j4 = l8.longValue();
        }
        this.f10216j = j4;
    }

    public final String toString() {
        return "Session{id=" + this.f10210d + ", creationTime=" + this.f10211e + ", currentReportId=" + this.f10212f + ", sessionRequestParams=" + this.f10214h + ", sleepStart=" + this.f10215i + '}';
    }
}
