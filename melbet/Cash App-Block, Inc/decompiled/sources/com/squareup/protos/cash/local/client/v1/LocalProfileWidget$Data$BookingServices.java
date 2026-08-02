package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.model.ActionEvent;
import com.squareup.protos.cash.local.client.v1.LocalProfileWidget;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalProfileWidget$Data$BookingServices extends ActionEvent.Companion {
    public final LocalProfileWidget.BookingServicesData value;

    public LocalProfileWidget$Data$BookingServices(LocalProfileWidget.BookingServicesData bookingServicesData) {
        bookingServicesData.getClass();
        this.value = bookingServicesData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalProfileWidget$Data$BookingServices) && Intrinsics.areEqual(this.value, ((LocalProfileWidget$Data$BookingServices) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BookingServices(value=" + this.value + ")";
    }
}
