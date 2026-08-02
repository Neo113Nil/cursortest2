package defpackage;

import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import java.math.BigDecimal;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hsj {
    static {
        Duration.ofSeconds(Long.MIN_VALUE);
        Duration.ofSeconds(Long.MAX_VALUE, 999999999L);
        Duration.ofMillis(Long.MAX_VALUE);
        Duration.ofMillis(Long.MIN_VALUE);
        b(Long.MAX_VALUE);
        b(Long.MIN_VALUE);
        Duration.ofNanos(Long.MAX_VALUE);
        Duration.ofNanos(Long.MIN_VALUE);
        BigDecimal.valueOf(9.223372036854776E18d);
        BigDecimal.valueOf(-9.223372036854776E18d);
        Duration.ofMillis(Long.MAX_VALUE).plusNanos(999999L);
    }

    public static double a(Duration duration) {
        return duration.getSeconds() + (duration.getNano() / 1.0E9d);
    }

    public static void b(long j) {
        Duration.of(j, ChronoUnit.MICROS);
    }
}
