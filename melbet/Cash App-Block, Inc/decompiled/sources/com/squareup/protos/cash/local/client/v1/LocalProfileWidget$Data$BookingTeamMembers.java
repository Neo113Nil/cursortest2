package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.model.ActionEvent;
import com.squareup.protos.cash.local.client.v1.LocalProfileWidget;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalProfileWidget$Data$BookingTeamMembers extends ActionEvent.Companion {
    public final LocalProfileWidget.BookingTeamMembersData value;

    public LocalProfileWidget$Data$BookingTeamMembers(LocalProfileWidget.BookingTeamMembersData bookingTeamMembersData) {
        bookingTeamMembersData.getClass();
        this.value = bookingTeamMembersData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalProfileWidget$Data$BookingTeamMembers) && Intrinsics.areEqual(this.value, ((LocalProfileWidget$Data$BookingTeamMembers) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BookingTeamMembers(value=" + this.value + ")";
    }
}
