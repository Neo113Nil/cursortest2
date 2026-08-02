package com.squareup.cash.work.data.api;

import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.protos.timecards.Timecard;
import com.squareup.protos.timecards.TimecardBreak;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface MerchantClockInStatus {

    public final class ClockedIn implements MerchantClockInStatus {
        public final MerchantIdentifier merchantIdentifier;
        public final ShiftSchedule shift;
        public final Timecard timecard;

        public ClockedIn(MerchantIdentifier merchantIdentifier, Timecard timecard, ShiftSchedule shiftSchedule) {
            merchantIdentifier.getClass();
            timecard.getClass();
            this.merchantIdentifier = merchantIdentifier;
            this.timecard = timecard;
            this.shift = shiftSchedule;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClockedIn)) {
                return false;
            }
            ClockedIn clockedIn = (ClockedIn) obj;
            return Intrinsics.areEqual(this.merchantIdentifier, clockedIn.merchantIdentifier) && Intrinsics.areEqual(this.timecard, clockedIn.timecard) && Intrinsics.areEqual(this.shift, clockedIn.shift);
        }

        @Override // com.squareup.cash.work.data.api.MerchantClockInStatus
        public final MerchantIdentifier getMerchantIdentifier() {
            return this.merchantIdentifier;
        }

        public final int hashCode() {
            int hashCode = (this.timecard.hashCode() + (this.merchantIdentifier.token.hashCode() * 31)) * 31;
            ShiftSchedule shiftSchedule = this.shift;
            return hashCode + (shiftSchedule == null ? 0 : shiftSchedule.hashCode());
        }

        public final String toString() {
            return "ClockedIn(merchantIdentifier=" + this.merchantIdentifier + ", timecard=" + this.timecard + ", shift=" + this.shift + ")";
        }
    }

    public final class ClockedOut implements MerchantClockInStatus {
        public final MerchantIdentifier merchantIdentifier;
        public final ShiftSchedule nextShift;

        public ClockedOut(MerchantIdentifier merchantIdentifier, ShiftSchedule shiftSchedule) {
            merchantIdentifier.getClass();
            this.merchantIdentifier = merchantIdentifier;
            this.nextShift = shiftSchedule;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClockedOut)) {
                return false;
            }
            ClockedOut clockedOut = (ClockedOut) obj;
            return Intrinsics.areEqual(this.merchantIdentifier, clockedOut.merchantIdentifier) && Intrinsics.areEqual(this.nextShift, clockedOut.nextShift);
        }

        @Override // com.squareup.cash.work.data.api.MerchantClockInStatus
        public final MerchantIdentifier getMerchantIdentifier() {
            return this.merchantIdentifier;
        }

        public final int hashCode() {
            int hashCode = this.merchantIdentifier.token.hashCode() * 31;
            ShiftSchedule shiftSchedule = this.nextShift;
            return hashCode + (shiftSchedule == null ? 0 : shiftSchedule.hashCode());
        }

        public final String toString() {
            return "ClockedOut(merchantIdentifier=" + this.merchantIdentifier + ", nextShift=" + this.nextShift + ")";
        }
    }

    public final class OnBreak implements MerchantClockInStatus {
        public final TimecardBreak activeBreak;
        public final MerchantIdentifier merchantIdentifier;
        public final ShiftSchedule shift;
        public final Timecard timecard;

        public OnBreak(MerchantIdentifier merchantIdentifier, Timecard timecard, ShiftSchedule shiftSchedule, TimecardBreak timecardBreak) {
            merchantIdentifier.getClass();
            timecard.getClass();
            this.merchantIdentifier = merchantIdentifier;
            this.timecard = timecard;
            this.shift = shiftSchedule;
            this.activeBreak = timecardBreak;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBreak)) {
                return false;
            }
            OnBreak onBreak = (OnBreak) obj;
            return Intrinsics.areEqual(this.merchantIdentifier, onBreak.merchantIdentifier) && Intrinsics.areEqual(this.timecard, onBreak.timecard) && Intrinsics.areEqual(this.shift, onBreak.shift) && this.activeBreak.equals(onBreak.activeBreak);
        }

        @Override // com.squareup.cash.work.data.api.MerchantClockInStatus
        public final MerchantIdentifier getMerchantIdentifier() {
            return this.merchantIdentifier;
        }

        public final int hashCode() {
            int hashCode = (this.timecard.hashCode() + (this.merchantIdentifier.token.hashCode() * 31)) * 31;
            ShiftSchedule shiftSchedule = this.shift;
            return this.activeBreak.hashCode() + ((hashCode + (shiftSchedule == null ? 0 : shiftSchedule.hashCode())) * 31);
        }

        public final String toString() {
            return "OnBreak(merchantIdentifier=" + this.merchantIdentifier + ", timecard=" + this.timecard + ", shift=" + this.shift + ", activeBreak=" + this.activeBreak + ")";
        }
    }

    MerchantIdentifier getMerchantIdentifier();
}
