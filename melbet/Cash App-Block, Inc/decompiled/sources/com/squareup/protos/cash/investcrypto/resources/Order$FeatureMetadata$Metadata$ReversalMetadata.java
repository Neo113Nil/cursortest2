package com.squareup.protos.cash.investcrypto.resources;

import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.squareup.protos.cash.investcrypto.resources.Order;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Order$FeatureMetadata$Metadata$ReversalMetadata extends MediaStoreUtil {
    public final Order.FeatureMetadata.ReversalMetadata value;

    public Order$FeatureMetadata$Metadata$ReversalMetadata(Order.FeatureMetadata.ReversalMetadata reversalMetadata) {
        reversalMetadata.getClass();
        this.value = reversalMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Order$FeatureMetadata$Metadata$ReversalMetadata) && Intrinsics.areEqual(this.value, ((Order$FeatureMetadata$Metadata$ReversalMetadata) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ReversalMetadata(value=" + this.value + ")";
    }
}
