package com.squareup.protos.cash.customersearch.api;

import app.cash.zipline.loader.FastCodeUpdatesKt;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorSearchResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RecipientSelectorSearchResponse$ResultSource$Source$LocalAddressBook extends FastCodeUpdatesKt {
    public final RecipientSelectorSearchResponse.LocalAddressBookResults value;

    public RecipientSelectorSearchResponse$ResultSource$Source$LocalAddressBook(RecipientSelectorSearchResponse.LocalAddressBookResults localAddressBookResults) {
        localAddressBookResults.getClass();
        this.value = localAddressBookResults;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecipientSelectorSearchResponse$ResultSource$Source$LocalAddressBook) && Intrinsics.areEqual(this.value, ((RecipientSelectorSearchResponse$ResultSource$Source$LocalAddressBook) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LocalAddressBook(value=" + this.value + ")";
    }
}
