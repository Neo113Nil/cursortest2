package com.squareup.protos.cash.aegis.core;

import com.google.android.gms.internal.mlkit_vision_barcode.zztj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PendingRequestSection$Type$PendingRequest extends zztj {
    public final PendingRequest value;

    public PendingRequestSection$Type$PendingRequest(PendingRequest pendingRequest) {
        pendingRequest.getClass();
        this.value = pendingRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PendingRequestSection$Type$PendingRequest) && Intrinsics.areEqual(this.value, ((PendingRequestSection$Type$PendingRequest) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PendingRequest(value=" + this.value + ")";
    }
}
