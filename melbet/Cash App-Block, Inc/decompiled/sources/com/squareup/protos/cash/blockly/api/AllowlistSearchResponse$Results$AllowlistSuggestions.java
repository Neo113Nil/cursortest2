package com.squareup.protos.cash.blockly.api;

import app.cash.local.primitives.LocalBrandBanner;
import com.squareup.protos.cash.blockly.api.AllowlistSearchResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AllowlistSearchResponse$Results$AllowlistSuggestions extends LocalBrandBanner.Action {
    public final AllowlistSearchResponse.AllowlistSuggestions value;

    public AllowlistSearchResponse$Results$AllowlistSuggestions(AllowlistSearchResponse.AllowlistSuggestions allowlistSuggestions) {
        allowlistSuggestions.getClass();
        this.value = allowlistSuggestions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AllowlistSearchResponse$Results$AllowlistSuggestions) && Intrinsics.areEqual(this.value, ((AllowlistSearchResponse$Results$AllowlistSuggestions) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AllowlistSuggestions(value=" + this.value + ")";
    }
}
