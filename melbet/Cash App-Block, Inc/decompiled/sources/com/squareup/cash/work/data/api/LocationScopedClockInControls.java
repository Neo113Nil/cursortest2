package com.squareup.cash.work.data.api;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* loaded from: classes7.dex */
public final class LocationScopedClockInControls {
    public final long autoClockOutBuffer;
    public final Instant earlyClockInBoundaryBegin;
    public final Instant earlyClockInBoundaryEnd;
    public final double geofenceRadiusInMeters;
    public final boolean isAutoClockOutEnabled;
    public final boolean isCashTipEnabled;
    public final boolean isEarlyAndUnscheduledClockInBlocked;
    public final boolean isEndBreakEarlyBlocked;
    public final boolean isGeofencingEnabled;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LocationScopedClockInControls(boolean z, boolean z2, Instant instant, Instant instant2, double d, int i) {
        this(false, r5, false, false, r8, r9, r10, 0L, (i & 256) != 0 ? 0.0d : d);
        Instant instant3;
        Instant instant4;
        boolean z3 = (i & 2) != 0 ? false : z;
        boolean z4 = (i & 16) != 0 ? false : z2;
        if ((i & 32) != 0) {
            Instant instant5 = Instant.MIN;
            instant5.getClass();
            instant3 = instant5;
        } else {
            instant3 = instant;
        }
        if ((i & 64) != 0) {
            Instant instant6 = Instant.MIN;
            instant6.getClass();
            instant4 = instant6;
        } else {
            instant4 = instant2;
        }
        Duration.Companion.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationScopedClockInControls)) {
            return false;
        }
        LocationScopedClockInControls locationScopedClockInControls = (LocationScopedClockInControls) obj;
        return this.isCashTipEnabled == locationScopedClockInControls.isCashTipEnabled && this.isGeofencingEnabled == locationScopedClockInControls.isGeofencingEnabled && this.isAutoClockOutEnabled == locationScopedClockInControls.isAutoClockOutEnabled && this.isEndBreakEarlyBlocked == locationScopedClockInControls.isEndBreakEarlyBlocked && this.isEarlyAndUnscheduledClockInBlocked == locationScopedClockInControls.isEarlyAndUnscheduledClockInBlocked && Intrinsics.areEqual(this.earlyClockInBoundaryBegin, locationScopedClockInControls.earlyClockInBoundaryBegin) && Intrinsics.areEqual(this.earlyClockInBoundaryEnd, locationScopedClockInControls.earlyClockInBoundaryEnd) && Duration.m4166equalsimpl0(this.autoClockOutBuffer, locationScopedClockInControls.autoClockOutBuffer) && Double.compare(this.geofenceRadiusInMeters, locationScopedClockInControls.geofenceRadiusInMeters) == 0;
    }

    public final int hashCode() {
        int hashCode = (this.earlyClockInBoundaryEnd.hashCode() + ((this.earlyClockInBoundaryBegin.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.isCashTipEnabled) * 31, 31, this.isGeofencingEnabled), 31, this.isAutoClockOutEnabled), 31, this.isEndBreakEarlyBlocked), 31, this.isEarlyAndUnscheduledClockInBlocked)) * 31)) * 31;
        Duration.Companion companion = Duration.Companion;
        return Double.hashCode(this.geofenceRadiusInMeters) + Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.autoClockOutBuffer);
    }

    public final String toString() {
        String m4177toStringimpl = Duration.m4177toStringimpl(this.autoClockOutBuffer);
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("LocationScopedClockInControls(isCashTipEnabled=", ", isGeofencingEnabled=", ", isAutoClockOutEnabled=", this.isCashTipEnabled, this.isGeofencingEnabled);
        re$$ExternalSyntheticOutline0.m(m, this.isAutoClockOutEnabled, ", isEndBreakEarlyBlocked=", this.isEndBreakEarlyBlocked, ", isEarlyAndUnscheduledClockInBlocked=");
        m.append(this.isEarlyAndUnscheduledClockInBlocked);
        m.append(", earlyClockInBoundaryBegin=");
        m.append(this.earlyClockInBoundaryBegin);
        m.append(", earlyClockInBoundaryEnd=");
        m.append(this.earlyClockInBoundaryEnd);
        m.append(", autoClockOutBuffer=");
        m.append(m4177toStringimpl);
        m.append(", geofenceRadiusInMeters=");
        return NavAction$$ExternalSyntheticOutline0.m(m, this.geofenceRadiusInMeters, ")");
    }

    public LocationScopedClockInControls(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Instant instant, Instant instant2, long j, double d) {
        instant.getClass();
        instant2.getClass();
        this.isCashTipEnabled = z;
        this.isGeofencingEnabled = z2;
        this.isAutoClockOutEnabled = z3;
        this.isEndBreakEarlyBlocked = z4;
        this.isEarlyAndUnscheduledClockInBlocked = z5;
        this.earlyClockInBoundaryBegin = instant;
        this.earlyClockInBoundaryEnd = instant2;
        this.autoClockOutBuffer = j;
        this.geofenceRadiusInMeters = d;
    }
}
