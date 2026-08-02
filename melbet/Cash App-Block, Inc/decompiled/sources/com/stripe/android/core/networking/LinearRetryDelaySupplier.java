package com.stripe.android.core.networking;

import kotlin.ranges.RangesKt___RangesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes8.dex */
public final class LinearRetryDelaySupplier {
    public final /* synthetic */ int $r8$classId;
    public final long delay;

    public LinearRetryDelaySupplier(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.delay = DurationKt.toDuration(2L, DurationUnit.SECONDS);
                break;
            default:
                this.delay = DurationKt.toDuration(3L, DurationUnit.SECONDS);
                break;
        }
    }

    /* renamed from: getDelay-3nIYWDw, reason: not valid java name */
    public final long m4010getDelay3nIYWDw(int i) {
        int i2 = this.$r8$classId;
        long j = this.delay;
        switch (i2) {
            case 0:
                return j;
            default:
                int coerceIn = 4 - RangesKt___RangesKt.coerceIn(i, 1, 3);
                DurationUnit durationUnit = DurationUnit.SECONDS;
                return DurationKt.toDuration(Math.pow(Duration.m4175toDoubleimpl(j, durationUnit), coerceIn), durationUnit);
        }
    }
}
