package com.squareup.protos.cash.customersearch.api;

import app.cash.zipline.loader.LoaderAndroidKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SearchCommonSection$Content$RowSection extends LoaderAndroidKt {
    public final SearchCommonRowSection value;

    public SearchCommonSection$Content$RowSection(SearchCommonRowSection searchCommonRowSection) {
        searchCommonRowSection.getClass();
        this.value = searchCommonRowSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchCommonSection$Content$RowSection) && Intrinsics.areEqual(this.value, ((SearchCommonSection$Content$RowSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RowSection(value=" + this.value + ")";
    }
}
