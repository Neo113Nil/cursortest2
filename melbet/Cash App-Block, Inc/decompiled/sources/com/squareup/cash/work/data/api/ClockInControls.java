package com.squareup.cash.work.data.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ClockInControls {
    public final boolean canClockInFromTeamApp;
    public final boolean canEnforceEarlyBreakCompletion;
    public final boolean canEnforceEarlyOrUnscheduledClockIn;
    public final boolean canUseAutoClockOut;
    public final boolean canUseGeofencing;
    public final boolean hasOverridePermission;
    public final LinkedHashMap locationScopedControls;

    public ClockInControls(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, LinkedHashMap linkedHashMap) {
        this.canClockInFromTeamApp = z;
        this.canEnforceEarlyOrUnscheduledClockIn = z2;
        this.canEnforceEarlyBreakCompletion = z3;
        this.canUseAutoClockOut = z4;
        this.canUseGeofencing = z5;
        this.hasOverridePermission = z6;
        this.locationScopedControls = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClockInControls)) {
            return false;
        }
        ClockInControls clockInControls = (ClockInControls) obj;
        return this.canClockInFromTeamApp == clockInControls.canClockInFromTeamApp && this.canEnforceEarlyOrUnscheduledClockIn == clockInControls.canEnforceEarlyOrUnscheduledClockIn && this.canEnforceEarlyBreakCompletion == clockInControls.canEnforceEarlyBreakCompletion && this.canUseAutoClockOut == clockInControls.canUseAutoClockOut && this.canUseGeofencing == clockInControls.canUseGeofencing && this.hasOverridePermission == clockInControls.hasOverridePermission && this.locationScopedControls.equals(clockInControls.locationScopedControls);
    }

    public final LocationScopedClockInControls get(String str) {
        str.getClass();
        return (LocationScopedClockInControls) this.locationScopedControls.getOrDefault(str, new LocationScopedClockInControls(false, false, null, null, 0.0d, 511));
    }

    public final int hashCode() {
        return this.locationScopedControls.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.canClockInFromTeamApp) * 31, 31, this.canEnforceEarlyOrUnscheduledClockIn), 31, this.canEnforceEarlyBreakCompletion), 31, this.canUseAutoClockOut), 31, this.canUseGeofencing), 31, this.hasOverridePermission);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("ClockInControls(canClockInFromTeamApp=", ", canEnforceEarlyOrUnscheduledClockIn=", ", canEnforceEarlyBreakCompletion=", this.canClockInFromTeamApp, this.canEnforceEarlyOrUnscheduledClockIn);
        re$$ExternalSyntheticOutline0.m(m, this.canEnforceEarlyBreakCompletion, ", canUseAutoClockOut=", this.canUseAutoClockOut, ", canUseGeofencing=");
        re$$ExternalSyntheticOutline0.m(m, this.canUseGeofencing, ", hasOverridePermission=", this.hasOverridePermission, ", locationScopedControls=");
        m.append(this.locationScopedControls);
        m.append(")");
        return m.toString();
    }
}
