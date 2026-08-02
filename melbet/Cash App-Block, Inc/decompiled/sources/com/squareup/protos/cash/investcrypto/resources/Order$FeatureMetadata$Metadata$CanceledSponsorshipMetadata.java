package com.squareup.protos.cash.investcrypto.resources;

import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.squareup.protos.cash.investcrypto.resources.Order;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Order$FeatureMetadata$Metadata$CanceledSponsorshipMetadata extends MediaStoreUtil {
    public final Order.FeatureMetadata.CanceledSponsorshipMetadata value;

    public Order$FeatureMetadata$Metadata$CanceledSponsorshipMetadata(Order.FeatureMetadata.CanceledSponsorshipMetadata canceledSponsorshipMetadata) {
        canceledSponsorshipMetadata.getClass();
        this.value = canceledSponsorshipMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Order$FeatureMetadata$Metadata$CanceledSponsorshipMetadata) && Intrinsics.areEqual(this.value, ((Order$FeatureMetadata$Metadata$CanceledSponsorshipMetadata) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CanceledSponsorshipMetadata(value=" + this.value + ")";
    }
}
