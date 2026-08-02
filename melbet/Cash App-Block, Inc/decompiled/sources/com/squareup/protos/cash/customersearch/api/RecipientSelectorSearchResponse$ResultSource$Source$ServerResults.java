package com.squareup.protos.cash.customersearch.api;

import app.cash.zipline.loader.FastCodeUpdatesKt;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorSearchResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RecipientSelectorSearchResponse$ResultSource$Source$ServerResults extends FastCodeUpdatesKt {
    public final RecipientSelectorSearchResponse.ServerResults value;

    public RecipientSelectorSearchResponse$ResultSource$Source$ServerResults(RecipientSelectorSearchResponse.ServerResults serverResults) {
        serverResults.getClass();
        this.value = serverResults;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecipientSelectorSearchResponse$ResultSource$Source$ServerResults) && Intrinsics.areEqual(this.value, ((RecipientSelectorSearchResponse$ResultSource$Source$ServerResults) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ServerResults(value=" + this.value + ")";
    }
}
