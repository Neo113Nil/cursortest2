package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class Ek {

    /* renamed from: a, reason: collision with root package name */
    public final C2953s5 f37474a;

    /* renamed from: b, reason: collision with root package name */
    public final Vk f37475b;

    /* renamed from: c, reason: collision with root package name */
    public final Hk f37476c;

    /* renamed from: d, reason: collision with root package name */
    public long f37477d;

    /* renamed from: e, reason: collision with root package name */
    public long f37478e;

    /* renamed from: f, reason: collision with root package name */
    public AtomicLong f37479f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f37480g;

    /* renamed from: h, reason: collision with root package name */
    public volatile Tk f37481h;

    /* renamed from: i, reason: collision with root package name */
    public long f37482i;

    /* renamed from: j, reason: collision with root package name */
    public long f37483j;

    /* renamed from: k, reason: collision with root package name */
    public final SystemTimeProvider f37484k;

    public Ek(C2953s5 c2953s5, Vk vk, Hk hk, SystemTimeProvider systemTimeProvider) {
        this.f37474a = c2953s5;
        this.f37475b = vk;
        this.f37476c = hk;
        this.f37484k = systemTimeProvider;
        a();
    }

    public final void a() {
        Hk hk = this.f37476c;
        long elapsedRealtime = this.f37484k.elapsedRealtime();
        Long l4 = hk.f37664c;
        if (l4 != null) {
            elapsedRealtime = l4.longValue();
        }
        this.f37478e = elapsedRealtime;
        Long l5 = this.f37476c.f37663b;
        this.f37477d = l5 == null ? -1L : l5.longValue();
        Long l6 = this.f37476c.f37666e;
        this.f37479f = new AtomicLong(l6 == null ? 0L : l6.longValue());
        Boolean bool = this.f37476c.f37667f;
        this.f37480g = bool == null ? true : bool.booleanValue();
        Long l7 = this.f37476c.f37668g;
        long longValue = l7 != null ? l7.longValue() : 0L;
        this.f37482i = longValue;
        Hk hk2 = this.f37476c;
        long j4 = longValue - this.f37478e;
        Long l8 = hk2.f37669h;
        if (l8 != null) {
            j4 = l8.longValue();
        }
        this.f37483j = j4;
    }

    public final String toString() {
        return "Session{id=" + this.f37477d + ", creationTime=" + this.f37478e + ", currentReportId=" + this.f37479f + ", sessionRequestParams=" + this.f37481h + ", sleepStart=" + this.f37482i + '}';
    }
}
