package com.squareup.protos.cash.customersearch.api;

import app.cash.zipline.loader.FastCodeUpdatesKt;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorSearchResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RecipientSelectorSearchResponse$ResultSource$Source$LocalSyncedContact extends FastCodeUpdatesKt {
    public final RecipientSelectorSearchResponse.LocalSyncedCustomerResults value;

    public RecipientSelectorSearchResponse$ResultSource$Source$LocalSyncedContact(RecipientSelectorSearchResponse.LocalSyncedCustomerResults localSyncedCustomerResults) {
        localSyncedCustomerResults.getClass();
        this.value = localSyncedCustomerResults;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecipientSelectorSearchResponse$ResultSource$Source$LocalSyncedContact) && Intrinsics.areEqual(this.value, ((RecipientSelectorSearchResponse$ResultSource$Source$LocalSyncedContact) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LocalSyncedContact(value=" + this.value + ")";
    }
}
