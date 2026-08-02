package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.model.ActionEvent;
import com.squareup.protos.cash.local.client.v1.LocalProfileWidget;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalProfileWidget$Data$Policies extends ActionEvent.Companion {
    public final LocalProfileWidget.PoliciesData value;

    public LocalProfileWidget$Data$Policies(LocalProfileWidget.PoliciesData policiesData) {
        policiesData.getClass();
        this.value = policiesData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalProfileWidget$Data$Policies) && Intrinsics.areEqual(this.value, ((LocalProfileWidget$Data$Policies) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Policies(value=" + this.value + ")";
    }
}
