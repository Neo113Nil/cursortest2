package com.squareup.protos.timecards.scheduling;

import com.google.android.gms.internal.mlkit_vision_face.zzkn;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class TimeOff$DateRange$ZonedDateRange extends zzkn {
    public final ZonedDateRange value;

    public TimeOff$DateRange$ZonedDateRange(ZonedDateRange zonedDateRange) {
        zonedDateRange.getClass();
        this.value = zonedDateRange;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TimeOff$DateRange$ZonedDateRange) && Intrinsics.areEqual(this.value, ((TimeOff$DateRange$ZonedDateRange) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ZonedDateRange(value=" + this.value + ")";
    }
}
