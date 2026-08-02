package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzld;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SearchSection$Content$RowSection extends zzld {
    public final RowSection value;

    public SearchSection$Content$RowSection(RowSection rowSection) {
        rowSection.getClass();
        this.value = rowSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchSection$Content$RowSection) && Intrinsics.areEqual(this.value, ((SearchSection$Content$RowSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RowSection(value=" + this.value + ")";
    }
}
