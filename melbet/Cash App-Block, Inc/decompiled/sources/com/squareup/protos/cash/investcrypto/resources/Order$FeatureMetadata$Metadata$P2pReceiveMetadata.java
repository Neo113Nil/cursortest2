package com.squareup.protos.cash.investcrypto.resources;

import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.squareup.protos.cash.investcrypto.resources.Order;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Order$FeatureMetadata$Metadata$P2pReceiveMetadata extends MediaStoreUtil {
    public final Order.FeatureMetadata.P2pReceiveMetadata value;

    public Order$FeatureMetadata$Metadata$P2pReceiveMetadata(Order.FeatureMetadata.P2pReceiveMetadata p2pReceiveMetadata) {
        p2pReceiveMetadata.getClass();
        this.value = p2pReceiveMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Order$FeatureMetadata$Metadata$P2pReceiveMetadata) && Intrinsics.areEqual(this.value, ((Order$FeatureMetadata$Metadata$P2pReceiveMetadata) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "P2pReceiveMetadata(value=" + this.value + ")";
    }
}
