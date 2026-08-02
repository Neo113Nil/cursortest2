package com.squareup.cash.work.data.real;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShiftSettings {
    public final Map byLocationSettings;
    public final boolean canClockInFromTeamApp;

    public ShiftSettings(Map map, boolean z) {
        map.getClass();
        this.canClockInFromTeamApp = z;
        this.byLocationSettings = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftSettings)) {
            return false;
        }
        ShiftSettings shiftSettings = (ShiftSettings) obj;
        return this.canClockInFromTeamApp == shiftSettings.canClockInFromTeamApp && Intrinsics.areEqual(this.byLocationSettings, shiftSettings.byLocationSettings);
    }

    public final int hashCode() {
        return this.byLocationSettings.hashCode() + (Boolean.hashCode(this.canClockInFromTeamApp) * 31);
    }

    public final String toString() {
        return "ShiftSettings(canClockInFromTeamApp=" + this.canClockInFromTeamApp + ", byLocationSettings=" + this.byLocationSettings + ")";
    }
}
