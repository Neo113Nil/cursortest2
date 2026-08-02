package com.squareup.protos.cash.blockly.api;

import app.cash.local.primitives.LocalBrandBanner;
import com.squareup.protos.cash.blockly.api.BlockSearchResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BlockSearchResponse$Results$BlockSearchResults extends LocalBrandBanner.Companion {
    public final BlockSearchResponse.BlockSearchResults value;

    public BlockSearchResponse$Results$BlockSearchResults(BlockSearchResponse.BlockSearchResults blockSearchResults) {
        blockSearchResults.getClass();
        this.value = blockSearchResults;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockSearchResponse$Results$BlockSearchResults) && Intrinsics.areEqual(this.value, ((BlockSearchResponse$Results$BlockSearchResults) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BlockSearchResults(value=" + this.value + ")";
    }
}
