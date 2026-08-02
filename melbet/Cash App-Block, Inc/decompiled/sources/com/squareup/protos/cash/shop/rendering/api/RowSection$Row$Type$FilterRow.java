package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzlc;
import com.squareup.protos.cash.shop.rendering.api.RowSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class RowSection$Row$Type$FilterRow extends zzlc {
    public final RowSection.FilterRow value;

    public RowSection$Row$Type$FilterRow(RowSection.FilterRow filterRow) {
        filterRow.getClass();
        this.value = filterRow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RowSection$Row$Type$FilterRow) && Intrinsics.areEqual(this.value, ((RowSection$Row$Type$FilterRow) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "FilterRow(value=" + this.value + ")";
    }
}
