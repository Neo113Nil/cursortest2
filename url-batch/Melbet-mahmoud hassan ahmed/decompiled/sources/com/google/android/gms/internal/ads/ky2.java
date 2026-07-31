package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ky2 {

    /* renamed from: a, reason: collision with root package name */
    private long f7734a;

    /* renamed from: b, reason: collision with root package name */
    private long f7735b;

    /* renamed from: c, reason: collision with root package name */
    private long f7736c;

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal<Long> f7737d = new ThreadLocal<>();

    public ky2(long j7) {
        f(0L);
    }

    public final synchronized long a(long j7) {
        if (this.f7735b == -9223372036854775807L) {
            long j8 = this.f7734a;
            if (j8 == 9223372036854775806L) {
                Long l7 = this.f7737d.get();
                Objects.requireNonNull(l7);
                j8 = l7.longValue();
            }
            this.f7735b = j8 - j7;
            notifyAll();
        }
        this.f7736c = j7;
        return j7 + this.f7735b;
    }

    public final synchronized long b(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j8 = this.f7736c;
        if (j8 != -9223372036854775807L) {
            long j9 = (j8 * 90000) / 1000000;
            long j10 = (4294967296L + j9) / 8589934592L;
            long j11 = (((-1) + j10) * 8589934592L) + j7;
            j7 += j10 * 8589934592L;
            if (Math.abs(j11 - j9) < Math.abs(j7 - j9)) {
                j7 = j11;
            }
        }
        return a((j7 * 1000000) / 90000);
    }

    public final synchronized long c() {
        long j7 = this.f7734a;
        if (j7 == Long.MAX_VALUE || j7 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j7;
    }

    public final synchronized long d() {
        long j7;
        j7 = this.f7736c;
        return j7 != -9223372036854775807L ? j7 + this.f7735b : c();
    }

    public final synchronized long e() {
        return this.f7735b;
    }

    public final synchronized void f(long j7) {
        this.f7734a = j7;
        this.f7735b = j7 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f7736c = -9223372036854775807L;
    }
}
