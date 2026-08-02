package com.squareup.protos.lending.sync_values;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class LendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute {
    public final String value;

    public LendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute) && Intrinsics.areEqual(this.value, ((LendingInfo$FirstTimeBorrowData$HomeScreen$ButtonRouting$ClientRoute) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRoute(value=", this.value, ")");
    }
}
