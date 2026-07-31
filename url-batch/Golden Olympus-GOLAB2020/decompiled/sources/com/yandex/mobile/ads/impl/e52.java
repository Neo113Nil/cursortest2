package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class e52 {

    /* renamed from: a, reason: collision with root package name */
    private long f25101a;

    /* renamed from: b, reason: collision with root package name */
    private long f25102b;

    /* renamed from: c, reason: collision with root package name */
    private long f25103c;

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal<Long> f25104d = new ThreadLocal<>();

    public e52(long j4) {
        c(j4);
    }

    public final synchronized long a(long j4) {
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.f25102b == -9223372036854775807L) {
                long j5 = this.f25101a;
                if (j5 == 9223372036854775806L) {
                    Long l4 = this.f25104d.get();
                    l4.getClass();
                    j5 = l4.longValue();
                }
                this.f25102b = j5 - j4;
                notifyAll();
            }
            this.f25103c = j4;
            return j4 + this.f25102b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j4) {
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j5 = this.f25103c;
            if (j5 != -9223372036854775807L) {
                long j6 = (j5 * 90000) / 1000000;
                long j7 = (4294967296L + j6) / 8589934592L;
                long j8 = ((j7 - 1) * 8589934592L) + j4;
                j4 += j7 * 8589934592L;
                if (Math.abs(j8 - j6) < Math.abs(j4 - j6)) {
                    j4 = j8;
                }
            }
            return a((j4 * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c() {
        return this.f25102b;
    }

    public final synchronized void c(long j4) {
        this.f25101a = j4;
        this.f25102b = j4 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f25103c = -9223372036854775807L;
    }

    public final synchronized long b() {
        long a4;
        try {
            long j4 = this.f25103c;
            if (j4 != -9223372036854775807L) {
                a4 = j4 + this.f25102b;
            } else {
                a4 = a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a4;
    }

    public final synchronized long a() {
        long j4;
        j4 = this.f25101a;
        if (j4 == Long.MAX_VALUE || j4 == 9223372036854775806L) {
            j4 = -9223372036854775807L;
        }
        return j4;
    }
}
