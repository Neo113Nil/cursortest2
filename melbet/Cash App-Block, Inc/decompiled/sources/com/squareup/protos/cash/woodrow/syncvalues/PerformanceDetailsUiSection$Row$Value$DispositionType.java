package com.squareup.protos.cash.woodrow.syncvalues;

import com.google.android.gms.internal.mlkit_vision_common.zzlu;
import com.squareup.protos.cash.woodrow.model.v1.AssetDisposition$DispositionType;

/* loaded from: classes8.dex */
public final class PerformanceDetailsUiSection$Row$Value$DispositionType extends zzlu {
    public final AssetDisposition$DispositionType value;

    public PerformanceDetailsUiSection$Row$Value$DispositionType(AssetDisposition$DispositionType assetDisposition$DispositionType) {
        assetDisposition$DispositionType.getClass();
        this.value = assetDisposition$DispositionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PerformanceDetailsUiSection$Row$Value$DispositionType) && this.value == ((PerformanceDetailsUiSection$Row$Value$DispositionType) obj).value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "DispositionType(value=" + this.value + ")";
    }
}
