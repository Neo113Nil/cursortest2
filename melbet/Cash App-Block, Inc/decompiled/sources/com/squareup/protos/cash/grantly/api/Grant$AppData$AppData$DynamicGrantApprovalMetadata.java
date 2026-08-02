package com.squareup.protos.cash.grantly.api;

import com.android.volley.toolbox.NetworkUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Grant$AppData$AppData$DynamicGrantApprovalMetadata extends NetworkUtility {
    public final DynamicGrantApprovalMetadata value;

    public Grant$AppData$AppData$DynamicGrantApprovalMetadata(DynamicGrantApprovalMetadata dynamicGrantApprovalMetadata) {
        dynamicGrantApprovalMetadata.getClass();
        this.value = dynamicGrantApprovalMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Grant$AppData$AppData$DynamicGrantApprovalMetadata) && Intrinsics.areEqual(this.value, ((Grant$AppData$AppData$DynamicGrantApprovalMetadata) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "DynamicGrantApprovalMetadata(value=" + this.value + ")";
    }
}
