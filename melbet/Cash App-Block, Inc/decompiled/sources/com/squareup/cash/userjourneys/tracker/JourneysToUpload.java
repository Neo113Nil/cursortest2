package com.squareup.cash.userjourneys.tracker;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class JourneysToUpload {
    public final boolean isRetry;
    public final List journeys;

    public JourneysToUpload(List list, boolean z) {
        list.getClass();
        this.journeys = list;
        this.isRetry = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JourneysToUpload)) {
            return false;
        }
        JourneysToUpload journeysToUpload = (JourneysToUpload) obj;
        return Intrinsics.areEqual(this.journeys, journeysToUpload.journeys) && this.isRetry == journeysToUpload.isRetry;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isRetry) + (this.journeys.hashCode() * 31);
    }

    public final String toString() {
        return "JourneysToUpload(journeys=" + this.journeys + ", isRetry=" + this.isRetry + ")";
    }
}
