package com.squareup.cash.work.presenters.shift;

import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ClockInSelectionResolver$Selection {
    public final JobIdentifier job;
    public final LocationIdentifier location;

    public ClockInSelectionResolver$Selection(JobIdentifier jobIdentifier, LocationIdentifier locationIdentifier) {
        this.location = locationIdentifier;
        this.job = jobIdentifier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClockInSelectionResolver$Selection)) {
            return false;
        }
        ClockInSelectionResolver$Selection clockInSelectionResolver$Selection = (ClockInSelectionResolver$Selection) obj;
        return Intrinsics.areEqual(this.location, clockInSelectionResolver$Selection.location) && Intrinsics.areEqual(this.job, clockInSelectionResolver$Selection.job);
    }

    public final int hashCode() {
        LocationIdentifier locationIdentifier = this.location;
        int hashCode = (locationIdentifier == null ? 0 : locationIdentifier.token.hashCode()) * 31;
        JobIdentifier jobIdentifier = this.job;
        return hashCode + (jobIdentifier != null ? jobIdentifier.token.hashCode() : 0);
    }

    public final String toString() {
        return "Selection(location=" + this.location + ", job=" + this.job + ")";
    }
}
