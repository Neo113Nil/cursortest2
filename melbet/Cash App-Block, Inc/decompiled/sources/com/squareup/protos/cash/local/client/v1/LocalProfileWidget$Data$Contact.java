package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.model.ActionEvent;
import com.squareup.protos.cash.local.client.v1.LocalProfileWidget;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalProfileWidget$Data$Contact extends ActionEvent.Companion {
    public final LocalProfileWidget.ContactData value;

    public LocalProfileWidget$Data$Contact(LocalProfileWidget.ContactData contactData) {
        contactData.getClass();
        this.value = contactData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalProfileWidget$Data$Contact) && Intrinsics.areEqual(this.value, ((LocalProfileWidget$Data$Contact) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Contact(value=" + this.value + ")";
    }
}
