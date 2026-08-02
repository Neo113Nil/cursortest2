package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzld;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SearchSection$Content$MessageSection extends zzld {
    public final ZeroResultsMessageSection value;

    public SearchSection$Content$MessageSection(ZeroResultsMessageSection zeroResultsMessageSection) {
        zeroResultsMessageSection.getClass();
        this.value = zeroResultsMessageSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchSection$Content$MessageSection) && Intrinsics.areEqual(this.value, ((SearchSection$Content$MessageSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "MessageSection(value=" + this.value + ")";
    }
}
