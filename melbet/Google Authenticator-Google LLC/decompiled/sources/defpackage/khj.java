package defpackage;

import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class khj implements kmr {
    private final /* synthetic */ int b;

    public khj(int i) {
        this.b = i;
    }

    @Override // defpackage.kmr
    public final long a() {
        if (this.b != 0) {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
        Instant now = Instant.now();
        long nanos = TimeUnit.SECONDS.toNanos(now.getEpochSecond());
        long nano = now.getNano();
        long j = nanos + nano;
        return (((nano ^ nanos) > 0L ? 1 : ((nano ^ nanos) == 0L ? 0 : -1)) < 0) | ((nanos ^ j) >= 0) ? j : ((j >>> 63) ^ 1) + Long.MAX_VALUE;
    }
}
