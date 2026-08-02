package com.squareup.cash.work.data.real;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.time.DayOfWeek;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShiftLoaderContext {
    public final ShiftLoaderIdentity identity;
    public final List locations;
    public final DayOfWeek weekStartDay;

    public ShiftLoaderContext(ShiftLoaderIdentity shiftLoaderIdentity, List list, DayOfWeek dayOfWeek) {
        shiftLoaderIdentity.getClass();
        list.getClass();
        dayOfWeek.getClass();
        this.identity = shiftLoaderIdentity;
        this.locations = list;
        this.weekStartDay = dayOfWeek;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftLoaderContext)) {
            return false;
        }
        ShiftLoaderContext shiftLoaderContext = (ShiftLoaderContext) obj;
        return Intrinsics.areEqual(this.identity, shiftLoaderContext.identity) && Intrinsics.areEqual(this.locations, shiftLoaderContext.locations) && this.weekStartDay == shiftLoaderContext.weekStartDay;
    }

    public final int hashCode() {
        return this.weekStartDay.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.identity.hashCode() * 31, 31, this.locations);
    }

    public final String toString() {
        return "ShiftLoaderContext(identity=" + this.identity + ", locations=" + this.locations + ", weekStartDay=" + this.weekStartDay + ")";
    }
}
