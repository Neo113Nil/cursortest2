package com.squareup.cash.work.viewmodels;

import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ClockInOverlayViewEvent {

    public final class ClockInClicked implements ClockInOverlayViewEvent {
        public static final ClockInClicked INSTANCE = new ClockInClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClockInClicked);
        }

        public final int hashCode() {
            return -1299506146;
        }

        public final String toString() {
            return "ClockInClicked";
        }
    }

    public final class ClockOutClicked implements ClockInOverlayViewEvent {
        public static final ClockOutClicked INSTANCE = new ClockOutClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClockOutClicked);
        }

        public final int hashCode() {
            return -719733859;
        }

        public final String toString() {
            return "ClockOutClicked";
        }
    }

    public final class ClockOutConfirmContinueClicked implements ClockInOverlayViewEvent {
        public static final ClockOutConfirmContinueClicked INSTANCE = new ClockOutConfirmContinueClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClockOutConfirmContinueClicked);
        }

        public final int hashCode() {
            return 2000548970;
        }

        public final String toString() {
            return "ClockOutConfirmContinueClicked";
        }
    }

    public final class DeclareCashTipClockOutClicked implements ClockInOverlayViewEvent {
        public final String amountText;

        public DeclareCashTipClockOutClicked(String str) {
            str.getClass();
            this.amountText = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeclareCashTipClockOutClicked) && Intrinsics.areEqual(this.amountText, ((DeclareCashTipClockOutClicked) obj).amountText);
        }

        public final int hashCode() {
            return this.amountText.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DeclareCashTipClockOutClicked(amountText=", this.amountText, ")");
        }
    }

    public final class Dismiss implements ClockInOverlayViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 1419182208;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class EndBreakClicked implements ClockInOverlayViewEvent {
        public static final EndBreakClicked INSTANCE = new EndBreakClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EndBreakClicked);
        }

        public final int hashCode() {
            return -481171815;
        }

        public final String toString() {
            return "EndBreakClicked";
        }
    }

    public final class ErrorDialogDismissed implements ClockInOverlayViewEvent {
        public static final ErrorDialogDismissed INSTANCE = new ErrorDialogDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ErrorDialogDismissed);
        }

        public final int hashCode() {
            return -1686241565;
        }

        public final String toString() {
            return "ErrorDialogDismissed";
        }
    }

    public final class JobClicked implements ClockInOverlayViewEvent {
        public static final JobClicked INSTANCE = new JobClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof JobClicked);
        }

        public final int hashCode() {
            return 1953018868;
        }

        public final String toString() {
            return "JobClicked";
        }
    }

    public final class JobSelected implements ClockInOverlayViewEvent {
        public final JobIdentifier jobIdentifier;

        public JobSelected(JobIdentifier jobIdentifier) {
            jobIdentifier.getClass();
            this.jobIdentifier = jobIdentifier;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof JobSelected) && Intrinsics.areEqual(this.jobIdentifier, ((JobSelected) obj).jobIdentifier);
        }

        public final int hashCode() {
            return this.jobIdentifier.token.hashCode();
        }

        public final String toString() {
            return "JobSelected(jobIdentifier=" + this.jobIdentifier + ")";
        }
    }

    public final class LocationClicked implements ClockInOverlayViewEvent {
        public static final LocationClicked INSTANCE = new LocationClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LocationClicked);
        }

        public final int hashCode() {
            return -2004854104;
        }

        public final String toString() {
            return "LocationClicked";
        }
    }

    public final class LocationSelected implements ClockInOverlayViewEvent {
        public final LocationIdentifier locationIdentifier;

        public LocationSelected(LocationIdentifier locationIdentifier) {
            locationIdentifier.getClass();
            this.locationIdentifier = locationIdentifier;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocationSelected) && Intrinsics.areEqual(this.locationIdentifier, ((LocationSelected) obj).locationIdentifier);
        }

        public final int hashCode() {
            return this.locationIdentifier.token.hashCode();
        }

        public final String toString() {
            return "LocationSelected(locationIdentifier=" + this.locationIdentifier + ")";
        }
    }

    public final class OpenAppSettingsClicked implements ClockInOverlayViewEvent {
        public static final OpenAppSettingsClicked INSTANCE = new OpenAppSettingsClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenAppSettingsClicked);
        }

        public final int hashCode() {
            return -2000121513;
        }

        public final String toString() {
            return "OpenAppSettingsClicked";
        }
    }

    public final class StartBreakClicked implements ClockInOverlayViewEvent {
        public final ClockInOverlayViewModel.BreakIdentifier identifier;

        public StartBreakClicked(ClockInOverlayViewModel.BreakIdentifier breakIdentifier) {
            breakIdentifier.getClass();
            this.identifier = breakIdentifier;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartBreakClicked) && Intrinsics.areEqual(this.identifier, ((StartBreakClicked) obj).identifier);
        }

        public final int hashCode() {
            return this.identifier.hashCode();
        }

        public final String toString() {
            return "StartBreakClicked(identifier=" + this.identifier + ")";
        }
    }

    public final class TakeBreakClicked implements ClockInOverlayViewEvent {
        public static final TakeBreakClicked INSTANCE = new TakeBreakClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TakeBreakClicked);
        }

        public final int hashCode() {
            return -472678631;
        }

        public final String toString() {
            return "TakeBreakClicked";
        }
    }
}
