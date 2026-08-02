package com.squareup.cash.work.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.work.screens.WorkHomeScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocationClockInControls implements Parcelable {
    public static final Parcelable.Creator<LocationClockInControls> CREATOR = new WorkHomeScreen.Creator(16);
    public final String earlyClockInBoundaryBegin;
    public final String earlyClockInBoundaryEnd;
    public final double geofenceRadiusInMeters;
    public final boolean isEarlyAndUnscheduledClockInBlocked;
    public final boolean isGeofencingEnabled;
    public final String token;

    public LocationClockInControls(String str, boolean z, String str2, String str3, boolean z2, double d) {
        str.getClass();
        this.token = str;
        this.isEarlyAndUnscheduledClockInBlocked = z;
        this.earlyClockInBoundaryBegin = str2;
        this.earlyClockInBoundaryEnd = str3;
        this.isGeofencingEnabled = z2;
        this.geofenceRadiusInMeters = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationClockInControls)) {
            return false;
        }
        LocationClockInControls locationClockInControls = (LocationClockInControls) obj;
        return Intrinsics.areEqual(this.token, locationClockInControls.token) && this.isEarlyAndUnscheduledClockInBlocked == locationClockInControls.isEarlyAndUnscheduledClockInBlocked && Intrinsics.areEqual(this.earlyClockInBoundaryBegin, locationClockInControls.earlyClockInBoundaryBegin) && Intrinsics.areEqual(this.earlyClockInBoundaryEnd, locationClockInControls.earlyClockInBoundaryEnd) && this.isGeofencingEnabled == locationClockInControls.isGeofencingEnabled && Double.compare(this.geofenceRadiusInMeters, locationClockInControls.geofenceRadiusInMeters) == 0;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.isEarlyAndUnscheduledClockInBlocked);
        String str = this.earlyClockInBoundaryBegin;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.earlyClockInBoundaryEnd;
        return Double.hashCode(this.geofenceRadiusInMeters) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.isGeofencingEnabled);
    }

    public final String toString() {
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("LocationClockInControls(token=", this.token, ", isEarlyAndUnscheduledClockInBlocked=", ", earlyClockInBoundaryBegin=", this.isEarlyAndUnscheduledClockInBlocked);
        Boxes$$ExternalSyntheticOutline1.m(m1540m, this.earlyClockInBoundaryBegin, ", earlyClockInBoundaryEnd=", this.earlyClockInBoundaryEnd, ", isGeofencingEnabled=");
        m1540m.append(this.isGeofencingEnabled);
        m1540m.append(", geofenceRadiusInMeters=");
        m1540m.append(this.geofenceRadiusInMeters);
        m1540m.append(")");
        return m1540m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeInt(this.isEarlyAndUnscheduledClockInBlocked ? 1 : 0);
        parcel.writeString(this.earlyClockInBoundaryBegin);
        parcel.writeString(this.earlyClockInBoundaryEnd);
        parcel.writeInt(this.isGeofencingEnabled ? 1 : 0);
        parcel.writeDouble(this.geofenceRadiusInMeters);
    }
}
