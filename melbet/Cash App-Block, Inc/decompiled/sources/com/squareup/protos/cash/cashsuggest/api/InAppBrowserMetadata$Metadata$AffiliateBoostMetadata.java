package com.squareup.protos.cash.cashsuggest.api;

import app.cash.redwood.ui.DensityKt;
import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InAppBrowserMetadata$Metadata$AffiliateBoostMetadata extends DensityKt {
    public final InAppBrowserMetadata.IABMetadataAffiliateBoost value;

    public InAppBrowserMetadata$Metadata$AffiliateBoostMetadata(InAppBrowserMetadata.IABMetadataAffiliateBoost iABMetadataAffiliateBoost) {
        iABMetadataAffiliateBoost.getClass();
        this.value = iABMetadataAffiliateBoost;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InAppBrowserMetadata$Metadata$AffiliateBoostMetadata) && Intrinsics.areEqual(this.value, ((InAppBrowserMetadata$Metadata$AffiliateBoostMetadata) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AffiliateBoostMetadata(value=" + this.value + ")";
    }
}
