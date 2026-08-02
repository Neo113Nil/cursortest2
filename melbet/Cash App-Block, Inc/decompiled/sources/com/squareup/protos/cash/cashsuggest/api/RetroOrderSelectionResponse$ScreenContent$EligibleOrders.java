package com.squareup.protos.cash.cashsuggest.api;

import app.cash.redwood.yoga.internal.YGNode;
import com.squareup.protos.cash.cashsuggest.api.RetroOrderSelectionResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RetroOrderSelectionResponse$ScreenContent$EligibleOrders extends YGNode.Companion {
    public final RetroOrderSelectionResponse.EligibleRetroOrdersSection value;

    public RetroOrderSelectionResponse$ScreenContent$EligibleOrders(RetroOrderSelectionResponse.EligibleRetroOrdersSection eligibleRetroOrdersSection) {
        eligibleRetroOrdersSection.getClass();
        this.value = eligibleRetroOrdersSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RetroOrderSelectionResponse$ScreenContent$EligibleOrders) && Intrinsics.areEqual(this.value, ((RetroOrderSelectionResponse$ScreenContent$EligibleOrders) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "EligibleOrders(value=" + this.value + ")";
    }
}
