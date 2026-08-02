package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.model.ActionEvent;
import com.squareup.protos.cash.local.client.v1.LocalProfileWidget;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalProfileWidget$Data$OrderingReordering extends ActionEvent.Companion {
    public final LocalProfileWidget.OrderingReorderingData value;

    public LocalProfileWidget$Data$OrderingReordering(LocalProfileWidget.OrderingReorderingData orderingReorderingData) {
        orderingReorderingData.getClass();
        this.value = orderingReorderingData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalProfileWidget$Data$OrderingReordering) && Intrinsics.areEqual(this.value, ((LocalProfileWidget$Data$OrderingReordering) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OrderingReordering(value=" + this.value + ")";
    }
}
