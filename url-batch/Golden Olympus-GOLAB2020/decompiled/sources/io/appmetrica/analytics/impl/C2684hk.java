package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.hk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2684hk {

    /* renamed from: a, reason: collision with root package name */
    public volatile long f39155a;

    /* renamed from: b, reason: collision with root package name */
    public C2834nf f39156b;

    /* renamed from: c, reason: collision with root package name */
    public TimeProvider f39157c;

    public static C2684hk c() {
        return AbstractC2658gk.f39100a;
    }

    public final synchronized long a() {
        return (System.currentTimeMillis() / 1000) + this.f39155a;
    }

    public final synchronized void b() {
        this.f39156b.d(false);
        this.f39156b.b();
    }

    public final synchronized long d() {
        return this.f39155a;
    }

    public final synchronized void e() {
        a(Ia.f37730F.x(), new SystemTimeProvider());
    }

    public final synchronized boolean f() {
        return this.f39156b.b(true);
    }

    public final synchronized void a(long j4, Long l4) {
        try {
            this.f39155a = (j4 - this.f39157c.currentTimeMillis()) / 1000;
            boolean z4 = true;
            if (this.f39156b.b(true)) {
                if (l4 != null) {
                    long abs = Math.abs(j4 - this.f39157c.currentTimeMillis());
                    C2834nf c2834nf = this.f39156b;
                    if (abs <= TimeUnit.SECONDS.toMillis(l4.longValue())) {
                        z4 = false;
                    }
                    c2834nf.d(z4);
                } else {
                    this.f39156b.d(false);
                }
            }
            this.f39156b.d(this.f39155a);
            this.f39156b.b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(C2834nf c2834nf, TimeProvider timeProvider) {
        this.f39156b = c2834nf;
        this.f39155a = c2834nf.a(0);
        this.f39157c = timeProvider;
    }
}
