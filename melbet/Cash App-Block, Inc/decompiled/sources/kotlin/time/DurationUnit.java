package kotlin.time;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public enum DurationUnit {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);

    public final TimeUnit timeUnit;

    DurationUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }
}
