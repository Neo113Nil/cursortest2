package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum geh {
    DONT_CARE(Duration.ofMillis(Long.MAX_VALUE)),
    SAME_WEEK(Duration.ofDays(7)),
    SAME_DAY(Duration.ofDays(1)),
    FEW_HOURS(Duration.ofHours(4)),
    ONE_HOUR(Duration.ofHours(1)),
    HALF_HOUR(Duration.ofMinutes(30)),
    TEN_MINUTES(Duration.ofMinutes(10)),
    FEW_MINUTES(Duration.ofMinutes(4)),
    ONE_MINUTE(Duration.ofMinutes(1)),
    FEW_SECONDS(Duration.ofSeconds(4));

    public final Duration k;

    geh(Duration duration) {
        this.k = duration;
    }
}
