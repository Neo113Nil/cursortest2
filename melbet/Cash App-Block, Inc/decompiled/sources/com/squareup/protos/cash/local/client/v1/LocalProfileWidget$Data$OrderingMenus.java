package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.model.ActionEvent;
import com.squareup.protos.cash.local.client.v1.LocalProfileWidget;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalProfileWidget$Data$OrderingMenus extends ActionEvent.Companion {
    public final LocalProfileWidget.OrderingMenusData value;

    public LocalProfileWidget$Data$OrderingMenus(LocalProfileWidget.OrderingMenusData orderingMenusData) {
        orderingMenusData.getClass();
        this.value = orderingMenusData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalProfileWidget$Data$OrderingMenus) && Intrinsics.areEqual(this.value, ((LocalProfileWidget$Data$OrderingMenus) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OrderingMenus(value=" + this.value + ")";
    }
}
