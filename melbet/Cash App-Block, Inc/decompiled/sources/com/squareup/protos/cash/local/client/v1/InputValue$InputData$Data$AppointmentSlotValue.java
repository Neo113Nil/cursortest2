package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzil;
import com.squareup.protos.cash.local.client.v1.InputValue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InputValue$InputData$Data$AppointmentSlotValue extends zzil {
    public final InputValue.AppointmentSlotValue value;

    public InputValue$InputData$Data$AppointmentSlotValue(InputValue.AppointmentSlotValue appointmentSlotValue) {
        appointmentSlotValue.getClass();
        this.value = appointmentSlotValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InputValue$InputData$Data$AppointmentSlotValue) && Intrinsics.areEqual(this.value, ((InputValue$InputData$Data$AppointmentSlotValue) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AppointmentSlotValue(value=" + this.value + ")";
    }
}
