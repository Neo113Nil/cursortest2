package com.stripe.android.financialconnections.features.reset;

import com.stripe.android.financialconnections.presentation.Async;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ResetState {
    public final Async payload;

    public ResetState(Async async) {
        async.getClass();
        this.payload = async;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResetState) && Intrinsics.areEqual(this.payload, ((ResetState) obj).payload);
    }

    public final int hashCode() {
        return this.payload.hashCode();
    }

    public final String toString() {
        return "ResetState(payload=" + this.payload + ")";
    }
}
