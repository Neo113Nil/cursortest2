package com.squareup.protos.cash.customersearch.api;

import app.cash.zipline.internal.bridge.ZiplineServiceAdapterKt;
import com.squareup.protos.cash.customersearch.api.ProfileDirectorySearchResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ProfileDirectorySearchResponse$ResultSource$Source$LocalFavorite extends ZiplineServiceAdapterKt {
    public final ProfileDirectorySearchResponse.LocalFavoriteResults value;

    public ProfileDirectorySearchResponse$ResultSource$Source$LocalFavorite(ProfileDirectorySearchResponse.LocalFavoriteResults localFavoriteResults) {
        localFavoriteResults.getClass();
        this.value = localFavoriteResults;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileDirectorySearchResponse$ResultSource$Source$LocalFavorite) && Intrinsics.areEqual(this.value, ((ProfileDirectorySearchResponse$ResultSource$Source$LocalFavorite) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LocalFavorite(value=" + this.value + ")";
    }
}
