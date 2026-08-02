package com.squareup.protos.cash.cashsuggest.api;

import app.cash.redwood.yoga.internal.YGFloatOptional;
import com.squareup.protos.cash.cashsuggest.api.OrderListSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class OrderListSection$ScreenContent$TextLines extends YGFloatOptional {
    public final OrderListSection.TextLineItems value;

    public OrderListSection$ScreenContent$TextLines(OrderListSection.TextLineItems textLineItems) {
        textLineItems.getClass();
        this.value = textLineItems;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrderListSection$ScreenContent$TextLines) && Intrinsics.areEqual(this.value, ((OrderListSection$ScreenContent$TextLines) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TextLines(value=" + this.value + ")";
    }
}
