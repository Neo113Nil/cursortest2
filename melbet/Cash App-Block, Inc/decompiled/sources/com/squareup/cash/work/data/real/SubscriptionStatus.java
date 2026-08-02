package com.squareup.cash.work.data.real;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class SubscriptionStatus {
    public final boolean canEnforceEarlyTimecardActions;
    public final boolean canUseAutoClockOut;
    public final boolean canUseGeofencing;

    public SubscriptionStatus(boolean z, boolean z2, boolean z3) {
        this.canEnforceEarlyTimecardActions = z;
        this.canUseAutoClockOut = z2;
        this.canUseGeofencing = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionStatus)) {
            return false;
        }
        SubscriptionStatus subscriptionStatus = (SubscriptionStatus) obj;
        return this.canEnforceEarlyTimecardActions == subscriptionStatus.canEnforceEarlyTimecardActions && this.canUseAutoClockOut == subscriptionStatus.canUseAutoClockOut && this.canUseGeofencing == subscriptionStatus.canUseGeofencing;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.canUseGeofencing) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.canEnforceEarlyTimecardActions) * 31, 31, this.canUseAutoClockOut);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("SubscriptionStatus(canEnforceEarlyTimecardActions=", ", canUseAutoClockOut=", ", canUseGeofencing=", this.canEnforceEarlyTimecardActions, this.canUseAutoClockOut), this.canUseGeofencing, ")");
    }
}
