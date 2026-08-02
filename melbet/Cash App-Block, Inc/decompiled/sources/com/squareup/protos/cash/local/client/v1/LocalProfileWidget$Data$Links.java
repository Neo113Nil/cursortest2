package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.model.ActionEvent;
import com.squareup.protos.cash.local.client.v1.LocalProfileWidget;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalProfileWidget$Data$Links extends ActionEvent.Companion {
    public final LocalProfileWidget.LinksData value;

    public LocalProfileWidget$Data$Links(LocalProfileWidget.LinksData linksData) {
        linksData.getClass();
        this.value = linksData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalProfileWidget$Data$Links) && Intrinsics.areEqual(this.value, ((LocalProfileWidget$Data$Links) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Links(value=" + this.value + ")";
    }
}
