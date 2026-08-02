package com.squareup.protos.cash.discover.api.app.v2.model;

import coil3.decode.StaticImageDecoderKt;
import com.squareup.protos.cash.discover.api.app.v2.model.RowSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RowSection$Item$Item$SearchRow extends StaticImageDecoderKt {
    public final RowSection.SearchRow value;

    public RowSection$Item$Item$SearchRow(RowSection.SearchRow searchRow) {
        searchRow.getClass();
        this.value = searchRow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RowSection$Item$Item$SearchRow) && Intrinsics.areEqual(this.value, ((RowSection$Item$Item$SearchRow) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SearchRow(value=" + this.value + ")";
    }
}
