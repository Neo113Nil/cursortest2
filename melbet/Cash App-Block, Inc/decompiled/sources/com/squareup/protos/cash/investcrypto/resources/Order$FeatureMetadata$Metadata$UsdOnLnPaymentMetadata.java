package com.squareup.protos.cash.investcrypto.resources;

import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.squareup.protos.cash.investcrypto.resources.Order;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Order$FeatureMetadata$Metadata$UsdOnLnPaymentMetadata extends MediaStoreUtil {
    public final Order.FeatureMetadata.UsdOnLnPaymentMetadata value;

    public Order$FeatureMetadata$Metadata$UsdOnLnPaymentMetadata(Order.FeatureMetadata.UsdOnLnPaymentMetadata usdOnLnPaymentMetadata) {
        usdOnLnPaymentMetadata.getClass();
        this.value = usdOnLnPaymentMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Order$FeatureMetadata$Metadata$UsdOnLnPaymentMetadata) && Intrinsics.areEqual(this.value, ((Order$FeatureMetadata$Metadata$UsdOnLnPaymentMetadata) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "UsdOnLnPaymentMetadata(value=" + this.value + ")";
    }
}
