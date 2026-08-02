package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.Rum;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetAppointmentResponse$Response$Appointment extends Rum {
    public final LocalAppointment value;

    public GetAppointmentResponse$Response$Appointment(LocalAppointment localAppointment) {
        localAppointment.getClass();
        this.value = localAppointment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetAppointmentResponse$Response$Appointment) && Intrinsics.areEqual(this.value, ((GetAppointmentResponse$Response$Appointment) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Appointment(value=" + this.value + ")";
    }
}
