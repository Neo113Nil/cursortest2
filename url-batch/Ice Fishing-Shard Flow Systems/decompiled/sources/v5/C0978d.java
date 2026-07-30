package v5;

import java.time.Clock;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

/* renamed from: v5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0978d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0978d f8235a = new C0978d();

    public final long a(boolean z7) {
        Clock systemUTC;
        Instant instant;
        long epochSecond;
        int nano;
        if (!z7) {
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
