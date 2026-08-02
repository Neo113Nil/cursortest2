package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.model.ActionEvent;
import com.squareup.protos.cash.local.client.v1.LocalProfileWidget;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalProfileWidget$Data$BookingRebooking extends ActionEvent.Companion {
    public final LocalProfileWidget.BookingRebookingData value;

    public LocalProfileWidget$Data$BookingRebooking(LocalProfileWidget.BookingRebookingData bookingRebookingData) {
        bookingRebookingData.getClass();
        this.value = bookingRebookingData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalProfileWidget$Data$BookingRebooking) && Intrinsics.areEqual(this.value, ((LocalProfileWidget$Data$BookingRebooking) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BookingRebooking(value=" + this.value + ")";
    }
}
