package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzjb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RescheduleAppointmentResponse$Response$Appointment extends zzjb {
    public final LocalAppointment value;

    public RescheduleAppointmentResponse$Response$Appointment(LocalAppointment localAppointment) {
        localAppointment.getClass();
        this.value = localAppointment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RescheduleAppointmentResponse$Response$Appointment) && Intrinsics.areEqual(this.value, ((RescheduleAppointmentResponse$Response$Appointment) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Appointment(value=" + this.value + ")";
    }
}
