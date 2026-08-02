package com.squareup.protos.timecards;

import com.squareup.cash.clientrouting.data.FeatureContextKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SimpleTimeWorkedCalculationRequest$TimeRange$InstantRange extends FeatureContextKt {
    public final InstantRange value;

    public SimpleTimeWorkedCalculationRequest$TimeRange$InstantRange(InstantRange instantRange) {
        instantRange.getClass();
        this.value = instantRange;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SimpleTimeWorkedCalculationRequest$TimeRange$InstantRange) && Intrinsics.areEqual(this.value, ((SimpleTimeWorkedCalculationRequest$TimeRange$InstantRange) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "InstantRange(value=" + this.value + ")";
    }
}
