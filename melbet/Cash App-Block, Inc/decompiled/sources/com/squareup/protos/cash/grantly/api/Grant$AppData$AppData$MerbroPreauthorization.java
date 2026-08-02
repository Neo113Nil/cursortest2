package com.squareup.protos.cash.grantly.api;

import com.android.volley.toolbox.NetworkUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Grant$AppData$AppData$MerbroPreauthorization extends NetworkUtility {
    public final PreAuthorizePaymentResponse value;

    public Grant$AppData$AppData$MerbroPreauthorization(PreAuthorizePaymentResponse preAuthorizePaymentResponse) {
        preAuthorizePaymentResponse.getClass();
        this.value = preAuthorizePaymentResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Grant$AppData$AppData$MerbroPreauthorization) && Intrinsics.areEqual(this.value, ((Grant$AppData$AppData$MerbroPreauthorization) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "MerbroPreauthorization(value=" + this.value + ")";
    }
}
