package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.ck, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0421ck {

    /* renamed from: a, reason: collision with root package name */
    public volatile long f7149a;

    /* renamed from: b, reason: collision with root package name */
    public C0467ef f7150b;

    /* renamed from: c, reason: collision with root package name */
    public TimeProvider f7151c;

    public static C0421ck c() {
        return AbstractC0395bk.f7096a;
    }

    public final synchronized long a() {
        return (System.currentTimeMillis() / 1000) + this.f7149a;
    }

    public final synchronized void b() {
        this.f7150b.d(false);
        this.f7150b.b();
    }

    public final synchronized long d() {
        return this.f7149a;
    }

    public final synchronized void e() {
        a(C0876ua.f8420H.z(), new SystemTimeProvider());
    }

    public final synchronized boolean f() {
        return this.f7150b.b(true);
    }

    public final synchronized void a(long j3, Long l3) {
        try {
            this.f7149a = (j3 - this.f7151c.currentTimeMillis()) / 1000;
            boolean z = true;
            if (this.f7150b.b(true)) {
                if (l3 != null) {
                    long abs = Math.abs(j3 - this.f7151c.currentTimeMillis());
                    C0467ef c0467ef = this.f7150b;
                    if (abs <= TimeUnit.SECONDS.toMillis(l3.longValue())) {
                        z = false;
                    }
                    c0467ef.d(z);
                } else {
                    this.f7150b.d(false);
                }
            }
            this.f7150b.d(this.f7149a);
            this.f7150b.b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(C0467ef c0467ef, TimeProvider timeProvider) {
        this.f7150b = c0467ef;
        this.f7149a = c0467ef.a(0);
        this.f7151c = timeProvider;
    }
}
