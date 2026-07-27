package J3;

import java.time.Clock;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1367a = new d();

    public final long a(boolean z) {
        Clock systemUTC;
        Instant instant;
        long epochSecond;
        int nano;
        if (!z) {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
        systemUTC = Clock.systemUTC();
        instant = systemUTC.instant();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        epochSecond = instant.getEpochSecond();
        long nanos = timeUnit.toNanos(epochSecond);
        nano = instant.getNano();
        return nanos + nano;
    }

    public final String toString() {
        return "SystemClock{}";
    }
}
