package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.model.ActionEvent;
import com.squareup.protos.cash.local.client.v1.LocalProfileWidget;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalProfileWidget$Data$About extends ActionEvent.Companion {
    public final LocalProfileWidget.AboutData value;

    public LocalProfileWidget$Data$About(LocalProfileWidget.AboutData aboutData) {
        aboutData.getClass();
        this.value = aboutData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalProfileWidget$Data$About) && Intrinsics.areEqual(this.value, ((LocalProfileWidget$Data$About) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "About(value=" + this.value + ")";
    }
}
