package com.squareup.protos.cash.cashsuggest.api;

import app.cash.redwood.ui.DensityKt;
import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InAppBrowserMetadata$Metadata$AfterpayShoppingMetadata extends DensityKt {
    public final InAppBrowserMetadata.IABMetadataAfterpay value;

    public InAppBrowserMetadata$Metadata$AfterpayShoppingMetadata(InAppBrowserMetadata.IABMetadataAfterpay iABMetadataAfterpay) {
        iABMetadataAfterpay.getClass();
        this.value = iABMetadataAfterpay;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InAppBrowserMetadata$Metadata$AfterpayShoppingMetadata) && Intrinsics.areEqual(this.value, ((InAppBrowserMetadata$Metadata$AfterpayShoppingMetadata) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AfterpayShoppingMetadata(value=" + this.value + ")";
    }
}
