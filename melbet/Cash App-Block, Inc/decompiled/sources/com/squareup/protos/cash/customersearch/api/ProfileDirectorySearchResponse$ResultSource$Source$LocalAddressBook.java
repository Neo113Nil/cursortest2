package com.squareup.protos.cash.customersearch.api;

import app.cash.zipline.internal.bridge.ZiplineServiceAdapterKt;
import com.squareup.protos.cash.customersearch.api.ProfileDirectorySearchResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ProfileDirectorySearchResponse$ResultSource$Source$LocalAddressBook extends ZiplineServiceAdapterKt {
    public final ProfileDirectorySearchResponse.LocalAddressBookResults value;

    public ProfileDirectorySearchResponse$ResultSource$Source$LocalAddressBook(ProfileDirectorySearchResponse.LocalAddressBookResults localAddressBookResults) {
        localAddressBookResults.getClass();
        this.value = localAddressBookResults;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileDirectorySearchResponse$ResultSource$Source$LocalAddressBook) && Intrinsics.areEqual(this.value, ((ProfileDirectorySearchResponse$ResultSource$Source$LocalAddressBook) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LocalAddressBook(value=" + this.value + ")";
    }
}
