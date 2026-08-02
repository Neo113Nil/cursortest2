package com.squareup.lending.sync_values;

import app.cash.local.presenters.internal.LoyaltyKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ToggleEntryPointData$Action$ClientRoute extends LoyaltyKt {
    public final String value;

    public ToggleEntryPointData$Action$ClientRoute(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ToggleEntryPointData$Action$ClientRoute) && Intrinsics.areEqual(this.value, ((ToggleEntryPointData$Action$ClientRoute) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRoute(value=", this.value, ")");
    }
}
