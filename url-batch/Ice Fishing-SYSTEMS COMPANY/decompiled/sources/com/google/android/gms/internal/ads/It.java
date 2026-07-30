package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes2.dex */
public final class It {

    /* renamed from: a, reason: collision with root package name */
    public long f25647a;

    /* renamed from: b, reason: collision with root package name */
    public long f25648b;

    /* renamed from: c, reason: collision with root package name */
    public long f25649c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f25650d = new ThreadLocal();

    public It() {
        b(0L);
    }

    public final synchronized long a() {
        long j9 = this.f25647a;
        return (j9 == Long.MAX_VALUE || j9 == 9223372036854775806L) ? com.anythink.basead.exoplayer.b.f6539b : j9;
    }

    public final synchronized void b(long j9) {
        this.f25647a = j9;
        this.f25648b = j9 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f25649c = com.anythink.basead.exoplayer.b.f6539b;
    }

    public final synchronized long c(long j9) {
        if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
            return com.anythink.basead.exoplayer.b.f6539b;
        }
        try {
            long j10 = this.f25649c;
            if (j10 != com.anythink.basead.exoplayer.b.f6539b) {
                long w9 = AbstractC3548lu.w(j10, 90000L, 1000000L, RoundingMode.DOWN);
                long j11 = (4294967296L + w9) / 8589934592L;
                long j12 = (((-1) + j11) * 8589934592L) + j9;
                long j13 = (j11 * 8589934592L) + j9;
                j9 = Math.abs(j12 - w9) < Math.abs(j13 - w9) ? j12 : j13;
            }
            return e(AbstractC3548lu.w(j9, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long d(long j9) {
        if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
            return com.anythink.basead.exoplayer.b.f6539b;
        }
        try {
            long j10 = this.f25649c;
            if (j10 != com.anythink.basead.exoplayer.b.f6539b) {
                long w9 = AbstractC3548lu.w(j10, 90000L, 1000000L, RoundingMode.DOWN);
                long j11 = w9 / 8589934592L;
                long j12 = (j11 * 8589934592L) + j9;
                j9 = j12 >= w9 ? j12 : ((j11 + 1) * 8589934592L) + j9;
            }
            return e(AbstractC3548lu.w(j9, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long e(long j9) {
        long j10;
        if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
            return com.anythink.basead.exoplayer.b.f6539b;
        }
        try {
            synchronized (this) {
                if (!(this.f25648b != com.anythink.basead.exoplayer.b.f6539b)) {
                    long j11 = this.f25647a;
                    if (j11 == 9223372036854775806L) {
                        Long l9 = (Long) this.f25650d.get();
                        if (l9 == null) {
                            throw null;
                        }
                        j11 = l9.longValue();
                    }
                    this.f25648b = j11 - j9;
                    notifyAll();
                }
                this.f25649c = j9;
                j10 = j9 + this.f25648b;
            }
            return j10;
        } catch (Throwable th) {
            throw th;
        }
    }
}
