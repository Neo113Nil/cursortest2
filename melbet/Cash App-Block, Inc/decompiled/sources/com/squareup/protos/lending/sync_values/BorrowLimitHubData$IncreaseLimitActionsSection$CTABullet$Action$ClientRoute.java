package com.squareup.protos.lending.sync_values;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class BorrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute {
    public final String value;

    public BorrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BorrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute) && Intrinsics.areEqual(this.value, ((BorrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRoute(value=", this.value, ")");
    }
}
