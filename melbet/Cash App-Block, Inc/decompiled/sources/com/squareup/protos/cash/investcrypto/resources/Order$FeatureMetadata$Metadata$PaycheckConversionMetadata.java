package com.squareup.protos.cash.investcrypto.resources;

import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.squareup.protos.cash.investcrypto.resources.Order;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Order$FeatureMetadata$Metadata$PaycheckConversionMetadata extends MediaStoreUtil {
    public final Order.FeatureMetadata.PaycheckConversionMetadata value;

    public Order$FeatureMetadata$Metadata$PaycheckConversionMetadata(Order.FeatureMetadata.PaycheckConversionMetadata paycheckConversionMetadata) {
        paycheckConversionMetadata.getClass();
        this.value = paycheckConversionMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Order$FeatureMetadata$Metadata$PaycheckConversionMetadata) && Intrinsics.areEqual(this.value, ((Order$FeatureMetadata$Metadata$PaycheckConversionMetadata) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PaycheckConversionMetadata(value=" + this.value + ")";
    }
}
