package com.squareup.protos.timecards;

import com.squareup.cash.clientrouting.data.FeatureContextKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SimpleTimeWorkedCalculationRequest$TimeRange$LocalDateTimeRange extends FeatureContextKt {
    public final LocalDateTimeRange value;

    public SimpleTimeWorkedCalculationRequest$TimeRange$LocalDateTimeRange(LocalDateTimeRange localDateTimeRange) {
        localDateTimeRange.getClass();
        this.value = localDateTimeRange;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SimpleTimeWorkedCalculationRequest$TimeRange$LocalDateTimeRange) && Intrinsics.areEqual(this.value, ((SimpleTimeWorkedCalculationRequest$TimeRange$LocalDateTimeRange) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LocalDateTimeRange(value=" + this.value + ")";
    }
}
