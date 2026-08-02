package com.squareup.protos.cash.customersearch.api;

import app.cash.zipline.loader.FastCodeUpdatesKt;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorSearchResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RecipientSelectorSearchResponse$ResultSource$Source$LocalFavorite extends FastCodeUpdatesKt {
    public final RecipientSelectorSearchResponse.LocalFavoriteResults value;

    public RecipientSelectorSearchResponse$ResultSource$Source$LocalFavorite(RecipientSelectorSearchResponse.LocalFavoriteResults localFavoriteResults) {
        localFavoriteResults.getClass();
        this.value = localFavoriteResults;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecipientSelectorSearchResponse$ResultSource$Source$LocalFavorite) && Intrinsics.areEqual(this.value, ((RecipientSelectorSearchResponse$ResultSource$Source$LocalFavorite) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LocalFavorite(value=" + this.value + ")";
    }
}
