package com.squareup.protos.cash.blockly.api;

import app.cash.local.primitives.LocalBrandBanner;
import com.squareup.protos.cash.blockly.api.BlockSearchResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BlockSearchResponse$Results$BlockSuggestions extends LocalBrandBanner.Companion {
    public final BlockSearchResponse.BlockSuggestions value;

    public BlockSearchResponse$Results$BlockSuggestions(BlockSearchResponse.BlockSuggestions blockSuggestions) {
        blockSuggestions.getClass();
        this.value = blockSuggestions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockSearchResponse$Results$BlockSuggestions) && Intrinsics.areEqual(this.value, ((BlockSearchResponse$Results$BlockSuggestions) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BlockSuggestions(value=" + this.value + ")";
    }
}
