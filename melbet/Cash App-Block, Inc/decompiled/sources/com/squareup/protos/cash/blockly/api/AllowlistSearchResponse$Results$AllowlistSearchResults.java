package com.squareup.protos.cash.blockly.api;

import app.cash.local.primitives.LocalBrandBanner;
import com.squareup.protos.cash.blockly.api.AllowlistSearchResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AllowlistSearchResponse$Results$AllowlistSearchResults extends LocalBrandBanner.Action {
    public final AllowlistSearchResponse.AllowlistSearchResults value;

    public AllowlistSearchResponse$Results$AllowlistSearchResults(AllowlistSearchResponse.AllowlistSearchResults allowlistSearchResults) {
        allowlistSearchResults.getClass();
        this.value = allowlistSearchResults;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AllowlistSearchResponse$Results$AllowlistSearchResults) && Intrinsics.areEqual(this.value, ((AllowlistSearchResponse$Results$AllowlistSearchResults) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AllowlistSearchResults(value=" + this.value + ")";
    }
}
