package com.squareup.protos.cash.grantly.api;

import com.android.volley.toolbox.NetworkUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Grant$AppData$AppData$RiskMetadata extends NetworkUtility {
    public final RiskMetadata value;

    public Grant$AppData$AppData$RiskMetadata(RiskMetadata riskMetadata) {
        riskMetadata.getClass();
        this.value = riskMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Grant$AppData$AppData$RiskMetadata) && Intrinsics.areEqual(this.value, ((Grant$AppData$AppData$RiskMetadata) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RiskMetadata(value=" + this.value + ")";
    }
}
