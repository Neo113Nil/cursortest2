package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.model.ActionEvent;
import com.squareup.protos.cash.local.client.v1.LocalProfileWidget;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalProfileWidget$Data$Hours extends ActionEvent.Companion {
    public final LocalProfileWidget.HoursData value;

    public LocalProfileWidget$Data$Hours(LocalProfileWidget.HoursData hoursData) {
        hoursData.getClass();
        this.value = hoursData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalProfileWidget$Data$Hours) && Intrinsics.areEqual(this.value, ((LocalProfileWidget$Data$Hours) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Hours(value=" + this.value + ")";
    }
}
