package io.opentelemetry.contrib.disk.buffering.internal.storage.util;

import io.opentelemetry.sdk.common.Clock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class ClockBuddy {
    private ClockBuddy() {
    }

    public static final long nowMillis(Clock clock) {
        return TimeUnit.NANOSECONDS.toMillis(clock.now());
    }
}
