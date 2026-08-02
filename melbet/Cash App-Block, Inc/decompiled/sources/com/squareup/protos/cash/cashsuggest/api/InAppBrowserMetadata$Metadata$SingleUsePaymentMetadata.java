package com.squareup.protos.cash.cashsuggest.api;

import app.cash.redwood.ui.DensityKt;
import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InAppBrowserMetadata$Metadata$SingleUsePaymentMetadata extends DensityKt {
    public final InAppBrowserMetadata.IABMetadataSUP value;

    public InAppBrowserMetadata$Metadata$SingleUsePaymentMetadata(InAppBrowserMetadata.IABMetadataSUP iABMetadataSUP) {
        iABMetadataSUP.getClass();
        this.value = iABMetadataSUP;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InAppBrowserMetadata$Metadata$SingleUsePaymentMetadata) && Intrinsics.areEqual(this.value, ((InAppBrowserMetadata$Metadata$SingleUsePaymentMetadata) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SingleUsePaymentMetadata(value=" + this.value + ")";
    }
}
