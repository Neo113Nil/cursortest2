package U6;

import java.time.Clock;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f3316a = new d();

    public final long a(boolean z8) {
        Clock systemUTC;
        Instant instant;
        long epochSecond;
        int nano;
        if (!z8) {
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
