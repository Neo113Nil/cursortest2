package com.squareup.protos.cash.customersearch.api;

import app.cash.zipline.internal.bridge.ZiplineServiceAdapterKt;
import com.squareup.protos.cash.customersearch.api.ProfileDirectorySearchResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ProfileDirectorySearchResponse$ResultSource$Source$ServerResults extends ZiplineServiceAdapterKt {
    public final ProfileDirectorySearchResponse.ServerResults value;

    public ProfileDirectorySearchResponse$ResultSource$Source$ServerResults(ProfileDirectorySearchResponse.ServerResults serverResults) {
        serverResults.getClass();
        this.value = serverResults;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileDirectorySearchResponse$ResultSource$Source$ServerResults) && Intrinsics.areEqual(this.value, ((ProfileDirectorySearchResponse$ResultSource$Source$ServerResults) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ServerResults(value=" + this.value + ")";
    }
}
