package com.squareup.protos.cash.cashsuggest.api;

import app.cash.redwood.yoga.internal.YGFloatOptional;
import com.squareup.protos.cash.cashsuggest.api.OrderListSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class OrderListSection$ScreenContent$EligibleOrders extends YGFloatOptional {
    public final OrderListSection.EligibleRetroOrders value;

    public OrderListSection$ScreenContent$EligibleOrders(OrderListSection.EligibleRetroOrders eligibleRetroOrders) {
        eligibleRetroOrders.getClass();
        this.value = eligibleRetroOrders;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrderListSection$ScreenContent$EligibleOrders) && Intrinsics.areEqual(this.value, ((OrderListSection$ScreenContent$EligibleOrders) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "EligibleOrders(value=" + this.value + ")";
    }
}
