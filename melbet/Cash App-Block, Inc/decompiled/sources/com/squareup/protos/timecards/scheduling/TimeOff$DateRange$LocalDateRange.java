package com.squareup.protos.timecards.scheduling;

import com.google.android.gms.internal.mlkit_vision_face.zzkn;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class TimeOff$DateRange$LocalDateRange extends zzkn {
    public final LocalDateRange value;

    public TimeOff$DateRange$LocalDateRange(LocalDateRange localDateRange) {
        localDateRange.getClass();
        this.value = localDateRange;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TimeOff$DateRange$LocalDateRange) && Intrinsics.areEqual(this.value, ((TimeOff$DateRange$LocalDateRange) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LocalDateRange(value=" + this.value + ")";
    }
}
