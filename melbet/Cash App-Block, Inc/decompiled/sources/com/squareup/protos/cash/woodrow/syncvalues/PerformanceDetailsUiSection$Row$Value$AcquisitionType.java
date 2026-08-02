package com.squareup.protos.cash.woodrow.syncvalues;

import com.google.android.gms.internal.mlkit_vision_common.zzlu;
import com.squareup.protos.cash.woodrow.model.v1.AssetAcquisition$AcquisitionType;

/* loaded from: classes8.dex */
public final class PerformanceDetailsUiSection$Row$Value$AcquisitionType extends zzlu {
    public final AssetAcquisition$AcquisitionType value;

    public PerformanceDetailsUiSection$Row$Value$AcquisitionType(AssetAcquisition$AcquisitionType assetAcquisition$AcquisitionType) {
        assetAcquisition$AcquisitionType.getClass();
        this.value = assetAcquisition$AcquisitionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PerformanceDetailsUiSection$Row$Value$AcquisitionType) && this.value == ((PerformanceDetailsUiSection$Row$Value$AcquisitionType) obj).value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AcquisitionType(value=" + this.value + ")";
    }
}
