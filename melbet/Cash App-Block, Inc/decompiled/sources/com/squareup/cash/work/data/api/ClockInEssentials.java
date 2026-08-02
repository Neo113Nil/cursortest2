package com.squareup.cash.work.data.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.tinygraph.models.Job;
import com.squareup.cash.work.tinygraph.models.Location;
import com.squareup.cash.work.tinygraph.models.Person;
import com.squareup.protos.merchants.api.UserLocale;
import com.squareup.protos.timecards.AutomaticClockoutDetails;
import com.squareup.protos.timecards.Timecard;
import com.squareup.protos.timecards.TimecardBreak;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ClockInEssentials extends ClockInEssentialsState {

    public final class BasicInfo {
        public final Person.Name currentUserName;
        public final String employeeToken;
        public final MerchantIdentifier merchantIdentifier;
        public final UserLocale merchantLocale;
        public final String merchantName;

        public BasicInfo(String str, String str2, UserLocale userLocale, Person.Name name, MerchantIdentifier merchantIdentifier) {
            merchantIdentifier.getClass();
            this.merchantName = str;
            this.employeeToken = str2;
            this.merchantLocale = userLocale;
            this.currentUserName = name;
            this.merchantIdentifier = merchantIdentifier;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BasicInfo)) {
                return false;
            }
            BasicInfo basicInfo = (BasicInfo) obj;
            return this.merchantName.equals(basicInfo.merchantName) && this.employeeToken.equals(basicInfo.employeeToken) && this.merchantLocale.equals(basicInfo.merchantLocale) && Intrinsics.areEqual(this.currentUserName, basicInfo.currentUserName) && Intrinsics.areEqual(this.merchantIdentifier, basicInfo.merchantIdentifier);
        }

        public final int hashCode() {
            int hashCode = (this.merchantLocale.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.merchantName.hashCode() * 31, 31, this.employeeToken)) * 31;
            Person.Name name = this.currentUserName;
            return this.merchantIdentifier.token.hashCode() + ((hashCode + (name == null ? 0 : name.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BasicInfo(merchantName=", this.merchantName, ", employeeToken=", this.employeeToken, ", merchantLocale=");
            m.append(this.merchantLocale);
            m.append(", currentUserName=");
            m.append(this.currentUserName);
            m.append(", merchantIdentifier=");
            m.append(this.merchantIdentifier);
            m.append(")");
            return m.toString();
        }
    }

    public final class ClockedInEssentials implements ClockInEssentials {
        public final BasicInfo basicInfo;
        public final List breakDefinitions;
        public final ClockInControls clockInControls;
        public final ShiftSchedule shift;
        public final Timecard timecard;
        public final List timecardBreaks;

        public ClockedInEssentials(BasicInfo basicInfo, ClockInControls clockInControls, Timecard timecard, ShiftSchedule shiftSchedule, List list, List list2) {
            basicInfo.getClass();
            clockInControls.getClass();
            timecard.getClass();
            list.getClass();
            list2.getClass();
            this.basicInfo = basicInfo;
            this.clockInControls = clockInControls;
            this.timecard = timecard;
            this.shift = shiftSchedule;
            this.breakDefinitions = list;
            this.timecardBreaks = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClockedInEssentials)) {
                return false;
            }
            ClockedInEssentials clockedInEssentials = (ClockedInEssentials) obj;
            return Intrinsics.areEqual(this.basicInfo, clockedInEssentials.basicInfo) && Intrinsics.areEqual(this.clockInControls, clockedInEssentials.clockInControls) && Intrinsics.areEqual(this.timecard, clockedInEssentials.timecard) && Intrinsics.areEqual(this.shift, clockedInEssentials.shift) && Intrinsics.areEqual(this.breakDefinitions, clockedInEssentials.breakDefinitions) && Intrinsics.areEqual(this.timecardBreaks, clockedInEssentials.timecardBreaks);
        }

        @Override // com.squareup.cash.work.data.api.ClockInEssentials
        public final BasicInfo getBasicInfo() {
            return this.basicInfo;
        }

        @Override // com.squareup.cash.work.data.api.ClockInEssentials
        public final ClockInControls getClockInControls() {
            return this.clockInControls;
        }

        public final int hashCode() {
            int hashCode = (this.timecard.hashCode() + ((this.clockInControls.hashCode() + (this.basicInfo.hashCode() * 31)) * 31)) * 31;
            ShiftSchedule shiftSchedule = this.shift;
            return this.timecardBreaks.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode + (shiftSchedule == null ? 0 : shiftSchedule.hashCode())) * 31, 31, this.breakDefinitions);
        }

        public final String toString() {
            return "ClockedInEssentials(basicInfo=" + this.basicInfo + ", clockInControls=" + this.clockInControls + ", timecard=" + this.timecard + ", shift=" + this.shift + ", breakDefinitions=" + this.breakDefinitions + ", timecardBreaks=" + this.timecardBreaks + ")";
        }
    }

    public final class ClockedOutEssentials implements ClockInEssentials {
        public final List assignedJobs;
        public final AutomaticClockoutDetails automaticClockoutDetails;
        public final BasicInfo basicInfo;
        public final ClockInControls clockInControls;
        public final LinkedHashMap coordinates;
        public final String lastClockedInJobToken;
        public final String lastClockedInLocationToken;
        public final ArrayList locations;
        public final NextShift nextShift;

        public ClockedOutEssentials(BasicInfo basicInfo, ClockInControls clockInControls, List list, NextShift nextShift, ArrayList arrayList, String str, String str2, LinkedHashMap linkedHashMap, AutomaticClockoutDetails automaticClockoutDetails) {
            clockInControls.getClass();
            list.getClass();
            this.basicInfo = basicInfo;
            this.clockInControls = clockInControls;
            this.assignedJobs = list;
            this.nextShift = nextShift;
            this.locations = arrayList;
            this.lastClockedInJobToken = str;
            this.lastClockedInLocationToken = str2;
            this.coordinates = linkedHashMap;
            this.automaticClockoutDetails = automaticClockoutDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClockedOutEssentials)) {
                return false;
            }
            ClockedOutEssentials clockedOutEssentials = (ClockedOutEssentials) obj;
            return this.basicInfo.equals(clockedOutEssentials.basicInfo) && Intrinsics.areEqual(this.clockInControls, clockedOutEssentials.clockInControls) && Intrinsics.areEqual(this.assignedJobs, clockedOutEssentials.assignedJobs) && Intrinsics.areEqual(this.nextShift, clockedOutEssentials.nextShift) && this.locations.equals(clockedOutEssentials.locations) && Intrinsics.areEqual(this.lastClockedInJobToken, clockedOutEssentials.lastClockedInJobToken) && Intrinsics.areEqual(this.lastClockedInLocationToken, clockedOutEssentials.lastClockedInLocationToken) && this.coordinates.equals(clockedOutEssentials.coordinates) && Intrinsics.areEqual(this.automaticClockoutDetails, clockedOutEssentials.automaticClockoutDetails);
        }

        @Override // com.squareup.cash.work.data.api.ClockInEssentials
        public final BasicInfo getBasicInfo() {
            return this.basicInfo;
        }

        @Override // com.squareup.cash.work.data.api.ClockInEssentials
        public final ClockInControls getClockInControls() {
            return this.clockInControls;
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m((this.clockInControls.hashCode() + (this.basicInfo.hashCode() * 31)) * 31, 31, this.assignedJobs);
            NextShift nextShift = this.nextShift;
            int m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.locations, (m + (nextShift == null ? 0 : nextShift.hashCode())) * 31, 31);
            String str = this.lastClockedInJobToken;
            int hashCode = (m2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.lastClockedInLocationToken;
            int hashCode2 = (this.coordinates.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            AutomaticClockoutDetails automaticClockoutDetails = this.automaticClockoutDetails;
            return hashCode2 + (automaticClockoutDetails != null ? automaticClockoutDetails.hashCode() : 0);
        }

        public final String toString() {
            return "ClockedOutEssentials(basicInfo=" + this.basicInfo + ", clockInControls=" + this.clockInControls + ", assignedJobs=" + this.assignedJobs + ", nextShift=" + this.nextShift + ", locations=" + this.locations + ", lastClockedInJobToken=" + this.lastClockedInJobToken + ", lastClockedInLocationToken=" + this.lastClockedInLocationToken + ", coordinates=" + this.coordinates + ", automaticClockoutDetails=" + this.automaticClockoutDetails + ")";
        }
    }

    public final class NextShift {
        public final Job job;
        public final Location location;
        public final ShiftSchedule shift;
        public final Lazy startTime$delegate;

        public NextShift(ShiftSchedule shiftSchedule, Job job, Location location) {
            shiftSchedule.getClass();
            this.shift = shiftSchedule;
            this.job = job;
            this.location = location;
            this.startTime$delegate = LazyKt.lazy(new PageTagSlotKt$$ExternalSyntheticLambda0(this, 19));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NextShift)) {
                return false;
            }
            NextShift nextShift = (NextShift) obj;
            return Intrinsics.areEqual(this.shift, nextShift.shift) && Intrinsics.areEqual(this.job, nextShift.job) && Intrinsics.areEqual(this.location, nextShift.location);
        }

        public final int hashCode() {
            int hashCode = this.shift.hashCode() * 31;
            Job job = this.job;
            int hashCode2 = (hashCode + (job == null ? 0 : job.hashCode())) * 31;
            Location location = this.location;
            return hashCode2 + (location != null ? location.hashCode() : 0);
        }

        public final String toString() {
            return "NextShift(shift=" + this.shift + ", job=" + this.job + ", location=" + this.location + ")";
        }
    }

    public final class OnBreakEssentials implements ClockInEssentials {
        public final BasicInfo basicInfo;
        public final ClockInControls clockInControls;
        public final ShiftSchedule shift;
        public final Timecard timecard;
        public final TimecardBreak timecardBreak;
        public final List timecardBreaks;

        public OnBreakEssentials(BasicInfo basicInfo, ClockInControls clockInControls, Timecard timecard, ShiftSchedule shiftSchedule, TimecardBreak timecardBreak, List list) {
            basicInfo.getClass();
            clockInControls.getClass();
            timecard.getClass();
            timecardBreak.getClass();
            list.getClass();
            this.basicInfo = basicInfo;
            this.clockInControls = clockInControls;
            this.timecard = timecard;
            this.shift = shiftSchedule;
            this.timecardBreak = timecardBreak;
            this.timecardBreaks = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBreakEssentials)) {
                return false;
            }
            OnBreakEssentials onBreakEssentials = (OnBreakEssentials) obj;
            return Intrinsics.areEqual(this.basicInfo, onBreakEssentials.basicInfo) && Intrinsics.areEqual(this.clockInControls, onBreakEssentials.clockInControls) && Intrinsics.areEqual(this.timecard, onBreakEssentials.timecard) && Intrinsics.areEqual(this.shift, onBreakEssentials.shift) && Intrinsics.areEqual(this.timecardBreak, onBreakEssentials.timecardBreak) && Intrinsics.areEqual(this.timecardBreaks, onBreakEssentials.timecardBreaks);
        }

        @Override // com.squareup.cash.work.data.api.ClockInEssentials
        public final BasicInfo getBasicInfo() {
            return this.basicInfo;
        }

        @Override // com.squareup.cash.work.data.api.ClockInEssentials
        public final ClockInControls getClockInControls() {
            return this.clockInControls;
        }

        public final int hashCode() {
            int hashCode = (this.timecard.hashCode() + ((this.clockInControls.hashCode() + (this.basicInfo.hashCode() * 31)) * 31)) * 31;
            ShiftSchedule shiftSchedule = this.shift;
            return this.timecardBreaks.hashCode() + ((this.timecardBreak.hashCode() + ((hashCode + (shiftSchedule == null ? 0 : shiftSchedule.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            return "OnBreakEssentials(basicInfo=" + this.basicInfo + ", clockInControls=" + this.clockInControls + ", timecard=" + this.timecard + ", shift=" + this.shift + ", timecardBreak=" + this.timecardBreak + ", timecardBreaks=" + this.timecardBreaks + ")";
        }
    }

    BasicInfo getBasicInfo();

    ClockInControls getClockInControls();
}
