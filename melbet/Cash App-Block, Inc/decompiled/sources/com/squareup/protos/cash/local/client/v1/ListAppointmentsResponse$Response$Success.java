package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzim;
import com.squareup.protos.cash.local.client.v1.ListAppointmentsResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ListAppointmentsResponse$Response$Success extends zzim {
    public final ListAppointmentsResponse.Success value;

    public ListAppointmentsResponse$Response$Success(ListAppointmentsResponse.Success success) {
        success.getClass();
        this.value = success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ListAppointmentsResponse$Response$Success) && Intrinsics.areEqual(this.value, ((ListAppointmentsResponse$Response$Success) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.value + ")";
    }
}
