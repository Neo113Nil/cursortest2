package io.appmetrica.analytics.impl;

import b2.AbstractC0279e;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class Ik {

    /* renamed from: a, reason: collision with root package name */
    public final C0608e5 f6965a;

    /* renamed from: b, reason: collision with root package name */
    public final Zk f6966b;

    /* renamed from: c, reason: collision with root package name */
    public final Lk f6967c;

    /* renamed from: d, reason: collision with root package name */
    public long f6968d;

    /* renamed from: e, reason: collision with root package name */
    public long f6969e;

    /* renamed from: f, reason: collision with root package name */
    public AtomicLong f6970f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6971g;

    /* renamed from: h, reason: collision with root package name */
    public volatile Xk f6972h;

    /* renamed from: i, reason: collision with root package name */
    public long f6973i;

    /* renamed from: j, reason: collision with root package name */
    public long f6974j;

    /* renamed from: k, reason: collision with root package name */
    public final SystemTimeProvider f6975k;

    public Ik(C0608e5 c0608e5, Zk zk, Lk lk, SystemTimeProvider systemTimeProvider) {
        this.f6965a = c0608e5;
        this.f6966b = zk;
        this.f6967c = lk;
        this.f6975k = systemTimeProvider;
        a();
    }

    public final void a() {
        Lk lk = this.f6967c;
        long elapsedRealtime = this.f6975k.elapsedRealtime();
        Long l2 = lk.f7101c;
        if (l2 != null) {
            elapsedRealtime = l2.longValue();
        }
        this.f6969e = elapsedRealtime;
        Long l6 = this.f6967c.f7100b;
        this.f6968d = l6 == null ? -1L : l6.longValue();
        Long l7 = this.f6967c.f7103e;
        this.f6970f = new AtomicLong(l7 == null ? 0L : l7.longValue());
        Boolean bool = this.f6967c.f7104f;
        this.f6971g = bool == null ? true : bool.booleanValue();
        Long l8 = this.f6967c.f7105g;
        long longValue = l8 != null ? l8.longValue() : 0L;
        this.f6973i = longValue;
        Lk lk2 = this.f6967c;
        long j2 = longValue - this.f6969e;
        Long l9 = lk2.f7106h;
        if (l9 != null) {
            j2 = l9.longValue();
        }
        this.f6974j = j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{id=");
        sb.append(this.f6968d);
        sb.append(", creationTime=");
        sb.append(this.f6969e);
        sb.append(", currentReportId=");
        sb.append(this.f6970f);
        sb.append(", sessionRequestParams=");
        sb.append(this.f6972h);
        sb.append(", sleepStart=");
        return AbstractC0279e.g(sb, this.f6973i, '}');
    }
}
