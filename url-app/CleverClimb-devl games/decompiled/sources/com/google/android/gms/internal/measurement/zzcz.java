package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
final class zzcz {
    private long startTime;
    private final Clock zzrj;

    public zzcz(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.zzrj = clock;
    }

    public zzcz(Clock clock, long j) {
        Preconditions.checkNotNull(clock);
        this.zzrj = clock;
        this.startTime = j;
    }

    public final void clear() {
        this.startTime = 0L;
    }

    public final void start() {
        this.startTime = this.zzrj.elapsedRealtime();
    }

    public final boolean zzj(long j) {
        return this.startTime == 0 || this.zzrj.elapsedRealtime() - this.startTime > j;
    }
}
