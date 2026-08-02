package com.squareup.protos.timecards;

import com.squareup.cash.clientrouting.data.FeatureContextKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SimpleTimeWorkedCalculationRequest$TimeRange$LocalDateRange extends FeatureContextKt {
    public final LocalDateRange value;

    public SimpleTimeWorkedCalculationRequest$TimeRange$LocalDateRange(LocalDateRange localDateRange) {
        localDateRange.getClass();
        this.value = localDateRange;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SimpleTimeWorkedCalculationRequest$TimeRange$LocalDateRange) && Intrinsics.areEqual(this.value, ((SimpleTimeWorkedCalculationRequest$TimeRange$LocalDateRange) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LocalDateRange(value=" + this.value + ")";
    }
}
