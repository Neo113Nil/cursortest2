package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Xj {

    /* renamed from: a, reason: collision with root package name */
    public volatile long f11272a;

    /* renamed from: b, reason: collision with root package name */
    public Ze f11273b;

    /* renamed from: c, reason: collision with root package name */
    public TimeProvider f11274c;

    public static Xj c() {
        return Wj.f11193a;
    }

    public final synchronized long a() {
        return (System.currentTimeMillis() / 1000) + this.f11272a;
    }

    public final synchronized void b() {
        this.f11273b.d(false);
        this.f11273b.b();
    }

    public final synchronized long d() {
        return this.f11272a;
    }

    public final synchronized void e() {
        a(C0817na.f12417I.y(), new SystemTimeProvider());
    }

    public final synchronized boolean f() {
        return this.f11273b.b(true);
    }

    public final synchronized void a(long j4, Long l4) {
        try {
            this.f11272a = (j4 - this.f11274c.currentTimeMillis()) / 1000;
            boolean z = true;
            if (this.f11273b.b(true)) {
                if (l4 != null) {
                    long abs = Math.abs(j4 - this.f11274c.currentTimeMillis());
                    Ze ze = this.f11273b;
                    if (abs <= TimeUnit.SECONDS.toMillis(l4.longValue())) {
                        z = false;
                    }
                    ze.d(z);
                } else {
                    this.f11273b.d(false);
                }
            }
            this.f11273b.d(this.f11272a);
            this.f11273b.b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(Ze ze, TimeProvider timeProvider) {
        this.f11273b = ze;
        this.f11272a = ze.a(0);
        this.f11274c = timeProvider;
    }
}
