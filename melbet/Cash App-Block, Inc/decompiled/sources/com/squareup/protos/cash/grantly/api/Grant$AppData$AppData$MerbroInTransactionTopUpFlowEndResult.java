package com.squareup.protos.cash.grantly.api;

import com.android.volley.toolbox.NetworkUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Grant$AppData$AppData$MerbroInTransactionTopUpFlowEndResult extends NetworkUtility {
    public final InTransactionTopUpFlowEndResult value;

    public Grant$AppData$AppData$MerbroInTransactionTopUpFlowEndResult(InTransactionTopUpFlowEndResult inTransactionTopUpFlowEndResult) {
        inTransactionTopUpFlowEndResult.getClass();
        this.value = inTransactionTopUpFlowEndResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Grant$AppData$AppData$MerbroInTransactionTopUpFlowEndResult) && Intrinsics.areEqual(this.value, ((Grant$AppData$AppData$MerbroInTransactionTopUpFlowEndResult) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "MerbroInTransactionTopUpFlowEndResult(value=" + this.value + ")";
    }
}
