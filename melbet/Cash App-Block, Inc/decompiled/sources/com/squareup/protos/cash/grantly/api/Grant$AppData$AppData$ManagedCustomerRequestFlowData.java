package com.squareup.protos.cash.grantly.api;

import com.android.volley.toolbox.NetworkUtility;
import com.squareup.protos.cash.pay.ManagedCustomerRequestFlowData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Grant$AppData$AppData$ManagedCustomerRequestFlowData extends NetworkUtility {
    public final ManagedCustomerRequestFlowData value;

    public Grant$AppData$AppData$ManagedCustomerRequestFlowData(ManagedCustomerRequestFlowData managedCustomerRequestFlowData) {
        managedCustomerRequestFlowData.getClass();
        this.value = managedCustomerRequestFlowData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Grant$AppData$AppData$ManagedCustomerRequestFlowData) && Intrinsics.areEqual(this.value, ((Grant$AppData$AppData$ManagedCustomerRequestFlowData) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ManagedCustomerRequestFlowData(value=" + this.value + ")";
    }
}
