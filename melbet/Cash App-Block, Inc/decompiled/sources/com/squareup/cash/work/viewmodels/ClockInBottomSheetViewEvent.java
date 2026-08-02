package com.squareup.cash.work.viewmodels;

import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ClockInBottomSheetViewEvent {

    /* loaded from: classes6.dex */
    public final class ClockInClicked implements ClockInBottomSheetViewEvent {
        public final JobIdentifier selectedJobIdentifier;
        public final LocationIdentifier selectedLocationIdentifier;
        public final boolean shouldSendShiftToken;

        public ClockInClicked(JobIdentifier jobIdentifier, LocationIdentifier locationIdentifier, boolean z) {
            this.selectedJobIdentifier = jobIdentifier;
            this.selectedLocationIdentifier = locationIdentifier;
            this.shouldSendShiftToken = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClockInClicked)) {
                return false;
            }
            ClockInClicked clockInClicked = (ClockInClicked) obj;
            return this.selectedJobIdentifier.equals(clockInClicked.selectedJobIdentifier) && this.selectedLocationIdentifier.equals(clockInClicked.selectedLocationIdentifier) && this.shouldSendShiftToken == clockInClicked.shouldSendShiftToken;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.shouldSendShiftToken) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.selectedJobIdentifier.token.hashCode() * 31, 31, this.selectedLocationIdentifier.token);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClockInClicked(selectedJobIdentifier=");
            sb.append(this.selectedJobIdentifier);
            sb.append(", selectedLocationIdentifier=");
            sb.append(this.selectedLocationIdentifier);
            sb.append(", shouldSendShiftToken=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.shouldSendShiftToken, ")");
        }
    }

    public final class Dismiss implements ClockInBottomSheetViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 2040624092;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    /* loaded from: classes6.dex */
    public final class JobSelectionChanged implements ClockInBottomSheetViewEvent {
        public final JobIdentifier jobIdentifier;

        public JobSelectionChanged(JobIdentifier jobIdentifier) {
            jobIdentifier.getClass();
            this.jobIdentifier = jobIdentifier;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof JobSelectionChanged) && Intrinsics.areEqual(this.jobIdentifier, ((JobSelectionChanged) obj).jobIdentifier);
        }

        public final int hashCode() {
            return this.jobIdentifier.token.hashCode();
        }

        public final String toString() {
            return "JobSelectionChanged(jobIdentifier=" + this.jobIdentifier + ")";
        }
    }

    public final class LocationPermissionLinkClicked implements ClockInBottomSheetViewEvent {
        public static final LocationPermissionLinkClicked INSTANCE = new LocationPermissionLinkClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LocationPermissionLinkClicked);
        }

        public final int hashCode() {
            return -1061093221;
        }

        public final String toString() {
            return "LocationPermissionLinkClicked";
        }
    }

    /* loaded from: classes6.dex */
    public final class LocationSelectionChanged implements ClockInBottomSheetViewEvent {
        public final LocationIdentifier locationIdentifier;

        public LocationSelectionChanged(LocationIdentifier locationIdentifier) {
            locationIdentifier.getClass();
            this.locationIdentifier = locationIdentifier;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocationSelectionChanged) && Intrinsics.areEqual(this.locationIdentifier, ((LocationSelectionChanged) obj).locationIdentifier);
        }

        public final int hashCode() {
            return this.locationIdentifier.token.hashCode();
        }

        public final String toString() {
            return "LocationSelectionChanged(locationIdentifier=" + this.locationIdentifier + ")";
        }
    }

    public final class OpenAppSettingsClicked implements ClockInBottomSheetViewEvent {
        public static final OpenAppSettingsClicked INSTANCE = new OpenAppSettingsClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenAppSettingsClicked);
        }

        public final int hashCode() {
            return 93682299;
        }

        public final String toString() {
            return "OpenAppSettingsClicked";
        }
    }
}
