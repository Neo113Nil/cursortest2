package com.squareup.protos.cash.customersearch.api;

import app.cash.zipline.internal.bridge.ZiplineServiceAdapterKt;
import com.squareup.protos.cash.customersearch.api.ProfileDirectorySearchResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ProfileDirectorySearchResponse$ResultSource$Source$LocalSyncedContact extends ZiplineServiceAdapterKt {
    public final ProfileDirectorySearchResponse.LocalSyncedCustomerResults value;

    public ProfileDirectorySearchResponse$ResultSource$Source$LocalSyncedContact(ProfileDirectorySearchResponse.LocalSyncedCustomerResults localSyncedCustomerResults) {
        localSyncedCustomerResults.getClass();
        this.value = localSyncedCustomerResults;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileDirectorySearchResponse$ResultSource$Source$LocalSyncedContact) && Intrinsics.areEqual(this.value, ((ProfileDirectorySearchResponse$ResultSource$Source$LocalSyncedContact) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LocalSyncedContact(value=" + this.value + ")";
    }
}
