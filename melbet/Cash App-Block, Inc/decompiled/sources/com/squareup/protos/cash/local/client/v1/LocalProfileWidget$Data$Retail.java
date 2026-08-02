package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.model.ActionEvent;
import com.squareup.protos.cash.local.client.v1.LocalProfileWidget;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalProfileWidget$Data$Retail extends ActionEvent.Companion {
    public final LocalProfileWidget.RetailData value;

    public LocalProfileWidget$Data$Retail(LocalProfileWidget.RetailData retailData) {
        retailData.getClass();
        this.value = retailData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalProfileWidget$Data$Retail) && Intrinsics.areEqual(this.value, ((LocalProfileWidget$Data$Retail) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Retail(value=" + this.value + ")";
    }
}
