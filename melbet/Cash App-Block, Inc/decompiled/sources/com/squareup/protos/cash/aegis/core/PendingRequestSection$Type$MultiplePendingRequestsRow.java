package com.squareup.protos.cash.aegis.core;

import com.google.android.gms.internal.mlkit_vision_barcode.zztj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PendingRequestSection$Type$MultiplePendingRequestsRow extends zztj {
    public final MultiplePendingRequestsRow value;

    public PendingRequestSection$Type$MultiplePendingRequestsRow(MultiplePendingRequestsRow multiplePendingRequestsRow) {
        multiplePendingRequestsRow.getClass();
        this.value = multiplePendingRequestsRow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PendingRequestSection$Type$MultiplePendingRequestsRow) && Intrinsics.areEqual(this.value, ((PendingRequestSection$Type$MultiplePendingRequestsRow) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "MultiplePendingRequestsRow(value=" + this.value + ")";
    }
}
