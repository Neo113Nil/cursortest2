package com.squareup.cash.work.data.real;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* loaded from: classes7.dex */
public final class LocationSettings {
    public final Duration autoClockOutBuffer;
    public final boolean canDeclareCashTips;
    public final Duration earlyBreakCompletionBuffer;
    public final Duration earlyClockInBuffer;
    public final Double geofenceRadiusInMeters;
    public final long minScheduledShiftBuffer;

    public LocationSettings(boolean z, Duration duration, Duration duration2, Duration duration3, long j, Double d) {
        this.canDeclareCashTips = z;
        this.autoClockOutBuffer = duration;
        this.earlyClockInBuffer = duration2;
        this.earlyBreakCompletionBuffer = duration3;
        this.minScheduledShiftBuffer = j;
        this.geofenceRadiusInMeters = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationSettings)) {
            return false;
        }
        LocationSettings locationSettings = (LocationSettings) obj;
        return this.canDeclareCashTips == locationSettings.canDeclareCashTips && Intrinsics.areEqual(this.autoClockOutBuffer, locationSettings.autoClockOutBuffer) && Intrinsics.areEqual(this.earlyClockInBuffer, locationSettings.earlyClockInBuffer) && Intrinsics.areEqual(this.earlyBreakCompletionBuffer, locationSettings.earlyBreakCompletionBuffer) && Duration.m4166equalsimpl0(this.minScheduledShiftBuffer, locationSettings.minScheduledShiftBuffer) && Intrinsics.areEqual((Object) this.geofenceRadiusInMeters, (Object) locationSettings.geofenceRadiusInMeters);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.canDeclareCashTips) * 31;
        Duration duration = this.autoClockOutBuffer;
        int hashCode2 = (hashCode + (duration == null ? 0 : Long.hashCode(duration.rawValue))) * 31;
        Duration duration2 = this.earlyClockInBuffer;
        int hashCode3 = (hashCode2 + (duration2 == null ? 0 : Long.hashCode(duration2.rawValue))) * 31;
        Duration duration3 = this.earlyBreakCompletionBuffer;
        int hashCode4 = (hashCode3 + (duration3 == null ? 0 : Long.hashCode(duration3.rawValue))) * 31;
        Duration.Companion companion = Duration.Companion;
        int m = Recorder$$ExternalSyntheticOutline2.m(hashCode4, 31, this.minScheduledShiftBuffer);
        Double d = this.geofenceRadiusInMeters;
        return m + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        return "LocationSettings(canDeclareCashTips=" + this.canDeclareCashTips + ", autoClockOutBuffer=" + this.autoClockOutBuffer + ", earlyClockInBuffer=" + this.earlyClockInBuffer + ", earlyBreakCompletionBuffer=" + this.earlyBreakCompletionBuffer + ", minScheduledShiftBuffer=" + Duration.m4177toStringimpl(this.minScheduledShiftBuffer) + ", geofenceRadiusInMeters=" + this.geofenceRadiusInMeters + ")";
    }
}
