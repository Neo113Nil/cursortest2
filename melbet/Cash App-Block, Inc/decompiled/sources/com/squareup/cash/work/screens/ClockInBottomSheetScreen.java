package com.squareup.cash.work.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.work.screens.WorkHomeScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ClockInBottomSheetScreen implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<ClockInBottomSheetScreen> CREATOR = new WorkHomeScreen.Creator(6);
    public final AskedQuestion askedQuestion;
    public final boolean canEnforceEarlyOrUnscheduledClockIn;
    public final boolean canUseGeofencing;
    public final String employeeToken;
    public final boolean hasOverridePermission;
    public final ArrayList jobs;
    public final ArrayList locationControls;
    public final ArrayList locationCoordinates;
    public final ArrayList locations;
    public final String merchantName;
    public final String merchantToken;
    public final String scheduledJobToken;
    public final String scheduledLocationToken;
    public final String shiftPublishedVersionToken;
    public final String shiftStartDatetime;
    public final String shiftStopDatetime;
    public final String shiftToken;

    /* loaded from: classes7.dex */
    public final class JobInfo implements Parcelable {
        public static final Parcelable.Creator<JobInfo> CREATOR = new WorkHomeScreen.Creator(7);
        public final String title;
        public final String token;

        public JobInfo(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.token = str;
            this.title = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof JobInfo)) {
                return false;
            }
            JobInfo jobInfo = (JobInfo) obj;
            return Intrinsics.areEqual(this.token, jobInfo.token) && Intrinsics.areEqual(this.title, jobInfo.title);
        }

        public final int hashCode() {
            return this.title.hashCode() + (this.token.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("JobInfo(token=", this.token, ", title=", this.title, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.token);
            parcel.writeString(this.title);
        }
    }

    /* loaded from: classes7.dex */
    public final class LocationCoordinates implements Parcelable {
        public static final Parcelable.Creator<LocationCoordinates> CREATOR = new WorkHomeScreen.Creator(8);
        public final Double latitude;
        public final Double longitude;
        public final String token;

        public LocationCoordinates(String str, Double d, Double d2) {
            str.getClass();
            this.token = str;
            this.latitude = d;
            this.longitude = d2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocationCoordinates)) {
                return false;
            }
            LocationCoordinates locationCoordinates = (LocationCoordinates) obj;
            return Intrinsics.areEqual(this.token, locationCoordinates.token) && Intrinsics.areEqual((Object) this.latitude, (Object) locationCoordinates.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) locationCoordinates.longitude);
        }

        public final int hashCode() {
            int hashCode = this.token.hashCode() * 31;
            Double d = this.latitude;
            int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
            Double d2 = this.longitude;
            return hashCode2 + (d2 != null ? d2.hashCode() : 0);
        }

        public final String toString() {
            return "LocationCoordinates(token=" + this.token + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.token);
            Double d = this.latitude;
            if (d == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeDouble(d.doubleValue());
            }
            Double d2 = this.longitude;
            if (d2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeDouble(d2.doubleValue());
            }
        }
    }

    /* loaded from: classes7.dex */
    public final class LocationInfo implements Parcelable {
        public static final Parcelable.Creator<LocationInfo> CREATOR = new WorkHomeScreen.Creator(9);
        public final String name;
        public final String token;

        public LocationInfo(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.token = str;
            this.name = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocationInfo)) {
                return false;
            }
            LocationInfo locationInfo = (LocationInfo) obj;
            return Intrinsics.areEqual(this.token, locationInfo.token) && Intrinsics.areEqual(this.name, locationInfo.name);
        }

        public final int hashCode() {
            return this.name.hashCode() + (this.token.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("LocationInfo(token=", this.token, ", name=", this.name, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.token);
            parcel.writeString(this.name);
        }
    }

    public ClockInBottomSheetScreen(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, ArrayList arrayList3, boolean z3, ArrayList arrayList4, AskedQuestion askedQuestion) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.employeeToken = str;
        this.merchantToken = str2;
        this.merchantName = str3;
        this.jobs = arrayList;
        this.locations = arrayList2;
        this.scheduledJobToken = str4;
        this.scheduledLocationToken = str5;
        this.shiftToken = str6;
        this.shiftPublishedVersionToken = str7;
        this.shiftStartDatetime = str8;
        this.shiftStopDatetime = str9;
        this.hasOverridePermission = z;
        this.canEnforceEarlyOrUnscheduledClockIn = z2;
        this.locationControls = arrayList3;
        this.canUseGeofencing = z3;
        this.locationCoordinates = arrayList4;
        this.askedQuestion = askedQuestion;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClockInBottomSheetScreen)) {
            return false;
        }
        ClockInBottomSheetScreen clockInBottomSheetScreen = (ClockInBottomSheetScreen) obj;
        return Intrinsics.areEqual(this.employeeToken, clockInBottomSheetScreen.employeeToken) && Intrinsics.areEqual(this.merchantToken, clockInBottomSheetScreen.merchantToken) && Intrinsics.areEqual(this.merchantName, clockInBottomSheetScreen.merchantName) && this.jobs.equals(clockInBottomSheetScreen.jobs) && this.locations.equals(clockInBottomSheetScreen.locations) && Intrinsics.areEqual(this.scheduledJobToken, clockInBottomSheetScreen.scheduledJobToken) && Intrinsics.areEqual(this.scheduledLocationToken, clockInBottomSheetScreen.scheduledLocationToken) && Intrinsics.areEqual(this.shiftToken, clockInBottomSheetScreen.shiftToken) && Intrinsics.areEqual(this.shiftPublishedVersionToken, clockInBottomSheetScreen.shiftPublishedVersionToken) && Intrinsics.areEqual(this.shiftStartDatetime, clockInBottomSheetScreen.shiftStartDatetime) && Intrinsics.areEqual(this.shiftStopDatetime, clockInBottomSheetScreen.shiftStopDatetime) && this.hasOverridePermission == clockInBottomSheetScreen.hasOverridePermission && this.canEnforceEarlyOrUnscheduledClockIn == clockInBottomSheetScreen.canEnforceEarlyOrUnscheduledClockIn && this.locationControls.equals(clockInBottomSheetScreen.locationControls) && this.canUseGeofencing == clockInBottomSheetScreen.canUseGeofencing && this.locationCoordinates.equals(clockInBottomSheetScreen.locationCoordinates) && Intrinsics.areEqual(this.askedQuestion, clockInBottomSheetScreen.askedQuestion);
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.locations, CameraState$Type$EnumUnboxingLocalUtility.m(this.jobs, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.employeeToken.hashCode() * 31, 31, this.merchantToken), 31, this.merchantName), 31), 31);
        String str = this.scheduledJobToken;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scheduledLocationToken;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shiftToken;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.shiftPublishedVersionToken;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.shiftStartDatetime;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.shiftStopDatetime;
        int m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.locationCoordinates, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.locationControls, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.hasOverridePermission), 31, this.canEnforceEarlyOrUnscheduledClockIn), 31), 31, this.canUseGeofencing), 31);
        AskedQuestion askedQuestion = this.askedQuestion;
        return m2 + (askedQuestion != null ? askedQuestion.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClockInBottomSheetScreen(employeeToken=", this.employeeToken, ", merchantToken=", this.merchantToken, ", merchantName=");
        m.append(this.merchantName);
        m.append(", jobs=");
        m.append(this.jobs);
        m.append(", locations=");
        m.append(this.locations);
        m.append(", scheduledJobToken=");
        m.append(this.scheduledJobToken);
        m.append(", scheduledLocationToken=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.scheduledLocationToken, ", shiftToken=", this.shiftToken, ", shiftPublishedVersionToken=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.shiftPublishedVersionToken, ", shiftStartDatetime=", this.shiftStartDatetime, ", shiftStopDatetime=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.shiftStopDatetime, ", hasOverridePermission=", this.hasOverridePermission, ", canEnforceEarlyOrUnscheduledClockIn=");
        m.append(this.canEnforceEarlyOrUnscheduledClockIn);
        m.append(", locationControls=");
        m.append(this.locationControls);
        m.append(", canUseGeofencing=");
        m.append(this.canUseGeofencing);
        m.append(", locationCoordinates=");
        m.append(this.locationCoordinates);
        m.append(", askedQuestion=");
        m.append(this.askedQuestion);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.employeeToken);
        parcel.writeString(this.merchantToken);
        parcel.writeString(this.merchantName);
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.jobs, parcel);
        while (m.hasNext()) {
            ((JobInfo) m.next()).writeToParcel(parcel, i);
        }
        Iterator m2 = NavAction$$ExternalSyntheticOutline0.m(this.locations, parcel);
        while (m2.hasNext()) {
            ((LocationInfo) m2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.scheduledJobToken);
        parcel.writeString(this.scheduledLocationToken);
        parcel.writeString(this.shiftToken);
        parcel.writeString(this.shiftPublishedVersionToken);
        parcel.writeString(this.shiftStartDatetime);
        parcel.writeString(this.shiftStopDatetime);
        parcel.writeInt(this.hasOverridePermission ? 1 : 0);
        parcel.writeInt(this.canEnforceEarlyOrUnscheduledClockIn ? 1 : 0);
        Iterator m3 = NavAction$$ExternalSyntheticOutline0.m(this.locationControls, parcel);
        while (m3.hasNext()) {
            ((LocationClockInControls) m3.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.canUseGeofencing ? 1 : 0);
        Iterator m4 = NavAction$$ExternalSyntheticOutline0.m(this.locationCoordinates, parcel);
        while (m4.hasNext()) {
            ((LocationCoordinates) m4.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.askedQuestion, i);
    }
}
