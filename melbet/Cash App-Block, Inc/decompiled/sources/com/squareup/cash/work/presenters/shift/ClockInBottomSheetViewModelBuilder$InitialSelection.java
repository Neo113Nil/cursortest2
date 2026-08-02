package com.squareup.cash.work.presenters.shift;

import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ClockInBottomSheetViewModelBuilder$InitialSelection {
    public final JobIdentifier jobIdentifier;
    public final LocationIdentifier locationIdentifier;

    public ClockInBottomSheetViewModelBuilder$InitialSelection(JobIdentifier jobIdentifier, LocationIdentifier locationIdentifier) {
        this.jobIdentifier = jobIdentifier;
        this.locationIdentifier = locationIdentifier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClockInBottomSheetViewModelBuilder$InitialSelection)) {
            return false;
        }
        ClockInBottomSheetViewModelBuilder$InitialSelection clockInBottomSheetViewModelBuilder$InitialSelection = (ClockInBottomSheetViewModelBuilder$InitialSelection) obj;
        return Intrinsics.areEqual(this.jobIdentifier, clockInBottomSheetViewModelBuilder$InitialSelection.jobIdentifier) && Intrinsics.areEqual(this.locationIdentifier, clockInBottomSheetViewModelBuilder$InitialSelection.locationIdentifier);
    }

    public final int hashCode() {
        JobIdentifier jobIdentifier = this.jobIdentifier;
        int hashCode = (jobIdentifier == null ? 0 : jobIdentifier.token.hashCode()) * 31;
        LocationIdentifier locationIdentifier = this.locationIdentifier;
        return hashCode + (locationIdentifier != null ? locationIdentifier.token.hashCode() : 0);
    }

    public final String toString() {
        return "InitialSelection(jobIdentifier=" + this.jobIdentifier + ", locationIdentifier=" + this.locationIdentifier + ")";
    }
}
