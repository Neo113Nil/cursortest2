package com.squareup.protos.cash.cashsuggest.api;

import app.cash.redwood.ui.DensityKt;
import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InAppBrowserMetadata$Metadata$CashAppPayMetadata extends DensityKt {
    public final InAppBrowserMetadata.IABMetadataCAP value;

    public InAppBrowserMetadata$Metadata$CashAppPayMetadata(InAppBrowserMetadata.IABMetadataCAP iABMetadataCAP) {
        iABMetadataCAP.getClass();
        this.value = iABMetadataCAP;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InAppBrowserMetadata$Metadata$CashAppPayMetadata) && Intrinsics.areEqual(this.value, ((InAppBrowserMetadata$Metadata$CashAppPayMetadata) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CashAppPayMetadata(value=" + this.value + ")";
    }
}
