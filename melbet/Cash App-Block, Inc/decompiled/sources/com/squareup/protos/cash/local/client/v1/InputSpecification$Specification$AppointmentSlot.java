package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzik;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InputSpecification$Specification$AppointmentSlot extends zzik {
    public final AppointmentSlotSpec value;

    public InputSpecification$Specification$AppointmentSlot(AppointmentSlotSpec appointmentSlotSpec) {
        appointmentSlotSpec.getClass();
        this.value = appointmentSlotSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InputSpecification$Specification$AppointmentSlot) && Intrinsics.areEqual(this.value, ((InputSpecification$Specification$AppointmentSlot) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AppointmentSlot(value=" + this.value + ")";
    }
}
