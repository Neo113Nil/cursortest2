package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class Ik {

    /* renamed from: a, reason: collision with root package name */
    public final C0457e5 f6165a;

    /* renamed from: b, reason: collision with root package name */
    public final Zk f6166b;

    /* renamed from: c, reason: collision with root package name */
    public final Lk f6167c;

    /* renamed from: d, reason: collision with root package name */
    public long f6168d;

    /* renamed from: e, reason: collision with root package name */
    public long f6169e;
    public AtomicLong f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6170g;

    /* renamed from: h, reason: collision with root package name */
    public volatile Xk f6171h;

    /* renamed from: i, reason: collision with root package name */
    public long f6172i;

    /* renamed from: j, reason: collision with root package name */
    public long f6173j;

    /* renamed from: k, reason: collision with root package name */
    public final SystemTimeProvider f6174k;

    public Ik(C0457e5 c0457e5, Zk zk, Lk lk, SystemTimeProvider systemTimeProvider) {
        this.f6165a = c0457e5;
        this.f6166b = zk;
        this.f6167c = lk;
        this.f6174k = systemTimeProvider;
        a();
    }

    public final void a() {
        Lk lk = this.f6167c;
        long elapsedRealtime = this.f6174k.elapsedRealtime();
        Long l3 = lk.f6294c;
        if (l3 != null) {
            elapsedRealtime = l3.longValue();
        }
        this.f6169e = elapsedRealtime;
        Long l4 = this.f6167c.f6293b;
        this.f6168d = l4 == null ? -1L : l4.longValue();
        Long l5 = this.f6167c.f6296e;
        this.f = new AtomicLong(l5 == null ? 0L : l5.longValue());
        Boolean bool = this.f6167c.f;
        this.f6170g = bool == null ? true : bool.booleanValue();
        Long l6 = this.f6167c.f6297g;
        long longValue = l6 != null ? l6.longValue() : 0L;
        this.f6172i = longValue;
        Lk lk2 = this.f6167c;
        long j3 = longValue - this.f6169e;
        Long l7 = lk2.f6298h;
        if (l7 != null) {
            j3 = l7.longValue();
        }
        this.f6173j = j3;
    }

    public final String toString() {
        return "Session{id=" + this.f6168d + ", creationTime=" + this.f6169e + ", currentReportId=" + this.f + ", sessionRequestParams=" + this.f6171h + ", sleepStart=" + this.f6172i + '}';
    }
}
