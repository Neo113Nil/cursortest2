package com.squareup.cash.treehouse.platform;

import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes.dex */
public abstract class CashFreshnessCheckerKt {
    public static final long freshDuration;

    static {
        Duration.Companion companion = Duration.Companion;
        freshDuration = DurationKt.toDuration(7, DurationUnit.DAYS);
    }
}
