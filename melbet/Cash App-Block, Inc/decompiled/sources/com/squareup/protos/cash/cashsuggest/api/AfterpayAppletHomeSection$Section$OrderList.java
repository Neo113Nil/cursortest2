package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletHomeSection$Section$OrderList extends LocalMenuHoursViewKt {
    public final OrderListSection value;

    public AfterpayAppletHomeSection$Section$OrderList(OrderListSection orderListSection) {
        orderListSection.getClass();
        this.value = orderListSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletHomeSection$Section$OrderList) && Intrinsics.areEqual(this.value, ((AfterpayAppletHomeSection$Section$OrderList) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OrderList(value=" + this.value + ")";
    }
}
