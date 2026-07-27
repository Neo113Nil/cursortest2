package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.ck, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0572ck {

    /* renamed from: a, reason: collision with root package name */
    public volatile long f8005a;

    /* renamed from: b, reason: collision with root package name */
    public C0618ef f8006b;

    /* renamed from: c, reason: collision with root package name */
    public TimeProvider f8007c;

    public static C0572ck c() {
        return AbstractC0546bk.f7949a;
    }

    public final synchronized long a() {
        return (System.currentTimeMillis() / 1000) + this.f8005a;
    }

    public final synchronized void b() {
        this.f8006b.d(false);
        this.f8006b.b();
    }

    public final synchronized long d() {
        return this.f8005a;
    }

    public final synchronized void e() {
        a(C1027ua.f9366H.z(), new SystemTimeProvider());
    }

    public final synchronized boolean f() {
        return this.f8006b.b(true);
    }

    public final synchronized void a(long j2, Long l2) {
        try {
            this.f8005a = (j2 - this.f8007c.currentTimeMillis()) / 1000;
            boolean z = true;
            if (this.f8006b.b(true)) {
                if (l2 != null) {
                    long abs = Math.abs(j2 - this.f8007c.currentTimeMillis());
                    C0618ef c0618ef = this.f8006b;
                    if (abs <= TimeUnit.SECONDS.toMillis(l2.longValue())) {
                        z = false;
                    }
                    c0618ef.d(z);
                } else {
                    this.f8006b.d(false);
                }
            }
            this.f8006b.d(this.f8005a);
            this.f8006b.b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(C0618ef c0618ef, TimeProvider timeProvider) {
        this.f8006b = c0618ef;
        this.f8005a = c0618ef.a(0);
        this.f8007c = timeProvider;
    }
}
