package com.squareup.cash.work.applets.presenters;

import com.squareup.protos.timecards.Timecard;
import com.squareup.protos.timecards.TimecardBreak;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ShiftsTileState {

    public final class Error implements ShiftsTileState {
        public final String message;

        public Error(String str) {
            this.message = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.message.equals(((Error) obj).message);
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(message=", this.message, ")");
        }
    }

    public interface Loaded extends ShiftsTileState {

        public final class ClockedIn implements Loaded {
            public final Instant clockInTime;
            public final ShiftsTileMerchantDisplayData merchantData;
            public final ShiftSchedule shift;
            public final Timecard timecard;

            public ClockedIn(ShiftsTileMerchantDisplayData shiftsTileMerchantDisplayData, Timecard timecard, ShiftSchedule shiftSchedule, Instant instant) {
                timecard.getClass();
                this.merchantData = shiftsTileMerchantDisplayData;
                this.timecard = timecard;
                this.shift = shiftSchedule;
                this.clockInTime = instant;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClockedIn)) {
                    return false;
                }
                ClockedIn clockedIn = (ClockedIn) obj;
                return this.merchantData.equals(clockedIn.merchantData) && Intrinsics.areEqual(this.timecard, clockedIn.timecard) && Intrinsics.areEqual(this.shift, clockedIn.shift) && this.clockInTime.equals(clockedIn.clockInTime);
            }

            @Override // com.squareup.cash.work.applets.presenters.ShiftsTileState.Loaded
            public final ShiftsTileMerchantDisplayData getMerchantData() {
                return this.merchantData;
            }

            public final int hashCode() {
                int hashCode = (this.timecard.hashCode() + (this.merchantData.hashCode() * 31)) * 31;
                ShiftSchedule shiftSchedule = this.shift;
                return this.clockInTime.hashCode() + ((hashCode + (shiftSchedule == null ? 0 : shiftSchedule.hashCode())) * 31);
            }

            public final String toString() {
                return "ClockedIn(merchantData=" + this.merchantData + ", timecard=" + this.timecard + ", shift=" + this.shift + ", clockInTime=" + this.clockInTime + ")";
            }
        }

        public final class ClockedOut implements Loaded {
            public final ShiftsTileMerchantDisplayData merchantData;
            public final UpcomingShiftData upcomingShift;

            public ClockedOut(ShiftsTileMerchantDisplayData shiftsTileMerchantDisplayData, UpcomingShiftData upcomingShiftData) {
                this.merchantData = shiftsTileMerchantDisplayData;
                this.upcomingShift = upcomingShiftData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClockedOut)) {
                    return false;
                }
                ClockedOut clockedOut = (ClockedOut) obj;
                return this.merchantData.equals(clockedOut.merchantData) && Intrinsics.areEqual(this.upcomingShift, clockedOut.upcomingShift);
            }

            @Override // com.squareup.cash.work.applets.presenters.ShiftsTileState.Loaded
            public final ShiftsTileMerchantDisplayData getMerchantData() {
                return this.merchantData;
            }

            public final int hashCode() {
                int hashCode = this.merchantData.hashCode() * 31;
                UpcomingShiftData upcomingShiftData = this.upcomingShift;
                return hashCode + (upcomingShiftData == null ? 0 : upcomingShiftData.hashCode());
            }

            public final String toString() {
                return "ClockedOut(merchantData=" + this.merchantData + ", upcomingShift=" + this.upcomingShift + ")";
            }
        }

        public final class NoShiftsFunctionality implements Loaded {
            public final ShiftsTileMerchantDisplayData merchantData;

            public NoShiftsFunctionality(ShiftsTileMerchantDisplayData shiftsTileMerchantDisplayData) {
                this.merchantData = shiftsTileMerchantDisplayData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NoShiftsFunctionality) && this.merchantData.equals(((NoShiftsFunctionality) obj).merchantData);
            }

            @Override // com.squareup.cash.work.applets.presenters.ShiftsTileState.Loaded
            public final ShiftsTileMerchantDisplayData getMerchantData() {
                return this.merchantData;
            }

            public final int hashCode() {
                return this.merchantData.hashCode();
            }

            public final String toString() {
                return "NoShiftsFunctionality(merchantData=" + this.merchantData + ")";
            }
        }

        public final class OnBreak implements Loaded {
            public final TimecardBreak activeBreak;
            public final Instant breakStartTime;
            public final Instant clockInTime;
            public final ShiftsTileMerchantDisplayData merchantData;
            public final ShiftSchedule shift;
            public final Timecard timecard;

            public OnBreak(ShiftsTileMerchantDisplayData shiftsTileMerchantDisplayData, Timecard timecard, ShiftSchedule shiftSchedule, TimecardBreak timecardBreak, Instant instant, Instant instant2) {
                timecard.getClass();
                instant2.getClass();
                this.merchantData = shiftsTileMerchantDisplayData;
                this.timecard = timecard;
                this.shift = shiftSchedule;
                this.activeBreak = timecardBreak;
                this.clockInTime = instant;
                this.breakStartTime = instant2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OnBreak)) {
                    return false;
                }
                OnBreak onBreak = (OnBreak) obj;
                return this.merchantData.equals(onBreak.merchantData) && Intrinsics.areEqual(this.timecard, onBreak.timecard) && Intrinsics.areEqual(this.shift, onBreak.shift) && this.activeBreak.equals(onBreak.activeBreak) && this.clockInTime.equals(onBreak.clockInTime) && Intrinsics.areEqual(this.breakStartTime, onBreak.breakStartTime);
            }

            @Override // com.squareup.cash.work.applets.presenters.ShiftsTileState.Loaded
            public final ShiftsTileMerchantDisplayData getMerchantData() {
                return this.merchantData;
            }

            public final int hashCode() {
                int hashCode = (this.timecard.hashCode() + (this.merchantData.hashCode() * 31)) * 31;
                ShiftSchedule shiftSchedule = this.shift;
                return this.breakStartTime.hashCode() + ((this.clockInTime.hashCode() + ((this.activeBreak.hashCode() + ((hashCode + (shiftSchedule == null ? 0 : shiftSchedule.hashCode())) * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "OnBreak(merchantData=" + this.merchantData + ", timecard=" + this.timecard + ", shift=" + this.shift + ", activeBreak=" + this.activeBreak + ", clockInTime=" + this.clockInTime + ", breakStartTime=" + this.breakStartTime + ")";
            }
        }

        ShiftsTileMerchantDisplayData getMerchantData();
    }

    public final class Loading implements ShiftsTileState {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -919894211;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
